'use strict'

/*
import 필요한 스크립트

<script src="js/util.js"></script>
*/
/** @type {import('./cart_manager').CartManager} */
const cartManager = {
  carts: [
    {
      id: 'f0e6c47d-82bc-4fde-9fb3-862c25e58a52',
      title: '[완주] 완주 당일 #MZ추천여행 #20-30한정예약 #아원고택',
      price: 100000,
      count: 2,
      discountRate: 0,
      seniorPrice: 5000,
      seniorCount: 0,
      teenPrice: 8000,
      teenCount: 0,
      kidsPrice: 6500,
      kidsCount: 3,
      dateTime: '2023-05-17 16:00',
      photoUrl: null,
    },
    {
      id: 'f93d8058-be78-4bd9-a985-6eb033473b98',
      title: '[김천] KTX 김천 트래블스냅&과일체험 기차여행',
      price: 50000,
      count: 1,
      discountRate: 0,
      seniorPrice: 5000,
      seniorCount: 1,
      teenPrice: 8000,
      teenCount: 2,
      kidsPrice: 6500,
      kidsCount: 2,
      dateTime: '2023-06-01 12:00',
      photoUrl:
        'https://cdn.visitkorea.or.kr/img/call?cmd=VIEW&id=76248d48-0827-49c6-86ed-6e827ec45b02',
    },
  ],

  get LOCAL_STORAGE_PREFIX() {
    return '20230515_kh_semi_project_'
  },

  get CARTS_KEY() {
    return this.LOCAL_STORAGE_PREFIX + 'carts'
  },

  initStorage() {
    const carts = localStorage.getItem(this.CARTS_KEY)
    carts ? (this.carts = JSON.parse(carts)) : this.syncCarts()
  },

  syncCarts() {
    localStorage.setItem(this.CARTS_KEY, JSON.stringify(this.carts))
  },

  sync() {
    this.syncCarts()
  },

  addItem(item) {
    if (
      !item ||
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

    item.id = randomTextGenerator()
    this.carts.push(item)
    this.syncCarts()
    return true
  },

  removeItemForTitle(title) {
    if (typeof title !== 'string') {
      return false
    }

    for (let i = 0; i < this.carts.length; i++) {
      const item = this.carts[i]
      if (item.title === title) {
        this.carts.splice(i, 1)
        this.syncCarts()
        return true
      }
    }

    return false
  },

  findByID(id) {
    if (typeof id !== 'string') return null

    for (const i of this.carts) {
      if (i.id === id) return i
    }

    return null
  },

  updateItem(item, newItem) {
    if (!item || !newItem) {
      return false
    }

    let result = true

    for (const i of this.carts) {
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

    this.syncCarts()

    return true
  },
}

cartManager.initStorage()
