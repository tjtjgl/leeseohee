import { ReviewItem } from './review'

export interface AccountManager {
  /**
   * 계정 정보를 저장하는 배열. 처음 실행 시 localStorage에 저장됨
   */
  accounts: Account[]
  /**
   * 현재 로그인되어 있는 계정. 로그인되어있는 계정이 없을 경우 `null`
   */
  loginAccount: Account | null
  get LOCAL_STORAGE_PREFIX(): string
  get ACCOUNTS_KEY(): string
  get LOGIN_ACCOUNT_KEY(): string
  /**
   * 스토리지에서 내용을 불러오거나 페이지를 띄웠을 때 초기화하는 메소드
   */
  initStorage(): void
  /** 계정 정보를 스토리지로 동기화하는 메소드 */
  syncAccounts(): void
  /** 현재 로그인되어 있는 계정을 스토리지로 동기화하는 메소드 */
  syncCurrentLoginAccount(): void
  /** 개별로 되어있는 동기화 메소드를 한번에 실행하는 메소드 */
  sync(): void
  checkValidateID(id: string): boolean
  checkValidatePassword(password: string): boolean
  checkValidateEmail(email: string): boolean

  checkValidate(account: Account): boolean
  /**
   * 계정을 추가하는 메소드.
   * 오브젝트를 파라미터로 해서 넘겨야 함.
   */
  addAccount(account: Account): boolean
  /** ID가 존재하는지 확인하는 메소드 */
  hasID(id: string): boolean
  findByID(id: string): Account | null
  /** 이름과 이메일을 입력받아 일치하는 정보가 있으면 아이디를 반환하는 메소드 */
  findIDByNameEmail(name: string, email: string): string | null
  /** 아이디와 이메일을 입력받아 일치하는 정보가 있으면 비밀번호를 반환하는 메소드 */
  findPwByIDEmail(id: string, email: string): string | null
  /**
   * 로그인할 때 사용하는 메소드. 로그인에 실패했을 경우 `false`가 반환되고,
   * 로그인에 성공했을 경우 `true`가 반환되며 `loginAccount` 인스턴스 변수에 로그인한 계정이 저장됨.
   * @param id 아이디
   * @param password 비밀번호
   */
  login(id: string, password: string): boolean
  /**
   * 로그아웃할 때 사용하는 메소드. `loginAccount` 변수에 저장되어 있던 계정 정보를 `null`로 만들고
   * 스토리지에서 로그인되어 있는 계정 정보를 지움.
   */
  logout(): void

  isLogin(): boolean

  /** 미구현 */
  hasOrder(id): boolean

  /** 미구현. 후기를 작성할 때 사용하는 메소드 */
  writeReview(orderedItem: OrderedItem): boolean

  updateCurrentAccount(newAccount: Account): boolean
  cartAddItem(item: CartItem): boolean
  /**
   * 제목명을 이용해서 아이템을 삭제하는 메소드. 삭제에 성공히면 `true`, 실패하면 `false`를 반환함.
   * 제목명을 정확하게 입력하지 않으면 삭제되지 않으니 주의
   */
  cartRemoveItemForTitle(title: string): boolean
  /** 찜한 상품의 id를 이용해 상품을 찾는 메소드 */
  cartFindByID(id: string): CartItem | null
  cartFindByGoodsID(goodsID: string): CartItem | null
  /** 찜한 상품의 정보를 업데이트하는 메소드 */
  cartUpdateItem(item: CartItem, newItem: CartItem): boolean
}

declare const AccountManager: AccountManagerConstructor
declare const accountManager: AccountManager

export interface Account {
  id: string
  password: string
  email: string
  name: string
  cart: CartItem[]
  shopItem: OrderedItem[]
}

interface CartItem {
  goodsID: string
  id: string | null
  /** 제목 */
  title: string
  /** 일반 인당 금액 */
  price: number
  /** 일반 명수 */
  count: number
  /** 시니어 인당 금액 */
  seniorPrice: number
  /** 시니어 명수 */
  seniorCount: number
  /** 청소년 인당 금액 */
  teenPrice: number
  /** 청소년 명수 */
  teenCount: number
  /** 유아 인당 금액 */
  kidsPrice: number
  /** 유아 명수 */
  kidsCount: number
  /** 전체 할인율. 0~100 */
  discountRate: number
  /**
   * 날짜 및 시간. 형식 예시:
   * @example '2023-05-15 14:30'
   * '2023-05-22 17:50'
   */
  dateTime: string
  /** 사진 URL */
  photoUrl: string | null
}

interface OrderedItem extends CartItem {
  review: ReviewItem
}
