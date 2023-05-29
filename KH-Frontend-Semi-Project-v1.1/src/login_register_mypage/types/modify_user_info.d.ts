export interface ModifyUserInfoForms extends HTMLCollectionOf<HTMLFormElement> {
  modify_user_form: HTMLFormElement
}

export interface ModifyUserInfoFormElements extends HTMLFormControlsCollection {
  id: HTMLInputElement
  password: HTMLInputElement
  password2: HTMLInputElement
  email: HTMLInputElement
  name: HTMLInputElement
  submit: HTMLButtonElement
}
