'use strict'

void (function (D) {
  /** @type {import('../types/login_register').LoginRegisterForms} */
  const { login_register_form } = D.forms
  /** @type {import('../types/login_register').RegisterFormElements} */
  const { id, password, password2, email, name, submit } = login_register_form.elements

  /**
   * ID 밑에 나타나는 메시지 요소
   * @type {HTMLElement}
   */
  const idMessage = id.nextElementSibling
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

  if (accountManager.loginAccount) {
    alert('로그아웃 후 이용해 주시기 바랍니다.')
    history.back()
  }

  /**
   * 리스너를 등록해서 입력할 때마다 함수가 실행됨
   */
  id.addEventListener('input', function () {
    if (!this.validity.valid) {
      idMessage.hidden = false
      idMessage.classList.remove('ok')
      idMessage.classList.add('error')
      idMessage.innerText = '아이디를 입력해 주세요.'
    } else if (accountManager.hasID(this.value)) {
      idMessage.hidden = false
      idMessage.classList.remove('ok')
      idMessage.classList.add('error')
      idMessage.innerText = '이미 존재하는 ID입니다.'
    } else {
      idMessage.classList.remove('error')
      idMessage.classList.add('ok')
      idMessage.hidden = true
    }
  })

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

  /* 리스너를 등록해서 폼을 전송할 때(회원가입 버튼을 눌렀을 때) 실행됨 */
  login_register_form.addEventListener('submit', (e) => {
    e.preventDefault()

    if (
      accountManager.addAccount({
        id: id.value,
        password: password.value,
        email: email.value,
        name: name.value,
      })
    ) {
      /* 계정이 성공적으로 추가되었을 경우 */
      alert('서울 구京에 회원가입 해 주셔서 감사합니다. 로그인 페이지로 이동합니다.')
      location.href = 'login.html'
    } else {
      /* 계정 추가에 실패했을 경우 */
      alert('아이디나 비밀번호를 잘못 입력했습니다.')
    }
  })
})(document)
