// 파이어베이스 앱 객체 모듈 가져오기
import firebase from 'firebase/app'
// 파이어베이스 패키지 모듈 가져오기
import 'firebase/firebase-auth'
import router from '@/router'

export default {
  state: {
    oUser: null // 사용자 정보를 담을 객체
  },
  mutations: {
    // 사용자 객체를 저장
    fnSetUser(state, payload) {
      state.oUser = payload
    }
  },
  getters: {
    // 사용자 객체를 반환
    fnGetUser(state) {
      return state.oUser
    },
    // 사용자 객체의 값의 유무로 로그인 여부 반환
    fnGetAuthStatus(state) {
      return (state.oUser != null)
    }
  },
  actions: {
    // 이메일 회원 가입 처리
    fnRegisterUser({ commit }, payload) {

    },
    // 이메일 회원 로그인
    fnDoLogin({ commit }, payload) {

    },
    // 구글 계정 회원 로그인(팝업)
    fnDoGoogleLogin_Popup({ commit }) {

    },
    // 자동 로그인 처리
    fnDoLoginAuto({ commit }, pUserInfo) {

    },
    // 로그아웃 처리
    fnDoLogout({ commit }) {

    }
  }
}
