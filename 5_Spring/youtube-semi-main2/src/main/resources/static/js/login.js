id.addEventListener("input", function() {
	// 중복체크
	const regExp = /^[a-zA-Z][a-zA-Z0-9]{9,13}$/;
	
	
	$.ajax({
		type: 'post',
		url: '/check',
		data: {
			id: e.target.value			
		},
		success: function(data) {
			if(data) {
				idCheck.innerHTML = "중복된 아이디입니다. 다시 입력해주세요 ";
				idCheck.style.color = "red";
			} else {
				idCheck.innerHTML = "OK!";
				idCheck.style.color = "green";
			}
		}
	});
	
	if(regExp.test(e.target.value)){
		idCheck.style.color = "green";
		idCheck.innerHTML ="OK";
		} else {
			idCheck.style.color= "red";
			idCheck.innerHTML = "첫글자는 영어로 , 영어 또는 숫자로만 10~14글자로 입력하세요";
		}
	
	// 비어 있으면 안되고
	// 영어, 숫자로만 10~14글자
	// 시작은 영어로
});

function validate() {
	alert("전송 전!");
	return false;
}



