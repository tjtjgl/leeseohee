
// const navLink = document.querySelectorAll(".nav_sub");
// const support = document.querySelectorAll(".nav_title")[2];

// let links = [
//     "newProduct.html",
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


let goBtn = document.querySelector("#go_apply_btn");
goBtn.addEventListener("click", () => {

    if (JSON.parse(localStorage.getItem("loginmember")) === null) {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">로그인 후 시도하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {
            window.location.href = "../권충오/login.html";
        });
    } else {
        window.location.href = "AS2.html";
    }
});
