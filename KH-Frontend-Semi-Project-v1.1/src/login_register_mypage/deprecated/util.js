/** @type {import('../types/common').Util} */
const util = {
  createElements(element, count) {
    return Array.from({ length: count }, () => document.createElement(element))
  },

  randomTextGenerator() {
    return Math.random().toString(36).substring(2, 12)
  },

  checkValidEmail(str) {
    return /^[\w\d\-]{1,}@([\w\d\-]{1,}\.){1,}[\w\d\-]{1,}$/.test(str)
  },
}
