<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<style>
.link-btn-block {
	width: 100%;
	padding: 10px;
	border: 1px solid gray;
	text-decoration: none;
	color: gray;
	text-align: center;
}
</style>

<div class="container center-block"
	style="width: 20%; margin-top: 100px">
	<div class="row mt-5" style="text-align: center">
		<h2 class="wz text display2">결제 완료</h2>
	</div>
	<div class="row" style="margin-top: 30px">
		<p>
			<br>이용해주셔서 감사합니다!
		</p>
		<p>
			더욱 많은 원마일의 상품들을 이용해보세요!<br>
		</p>

	</div>
	<div class="row" style="margin-top: 30px">
		<a href="${pageContext.request.contextPath}/account/mypage" class="wz primary block button">마이페이지</a>
	</div>
	<div class="row">
		<a href="${pageContext.request.contextPath}" class="link-btn-block">원마일
			홈으로 가기</a>
	</div>

</div>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>