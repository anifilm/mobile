<template>
  <v-app>
    <!-- 전체영역을 카드 UI로 변경하여 색상의 일관성 유지 -->
    <v-card>
      <v-app-bar dark color="primary">
        <!-- 좌측에 메뉴 아이콘 넣음 -->
        <v-app-bar-nav-icon></v-app-bar-nav-icon>
        <v-toolbar-title>To-Do 리스트</v-toolbar-title>
      </v-app-bar>
      <v-content>
        <v-container>
          <v-row my-5>
            <v-col cols="7" offset="2">
              <v-text-field label="할 일을 입력하세요." v-model="sTodoTitle" v-on:keyup.enter="fnSubmitTodo()">
              </v-text-field>
            </v-col>
            <v-col cols="2" my-2>
              <v-btn
                fab
                max-height="50px"
                max-width="50px"
                color="pink"
                dark
                v-on:click="fnSubmitTodo()"
              >
                <v-icon>add</v-icon>
              </v-btn>
            </v-col>
          </v-row>

          <v-row>
            <v-col cols="12">
              <v-list two-line v-for="item in oTodos" :key="item.key">
                <!-- item.b_edit값을 통해 읽기모드인 경우만 표시 -->
                <v-card flat color="grey lighten-3" v-if="!item.b_edit">
                  <!-- 항목을 하나씩 가져와서 tile 단위로 표시함 -->
                  <v-list-item class="py-2">
                    <v-list-item-action>
                      <!-- 체크박스 표시하고 선택되면 변경상태 DB에 저장 -->
                      <v-checkbox
                        v-model="item.b_completed"
                        v-on:change="fnCheckboxChange(item)"
                      ></v-checkbox>
                    </v-list-item-action>
                    <!-- 제목을 표시하고 체크선택되면 취소선 표시 -->
                    <v-list-item-content>
                      <v-list-item-title
                        v-bind:class="{ style_completed: item.b_completed }"
                      >
                        {{ item.todo_title }}
                      </v-list-item-title>
                      <!-- 두번째 줄에 아이콘 배치 -->
                      <v-list-item-subtitle class="mt-2">
                        <!-- 수정 아이콘 표시하고 클릭하면 수정모드로 변경함 -->
                        <v-icon
                          class="pointer ml-1"
                          v-on:click="fnSetEditTodo(item['.key'])"
                          color="blue darken-2"
                        >create</v-icon>
                        <!-- 삭제 아이콘 표시하고 클릭하면 해당 item 삭제 -->
                        <v-icon
                          class="pointer ml-3"
                          v-on:click="fnRemoveTodo(item['.key'])"
                          color="pink"
                        >delete</v-icon>
                      </v-list-item-subtitle>
                    </v-list-item-content>
                  </v-list-item>
                </v-card>
                <!-- item.b_edit값을 통해 수정모드인 경우 어둡게 표시 -->
                <v-card v-else dark>
                  <v-list-item class="py-2">
                    <v-list-item-action>
                      <v-checkbox v-model="item.b_completed"></v-checkbox>
                    </v-list-item-action>
                    <!-- v-list-item안에서 텍스트입력과 버튼 사용을 위해
										v-card 엘리먼트 사용 -->
                    <v-card-text>
                      <!-- 포커스를 입력창으로 바로 옮기고 삭제 아이콘도 추가함 -->
                      <v-text-field
                        autofocus
                        clearable
                        v-model="item.todo_title"
                        v-on:keyup.enter="fnSaveEdit(item)"
                        v-on:keyup.esc="fnCancelEdit(item['.key'])"
                      ></v-text-field>
                    </v-card-text>
                    <v-card-actions>
                      <!-- 수정모드에서 '저장' 아이콘 클릭하면 해당 item 저장 -->
                      <v-icon
                        class="pointer"
                        v-on:click="fnSaveEdit(item)"
                        color="yellow" large
                      >save</v-icon>
                      <!-- 수정모드에서 '취소' 아이콘 클릭하면 취소하고 읽기모드로
										 돌아감 -->
                      <v-icon
                        class="pointer ml-5"
                        v-on:click="fnCancelEdit(item['.key'])"
                        color="pink" large
                      >cancel</v-icon>
                    </v-card-actions>
                  </v-list-item>
                </v-card>
              </v-list>
            </v-col>
          </v-row>
        </v-container>
      </v-content>
    </v-card>
  </v-app>
</template>

<script>
// 파이어베이스 DB 가져옴
import { oTodosinDB } from '@/datasources/firebase';

export default {
  name: 'App',
  data() {
    return {
      oTodos: [], // 할일 데이터 목록 저장 변수
      sTodoTitle: '' // 할 일 제목 저장 문자열 변수
    };
  },
  // 파이어베이스를 쉽게 사용하도록 oTodos 변수로 변경
  firebase: {
    oTodos: oTodosinDB
  },
  methods: {
    // 할 일 제목, 완료, 수정모드 상태값을 DB에 저장
    fnSubmitTodo() {
      oTodosinDB.push({
        todo_title: this.sTodoTitle,
        b_completed: false,
        b_edit: false
      });
      this.sTodoTitle = '';
    },
    // 전달된 할 일을 DB에서 제거
    fnRemoveTodo(pKey) {
      oTodosinDB.child(pKey).remove();
    },
    // 전달된 할 일의 b_edit를 수정모드로 변경
    fnSetEditTodo(pKey) {
      oTodosinDB.child(pKey).update({
        b_edit: true
      });
    },
    // 전달된 할 일의 b_edit를 읽기모드로 변경
    fnCancelEdit(pKey) {
      oTodosinDB.child(pKey).update({
        b_edit: false
      });
    },
    // 전달된 할 일의 수정값을 DB에 저장
    fnSaveEdit(pItem) {
      const sKey = pItem['.key'];
      oTodosinDB.child(sKey).set({
        todo_title: pItem.todo_title,
        b_completed: pItem.b_completed,
        b_edit: false
      });
    },
    // 체크박스 선택되면 DB에 b_completed 변경값 저장
    fnCheckboxChange(pItem) {
      const sKey = pItem['.key'];
      oTodosinDB.child(sKey).update({
        b_completed: pItem.b_completed
      });
    }
  }
};
</script>

<style>
.pointer {
  /* 마우스포인터를 손모양으로 변경 */
  cursor: pointer;
}
.style_completed {
  /* 할 일의 제목을 취소선으로 변경 */
  text-decoration: line-through;
  color: gray;
}
</style>
