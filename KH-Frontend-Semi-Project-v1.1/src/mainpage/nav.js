const logo_img = document.querySelector('.logo')
const header = document.querySelector('.header')
const colored = document.querySelectorAll('.colored')
const nav_icon = document.querySelectorAll('.nav_icon')
document.addEventListener('scroll', function () {
  if (window.scrollY > 100) {
    logo_img.classList.remove('active_title')
    logo_img.classList.add('deactive_title')

    header.classList.remove('active')
    header.classList.add('deactive')
    for (let i = 0; i < colored.length; i++) {
      colored[i].classList.add('deactive_font')
      colored[i].classList.remove('active_font')
    }
    for (let i = 0; i < nav_icon.length; i++) {
      nav_icon[i].classList.add('deactive_font')
      nav_icon[i].classList.remove('active_font')
    }
  } else {
    logo_img.classList.add('active_title')
    logo_img.classList.remove('deactive_title')

    logo_img.src = 'img/logo2.png'
    logo_img.width = '200'
    header.classList.remove('deactive')
    header.classList.add('active')
    for (let i = 0; i < colored.length; i++) {
      colored[i].classList.remove('deactive_font')
      colored[i].classList.add('active_font')
    }
    for (let i = 0; i < nav_icon.length; i++) {
      nav_icon[i].classList.remove('deactive_font')
      nav_icon[i].classList.add('active_font')
    }
  }
})

// 로그인, 비로그인 코드
$(function () {
  $(document).ready(function () {
    // 테스트용 로컬스토리지 삭제
    // localStorage.clear()
    // 테스트용 로컬스토리지 값 추가
    // localStorage.setItem('result', 'pasward');
    // if (localStorage.length > 0) {
    //   // $('.inIcon').show();
    //   // $('.outIcon').hide();
    //   $('.inIcon img').css('margin', '0 0 7px -9px')
    //   console.log('값있음')
    // } else {
    //   // $('.inIcon').hide();
    //   // $('.outIcon').show();
    //   $('.outIcon').css('margin', '0 0 6px 0')
    //   console.log('값없음')
    // }
  })
  $(document).on('scroll', function () {
    if (window.scrollY > 100) {
      // CSS 파일로 처리
      // $('.inIcon').css('transition', 'filter 0.5s ease')
      // $('.outIcon').css('transition', 'filter 0.5s ease')
      $('header .inIcon img').css('filter', 'invert(100%)')
      $('header .outIcon img').css('filter', 'invert(100%)')
    } else {
      $('header .inIcon img').css('filter', 'invert(0%)')
      $('header .outIcon img').css('filter', 'invert(0%)')
    }
  })
})
