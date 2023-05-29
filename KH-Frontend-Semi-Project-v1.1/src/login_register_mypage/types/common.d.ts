export interface Util {
  createElements<T extends keyof HTMLElementTagNameMap>(
    element: T,
    count: number,
  ): HTMLElementTagNameMap[T][]
  randomTextGenerator(): string
  checkValidEmail(str: string): boolean
}

declare const util: Util
