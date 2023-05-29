var swiper = new Swiper('.swiper', {
  // Optional parameters
  direction: 'horizontal',
  loop: true,

  // If we need pagination
  pagination: {
    el: '.swiper-pagination',
  },

  // Navigation arrows
  navigation: {
    nextEl: '.swiper-button-next',
    prevEl: '.swiper-button-prev',
  },

  // And if we need scrollbar
  scrollbar: {
    el: '.swiper-scrollbar',
  },

  autoplay: {
    delay: 5000,
    disableOnInteraction: false,
  },
})

swiper.on('slideChange', function () {
  console.log('slide changed')
})

$('.btn')
  .on('mouseenter', function () {
    $(this).children('img').animate({ left: '10px' }, 'fast')
  })
  .on('mouseleave', function () {
    $(this).children('img').animate({ left: '0px' }, 'fast')
  })

// 로그인, 비로그인 코드
$(function () {
  // nav.js 내용 중복 주석 처리
  /* $(document).ready(function () {
    // 테스트용 로컬스토리지 삭제
    localStorage.clear(); 
    // 테스트용 로컬스토리지 값 추가
    // localStorage.setItem('result', 'pasward'); 

    if (localStorage.length > 0) {
      $('.inIcon').show();
      $('.outIcon').hide();
      $('.inIcon img').css('margin', '0 0 7px -9px');

      console.log('값있음');
    } else {
      $('.inIcon').hide();
      $('.outIcon').show();
      $('.outIcon').css('margin','0 0 6px 0');

      console.log('값없음');
    }
  }); */

  // 3,4번째 섹션 이미지 클릭시 이동할 페이지
  $('#infoBtn1, #infoBtn2, #infoBtn3 ,#infoBtn4 , #party_btn1, #party_btn2, #party_btn3').on(
    'click',
    function () {
      let btnId = $(this).prop('id')

      switch (btnId) {
        case 'infoBtn1':
          window.location.href = 'https://www.naver.com'
          break
        case 'infoBtn2':
          window.location.href = 'https://www.naver.com'
          break
        case 'infoBtn3':
          window.location.href = 'https://www.naver.com'
          break
        case 'infoBtn4':
          window.location.href = 'https://www.naver.com'
          break
        case 'party_btn1':
          window.location.href = 'https://www.naver.com'
          break
        case 'party_btn2':
          window.location.href = 'https://www.naver.com'
          break
        case 'party_btn3':
          window.location.href = 'https://www.naver.com'
          break
        default:
          break
      }
    },
  )
})
