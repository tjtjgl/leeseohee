

/*헤더 마우스오버*/
// let gnb = document.querySelectorAll("#gnb > li")
// let gnbElement = document.querySelector("#gnb")

// for (let i = 0; i < gnb.length; i++) {
//   gnb[i].addEventListener("mouseover", () => {

//     gnbElement.classList.add("on");

//   },)
// }


// let headerElement = document.querySelector("#header")

// header.addEventListener("mouseout", (e) => {
//   if (e.target.id == "gnb") {

//     gnbElement.classList.remove("on");

//   }
// });




/* 장바구니 아이콘 변경 */

// if (true) { // <-----------------------------------------------------------------@서희님

//   const cartIcon = $("#cartIcon"); //기존 아이콘

//   cartIcon.remove("#cartIcon_img");
//   cartIcon.html(`<i class="bi bi-bag-check-fill"><svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-bag-check-fill" viewBox="0 0 16 16">
//   <path fill-rule="evenodd" d="M10.5 3.5a2.5 2.5 0 0 0-5 0V4h5v-.5zm1 0V4H15v10a2 2 0 0 1-2 2H3a2 2 0 0 1-2-2V4h3.5v-.5a3.5 3.5 0 1 1 7 0zm-.646 5.354a.5.5 0 0 0-.708-.708L7.5 10.793 6.354 9.646a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0l3-3z"/>
// </svg></i>`);  //아이콘 교체

// }



/* 로그인시 로그아웃으로 텍스트 변경 */

// if (true) { // <-----------------------------------------------------------------@충오님

//   $("#header_login_text").text('로그아웃')

// }



/*aside 왼쪽 이미지 슬라이드  */

const slide = document.querySelector(".slide");
let slideWidth = slide.clientWidth;

// 버튼 엘리먼트 선택하기
const prevBtn = document.querySelector(".slide_prev_button");
const nextBtn = document.querySelector(".slide_next_button");

// 슬라이드 전체를 선택해 값을 변경해주기 위해 슬라이드 전체 선택하기
const slideItems = document.querySelectorAll(".slide_item");
// 현재 슬라이드 위치가 슬라이드 개수를 넘기지 않게 하기 위한 변수
const maxSlide = slideItems.length;

// 버튼 클릭할 때 마다 현재 슬라이드가 어디인지 알려주기 위한 변수

let currSlide = 1;

// 페이지네이션 생성
const pagination = document.querySelector(".slide_pagination");

for (let i = 0; i < maxSlide; i++) {
  if (i === 0) pagination.innerHTML += `<li class="active">•</li>`;
  else pagination.innerHTML += `<li>•</li>`;
}

const paginationItems = document.querySelectorAll(".slide_pagination > li");
//console.log(paginationItems);

// 버튼 엘리먼트에 클릭 이벤트 추가하기
nextBtn.addEventListener("click", () => {
  // 이후 버튼 누를 경우 현재 슬라이드를 변경
  currSlide++;

 // console.log(currSlide)

  // 마지막 슬라이드 이상으로 넘어가지 않게 하기 위해서
  if (currSlide <= maxSlide) {
    // 슬라이드를 이동시키기 위한 offset 계산
    const offset = 820 * (currSlide - 1); //slidewidth변경

    //console.log(offset)

    // 각 슬라이드 아이템의 left에 offset 적용
    slideItems.forEach((i) => {
      i.setAttribute("style", `left: ${-offset}px`);
    });
    // 슬라이드 이동 시 현재 활성화된 pagination 변경
    paginationItems.forEach((i) => i.classList.remove("active"));
    paginationItems[currSlide - 1].classList.add("active");
  } else {
    currSlide--;
  }
});
// 버튼 엘리먼트에 클릭 이벤트 추가하기
prevBtn.addEventListener("click", () => {
  // 이전 버튼 누를 경우 현재 슬라이드를 변경
  currSlide--;
  // 1번째 슬라이드 이하로 넘어가지 않게 하기 위해서
  if (currSlide > 0) {
    // 슬라이드를 이동시키기 위한 offset 계산
    const offset = 820 * (currSlide - 1);
    // 각 슬라이드 아이템의 left에 offset 적용
    slideItems.forEach((i) => {
      i.setAttribute("style", `left: ${-offset}px`);
    });
    // 슬라이드 이동 시 현재 활성화된 pagination 변경
    paginationItems.forEach((i) => i.classList.remove("active"));
    paginationItems[currSlide - 1].classList.add("active");
  } else {
    currSlide++;
  }
});

