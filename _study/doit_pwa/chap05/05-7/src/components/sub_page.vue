<template>
  <div>
    <h2>서브 페이지입니다.</h2>
    <button v-on:click="fnMainPage">메인 페이지로 이동(라우터 함수 사용)</button>
  </div>
</template>

<script>
export default {
  methods: {
    fnMainPage() {
      this.$router.push('/main');
    }
  }
};
</script>
