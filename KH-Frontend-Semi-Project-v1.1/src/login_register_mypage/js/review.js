'use strict'

void (function (D) {
  /** @type {HTMLElement} */
  const reviewsEl = D.querySelector('.reviews')
  /** @type {HTMLElement} */
  const reviewEmpty = D.querySelector('.reviews > .review_empty')

  /** @type {import('../types/my_review').CreateStar} */
  function createStar(count) {
    const star = D.createElement('span')
    const stars = util.createElements('i', 5)

    for (let i = 0; i < stars.length; i++) {
      stars[i].className = `fa-star ${count >= i + 1 ? 'fa-solid' : 'fa-regular'}`

      star.append(stars[i])
    }

    star.className = 'review_star'
    return star
  }

  /** @type {import('../types/my_review').GenerateReview} */
  function generateReview(item) {
    if (!item || !item.review) return null

    const review = D.createElement('li')
    const [container, top, bottom, title, content, photo] = util.createElements('div', 6)
    const [dateTime] = util.createElements('span', 1)
    const image = D.createElement('img')

    dateTime.className = 'review_datetime'
    dateTime.innerText = item.review.dateTime

    const star = createStar(item.review.rate)

    top.className = 'review_top'
    top.append(star, dateTime)

    title.className = 'review_title'
    title.innerText = item.title

    content.className = 'review_content'
    content.innerText = item.review.content

    bottom.className = 'review_bottom'
    bottom.append(title, content)

    container.className = 'review_con'
    container.append(top, bottom)

    if (typeof item.review.photoUrl === 'string') {
      image.src = item.review.photoUrl
      image.width = image.height = 100

      photo.className = 'review_photo'
      photo.append(image)
    }

    review.className = 'review'
    review.append(container)

    typeof item.review.photoUrl === 'string' && review.append(photo)

    return review
  }

  if (!accountManager.isLogin()) {
    alert('작성한 후기를 보려면 로그인해야 합니다.')
    location.href = 'login.html'
  }

  const shopItems = accountManager.loginAccount.shopItem

  reviewEmpty.style.display = shopItems.length >= 1 ? 'none' : ''

  const pathNameArr = location.pathname.split('/')
  const documentName = pathNameArr[pathNameArr.length - 1]

  if (documentName === 'my_page.html') {
    /** @type {HTMLElement} */
    const buttons = D.querySelector('#my_page .recent_review_card .link_and_buttons')

    buttons.style.visibility =
      shopItems.length <= 0 ? ((reviewsEl.style.marginBottom = '0'), 'hidden') : ''
  }

  for (let i = 0; i < shopItems.length; i++) {
    if (documentName === 'my_page.html' && i >= 2) {
      break
    }

    const j = shopItems[i]
    const review = generateReview(j)
    reviewsEl.append(review)
  }
})(document)
