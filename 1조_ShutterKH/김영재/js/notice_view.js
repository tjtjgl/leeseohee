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


/* 값 받아오기 */
document.addEventListener('DOMContentLoaded', getView);

let viewHeader = document.querySelector(".kim_notice_view_header");
let viewBody = document.querySelector(".kim_notice_view_body");

function getView() {

    let title = JSON.parse(localStorage.getItem("viewtitle"));
    let localList = JSON.parse(localStorage.getItem("list"));

    localList.forEach((list) => {
        if (list.title === title) {
            let p1 = document.createElement("p");
            p1.classList.add("kim_notice_view_date");
            p1.innerText = list.date;

            let h2 = document.createElement("h2");
            h2.innerText = list.title;

            let p2 = document.createElement("p");
            p2.innerText = list.content;

            viewHeader.append(p1, h2);
            viewBody.append(p2);
        }
    });
}

/* 삭제 */

let removeBtn = document.querySelector("#remove_notice");
removeBtn.addEventListener("click", () => {

    
    Swal.fire({
        title: '<span class="popup-all popup-question">삭제 하겠습니까?',
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#D94925',
        cancelButtonColor: 'black',
        confirmButtonText: '예',
        cancelButtonText: '아니오',
        /* reverseButtons: true,  */

    }).then((result) => {
        if (result.isConfirmed) {
            
            let removeTitle = JSON.parse(localStorage.getItem("viewtitle"));
            let localList = JSON.parse(localStorage.getItem("list"));
        
            let removeList = localList.filter(list => list.title !== removeTitle);
            localStorage.setItem("list", JSON.stringify(removeList));
            window.location.href = "notice.html";
        }
    });

    /* if (confirm("삭제 하시겠습니까?")) {
        window.location.href = link;
    } */
});

/* 수정 */

let editBtn = document.querySelector("#edit_notice");
editBtn.addEventListener("click", () => {

    Swal.fire({
        title: '<span class="popup-all popup-question">수정 하겠습니까?',
        icon: 'question',
        showCancelButton: true,
        confirmButtonColor: '#D94925',
        cancelButtonColor: 'black',
        confirmButtonText: '예',
        cancelButtonText: '아니오',
        /* reverseButtons: true, */

    }).then((result) => {
        if (result.isConfirmed) {
            
            let editTitle = JSON.parse(localStorage.getItem("viewtitle"));
        let localList = JSON.parse(localStorage.getItem("list"));

        let editContent = localList.filter(list => list.title === editTitle);
        localStorage.setItem("edit", JSON.stringify(editContent));
        window.location.href = "notice_write.html";
        }
    });
});