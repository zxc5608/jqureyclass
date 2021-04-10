/**
 * 
 */

function idcheck(){
	idvalue = $('#id').val().trim();        
	
	//공백체크 
	if(idvalue.length<1){
		//alert("아이디입력");
		$('#idspan').html("아이디입력").css('color','red');
		return false;
	}
	//아이디 길이 4-12
	if(idvalue.length<4||idvalue.length>12){
		//alert("아이디 4~12사이");
		$('#idspan').html("아이디 4~12사이").css('color','red');
		return false;
	}
	//아이디 정규식 - 소문자로 시작하고 대문자와 숫자로 조합한다. 
	idreg =/^[a-z][a-zA-Z0-9]{3,7}$/;
	if(!(idreg.test(idvalue))){
		//alert("아이디 형식오류");
		$('#idspan').html("사용불가능아이디").css('color','red');
		return false;
	}
	return true;
}

function regcheck() {
	idvalue=$('#id').val().trim();
	
	if(idvalue.length<1){
		//alert("아이디 입력");
		$('#idspan').html("아이디입력").css('color','red');
		return false;
	}
	
	// 이름 - 공백, 길이 , 정규식 
	namevalue = $('#name').val().trim();
	// 공백 체크
	if(namevalue.length <1){
	//	alert("이름입력");
		$('#nmspan').html("아이디입력").css('color','red');
		return false;
	}
	// 이름 길이 2-5
	if(namevalue.length<2 || namevalue.length>5){
		//alert("이름형식 오류");
		$('#nmspan').html("이름의 길이는 2~5글자입니다").css('color','red');
		return false;
	}
	// 이름 정규식
	namereg = /^[가-힣]{2,5}$/; 
	if(!(namereg.test(namevalue))){
		//alert("이름 형식오류");
		$('#nmspan').html("이름형식 오류입니다").css('color','red');
		return false;
	}else{
		$('#nmspan').html("이름 성공").css('color','blue');
		
	}


	//생년월일 정규식 
	birvalue =$('#bir').val().trim();
	sub = parseInt(birvalue.substring(0,4));
	if(birvalue ==null ) {
		//alert("생년월일을 입력해주세요");
		$('#birspan').html("생년월일을 입력해주세요").css('color','blue');
		return false;
	}
	age = 2020-sub;
	if(age < 10 ){
		//alert("당신의 나이는 " + age +"살 입니다. 가입이 불가합니다..");
		$('#birspan').html("당신의 나이는 "+age+"살입니다 가입 불가!").css('color','red');
		return false;
	}else{
		$('#birspan').html("당신의 나이는 "+age+"살입니다 가입불가").css('color','red');
	}
	
	
	//이메일 - 공백, 정규식
	mailvalue = $('#email').val().trim();
	mailreg=/^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z]+){1,2}$/;
	//이메일 -공백
	if(mailvalue.length <1){
		//alert("이메일입력");
		$('#mailspan').html("이메일 입력").css('color','red');
		return false;
	}
	// 이메일 정규식
	if(!(mailreg.test(mailvalue))){
		//alert("이메일 형식오류");
		$('#mailspan').html("이메일 형식 오류입니다.").css('color','red');
		return false;
	}else{
		$('#mailspan').html("이메일 성공.").css('color','blue');
	}
	
	//비밀번호 - 공백. 길이, 정규식
	passvalue =$('#pass').val().trim();
	passvalue1=$('#passck').val().trim();
	
	// 비밀번호 정규식 
	passreg = /^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&]).{8,12}$/;
	
	// 비밀번호 공백체크 
	if(passvalue.length<1){
		//alert("비밀번호 입력");
		$('#pwdspan').html("비밀번호입력").css('color','red');
		return false;
	}
	
	// 비밀번호 길이  8-12
	if(passvalue.length <8 || passvalue >12 ){
		//alert("비밀번호 8~12사이 ");
		$('#pwdspan').html("비밀번호입력").css('color','red');
		return false;
	}
	if(!(passreg.test(passvalue))){
		//alert("비밀번호 형식오류");
		$('#pwdspan').html("비밀번호 형식오류").css('color','red');
		return false;
	}else {
		$('#pwdspan').html("올바른 비밀번호 입력").css('color', 'blue');
	}
	
	//비밀번호확인
	if(passvalue1< 1){
		//alert("비밀번호가 맞지 않습니다.");
		$('#pwdspan2').html("비밀번호 확인입력").css('color', 'blue');
		return false;
	}
	if(passvalue!=passvalue1){
		$('#pwdspan2').html("비밀번호 값 불일치").css('color', 'red');
		return false;
	}else{
		$('#pwdspan2').html("비밀번호 일치!!").css('color','blue');
	}

	//전화번호 - 공백, 정규식
	telvalue =$('#hp').val().trim();
	//전화번호 공백
	if(telvalue.length<1){
		//alert("전화번호 입력");
		$('#telspan2').html("전화번호입력").css('color','red');
		return false;
	}
	// 전화번호 정규식 
	telreg = /^\d{3}-\d{4}-\d{4}$/;
	if(!(telreg.test(telvalue))){
		//alert("전화번호 형식오류");
		$('#telspan2').html("전화번호형식오류").css('color','blue');
		return false;
	}else{
		$('#telspan2').html("전화번호성공").css('color','blue');
		
	}
	return true;
	

	
	
	
}