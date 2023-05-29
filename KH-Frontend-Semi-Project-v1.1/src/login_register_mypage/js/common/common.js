'use strict'

/** @type {import('../../types/common').Util} */
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

void (function (D) {
  // const splitedPathname = location.pathname.split('/')
  // const documentName = splitedPathname[splitedPathname.length - 1]

  D.addEventListener('DOMContentLoaded', () => {
    /** @type {HTMLElement} */
    const headerLogoutButton = D.querySelector('.header_logout_button')
    /** @type {HTMLElement} */
    const loginIcon = D.querySelector('header .nav_3 .inIcon')
    /** @type {HTMLElement} */
    const logoutIcon = D.querySelector('header .nav_3 .outIcon')

    loginIcon.style.display = accountManager.isLogin() ? '' : 'none'
    logoutIcon.style.display = accountManager.isLogin() ? 'none' : ''

    headerLogoutButton.addEventListener('click', function () {
      accountManager.logout()

      switch (true) {
        case location.pathname.endsWith('login_register_mypage/find_account.html'):
        case location.pathname.endsWith('login_register_mypage/login.html'):
        case location.pathname.endsWith('login_register_mypage/modify_user_info.html'):
        case location.pathname.endsWith('login_register_mypage/my_page.html'):
        case location.pathname.endsWith('login_register_mypage/my_review.html'):
        case location.pathname.endsWith('login_register_mypage/register.html'):
          location.href = '/src/mainpage/mainPage.html'
          break
        default:
          location.reload()
      }
    })
  })
})(document)
