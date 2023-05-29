export interface FindAccountForms extends HTMLCollectionOf<HTMLFormElement> {
  find_id: HTMLFormElement
  find_pw: HTMLFormElement
}

export interface FindIDElements extends HTMLFormControlsCollection {
  name: HTMLInputElement
  email: HTMLInputElement
}

export interface FindPasswordElements extends HTMLFormControlsCollection {
  id: HTMLInputElement
  email: HTMLInputElement
}
