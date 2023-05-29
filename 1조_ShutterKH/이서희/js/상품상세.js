let addCartChk = JSON.parse(localStorage.getItem('addCartChk')) || false;
let loginChk = JSON.parse(localStorage.getItem('loginmember'));

const productName = document.querySelector('.lee_mainTitle')
const cartBtn = document.querySelector('#lee_addCart')



// , confirmButtonColor: '#D94925'

function addCart() {
  if (!addCartChk) {
    Swal.fire({
      icon: "success"
      , title: '<span class="popup-all popup-success">장바구니에 추가되었습니다.<br>즐거운 쇼핑 되세요.'
      , confirmButtonColor: '#D94925'
      , closeOnClickOutside: false
    }).then(function () {
      addCartChk = true;
      localStorage.setItem('addCartChk', JSON.stringify(addCartChk))
      location.reload();
    });
  }else {
        Swal.fire({
          icon: "error"
          , title: "<span class='popup-all pupup-error'>이미 추가된 상품입니다.</span>"
          , confirmButtonColor: '#2F4858'
          , closeOnClickOutside: false
        })
      }

}
  cartBtn.addEventListener('click', addCart)
  //================================


  //구매하기 버튼 누르면 무조건 개수는 1개만, 로그인 후 이용 가능
  const modal = document.getElementById("lee_mymodal");

  function clearOrder() {
    if (loginChk !== '' && loginChk !== null && loginChk !== undefined) {
      orderList = [1, 12999000, 12999000]
      localStorage.setItem('orderList', JSON.stringify(orderList))
      window.open('구매.html', '_self')
    } else {
      // modal.style.display = "flex";
      Swal.fire({
        title: '<span class="popup-all popup-question">ShutterKH는 회원만 구매 가능합니다.</span>',
        icon: 'question',
        showCancelButton: true,
        confirmButtonText: '로그인하기',
        cancelButtonText: '돌아가기',
        confirmButtonColor: '#D94925',
        cancelButtonColor: 'black',
        closeOnClickOutside: false
      }).then((result) => {
        if (result.isConfirmed) {
            window.location = "/권충오/login.html";
        }
    });
  }
}

  // function closeModal(result) {
  //   modal.style.display = "none";

  //   if (result) {
  //     window.open('../권충오/login.html', '_self')
  //   }
  // }

  //================================



  //사양 더보기 -> 높이를 이용해서
  const specTable = document.querySelector('.specTable');
  const showBtn = document.getElementById('lee_showBtn');
  const mask = document.querySelector('.mask')
  let expanded1 = false;

  showBtn.addEventListener('click', function () {
    if (!expanded1) {
      specTable.classList.add('show');
      showBtn.innerHTML = '접기 <i class="fa-solid fa-chevron-up"></i>';
      mask.style.display = 'none';
    } else {
      specTable.classList.remove('show');
      showBtn.innerHTML = '더 보기 <i class="fa-solid fa-chevron-down"></i>';
      mask.style.display = 'block';
    }

    expanded1 = !expanded1;
  });

  //배송안내 더보기 -> 토글을 이용해서

  const moreBtn1 = document.getElementById("lee_moreBtn1");
  const moreTxt1 = document.getElementById("lee_moreText1");

  const deliveryContent1 = document.getElementById("lee_deliveryContent1");

  let expanded2 = false;

  moreTxt1.addEventListener('click', () => {
    if (!expanded2) {
      deliveryContent1.classList.add('showMore');
      moreBtn1.innerHTML = '<i class="fa-solid fa-chevron-up fa-xl"></i>';

      if (expanded3) {
        deliveryContent2.classList.remove('showMore');
        moreBtn2.innerHTML = '<i class="fa-solid fa-chevron-down fa-xl"></i>';
        expanded3 = !expanded3;
      }
    } else {
      deliveryContent1.classList.remove('showMore');
      moreBtn1.innerHTML = '<i class="fa-solid fa-chevron-down fa-xl"></i>';
    }

    expanded2 = !expanded2;
  });





  //주문취소 더보기 -> 토글을 이용해서
  const moreTxt2 = document.getElementById("lee_moreText2");
  const moreBtn2 = document.getElementById("lee_moreBtn2");
  const deliveryContent2 = document.getElementById("lee_deliveryContent2");

  let expanded3 = false;
  moreTxt2.addEventListener('click', () => {
    if (!expanded3) {
      deliveryContent2.classList.add('showMore');
      moreBtn2.innerHTML = '<i class="fa-solid fa-chevron-up fa-xl"></i>';
      if (expanded2) {
        deliveryContent1.classList.remove('showMore');
        moreBtn1.innerHTML = '<i class="fa-solid fa-chevron-down fa-xl"></i>';
        expanded2 = !expanded2;
      }
    } else {
      deliveryContent2.classList.remove('showMore');
      moreBtn2.innerHTML = '<i class="fa-solid fa-chevron-down fa-xl"></i>';
    }

    expanded3 = !expanded3;
  });
