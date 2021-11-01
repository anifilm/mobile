// 파이어베이스 앱 객체 모듈 가져오기
import firebase from 'firebase/app';
// 파이어베이스 패키지 모듈 가져오기
import 'firebase/firebase-database';

// 파이어베이스 DB를 초기화하고 연결
const oDB = firebase.initializeApp({
  // 파이어베이스 콘솔에서 복사하여 붙여넣기
  // databaseURL: "https://pwa-to-do.firebaseio.com",
  databaseURL: process.env.VUE_APP_DATABASE_URL
}).database();

// 파이어베이스 DB객체 중에서 todos 항목을 다른 곳에서 사용하도록 공개
export const oTodosinDB = oDB.ref('todos');
