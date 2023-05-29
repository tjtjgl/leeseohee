let cartChk = JSON.parse(localStorage.getItem('addCartChk')) || false;
let loginChk = JSON.parse(localStorage.getItem('loginmember'));

const emptyDiv = document.querySelector('.lee_empty')
const cartDiv1 = document.querySelector('.lee_cart')
const cartDiv2 = document.querySelector('.lee_orderBtn')
const cartDiv3 = document.querySelector('.lee_totlaPrice')


const selAllBtn = document.querySelector('#lee_selAll')
const selBtn = document.querySelector('#lee_sel')
const rmvBtn = document.querySelector('#lee_remove')
const sel_rmvBtn = document.querySelector('#lee_removeBtn');

//장바구니 비었을 때
function updateCartDisplay() {
    if (cartChk) {
        cartDiv1.style.display = 'block';
        cartDiv2.style.display = 'flex';
        cartDiv3.style.display = 'block';
        emptyDiv.style.display = 'none';
    } else {
        cartDiv1.style.display = 'none';
        cartDiv2.style.display = 'none';
        cartDiv3.style.display = 'none';
        emptyDiv.style.display = 'block';
    }
}
updateCartDisplay(); //항상 실행

//엑스표시
rmvBtn.addEventListener('click', () => {
    cartChk = false;
    localStorage.setItem("addCartChk", JSON.stringify(cartChk));
    location.reload();

    updateCartDisplay();
})

//선택상품삭제 
sel_rmvBtn.addEventListener('click',()=>{
    if (chkbox.checked) {
    cartChk = false;
    localStorage.setItem("addCartChk", JSON.stringify(cartChk));
    location.reload();

    updateCartDisplay();
    } else {
        Swal.fire({
            icon: "error"
            , title: "<span class='popup-all pupup-error'>선택된 상품이 없습니다.</span>"
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {
            return;
        });
    }
});

//====제품 가격 계산하기=====
let orderList;
const chkbox = document.querySelector('#lee_sel')
const pri = document.querySelector('#lee_price')
const totalPri = document.querySelector('#lee_totalPrice')
const priInfo = document.querySelector('#lee_priceInfo')
const totalPriInfo = document.querySelector('#lee_totalPriceInfo')

const amount = document.querySelector('#lee_amount')

//초기
document.addEventListener('DOMContentLoaded', () => {
    orderList = [];
    let selAmount = parseInt(amount.value);
    let totalPrice = parseInt(pri.title) * selAmount;

    totalPri.innerText = totalPrice.toLocaleString('en-US') + '원';

    orderList = [selAmount, totalPrice, parseInt(pri.title)]

    return orderList;
});

//옵션 변경될 때
amount.addEventListener('change', (e) => {
    orderList = [];
    let selAmount = parseInt(e.target.value);
    let totalPrice = parseInt(pri.title) * selAmount

    totalPri.innerText = totalPrice.toLocaleString('en-US') + '원';

    //체크박스 체크 된 상태로 옵션 변경 시
    if (chkbox.checked) {
        priInfo.innerText = totalPri.innerText;
        totalPriInfo.innerText = (totalPrice + 2500).toLocaleString('en-US') + '원';
    }

    orderList = [selAmount, totalPrice, parseInt(pri.title)]

    return orderList
})

//체크되면 총금액 표시
chkbox.addEventListener('change', (e) => {
    if (e.target.checked) {
        priInfo.innerText = orderList[1].toLocaleString('en-US') + '원';
        totalPriInfo.innerText = (orderList[1] + 2500).toLocaleString('en-US') + '원';
    } else {
        priInfo.innerText = '0원';
        totalPriInfo.innerText = '0원';
    }


})

//==========================

//구매하기 눌렀을 때 전달해 줄 객체(개수 / 총 가격)
const item = {};

const modal = document.getElementById("lee_mymodal");
const orderBtn = document.querySelector('#lee_orderBtn')

orderBtn.addEventListener('click', () => {

    if (chkbox.checked) {
        localStorage.setItem('orderList', JSON.stringify(orderList))

        if (loginChk !== '' && loginChk !== null && loginChk !== undefined) {
            window.open('구매.html', '_self')
        }
        else {
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
                    window.location = "../권충오/login.html";
                }
            });
        }

    } else {
        Swal.fire({
            icon: "error"
            , title: "<span class='popup-all pupup-error'>선택된 상품이 없습니다.</span>"
            , confirmButtonColor: '#2F4858'
            , closeOnClickOutside: false
        }).then(function () {
            return;
        });
    }

    // function closeModal(result) {
    //     modal.style.display = "none";
    //     if (result) {
    //         window.location.href = "../권충오/login.html"
    //     }
    // }
});

