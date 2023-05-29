'use strict'

void (function (D) {
  /** @type {import('../types/find_account').FindAccountForms} */
  const { find_id, find_pw } = D.forms

  /** @type {import('../types/find_account').FindIDElements} */
  const { email: findIDEmail, name: findIDName } = find_id.elements
  /** @type {import('../types/find_account').FindPasswordElements} */
  const { id: findPwID, email: findPwEmail } = find_pw.elements

  find_id.addEventListener('submit', function (e) {
    e.preventDefault()

    const result = accountManager.findIDByNameEmail(findIDName.value, findIDEmail.value)
    if (result) {
      alert('아이디는 ' + result + '입니다.')
    } else {
      alert('해당하는 조건의 아이디가 없습니다.')
    }
  })

  find_pw.addEventListener('submit', function (e) {
    e.preventDefault()

    console.log(findPwID.value, findPwEmail.value)
    const result = accountManager.findPwByIDEmail(findPwID.value, findPwEmail.value)
    if (result) {
      alert('비밀번호는 ' + result + '입니다.')
    } else {
      alert('해당하는 조건의 비밀번호가 없습니다.')
    }
  })
})(document)
