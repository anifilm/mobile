import Vue from 'vue';
import VueRouter from 'vue-router';

import StartPage from '@/components/StartPage';
import MainPage from '@/components/MainPage';
import LoginPage from '@/components/LoginPage';
import RegisterPage from '@/components/RegisterPage';
import ErrorPage from '@/components/ErrorPage';

// 파이어 베이스 앱 객체 모둘 가져오기
import firebase from 'firebase/app';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'StartPage',
    component: StartPage
  },
  {
    path: '/main',
    name: 'MainPage',
    component: MainPage,
    // 메인 페이지는 인증과 연동
    meta: { bAuth: true }
  },
  {
    path: '/login',
    name: 'LoginPage',
    component: LoginPage
  },
  {
    path: '/register',
    name: 'RegisterPage',
    component: RegisterPage
  },
  {
    // 사용자가 라우터에 등록된 것 외에 다른 주소 입력시 에러 페이지 연결
    path: '/*',
    name: 'ErrorPage',
    component: ErrorPage
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

// 라우터 이동에 개입하여 인증이 필요한 경우 login 페이지로 전환
// TODO: history의 영향인지 미묘하게 오작동하는 느낌이 든다.
router.beforeEach((to, from, next) => {
  const bNeedAuth = to.matched.some((record) => record.meta.bAuth);
  const bCheckAuth = firebase.auth().currentUser
  if (bNeedAuth && !bCheckAuth) {
    next('/login');
  } else {
    next();
  }
});

export default router;
