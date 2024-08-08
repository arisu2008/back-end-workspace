<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
</head>
<body>
		<h2>Encoding 처리하기</h2>
		닉네임 : <input type="text id="nick>
		<div id="result"></div>
		
		<!--  jQuery -->
		<script>
			$("btn").click(() => {
				const nickname = $("#nick").val();
				$.ajax({
					// 요청
					type: "get",
					url: "/encoding",
					data: "nickname=" + encodeURI(encodeURIComponent()),
					
					// 응답
					success: function(result) {
						$("#result").text(decodeURI(decodeURIComponent(result)));
					}
				});
			});
		</script>
		
</body>
</html>