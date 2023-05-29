'use strict'

void (function (D) {
  /** @type {import('../types/login_register').LoginRegisterForms} */
  const { login_register_form } = D.forms
  /** @type {import('../types/login_register').LoginFormElements} */
  const { id, password, submit } = login_register_form.elements

  /* 로그인 된 계정이 있는지 확인하고 로그인 되어있는 상태면 페이지를 이동함 */
  if (accountManager.isLogin()) {
    // alert('이미 로그인한 상태입니다. 홈페이지로 이동합니다.')
    /* 페이지 이동 */
    location.href = 'my_page.html'
  }

  /*  */
  login_register_form.addEventListener('submit', (e) => {
    e.preventDefault()

    /* 로그인 함수로 아이디와 비밀번호를 넘겨서 반환되는 값에 따라 페이지를 이동하거나 오류 메시지를 출력함 */
    if (accountManager.login(id.value, password.value)) {
      location.href = '../mainpage/mainPage.html'
    } else {
      alert('아이디나 비밀번호를 잘못 입력했습니다')
    }
  })
})(document)
