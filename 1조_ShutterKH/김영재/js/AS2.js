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


/* 임의 제품번호 */
let productNum = [
    { num: "GFX100" },
    { num: "GFX100S" },
    { num: "X-H2S" },
    { num: "test1234" },
    { num: "1234" }
];

/* 주소찾기 */

let addressBtn = document.querySelector("#kim_address_btn");
addressBtn.addEventListener("click", () => {
    new daum.Postcode({
        oncomplete: function (data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
            /* data.roadAddress : 도로명
            data.jibunAddress : 지번
            data.zonecode : 우편번호 */

            let roadAddr = data.roadAddress;
            let jibunAddr = data.jibunAddress;

            document.querySelector("#kim_zonecode").value = data.zonecode;

            if (roadAddr !== '') {
                document.querySelector("#kim_address").value = roadAddr;
            }
            else if (jibunAddr !== '') {
                document.querySelector("#kim_address").value = jibunAddr;
            }
        }
    }).open();
});





/* 로딩시 로그인유저 정보 */
let asName = document.querySelector("#kim_name");
let asPhone = document.querySelector("#kim_phone");
let asMail = document.querySelector("#kim_mail");

document.addEventListener('DOMContentLoaded', getInfo);

function getInfo() {


    let username = JSON.parse(localStorage.getItem("loginmember")).name;
    let userphone = JSON.parse(localStorage.getItem("loginmember")).phone;
    let useremail = JSON.parse(localStorage.getItem("loginmember")).email;

    asName.value = username;
    asPhone.value = userphone;
    asMail.value = useremail;

}



/* 이름 */

asName.addEventListener("blur", () => {
    let nameWrn = document.querySelector("#kim_AS_name_wrn");
    if (asName.value === '') {
        nameWrn.style.display = "block";
    } else {
        nameWrn.style.display = "none";
    }
});

/* 휴대폰 */

function checkPhone() {
    let asPhone = document.getElementById("kim_phone").value;
    let numCheck = /^[0-9]*$/g;

    let index;

    if (asPhone === '') {
        index = 0;
    } else if (!numCheck.test(asPhone)) {
        index = 1;
    } else if (asPhone.length < 9) {
        index = 2;
    }
    checkPhoneWrn(index);
}

function checkPhoneWrn(index) {
    let phoneWrn = document.querySelectorAll(".phone");
    if (index < 3) {
        phoneWrn[index].style.display = "block";

        switch (index) {
            case 0:
                phoneWrn[1].style.display = "none";
                phoneWrn[2].style.display = "none";
                break;
            case 1:
                phoneWrn[0].style.display = "none";
                phoneWrn[2].style.display = "none";
                break;
            case 2:
                phoneWrn[0].style.display = "none";
                phoneWrn[1].style.display = "none";
                break;
        }
    } else {
        phoneWrn[0].style.display = "none";
        phoneWrn[1].style.display = "none";
        phoneWrn[2].style.display = "none";
    }
}

/* 이메일체크 */
let mailCheck = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;

asMail.addEventListener("input", () => {
    checkMail();
});

asMail.addEventListener("blur", () => {
    checkMail();
});

function checkMail() {
    let mailWrn = document.querySelectorAll(".mail");

    if (asMail.value === '') {
        mailWrn[0].style.display = "block";
        mailWrn[1].style.display = "none";
    } else if (!mailCheck.test(asMail.value)) {
        mailWrn[0].style.display = "none";
        mailWrn[1].style.display = "block";
    } else {
        mailWrn[0].style.display = "none";
        mailWrn[1].style.display = "none";
    }
}

/* 택배?체크 */
let service = document.querySelectorAll("input[type=radio]");
let addr = document.querySelector(".kim_add_row");

for (let i = 0; i < service.length; i++) {
    service[i].addEventListener("change", () => {
        let send = document.querySelector("input[name=send]:checked");
        let receive = document.querySelector("input[name=receive]:checked");

        if (send === null) {
            if (receive.value === "1") {
                addr.style.display = "table-row";
            } else {
                addr.style.display = "none";
            }
        } else if (send !== null) {
            if (send.value === "1" || receive.value === "1") {
                addr.style.display = "table-row";
            } else {
                addr.style.display = "none";
            }
        }

    });
}

