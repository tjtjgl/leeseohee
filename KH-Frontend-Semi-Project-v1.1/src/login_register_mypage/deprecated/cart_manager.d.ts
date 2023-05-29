export interface CartManager {
  /** 찜한 상품을 담아두는 배열 */
  carts: CartItem[]
  get LOCAL_STORAGE_PREFIX(): string
  get CARTS_KEY(): string
  /** 스토리지에서 내용을 불러오거나 페이지를 띄웠을 때 초기화하는 메소드 */
  initStorage(): void
  /** 현재 로그인되어 있는 찜한 상품들을 스토리지로 동기화하는 메소드 */
  syncCarts(): void
  /** 개별로 되어있는 동기화 메소드를 한번에 실행하는 메소드 */
  sync(): void
  /** 찜 목록에 새로운 아이템을 추가하는 메소드 */
  addItem(item: CartItem): boolean
  /**
   * 제목명을 이용해서 아이템을 삭제하는 메소드. 삭제에 성공히면 `true`, 실패하면 `false`를 반환함.
   * 제목명을 정확하게 입력하지 않으면 삭제되지 않으니 주의
   */
  removeItemForTitle(title: string): boolean
  /** 찜한 상품의 id를 이용해 상품을 찾는 메소드 */
  findByID(id: string): CartItem | null
  /** 찜한 상품의 정보를 업데이트하는 메소드 */
  updateItem(item: CartItem, newItem: CartItem): boolean
}

// declare const cartManager: CartManager
