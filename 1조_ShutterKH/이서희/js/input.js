// HTML에서 모든 input 요소를 가져옵니다.
const inputFields = document.querySelectorAll('input');

// input 창 포커스 시 테두리 색상 변경 함수를 정의합니다.
function changeBorderColor(event) {
  event.target.style.border = '2px solid #D94925'; // 포커스된 input 요소의 테두리 색상을 변경합니다.
}

// input 창 포커스 아웃 시 테두리 색상 원래대로 변경 함수를 정의합니다.
function revertBorderColor(event) {
  event.target.style.border = ''; // 원래대로 테두리 스타일을 설정합니다.
}

// 모든 input 요소에 대해 focus와 blur 이벤트에 대한 리스너를 등록합니다.
inputFields.forEach((inputField) => {
  inputField.addEventListener('focus', changeBorderColor);
  inputField.addEventListener('blur', revertBorderColor);
  inputField.addEventListener('mouseover', changeBorderColor);
  inputField.addEventListener('mouseout', revertBorderColor);
});



