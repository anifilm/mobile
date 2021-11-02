// 파이어베이스 앱 객체 모듈 가져오기
import firebase from 'firebase/app';
import 'firebase/auth';

// 파이어베이스 DB를 초기화
const oFirebase = firebase.initializeApp({
  // 파이어베이스 콘솔에서 복사하여 붙여넣기
  apiKey: process.env.VUE_APP_API_KEY,
  authDomain: process.env.VUE_APP_AUTH_DOMAIN
});

// 파이어베이스 인증 객체 공개
export const oFirebaseAuth = oFirebase.auth();
