'use strict'

void (function (D) {
  /** @type {import('../types/modify_user_info').ModifyUserInfoForms} */
  const { modify_user_form } = D.forms
  /** @type {import('../types/modify_user_info').ModifyUserInfoFormElements} */
  const { id, password, password2, email, name, submit } = modify_user_form.elements

  /**
   * 재입력 비밀번호 밑에 나타나는 메시지 요소
   * @type {HTMLElement}
   */
  const passwordMessage = password2.nextElementSibling
  /**
   * 이메일 밑에 나타나는 메시지 요소
   * @type {HTMLElement}
   */
  const emailMessage = email.nextElementSibling

  const loginAccount = accountManager.loginAccount

  if (!accountManager.isLogin()) {
    /*
    로그인 정보가 없을 때 실행됨

    알림을 띄우고 메인 페이지로 이동한다.
    */
    alert('로그인하지 않은 상태에서 사용자 정보를 수정할 수 없습니다. 메인 페이지로 이동합니다.')
    location.href = '../mainpage/mainPage.html'
  }

  id.value = loginAccount.id
  email.value = loginAccount.email
  name.value = loginAccount.name

  /**
   * 비밀번호를 입력할 때 실행되는 함수
   * @param {Event} e Event
   */
  function passwordInputEvent(e) {
    if (password.value !== password2.value) {
      /* 서로간의 비밀번호가 다를 경우 실행됨 */
      passwordMessage.hidden = false
      passwordMessage.classList.remove('ok')
      passwordMessage.classList.add('error')
      passwordMessage.innerText = '비밀번호와 재입력 비밀번호가 다릅니다.'
    } else if (
      password.validity.valueMissing ||
      password.validity.tooShort ||
      password.validity.tooLong
    ) {
      /* 비밀번호란이 비어있거나 기준보다 짧거나 긴 경우 실행됨 */
      passwordMessage.hidden = false
      passwordMessage.classList.remove('ok')
      passwordMessage.classList.add('error')
      passwordMessage.innerText = '8~20자 사이로 입력할 수 있습니다.'
    } else {
      /* 비밀번호가 일치할 경우 */
      passwordMessage.classList.remove('error')
      passwordMessage.classList.add('ok')
      passwordMessage.hidden = true
    }
  }

  password.addEventListener('input', passwordInputEvent)
  password2.addEventListener('input', passwordInputEvent)

  email.addEventListener('input', function () {
    if (this.validity.valid) {
      /* 유효한 이메일을 입력했을 경우 실행됨 */
      emailMessage.hidden = true
      emailMessage.classList.remove('error')
      emailMessage.classList.add('ok')
    } else {
      /* 유효하지 않은 이메일을 입력했을경우 */
      emailMessage.hidden = false
      emailMessage.classList.remove('ok')
      emailMessage.classList.add('error')
      emailMessage.innerText = '올바르지 않은 이메일 주소입니다.'
    }
  })

  modify_user_form.addEventListener('submit', function (e) {
    e.preventDefault()

    if (
      accountManager.updateCurrentAccount({
        id: id.value,
        password: password.value,
        name: name.value,
        email: email.value,
      })
    ) {
      alert('정보를 변경했습니다. 마이페이지로 이동합니다.')
      location.href = 'my_page.html'
    } else {
      alert('변경에 실패했습니다.')
    }
  })
})(document)
