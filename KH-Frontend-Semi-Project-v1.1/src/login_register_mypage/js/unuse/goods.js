'use strict'

/** @type {import('../../types/unuse/goods').GoodsManager} */
const goodsManager = {
  list: [
    {
      id: 'b8bb3a30-90f0-4e94-86f6-aa4e061d2322',
      title: '서울 남산 투어',
      summary: '서울 남산타워를 중심으로 느긋한 투어를 합니다.',
      price: 10000,
      discountRate: 10,
    },
    {
      id: '70439088-163a-4632-b496-139033c41dcb',
      title: '[완주] 완주 당일 #MZ추천여행 #20-30한정예약 #아원고택',
      summary:
        '감성도시 완주로 떠나는 20-30대 전용 패키지 상품입니다. 편안한 버스 이동으로 사진 스팟만 쏙쏙 골라담은 완주 감성 당일 여행을 즐겨보세요.',
      price: 56000,
      discountRate: 0,
    },
  ],

  findByID(id) {
    for (const i of this.list) {
      if (i.id === id) {
        return i
      }
    }

    return null
  },

  findByTitle(searchString) {
    for (const i of this.list) {
      if (i.title.includes(searchString)) {
        return i
      }
    }

    return null
  },

  add(goods) {
    if (!goods.discountRate || !goods.price || !goods.summary || !goods.title) {
      return false
    }

    goods.id = goods.id || util.randomTextGenerator()
    this.list.push(goods)
    return true
  },
}
