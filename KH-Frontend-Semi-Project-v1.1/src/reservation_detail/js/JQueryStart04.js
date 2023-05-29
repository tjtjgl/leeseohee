/**
 * 
 
 
 이벤트 연결할 객체
 
 
 */
 
 //웹 브라우저를 실행할 때 문서가 준비 되어있다면 팝업
/*

1.
 $(document).ready(function(){
	alert("날 좋다");
});

2.
$().ready(function() {});


3. 

$().ready(() = > {
	
});


4. 
$(function(){
	
});

5. $(() = > {
	
});


*/ 


$(() => {
	//onclick, onchange,와 같이 이벤트가 'on'으로 시작
	$('select').eq(0).change(() => {
		//select 태그의 change 이벤트가 실행
		//option : selected는 option에서 선택된 태그를 가지고 온다
		let select = $('selected:eq(0) > option:selected');
		console.log(select)
		$('input:text').eq(0).val(select);
	});
	
	$('input[name = gender]').click( () => {
		let check = $('input[name=gender]:checked').val();
		console.log(check);
		
		$('input:text').eq(1).val(check);
		
	});
	
});







