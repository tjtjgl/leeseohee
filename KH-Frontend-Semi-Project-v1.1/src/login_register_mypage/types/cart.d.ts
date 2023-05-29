import { CartItem } from '../deprecated/cart_manager'

export type ShowControllers = () => void
export type GetCards = <K extends keyof HTMLElementTagNameMap>() => NodeListOf<
  HTMLElementTagNameMap[K]
>
export function GenerateItem(item: CartItem): HTMLDivElement

export interface CartForms extends HTMLCollectionOf<HTMLFormElement> {
  modify_goods: HTMLFormElement
}

export interface CartFormElements extends HTMLFormControlsCollection {
  goods_modify_count: HTMLInputElement
  goods_modify_senior_count: HTMLInputElement
  goods_modify_kids_count: HTMLInputElement
  goods_modify_teen_count: HTMLInputElement
}

export function ModifyCountListenerCallback(this: HTMLInputElement, e: Event): any
