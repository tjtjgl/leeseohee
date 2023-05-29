/** 로그인 또는 회원가입 페이지의 폼 리스트 */
export interface LoginRegisterForms extends HTMLCollectionOf<HTMLFormElement> {
  login_register_form: HTMLFormElement
}

/** 로그인 페이지 폼에 등록되어 있는 요소 모음 */
export interface LoginFormElements extends HTMLFormControlsCollection {
  id: HTMLInputElement
  password: HTMLInputElement
  /** 로그인 또는 회원가입 버튼 요소 */
  submit: HTMLButtonElement
}

/** 회원가입 페이지 폼에 등록되어 있는 요소 모음 */
export interface RegisterFormElements extends LoginFormElements {
  email: HTMLInputElement
  password2: HTMLInputElement
  name: HTMLInputElement
}
