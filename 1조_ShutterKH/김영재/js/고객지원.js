// const navLink = document.querySelectorAll(".nav_sub");
// const support = document.querySelectorAll(".nav_title")[2];

// let links = ["newProduct.html",
//  "프로모션.html",
//  "제품.html",
//  "전시.html",
//  "라이브러리.html",
//  "notice.html",
//  "AS1.html"];

// for(let i = 0; i < navLink.length; i++){
//     navLink[i].addEventListener("click", (e) => {
//         navLink[i].setAttribute("href", links[i]);
//     });
// }

// support.addEventListener("click", () => {
//     support.setAttribute("href", "고객지원.html");
// });


window.onload = function() {
	window.addEventListener("scroll", function(e) {
		scrollEvent();
	});
}

let scrollEvent = function() {
	// 사용자 모니터 화면 높이 + 스크롤이 움직인 높이
	let scroll = window.innerHeight + window.scrollY;
	
    // 애니메이션 효과를 넣을 DOM 객체 배열
	let itemList = document.querySelectorAll(".kim_img_box");
	 
    itemList.forEach((item) => {
        if(item.offsetTop < (scroll-400)){
            item.classList.remove("img_off");
            item.classList.add("img_on");
        }/*  else {
            item.classList.remove("img_on");
            item.classList.add("img_off");
        } */
    });
}