/* 제품 번호 */


let checkProduct; /* submit체크용 */
let productNumBtn = document.querySelector("#kim_product_confirm_btn");
let productInput = document.querySelector("#kim_AS_product");

productNumBtn.addEventListener("click", () => {
    let productWrn1 = document.querySelector("#kim_AS_product_wrn1");
    let productWrn2 = document.querySelector("#kim_AS_product_wrn2");

    if (productInput.value === '') {
        productWrn1.style.display = "block";
        productWrn2.style.display = "none";
    } else if (confrimProduct(productInput.value)) {
        checkProduct = true;
    } else {
        checkProduct = false;
    }
});

function confrimProduct(value) {
    for (let i = 0; i < productNum.length; i++) {
        if (productNum[i].num === value) {
            Swal.fire({
                icon: "success"
                , title: '<span class="popup-all popup-success">정상적으로 확인 되었습니다.'
                , confirmButtonColor: '#D94925'
                , closeOnClickOutside: false
            });
            return true;
        }
    }
    Swal.fire({
        icon: "error"
        , title: '<span class="popup-all popup-error">입력하신 제품번호는 없는 번호입니다.'
        , confirmButtonColor: '#2F4858'
        , closeOnClickOutside: false
    });
    return false;
}


/* A/S 요청사항 */
let request = document.querySelector("#kim_AS_request");
request.addEventListener("blur", () => {
    let requestWrn = document.querySelector("#kim_AS_request_wrn");
    if (request.value === '') {
        requestWrn.style.display = "block";
    } else {
        requestWrn.style.display = "none";
    }
});

/* 신청하기 눌렀을 때 */

let submitBtn = document.querySelector("button[type=submit]");

submitBtn.addEventListener("click", (e) => {
    e.preventDefault();

    /* 이름 */
    /* if (asName.value === '') {
        alert("이름을 입력하세요.");
        asName.focus();
        return;
    } */

    /* 휴대폰 */
    /* if (asPhone.value === '') {
        alert("연락처를 입력하세요.");
        asPhone.focus();
        return;
    } */

    /* 이메일 */
    /* if (asMail.value === '') {
        alert("이메일을 입력하세요.");
        asMail.focus();
        return;
    } */

    /* 접수 */

    let send = document.querySelector("input[name=send]:checked");
    let sendBtn = document.querySelector("input[name=send]");
    let sendWrn = document.querySelector("#kim_AS_send_wrn");
    if (send === null) {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">접수 방법을 선택하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {
            sendBtn.focus();
            sendWrn.style.display = "block";
        });
        return;
    } else {
        sendWrn.style.display = "none";
    }

    /* 수령 */

    let recevie = document.querySelector("input[name=receive]:checked");
    let recevieBtn = document.querySelector("input[name=receive]");
    let receiveWrn = document.querySelector("#kim_AS_recevie_wrn");

    if (recevie === null) {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">수령 방법을 선택하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {
            recevieBtn.focus();
            receiveWrn.style.display = "block";
        });
        return;
    } else {
        receiveWrn.style.display = "none";
    }

    /* 주소 */
    let addrInput = document.querySelector("#kim_detail_address");
    if ((addr.style.display === "table-row") && (addrInput.value === '')) {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">주소를 입력하세요.'
           , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {

            addrInput.focus();
        });
        return;

    }

    /* 제품번호 */
    if (productInput.value === '') {

        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">제품번호를 입력하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {

            productInput.focus();
        });
        return;

    }

    if (checkProduct === false) {
        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">제품번호를 인증하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {

            productInput.focus();
        });
        return;
    }

    /* 요청사항 */
    if (request.value === '') {

        Swal.fire({
            icon: "error"
            , title: '<span class="popup-all popup-error">요청사항을 입력하세요.'
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {

            request.focus();
        });

        return;
    }

    Swal.fire({
        icon: "success"
        , title: '<span class="popup-all popup-success"></span>정상적으로 접수 되었습니다.'
        , confirmButtonColor: '#D94925'
        , closeOnClickOutside: false
    }).then(function () {
        window.location.href = "/main.html";
    });
});