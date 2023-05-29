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

/* 카테고리 정렬 */
/* let categoryFilter = document.querySelectorAll(".kim_category_btn"); */

function categoryFilter(noticeCategory, selCategory){
    noticeCategory.forEach((item) => {
        if(item.innerText === selCategory){
            item.parentNode.style.display = "table-row";
        } else {
            item.parentNode.style.display = "none";
        }
    });
}

function categoryFilterAll(noticeCategory){
    noticeCategory.forEach((item) => {
        item.parentNode.style.display = "table-row";
    });
}

/* 전체 */
let categoryAll = document.querySelector("#kim_category_all");
categoryAll.addEventListener("click", () => {
    let noticeCategory = document.querySelectorAll(".kim_notice_category");
    categoryFilterAll(noticeCategory);
});

/* cs소식 */
let categoryNews = document.querySelector("#kim_category_news");
categoryNews.addEventListener("click", () => {
    let selCategory = categoryNews.innerText;
    let noticeCategory = document.querySelectorAll(".kim_notice_category");
    categoryFilter(noticeCategory, selCategory);
});

/* 보도자료 */
let categoryRelease = document.querySelector("#kim_category_release");
categoryRelease.addEventListener("click", () => {
    let selCategory = categoryRelease.innerText;
    let noticeCategory = document.querySelectorAll(".kim_notice_category");
    categoryFilter(noticeCategory, selCategory);
});

/* 이벤트 */
let categoryEvent = document.querySelector("#kim_category_event");
categoryEvent.addEventListener("click", () => {
    let selCategory = categoryEvent.innerText;
    let noticeCategory = document.querySelectorAll(".kim_notice_category");
    categoryFilter(noticeCategory, selCategory);
});

/* 매장정보 */
let categoryInfo = document.querySelector("#kim_category_info");
categoryInfo.addEventListener("click", () => {
    let selCategory = categoryInfo.innerText;
    let noticeCategory = document.querySelectorAll(".kim_notice_category");
    categoryFilter(noticeCategory, selCategory);
});

/* 일반공지 */
let categoryDefault = document.querySelector("#kim_category_default");
categoryDefault.addEventListener("click", () => {
    let selCategory = categoryDefault.innerText;
    let noticeCategory = document.querySelectorAll(".kim_notice_category");
    categoryFilter(noticeCategory, selCategory);
});


/* 작성글 표시 */

document.addEventListener('DOMContentLoaded', getList);
let noticeBody = document.querySelector(".kim_make_notice");
function getList(){

    
    /* 목록 틀 생성 */
    let localList = JSON.parse(localStorage.getItem("list"));
    
    if(localList !== null){
        localList.forEach((list) => {
            let tr = document.createElement("tr");
            let td1 = document.createElement("td");
            let td2 = document.createElement("td");
            let td3 = document.createElement("td");
            let a = document.createElement("a");
        
            /* 카테고리 */
            td1.classList.add("kim_notice_category");
            td1.innerText = list.category;
            
            /* 제목 */
            td2.classList.add("kim_notice_title");
            a.setAttribute("href","#");
            a.setAttribute("onclick","viewNotice(this)");
            a.classList.add("kim_notice_link");
            a.innerText = list.title;
            td2.appendChild(a);
        
            /* 날짜 */
            td3.classList.add("kim_notice_date");
            td3.innerText = list.date;
            tr.append(td1, td2, td3);
            
            noticeBody.prepend(tr);
            
        });
    }

    
}
/* 글쓰기 눌렀을 때 */
let write_btn = document.querySelector(".kim_write_btn");

write_btn.addEventListener("click", () => {
    if(JSON.parse(localStorage.getItem("loginmember")) === null){
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">로그인 후 시도하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function(){
            window.location.href = "/권충오/login.html";
        });
    } else {
        window.location.href = "notice_write.html";
    }
});
/* function checkLogin() {

    if(JSON.parse(localStorage.getItem("loginmember")) === null){
        alert("로그인 후 시도하세요.");
        window.location.href = "notice.html";
    } else {
        let username = JSON.parse(localStorage.getItem("loginmember")).name;
        let userphone = JSON.parse(localStorage.getItem("loginmember")).phone;
        let useremail = JSON.parse(localStorage.getItem("loginmember")).email;
    
        asName.value = username;
        asPhone.value = userphone;
        asMail.value = useremail;
    }
} */

/* 공지사항 눌렀을 때 */

function viewNotice(e){

    let viewTitle = e.innerText;
    localStorage.setItem("viewtitle", JSON.stringify(viewTitle));
    window.location.href = "notice_view.html";
}



/* let viewLink = document.querySelector(".kim_notice_link"); */



/* let viewLink = document.querySelectorAll(".kim_notice_link"); */


/* viewLink[0].addEventListener("click", (e) => {
    console.log(123);
    e.preventDefault();
    let viewTitle = viewLink[0].innerText;
    localStorage.setItem("0", JSON.stringify(viewTitle));
    window.location.href = "notice_view.html";
}); */

/* for(let i = 0; i < viewLink.length; i++){
    viewLink[i].addEventListener("click", (e) => {
        console.log(123);
        
        let viewTitle = viewLink[i].innerText;
        localStorage.setItem("viewtitle",JSON.stringify(viewTitle));
    });
} */
