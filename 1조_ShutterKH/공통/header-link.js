
//==================================헤더 링크 연결(영재님)
const navLink = document.querySelectorAll(".nav_sub");
const support = document.querySelectorAll(".nav_title")[2];
const logo = document.querySelector("#header #logo");
const cartIcon = document.querySelector("#cartIcon"); // 밑에 아이콘 변경 시에도 사용
const loginBtn = document.getElementById("header_login_text");

let links = [
  "../권충오/newProduct.html",
  "../구승완/프로모션.html",
  "../이서희/제품목록.html",
  "../구승완/전시.html",
  "../구승완/라이브러리.html",
  "../김영재/notice.html",
  "../김영재/AS1.html"];

for (let i = 0; i < navLink.length; i++) {
  navLink[i].addEventListener("click", (e) => {
    navLink[i].setAttribute("href", links[i]);
  });
}

support.addEventListener("click", () => {
  support.setAttribute("href", "../김영재/고객지원.html");
});

cartIcon.addEventListener('click', () => {
  cartIcon.setAttribute("href","../이서희/장바구니.html")
})

loginBtn.addEventListener('click', () => {
  loginBtn.setAttribute("href", "../권충오/login.html");
});

logo.addEventListener('click', () => {
  location.href = "../main.html"
})


//=============================헤더js(소정님)
let gnb = document.querySelectorAll("#gnb > li")
let gnbElement = document.querySelector("#gnb")

for (let i = 0; i < gnb.length; i++) {
  gnb[i].addEventListener("mouseover", () => {
    gnbElement.classList.add("on");
  })
}

let headerElement = document.querySelector("#header")

header.addEventListener("mouseout", (e) => {
  if (e.target.id == "gnb") {
    gnbElement.classList.remove("on")
  }
})

/* =======================로그인시 로그아웃으로 텍스트 변경 */

/* 로그인 정보 확인 */
function loginCheck() {
  return JSON.parse(localStorage.getItem("loginmember"));
}

/* 로그인 정보 없으면 "로그인", 있으면 "로그아웃" */
if (loginCheck() === null) { // <------|| loginCheck() ==='' || loginCheck() ===false || loginCheck() ===undefined-----------------@충오님
  $("#header_login_text").text('로그인');

} else {
  $("#header_login_text").text('로그아웃');
}

/* 클릭시 팝업누르고 확인 */
$("#header_login_text").click(() => {
  if (loginCheck() === null) { //로그인 정보 없으면 로그인페이지로 이동
    window.location.href = "../권충오/login.html";
  } else {
    Swal.fire({
      title: '<span class="popup-all popup-question">로그아웃 하시겠습니까?</span>',
      icon: 'question',
      showCancelButton: true,
      confirmButtonText: '예',
      cancelButtonText: '아니오',
      confirmButtonColor: '#D94925',
      cancelButtonColor: 'black',
      closeOnClickOutside: false

    }).then((result) => {  //예 누르면 로그인정보 삭제후 새로고침
      if (result.isConfirmed) {
        Swal.fire({
          title: '<span class="popup-all popup-success">로그아웃 되었습니다.</span>',
          icon: "success",
          confirmButtonColor: '#D94925',
          closeOnClickOutside: false
        }).then(() => {
          localStorage.removeItem("loginmember");
          window.location.href = "../main.html";
        });
      }
    });
  }
});

// <span class="popup-all popup-error">

//======================장바구니
let cartItemChk = JSON.parse(localStorage.getItem('addCartChk')) || false;
const cartIconImg = cartIcon.querySelector("#cartIcon_img"); // 아이콘 이미지 선택

function addCart() {
  if (cartItemChk) {
    cartIconImg.remove();// 아이콘 이미지 제거
    cartIcon.innerHTML = `<i class="bi bi-bag-check-fill"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bag-check-fill" viewBox="0 0 16 16">
    <path fill-rule="evenodd" d="M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5v-.5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0zm-.646 5.354a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z"/>
  </svg></i>`; // 아이콘 교체
 
  } else {
    const cartIcon = $("#cartIcon");
  }
}

addCart();
