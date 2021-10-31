<template>
  <div>
    <h2>메인 페이지입니다.</h2>
    <button v-on:click="fnSubPage">서브 페이지로 이동(라우터 함수 사용)</button>
  </div>
</template>

<script>
export default {
  methods: {
    fnSubPage() {
      this.$router.push('/sub');
    }
  }
};
</script>
