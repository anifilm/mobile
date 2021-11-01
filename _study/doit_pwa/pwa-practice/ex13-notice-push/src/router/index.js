import Vue from 'vue';
import VueRouter from 'vue-router';

import HomePage from '@/components/HomePage';
import CameraPage from '@/components/CameraPage';
import InfoPage from '@/components/InfoPage';
import PostPage from '@/components/PostPage';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'HomePage',
    component: HomePage
  },
  {
    path: '/camera',
    name: 'CameraPage',
    component: CameraPage
  },
  {
    path: '/info',
    name: 'InfoPage',
    component: InfoPage
  },
  {
    path: '/post',
    name: 'PostPage',
    component: PostPage
  }
];

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
});

export default router;
