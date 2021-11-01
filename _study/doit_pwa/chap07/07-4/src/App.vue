<template>
  <v-app>
    <!-- 앱바 테마를 primary(파랑색)로 설정합니다. -->
    <v-app-bar app color="primary" dark>
      <v-app-bar-nav-icon></v-app-bar-nav-icon>
      <v-toolbar-title>멀티 페이지</v-toolbar-title>
      <v-spacer></v-spacer>
      <v-btn icon>
        <v-icon>mdi-dots-vertical</v-icon>
      </v-btn>
    </v-app-bar>

    <!-- 내용영역에 라우터 페이지 렌더링 -->
    <v-content>
      <!-- 페이지 장면전환 효과 넣기 -->
      <v-slide-x-transition mode="out-in">
        <router-view></router-view>
      </v-slide-x-transition>
    </v-content>

    <!-- 툴바 테마를 secondary로 설정합니다. -->
    <v-footer color="secondary" fixed dark>
      <div class="mx-auto">CODE-DESIGN.web.app</div>
    </v-footer>
  </v-app>
</template>

<script>
export default {
  name: 'App',
  data: () => ({
    //
  }),
};
</script>
