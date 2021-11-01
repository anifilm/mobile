<template>
  <div id="app">
    <h1>안녕하세요!</h1>
    <router-view></router-view>
    <hr>
    <p>
      라우터 사용:
      <!-- to 속성에 이동할 링크 지정 -->
      <router-link to="/main">메인 페이지 이동</router-link>
      <router-link to="/sub">서브 페이지 이동</router-link>
    </p>
  </div>
</template>

<script>
export default {
  name: 'App',
  data: () => ({
    //
  }),
};
</script>
