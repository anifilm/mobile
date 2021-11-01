<template>
  <v-app>
    <v-app-bar app>
      <v-toolbar-title class="headline text-uppercase">
        <span>Vuetify</span>
        <span class="font-weight-light">MATERIAL DESIGN</span>
      </v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn
        text
        href="https://github.com/vuetifyjs/vuetify/releases/latest"
        target="_blank"
      >
        <span class="mr-2">Latest Release</span>
      </v-btn>
    </v-app-bar>

    <v-content>
      <HelloWorld />
    </v-content>
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
}
</style>
