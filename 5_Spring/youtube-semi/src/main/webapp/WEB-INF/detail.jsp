<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="video-detail">
		<video src="${video.videoUrl }" controls></video>
		<h2>${video.videoTitle}</h2>
		<div class="video-detail-desc">
			<div class="detail-desc-left">
				<img src="${video.channel.channelImg}">	
				<div class="channel-desc">
					<h3>${video.channel.channelName}</h3>
					<p>구독자 0명</p>
				</div>			
				<button>구독</button>	
			</div>			
		<button><i class="fa-regular fa-thumbs-up"></i>좋아요</button>
	</div>
	<div class="video-detail-info">
		${video.videoDesc}
		</div>
	</div>
	<div class="video-list">
		<c:forEach items="${list}" var="video">
			<a href="/${video.videoCode}" class="video-list-card">
			 <img src="${video.videoImg}"/>
			 <div class="video-list-desc">
			 	<p></p>
			 	<p></p>
			 	<p></p>
			 </div>
			</a>
		</c:forEach>
	</div>
</body>
</html>