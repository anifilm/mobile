<template>
  <v-container>
    <v-content>
      <div class="text-center display-3 my-4">메인 페이지입니다.</div>
      <v-row>
        <v-col offset-sm="1" sm="10">
          <!-- 제목을 입력받으면 sParam 데이터와 바인딩 시켜 저장함-->
          <v-text-field label="매개변수1" v-model="sParam1">
          </v-text-field>
          <v-text-field label="매개변수2" v-model="sParam2">
          </v-text-field>
        </v-col>
      </v-row>
      <div class="text-center">
        <v-btn large class="mt-5" color="purple" dark v-on:click="fnGoSub">
          확 인
        </v-btn>
      </div>
    </v-content>
  </v-container>
</template>

<script>
export default {
  // 두개의 매개변수 데이터를 저장함
  data: function () {
    return {
      sParam1: '',
      sParam2: ''
    };
  },
  methods: {
    // 입력받은 두개의 데이터를 라우터에 저장하여 서브페이지로 이동 및 전달
    fnGoSub() {
      this.$router.push({
        name: 'sub_page',
        params: {
          p_param1: this.sParam1,
          p_param2: this.sParam2
        }
      });
    }
  }
};
</script>
