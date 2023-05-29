
const orderMem = document.querySelectorAll('.s-2 input[type="text"]')
const deliveryList = document.querySelectorAll('.s-3 input[type="text"]')
const sameBtn = document.querySelector("#orderChk");
const payBtn = document.querySelector("#lee_paybtn");

//=====주문 수량 및 가격======
const infoALL = document.querySelector('#lee_orderInfo')
const infoPrice1 = document.querySelector('#lee_priceInfo1')
const infoPrice2 = document.querySelector('#lee_priceInfo2')
const infoPriceTotal = document.querySelector('#lee_totalPrice')
let orderInfo = JSON.parse(localStorage.getItem('orderList'));

//변경
document.addEventListener('DOMContentLoaded', () => {
infoALL.innerText = orderInfo[0]+'개 * '+orderInfo[2].toLocaleString('en-US') + '원';
infoPrice1.innerText = orderInfo[1].toLocaleString('en-US') + '원';
infoPrice2.innerText = orderInfo[1].toLocaleString('en-US') + '원';
infoPriceTotal.innerText = (orderInfo[1]+2500).toLocaleString('en-US') + '원';
});
//=====================



const addrBtn = document.querySelector("#kim_address_btn");
const loginMem = JSON.parse(localStorage.getItem('loginmember')) || null;

orderMem[0].value = loginMem.name;
orderMem[1].value = loginMem.phone;
orderMem[2].value = loginMem.email;

sameBtn.addEventListener('click', ()=>{

if(sameBtn.checked){
    deliveryList[0].value = loginMem.name;
    deliveryList[1].value = loginMem.phone;
    deliveryList[0].disabled=true;
    deliveryList[1].disabled=true;
} else {
    deliveryList[0].disabled=false;
    deliveryList[1].disabled=false;
    deliveryList[0].value = ""
    deliveryList[1].value = ""
}

})

// 주소찾기버튼(영재님)
addrBtn.addEventListener("click", () => {
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

//유효성 검사