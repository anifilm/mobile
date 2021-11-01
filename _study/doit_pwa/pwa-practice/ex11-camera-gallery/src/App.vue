<template>
  <v-app>
    <v-app-bar color="pink lighten-1" dark app>
      <!-- 홈 화면이 아닌 경우 돌아가기 버튼 표시 -->
      <v-btn icon v-if="$route.name !== 'HomePage'" v-on:click="$router.go(-1)">
        <v-icon>arrow_back</v-icon>
      </v-btn>
      <v-app-bar-nav-icon v-else></v-app-bar-nav-icon>
      <v-toolbar-title>카메라 갤러리</v-toolbar-title>
      <v-spacer></v-spacer>
      <!-- 홈 화면에서만 촬영아이콘 표시-->
      <v-btn icon v-if="$route.name == 'HomePage'" v-on:click="$router.push('/camera')">
        <v-icon>camera_alt</v-icon>
      </v-btn>
    </v-app-bar>

    <v-content>
      <router-view />
    </v-content>

    <!-- 바닥글 고정 -->
		<v-footer app>
			<div class="mx-auto">&copy; CODE-DESIGN.web.app</div>
		</v-footer>
	</v-app>
</template>
<script>
export default {
  name: 'App'
};
</script>
