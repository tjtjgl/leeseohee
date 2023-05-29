export interface GoodsManager {
  list: Goods[]
  checkDuplicate(id: string): boolean
  findByID(id: string): Goods | null
  findByTitle(searchString: string): Goods | null
  add(goods: Goods): boolean
}

export interface Goods {
  id: string
  title: string
  summary: string
  price: number
  discountRate: number
}

// declare const goodsManager: GoodsManager
