'use strict'

/*
import 필요한 스크립트

<script src="js/common.js"></script>
*/
/** @type {import('../../types/account_manager').AccountManager} */
const accountManager = {
  accounts: [
    {
      id: 'a',
      password: '12345678',
      email: 'a@a.a',
      name: 'ㅁㅁ',
      cart: [
        {
          goodsID: '870f208f-f91d-4d57-9ccf-267d60f15d1a',
          id: '602d11d8-d6f9-4645-ab6f-cf73ea605b27',
          title: '청계천',
          price: 5000,
          count: 1,
          discountRate: 0,
          seniorPrice: 3000,
          seniorCount: 1,
          teenPrice: 2000,
          teenCount: 2,
          kidsPrice: 1000,
          kidsCount: 2,
          dateTime: '2023-06-01 12:00',
          photoUrl: '/src/area_theme_search/img/jong2.png',
        },
        {
          goodsID: 'c5d64e76-042f-44e2-8408-5a8beac537cd',
          id: 'bb0f6edb-7e21-45f3-9922-b80f849e6832',
          title: '하늘공원',
          price: 9000,
          count: 5,
          discountRate: 0,
          seniorPrice: 5500,
          seniorCount: 0,
          teenPrice: 4000,
          teenCount: 0,
          kidsPrice: 3000,
          kidsCount: 0,
          dateTime: '2023-11-25 14:00',
          photoUrl: '/src/area_theme_search/img/mapo3.jpg',
        },
      ],
      shopItem: [
        {
          goodsID: '17f6dbdf-f8f7-43bc-9757-72b76ad6cb1e',
          id: '7e69a836-68d0-446f-b28f-37376a7534b7',
          title: '국립현대미술관',
          price: 12000,
          count: 1,
          discountRate: 0,
          seniorPrice: 6000,
          seniorCount: 0,
          teenPrice: 4500,
          teenCount: 0,
          kidsPrice: 3000,
          kidsCount: 0,
          dateTime: '2023-05-17 16:00',
          photoUrl: '/src/area_theme_search/img/jong3.jpg',
          review: {
            content: '요즘 현대 미술은 참 독특하네요~ 잘 관람했습니다!',
            dateTime: '2023-05-21 20:30',
            photoUrl: '/src/area_theme_search/img/jong3.jpg',
            rate: 5,
          },
        },
        {
          goodsID: 'e06edd57-2707-419a-98de-5b8beb824a49',
          id: '58b8a708-bb46-4199-8c95-f3df8d9fe911',
          title: '홍대 쇼핑거리',
          price: 5000,
          count: 2,
          discountRate: 0,
          seniorPrice: 3000,
          seniorCount: 0,
          teenPrice: 2000,
          teenCount: 0,
          kidsPrice: 1000,
          kidsCount: 0,
          dateTime: '2023-06-21 20:00',
          photoUrl: '/src/area_theme_search/img/mapo5.jpg',
          review: {
            content:
              '외국인 친구와 같이 방문해서 눈요기하다가 맛있는 음식도 많이 먹고 이것저것 많이 구매했습니다!!',
            dateTime: '2023-06-23 19:40',
            photoUrl: '/src/area_theme_search/img/mapo5.jpg',
            rate: 4,
          },
        },
        {
          goodsID: '96950133-6b24-4c30-97c8-afc045ff7fc0',
          id: '0bebf376-67b3-499c-938e-28a061945885',
          title: '코엑스 아쿠아리움',
          price: 15000,
          count: 3,
          discountRate: 0,
          seniorPrice: 7000,
          seniorCount: 0,
          teenPrice: 5000,
          teenCount: 0,
          kidsPrice: 3500,
          kidsCount: 5,
          dateTime: '2023-07-04 14:00',
          photoUrl: '/src/area_theme_search/img/gangnam1.png',
          review: {
            content: '아이들이 너무 좋아했어요~ 저도 아이들이 좋아하는 모습을 보고 기뻤습니다.',
            dateTime: '2023-07-06 10:10',
            photoUrl: '/src/area_theme_search/img/gangnam1.png',
            rate: 5,
          },
        },
        {
          goodsID: '6a6a3d44-266c-4411-ab3f-6994cc93f9bb',
          id: '1844ce9c-8fb6-4ab9-9e4c-505fdf59a11f',
          title: '이랜드 크루즈',
          price: 30000,
          count: 2,
          discountRate: 0,
          seniorPrice: 17000,
          seniorCount: 0,
          teenPrice: 10000,
          teenCount: 1,
          kidsPrice: 8000,
          kidsCount: 1,
          dateTime: '2023-09-05 17:00',
          photoUrl: '/src/area_theme_search/img/young4.jpg',
          review: {
            content: '가족끼리와서 좋은 추억 쌓고 갑니다. :)',
            dateTime: '2023-09-06 12:00',
            photoUrl: '/src/area_theme_search/img/young4.jpg',
            rate: 5,
          },
        },
      ],
    },
    {
      id: 's',
      password: '12345678',
      email: 's@s.s',
      name: 'ㄴㄴ',
      cart: [],
      shopItem: [],
    },
  ],

  loginAccount: null,

  get LOCAL_STORAGE_PREFIX() {
    return '20230515_kh_semi_project_'
  },

  get ACCOUNTS_KEY() {
    return this.LOCAL_STORAGE_PREFIX + 'accounts'
  },

  get LOGIN_ACCOUNT_KEY() {
    return this.LOCAL_STORAGE_PREFIX + 'login_account'
  },

  initStorage() {
    /*
    1. localStorage에서 계정을 찾는다.
    2. 계정이 있으면 JSON을 파싱해서 account 인스턴스 변수에 넣는다.
      계정이 없으면 syncAccounts() 메소드를 통해 동기화한다.
    */
    const accounts = localStorage.getItem(this.ACCOUNTS_KEY)
    accounts ? (this.accounts = JSON.parse(accounts)) : this.syncAccounts()

    const currentLoginAccount = localStorage.getItem(this.LOGIN_ACCOUNT_KEY)

    if (currentLoginAccount) {
      this.loginAccount = JSON.parse(currentLoginAccount)

      const resultAccount = this.findByID(this.loginAccount.id)

      if (resultAccount) {
        this.loginAccount = resultAccount
        this.syncCurrentLoginAccount()
        this.syncAccounts()
      } else {
        alert('로그인한 계정과 일치하는 정보가 없습니다.')
        this.logout()
        location.reload()
      }
    }
  },

  syncAccounts() {
    localStorage.setItem(this.ACCOUNTS_KEY, JSON.stringify(this.accounts))
  },

  syncCurrentLoginAccount() {
    this.isLogin() &&
      localStorage.setItem(this.LOGIN_ACCOUNT_KEY, JSON.stringify(this.loginAccount))
  },

  sync() {
    this.syncAccounts()
    this.syncCurrentLoginAccount()
  },

  checkValidateID(id) {
    /* id가 string이며 길이가 1자 이상일 때 true 반환 */
    return typeof id === 'string' && id.length > 0
  },

  checkValidatePassword(password) {
    util
    /* password가 string이며 길이가 8자 이상 20자 이하일 때 true 반환 */
    return typeof password === 'string' && password.length >= 8 && password.length <= 20
  },

  checkValidateEmail(email) {
    /* util.js 불러와야 사용할 수 있음 */
    return util.checkValidEmail(email)
  },

  checkValidate(account) {
    if (
      !this.checkValidateID(account.id) ||
      !this.checkValidatePassword(account.password) ||
      typeof account.email !== 'string' ||
      typeof account.name !== 'string'
    ) {
      return false
    }

    if (this.hasID(account.id)) {
      return false
    }

    return true
  },

  addAccount(account = {}) {
    if (!this.checkValidate(account)) {
      return false
    }

    account.cart || (account.cart = [])
    account.shopItem || (account.shopItem = [])

    this.accounts.push(account)
    this.sync()
    return true
  },

  hasID(id) {
    if (typeof id !== 'string') {
      return false
    }

    for (const i of this.accounts) {
      if (i.id === id) {
        return true
      }
    }

    return false
  },

  findByID(id) {
    if (typeof id !== 'string') return null

    for (const i of this.accounts) {
      if (i.id === id) {
        return i
      }
    }

    return null
  },

  findIDByNameEmail(name, email) {
    if (typeof name !== 'string' || typeof email !== 'string') {
      return null
    }

    for (const i of this.accounts) {
      if (i.name === name && i.email === email) {
        return i.id
      }
    }

    return null
  },

  findPwByIDEmail(id, email) {
    if (typeof id !== 'string' || typeof email !== 'string') {
      return null
    }

    for (const i of this.accounts) {
      if (i.id === id && i.email === email) {
        return i.password
      }
    }

    return null
  },

  login(id, password) {
    if (this.isLogin()) return false

    for (const i of this.accounts) {
      if (i.id === id && i.password === password) {
        this.loginAccount = i
        this.syncCurrentLoginAccount()

        return true
      }
    }

    return false
  },

  logout() {
    this.loginAccount = null
    localStorage.removeItem(this.LOGIN_ACCOUNT_KEY)
  },

  isLogin() {
    return this.loginAccount !== null
  },

  hasOrder() {},

  writeReview(orderedItem) {
    if (
      !this.isLogin() ||
      !orderedItem ||
      typeof orderedItem.id !== 'string' ||
      typeof orderedItem.title !== 'string' ||
      typeof orderedItem.price !== 'number' ||
      typeof orderedItem.count !== 'number' ||
      typeof orderedItem.seniorPrice !== 'number' ||
      typeof orderedItem.seniorCount !== 'number' ||
      typeof orderedItem.teenPrice !== 'number' ||
      typeof orderedItem.teenCount !== 'number' ||
      typeof orderedItem.kidsPrice !== 'number' ||
      typeof orderedItem.kidsCount !== 'number' ||
      typeof orderedItem.discountRate !== 'number' ||
      typeof orderedItem.dateTime !== 'string' ||
      (orderedItem.photoUrl !== null && typeof orderedItem.photoUrl !== 'string')
    ) {
      return false
    }
  },

  updateCurrentAccount(newAccount) {
    if (
      !this.isLogin() ||
      typeof newAccount.id !== 'string' ||
      !this.checkValidateEmail(newAccount.email) ||
      !this.checkValidatePassword(newAccount.password) ||
      newAccount.name.length <= 0
    ) {
      return false
    }

    let updated = false

    for (const i in newAccount) {
      if (
        this.loginAccount[i] !== newAccount[i] &&
        (i === 'name' || i === 'email' || i === 'password')
      ) {
        this.loginAccount[i] = newAccount[i]
        updated = true
      }
    }

    if (updated) {
      this.syncCurrentLoginAccount()
      this.syncAccounts()
    }

    return updated
  },

  cartAddItem(item) {
    if (
      !this.isLogin() ||
      !item ||
      typeof item.goodsID !== 'string' ||
      typeof item.title !== 'string' ||
      typeof item.price !== 'number' ||
      typeof item.count !== 'number' ||
      typeof item.seniorPrice !== 'number' ||
      typeof item.seniorCount !== 'number' ||
      typeof item.teenPrice !== 'number' ||
      typeof item.teenCount !== 'number' ||
      typeof item.kidsPrice !== 'number' ||
      typeof item.kidsCount !== 'number' ||
      typeof item.discountRate !== 'number' ||
      typeof item.dateTime !== 'string' ||
      (item.photoUrl !== null && typeof item.photoUrl !== 'string')
    ) {
      return false
    }

    if (this.cartFindByGoodsID(item.goodsID)) {
      return false
    }

    item.id = item.id || util.randomTextGenerator()
    item.id = this.hasID(item.id) ? util.randomTextGenerator() : item.id
    this.loginAccount.cart.push(item)
    this.syncAccounts()
    return true
  },

  cartRemoveItemForTitle(title) {
    if (!this.isLogin() || typeof title !== 'string') {
      return false
    }

    for (let i = 0; i < this.loginAccount.cart.length; i++) {
      const item = this.loginAccount.cart[i]
      if (item.title === title) {
        this.loginAccount.cart.splice(i, 1)
        this.syncAccounts()
        return true
      }
    }

    return false
  },

  cartFindByID(id) {
    if (!this.isLogin() || typeof id !== 'string') return null

    for (const i of this.loginAccount.cart) {
      if (i.id === id) return i
    }

    return null
  },

  cartFindByGoodsID(goodsID) {
    if (typeof goodsID !== 'string' || !this.isLogin()) return null

    for (const i of this.loginAccount.cart) {
      if (i.goodsID === goodsID) return i
    }

    return null
  },

  cartUpdateItem(item, newItem) {
    if (!this.isLogin() || !item || !newItem) {
      return false
    }

    let result = true

    for (const i of this.loginAccount.cart) {
      if (i === item) {
        result = true
        break
      }
    }

    if (!result) {
      return false
    }

    for (const i in newItem) {
      if (newItem[i] !== item[i]) {
        item[i] = newItem[i]
      }
    }

    this.syncAccounts()

    return true
  },
}

accountManager.initStorage()
