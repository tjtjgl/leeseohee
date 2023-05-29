// const navLink = document.querySelectorAll(".nav_sub");
// const support = document.querySelectorAll(".nav_title")[2];

// let links = ["newProduct.html",
//     "프로모션.html",
//     "제품.html",
//     "전시.html",
//     "라이브러리.html",
//     "notice.html",
//     "AS1.html"];

// for (let i = 0; i < navLink.length; i++) {
//     navLink[i].addEventListener("click", (e) => {
//         navLink[i].setAttribute("href", links[i]);
//     });
// }

// support.addEventListener("click", () => {
//     support.setAttribute("href", "고객지원.html");
// });


document.addEventListener("DOMContentLoaded", () => {
    let edit = JSON.parse(localStorage.getItem("edit"));

    if (edit !== null) {
        let titleText = document.querySelector("#kim_notice_write_title");
        let contentText = document.querySelector("#kim_notice_write_content");

        titleText.value = edit[0].title;
        contentText.value = edit[0].content;
    }


});

/* 취소 버튼 */
let cancelBtn = document.querySelector("#kim_cancel_btn");
cancelBtn.addEventListener("click", () => {
    let link = "notice.html";

    Swal.fire({
        title: '<span class="popup-all popup-question">취소 하시겠습니까?',
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#D94925',
      cancelButtonColor: 'black',
        confirmButtonText: '예',
        cancelButtonText: '아니오',
        /* reverseButtons: true,  */

    }).then((result) => {
        if (result.isConfirmed) {
            window.location.href = link;
        }
    });

});

/* 작성 버튼 */
let writeBtn = document.querySelector("#kim_write_btn");
writeBtn.addEventListener("click", (e) => {
    e.preventDefault();

    let input = document.querySelectorAll(".kim_input");

    for (let i = 0; i < input.length; i++) {
        if (input[i].value === "") {
            Swal.fire({
                icon: "error"
                , title: '<span class="popup-all popup-error">제목과 내용을 입력하세요.'
                ,confirmButtonColor: '#2F4858'
                , closeOnClickOutside: false
            }).then(() => {
                e.preventDefault();
                input[i].focus();
            });
            return;
        }
    }

    Swal.fire({
        title: '<span class="popup-all popup-question">등록 하시겠습니까?',
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#D94925',
        cancelButtonColor: 'black',
        confirmButtonText: '예',
        cancelButtonText: '아니오',
        /* reverseButtons: true,  */

    }).then((result) => {
        if (result.isConfirmed) {
            saveLocal();

            window.location.href = "notice.html";
        }
    });


});



function saveLocal() {

    let noticeList;

    /* 카테고리 */
    let category = document.querySelector("#kim_category_sel");
    let categoryText = category[category.selectedIndex].innerText;


    /* 제목 */
    let titleText = document.querySelector("#kim_notice_write_title").value;

    /* 내용 */
    let contentText = document.querySelector("#kim_notice_write_content").value;

    /* 날짜 */
    let today = new Date();
    let year = today.getFullYear();
    let month = ("0" + (today.getMonth() + 1)).slice(-2);
    let day = ("0" + today.getDate()).slice(-2);

    let dayStr = year + "-" + month + "-" + day;

    /* 게시판 리스트가 있는지 */
    if (JSON.parse(localStorage.getItem("list")) === null) {
        noticeList = [];
    } else {
        noticeList = JSON.parse(localStorage.getItem("list"));
    }

    /* 수정값이 있는지 */
    let edit = JSON.parse(localStorage.getItem("edit"));
    if (edit === null) {
        noticeList.push({
            category: categoryText,
            title: titleText,
            content: contentText,
            date: dayStr
        });
    } else {
        let index = noticeList.findIndex((list) => list.title === edit[0].title);
        noticeList[index] = {
            category: categoryText,
            title: titleText,
            content: contentText,
            date: dayStr
        };
        localStorage.removeItem("edit");
    }

    localStorage.setItem("list", JSON.stringify(noticeList));
}