// 브라우저 화면이 조정될 때 마다 slideWidth를 변경하기 위해
window.addEventListener("resize", () => {
  slideWidth = slide.clientWidth;
});

// 각 페이지네이션 클릭 시 해당 슬라이드로 이동하기
for (let i = 0; i < maxSlide; i++) {
  // 각 페이지네이션마다 클릭 이벤트 추가하기
  paginationItems[i].addEventListener("click", () => {
    // 클릭한 페이지네이션에 따라 현재 슬라이드 변경해주기(currSlide는 시작 위치가 1이기 때문에 + 1)
    currSlide = i + 1;
    // 슬라이드를 이동시키기 위한 offset 계산
    const offset = 820 * (currSlide - 1);
    // 각 슬라이드 아이템의 left에 offset 적용
    slideItems.forEach((i) => {
      i.setAttribute("style", `left: ${-offset}px`);
    });
    // 슬라이드 이동 시 현재 활성화된 pagination 변경
    paginationItems.forEach((i) => i.classList.remove("active"));
    paginationItems[currSlide - 1].classList.add("active");
  });
}




/*aside 오른쪽 카드 스크롤 두개 연동*/
$("#card1").scroll(function () {
  $("#card2").scrollTop($("#card1").scrollTop());
  $("#card2").scrollLeft($("#card1").scrollLeft());
});
$("#card2").scroll(function () {
  $("#card1").scrollTop($("#card2").scrollTop());
  $("#card1").scrollLeft($("#card2").scrollLeft());
});




// 작은카메라이미지 슬라이드

let slideWrap = $(".slide_wrap_camera"),
  slideShow = slideWrap.find(".slide_show"),
  slideList = slideShow.find(".slide_list"),
  slides = slideList.find(".slide"),
  slideBtn = slideWrap.find(".slide_btn");

let slideCount = slides.length,
  slideWidth2 = slides.innerWidth(),
  showNum = 3,
  num = 0,
  currentIndex = 0,

  slideCopy = $(".slide:lt(" + showNum + ")").clone();
slideList.append(slideCopy);




//이미지 움직이기
function backShow() {
  if (num == 0) {
    //시작
    num = slideCount;
    slideList.css("left", -num * slideWidth2 + "px");
  }
  num--;
  slideList.stop().animate({ left: -slideWidth2 * num + "px" }, 400);
}

function nextShow() {
  if (num == slideCount) {
    //마지막
    num = 0;
    slideList.css("left", num);
  }
  num++;
  slideList.stop().animate({ left: -slideWidth2 * num + "px" }, 400);
}

//왼쪽, 오른쪽 버튼 설정
slideBtn.on("click", "button", function () {
  if ($(this).hasClass("prev")) {
    //왼쪽 버튼을 클릭
    backShow();
  } else {
    //오른쪽 버튼을 클릭
    nextShow();
  }
});

setInterval(function () {
  nextShow();
}, 2000);

/*camera slide 끝*/




/*마지막이미지 슬라이드*/

setInterval(function () {
  $('#bottom_slide>ul').delay(3000);
  $('#bottom_slide>ul').animate({ marginTop: "-810px" })
  $('#bottom_slide>ul').delay(3000);
  $('#bottom_slide>ul').animate({ marginTop: "-810px" })
  $('#bottom_slide>ul').delay(3000);
  $('#bottom_slide>ul').animate({ marginTop: "0px" })
});
