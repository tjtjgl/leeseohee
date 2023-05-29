'use strict'

void (function (D) {
  /** @type {HTMLImageElement} */
  const profileImage = D.querySelector('.profile img#profile_image')
  /** @type {HTMLElement} */
  const profileMessage = D.querySelector('.profile .message')
  /** @type {HTMLElement} */
  const recentReviewList = D.querySelector('.card.recent_review_card > .reviews')
  /** @type {HTMLElement} */
  const recentReviewButtons = D.querySelector('.card.recent_review_card > .link_and_buttons')

  if (!accountManager.isLogin()) {
    /*
    로그인 정보가 없을 때 실행됨

    알림을 띄우고 확인을 누르거나 닫으면 로그인 페이지로 이동한다.
    */
    alert('마이페이지에 접속하려면 로그인해야 합니다.')
    location.href = 'login.html'
  }

  /*
    1. 프로필 메시지 요소의 텍스트에서 '{{@user_name}}'을 사용자 이름으로 교체한다.
    2. 함수에서 반환된 값을 profileMessage 요소의 텍스트로 넘겨준다.
  */
  profileMessage.innerText = profileMessage.innerText.replace(
    /{{@user_name}}/g,
    accountManager.loginAccount.name,
  )

  for (
    let i = 0;
    accountManager.loginAccount.shopItem.length >= 3
      ? i < 3
      : i < accountManager.loginAccount.shopItem.length;
    i++
  ) {
    const currentItem = accountManager.loginAccount.shopItem[i]

    recentReviewList.append()
  }

  /*
  =================================== ===================================

                          마이페이지 - 나의 찜

  =================================== ===================================
   */
  const PROFILE_ALT_IMAGE_PATH = 'img/Question_mark_(black).svg.png'

  /** @type {HTMLInputElement} */
  const selectAllCb = D.querySelector('#cart input#order_select_all_cb')
  // /** @type {NodeListOf.<HTMLElement>} */
  // const cards = D.querySelectorAll('#cart .cards > .card')
  /** @type {HTMLElement} */
  const cardsEl = D.querySelector('#cart .cards')
  /** @type {HTMLButtonElement} */
  const removeSelectedItemButton = D.querySelector('#cart button.remove_selected_item_button')
  /** @type {HTMLButtonElement} */
  const paymentSelectedItemButton = D.querySelector('#cart button.payment_selected_item_button')
  /** @type {HTMLElement} */
  const controllers = D.querySelector('#cart .controllers')
  /** @type {HTMLElement} */
  const emptyCart = D.querySelector('#cart .empty_cart')

  /** @type {HTMLElement} */
  const cartModifyEl = D.querySelector('#cart #cart_modify')

  /** @type {HTMLElement} */
  const goodsModifyTotalCount = cartModifyEl.querySelector('.goods_modify_total_count')
  /** @type {HTMLElement} */
  const goodsModifyTotalPrice = cartModifyEl.querySelector('.goods_modify_total_price')
  /** @type {import('../types/cart').CartForms} */
  const { modify_goods } = document.forms
  /** @type {import('../types/cart').CartFormElements} */
  const {
    goods_modify_count,
    goods_modify_kids_count,
    goods_modify_senior_count,
    goods_modify_teen_count,
  } = modify_goods.elements

  /** @type {HTMLElement} */
  const goodsModifyInputItemNormal = modify_goods.querySelector(
    '.goods_modify_input_item[data-type="normal"]',
  )
  /** @type {HTMLElement} */
  const goodsModifyPriceNormal = goodsModifyInputItemNormal.querySelector('.goods_modify_price')
  /** @type {HTMLElement} */
  const goodsModifyInputItemSenior = modify_goods.querySelector(
    '.goods_modify_input_item[data-type="senior"]',
  )
  /** @type {HTMLElement} */
  const goodsModifyPriceSenior = goodsModifyInputItemSenior.querySelector('.goods_modify_price')
  /** @type {HTMLElement} */
  const goodsModifyInputItemKids = modify_goods.querySelector(
    '.goods_modify_input_item[data-type="kids"]',
  )
  /** @type {HTMLElement} */
  const goodsModifyPriceKids = goodsModifyInputItemKids.querySelector('.goods_modify_price')
  /** @type {HTMLElement} */
  const goodsModifyInputItemTeen = modify_goods.querySelector(
    '.goods_modify_input_item[data-type="teen"]',
  )
  /** @type {HTMLElement} */
  const goodsModifyPriceTeen = goodsModifyInputItemTeen.querySelector('.goods_modify_price')

  /** @type {HTMLButtonElement} */
  const goodModifyCancelButton = modify_goods.querySelector('button.good_modify_cancel_button')

  /**
   * 카드 요소를 보관하는 배열
   * @type {HTMLElement[]}
   */
  const cards = []
  /**
   * 체크박스로 선택한 카드를 보관하는 배열
   * @type {HTMLElement[]}
   */
  const selectedCards = []

  /**
   * 수정 버튼을 누른 아이템을 보관하는 변수
   * @type {import('../deprecated/cart_manager').CartItem | null}
   */
  let currentModifyCartItem = null

  /** @type {import('../types/cart').ShowControllers} */
  const showControllers = () => {
    if (cards.length >= 1) {
      controllers.style.display = ''
      emptyCart.style.display = 'none'
    } else {
      controllers.style.display = 'none'
      emptyCart.style.display = ''
    }
  }

  /**
   * 아이템 요소을 생성하는 함수
   * @type {import('../types/cart').GenerateItem}
   */
  function generateItem(item) {
    const [
      card,
      orderCb,
      orderImg,
      orderInfo,
      orderTitle,
      orderInfo2,
      orderTravelDate,
      orderPrice,
      orderCount,
      orderDiscountPrice,
      orderNormalPrice,
      orderButtons,
    ] = util.createElements('div', 12)
    const checkbox = D.createElement('input')
    const img = D.createElement('img')
    const [modifyButton, removeButton] = util.createElements('button', 2)

    checkbox.type = 'checkbox'
    checkbox.className = 'order_select checkbox_default checkbox_default_large_1'
    checkbox.addEventListener('change', function () {
      /*
      체크박스를 체크하거나 체크 해제했을 때 실행되는 함수


      작동 방식
        - 체크박스를 체크했으면 선택한 카드 배열에 현재 카드를 넣음.
        - 체크를 해제했을 경우 선택한 카드 배열에서 해당 카드의 인덱스 번호를 찾은 다음 배열에서 카드를 삭제함.
        - 마지막으로 선택한 카드의 수의 전체 카드의 수가 일치하면 모두 선택 체크박스를 체크 표시함.
      */
      if (this.checked) {
        selectedCards.push(card)
      } else {
        const index = selectedCards.indexOf(card)
        selectedCards.splice(index, 1)
      }

      selectAllCb.checked = cards.length === selectedCards.length
    })

    orderCb.className = 'order_cb'
    orderCb.append(checkbox)

    img.src = item.photoUrl || PROFILE_ALT_IMAGE_PATH
    img.width = 100
    img.height = 100
    orderImg.className = 'order_img'
    orderImg.append(img)

    orderTitle.className = 'order_title'
    orderTitle.innerText = item.title

    orderTravelDate.className = 'order_travel_date'
    orderTravelDate.innerText = item.dateTime

    orderCount.className = 'order_count'
    orderCount.innerText = item.count + item.seniorCount + item.teenCount + item.kidsCount + '명'

    const normalPrice = Math.ceil(
      item.price * item.count +
        item.seniorPrice * item.seniorCount +
        item.teenPrice * item.teenCount +
        item.kidsPrice * item.kidsCount,
    )
    const discountPrice = Math.ceil(
      item.price * item.count +
        item.seniorPrice * item.seniorCount +
        item.teenPrice * item.teenCount +
        item.kidsPrice * item.kidsCount,
    )

    orderDiscountPrice.className = 'order_discount_price'
    orderDiscountPrice.innerText = discountPrice.toLocaleString() + '원'

    orderNormalPrice.className = 'order_normal_price'
    orderNormalPrice.innerText = normalPrice.toLocaleString() + '원'
    orderNormalPrice.style.display = normalPrice >= discountPrice ? 'none' : ''

    orderPrice.className = 'order_price'
    orderPrice.append(orderCount, orderDiscountPrice, orderNormalPrice)

    orderInfo2.className = 'order_info_2'
    orderInfo2.append(orderTravelDate, orderPrice)

    orderInfo.className = 'order_info'
    orderInfo.append(orderTitle, orderInfo2)

    modifyButton.className = 'button_2 modify_button'
    modifyButton.innerText = '수정'
    modifyButton.addEventListener('click', function () {
      /* 수정 버튼을 클릭했을 때 실행되는 함수 */
      const cartItem = accountManager.cartFindByID(card.dataset.id)

      if (!cartItem) {
        alert('해당 아이템이 없습니다.')
        return
      }

      if (currentModifyCartItem) {
        alert('이미 다른 항목을 수정하고 있습니다.')
        return
      }

      currentModifyCartItem = cartItem

      goods_modify_count.value = currentModifyCartItem.count
      goods_modify_kids_count.value = currentModifyCartItem.kidsCount
      goods_modify_senior_count.value = currentModifyCartItem.seniorCount
      goods_modify_teen_count.value = currentModifyCartItem.teenCount

      modifyCountListenerCallback()

      cartModifyEl.style.display = ''
      D.body.style.overflow = 'hidden'
    })

    removeButton.className = 'button_2 remove_button'
    removeButton.innerText = '삭제'
    removeButton.addEventListener('click', function () {
      if (confirm('이 상품을 삭제하시겠습니까?')) {
        card.remove()
        accountManager.cartRemoveItemForTitle(item.title)
        const index = cards.indexOf(card)
        cards.splice(index, 1)

        if (D.querySelectorAll('#cart .cards > .card').length <= 0) {
          cardsEl.innerText = '찜한 상품이 없습니다.'
          controllers.style.display = 'none'
        }

        showControllers()
      }
    })

    orderButtons.className = 'order_buttons'
    orderButtons.append(modifyButton, removeButton)

    card.className = 'card'
    card.dataset.id = item.id
    card.append(orderCb, orderImg, orderInfo, orderButtons)
    return card
  }

  /* 수정 팝업을 숨기는 함수 */
  function hideCartModifyEl() {
    D.body.style.overflow = ''
    cartModifyEl.style.display = 'none'
    currentModifyCartItem = null
  }

  for (const i of accountManager.loginAccount.cart) {
    const card = generateItem(i)
    cardsEl.append(card)
    cards.push(card)
  }

  showControllers()

  cartModifyEl.addEventListener('click', function (e) {
    e.target === cartModifyEl && hideCartModifyEl()
  })

  selectAllCb.addEventListener('click', function (e) {
    const checked = this.checked

    for (const i of cards) {
      /** @type {HTMLInputElement} */
      const checkBox = i.querySelector('input.order_select')

      ;(checked ? !checkBox.checked : checkBox.checked) && checkBox.click()
    }
  })

  removeSelectedItemButton.addEventListener('click', function () {
    if (selectedCards.length >= 1 && confirm('선택한 항목을 삭제하시겠습니까?')) {
      for (const i of selectedCards) {
        /** @type {HTMLElement} */
        const titleEl = i.querySelector('.order_title')

        i.remove()
        const idx = cards.indexOf(i)
        cards.splice(idx, 1)
        accountManager.cartRemoveItemForTitle(titleEl.innerText)
        showControllers()
      }
    } else if (selectedCards.length <= 0) {
      alert('삭제할 항목이 없습니다.')
    }
  })

  modify_goods.addEventListener('submit', function (e) {
    e.preventDefault()

    if (!currentModifyCartItem) {
      alert('현재 수정하고 있는 아이템이 없습니다.')
      return
    }

    if (
      goods_modify_count.valueAsNumber <= 0 &&
      goods_modify_kids_count.valueAsNumber <= 0 &&
      goods_modify_senior_count.valueAsNumber <= 0 &&
      goods_modify_teen_count.valueAsNumber <= 0
    ) {
      alert('수정할 수량이 모두 0 이하 입니다.')
      return
    }

    if (
      accountManager.cartUpdateItem(currentModifyCartItem, {
        count: goods_modify_count.valueAsNumber,
        kidsCount: goods_modify_kids_count.valueAsNumber,
        teenCount: goods_modify_teen_count.valueAsNumber,
        seniorCount: goods_modify_senior_count.valueAsNumber,
      })
    ) {
      alert('정상적으로 수정되었습니다.')
      location.reload()
    } else {
      alert('수정에 실패했습니다.')
    }
  })

  /** @type {import('../types/cart').ModifyCountListenerCallback} */
  function modifyCountListenerCallback(e) {
    if (!currentModifyCartItem) {
      alert('현재 수정하려는 아이템이 없습니다.')
      return
    }

    const normalPrice = Math.ceil(currentModifyCartItem.price * goods_modify_count.valueAsNumber)
    const kidsPrice = Math.ceil(
      currentModifyCartItem.kidsPrice * goods_modify_kids_count.valueAsNumber,
    )
    const teenPrice = Math.ceil(
      currentModifyCartItem.teenPrice * goods_modify_teen_count.valueAsNumber,
    )
    const seniorPrice = Math.ceil(
      currentModifyCartItem.seniorPrice * goods_modify_senior_count.valueAsNumber,
    )

    goodsModifyPriceNormal.innerText = normalPrice.toLocaleString() + '원'
    goodsModifyPriceKids.innerText = kidsPrice.toLocaleString() + '원'
    goodsModifyPriceTeen.innerText = teenPrice.toLocaleString() + '원'

    goodsModifyPriceSenior.innerText = seniorPrice.toLocaleString() + '원'

    goodsModifyTotalCount.innerText =
      goods_modify_count.valueAsNumber +
      goods_modify_kids_count.valueAsNumber +
      goods_modify_teen_count.valueAsNumber +
      goods_modify_senior_count.valueAsNumber +
      '명'
    goodsModifyTotalPrice.innerText =
      (normalPrice + kidsPrice + teenPrice + seniorPrice).toLocaleString() + '원'
  }

  goods_modify_count.addEventListener('input', modifyCountListenerCallback)
  goods_modify_kids_count.addEventListener('input', modifyCountListenerCallback)
  goods_modify_senior_count.addEventListener('input', modifyCountListenerCallback)
  goods_modify_teen_count.addEventListener('input', modifyCountListenerCallback)

  goodModifyCancelButton.addEventListener('click', function () {
    hideCartModifyEl()
  })
})(document)
