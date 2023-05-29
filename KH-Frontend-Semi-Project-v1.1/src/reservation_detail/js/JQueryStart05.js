/**
 * 
 
 
 */
 
 
$(()=>{
	
	$('input:checkbox[name = all]').click(() => {
		
		//prop('속성이름') : 인수로 지정된 프로퍼티를 얻어온다.
		// checked 라는 속성의 프로퍼티(~= 속성의 현재 동적인 상태?)를 변수로 저장한 것.
		
		
		let checked = $('input:checkbox[name = all]').prop('checked');
		
		//prop('속성이름', 프로퍼티) : 인수로 지정된 속성의 프로퍼티를 변경
		// 만약 여러 개의 데이터가 있으면 자동으로 반복해서 데이터를 저장
		
		
		$('input:checkbox[name=chk]').prop('checked', checked);
		// 다른 버튼의 chk 를 선택하고		그 속성을 'checked'를 checked 상태로.
		
	});
	
	
	/*  아래 코드 수정하기 작동 안됨;
	$('#confirm').click(() => {
		
		let checkList = $('input:checkbox[name=chk]:checked');
		
		for (let i=0; i<checkList.length; i++) {
			$('#result').innerText += checkList[i].value;
		}
		
	});
	*/
	
	
	
});