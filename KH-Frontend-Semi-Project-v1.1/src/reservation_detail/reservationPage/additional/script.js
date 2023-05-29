'use strict'

void (function (D) {
  /** @type {NodeListOf.<HTMLInputElement>} */
  const checkDateEls = D.querySelectorAll('input[name="reservDate"]')
  /** @type {NodeListOf.<HTMLInputElement>} */
  const checkTimeEls = D.querySelectorAll('input[name="reservTime"]')

  /** @type {HTMLInputElement} */
  const normalEl = D.querySelector('input#normalPerson')
  /** @type {HTMLInputElement} */
  const seniorEl = D.querySelector('input#seniorPerson')
  /** @type {HTMLInputElement} */
  const teenEl = D.querySelector('input#teenPerson')
  /** @type {HTMLInputElement} */
  const babyEl = D.querySelector('input#babyPerson')

  /** @type {HTMLInputElement} */
  const sumButtonEl = D.querySelector('input#sumButton')

  /** @type {HTMLInputElement} */
  const addButtonEl = D.querySelector('input#addButton')

  /** @type {(string | null)} */
  let selectedDate = null
  /** @type {(string | null)} */
  let selectedTime = null
  let normalPeople = 0
  let seniorPeople = 0
  let teenPeople = 0
  let babyPeople = 0

  for (const i of checkDateEls) {
    i.addEventListener('change', function () {
      selectedDate = this.value
    })
  }

  for (const i of checkTimeEls) {
    i.addEventListener('change', function () {
      selectedTime = this.value
    })
  }

  sumButtonEl.addEventListener('click', function () {
    normalPeople = normalEl.valueAsNumber
    seniorPeople = seniorEl.valueAsNumber
    teenPeople = teenEl.valueAsNumber
    babyPeople = babyEl.valueAsNumber
  })

  addButtonEl.addEventListener('click', function () {
    if (!selectedDate || !selectedTime) {
      alert('날짜 또는 시간을 선택하지 않았습니다.')
      return
    }

    if (normalPeople <= 0 && seniorPeople <= 0 && teenPeople <= 0 && babyPeople <= 0) {
      alert('최소 1명 이상 선택해야 합니다.')
      return
    }

    if (!accountManager.isLogin()) {
      alert('찜 목록에 추가하려면 로그인해야 합니다.')
      // location.href = '../../login_register_mypage/login.html'
      return
    }

    if (
      accountManager.cartAddItem({
        goodsID: '선정릉_입장권',
        title: '선정릉 입장권',
        price: 10000,
        count: normalPeople,
        seniorPrice: 8000,
        seniorCount: seniorPeople,
        teenPrice: 6000,
        teenCount: teenPeople,
        kidsPrice: 5000,
        kidsCount: babyPeople,
        discountRate: 0,
        dateTime: selectedDate + ' ' + selectedTime,
        photoUrl: '/src/reservation_detail/img/main5.jpg',
      })
    ) {
      alert('찜 목록에 추가했습니다.')
    } else {
      alert(
        '찜 목록에 추가하지 못 했습니다.\n\
\n\
다음과 같은 이유로 인해 추가에 실패했을 수도 있습니다.\n\
- 항목이 이미 찜 목록에 추가되어 있을 경우',
      )
    }
  })
})(document)
