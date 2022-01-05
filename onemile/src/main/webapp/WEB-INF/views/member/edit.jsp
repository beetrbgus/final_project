<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- 출력 --%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h2>회원 정보 수정</h2>

<form method="post">
	
	<table class="table">
		<tbody>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" name="memberPw" required>
				</td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td>
					<input type="text" name="nick" required value="${memberDTO.nick}">
				</td>
			</tr>
			<tr>
				<th>생년월일</th>
				<td>
					<input type="date" name="birth" required value="${memberDTO.birth}">

				</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td>
					<input type="email" name="email" value="${memberDTO.email}">
				</td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td>
					<input type="tel" name="phone" value="${memberDTO.phone}">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type="submit" value="수정">
				</td>
			</tr>
		</tbody>
	</table>
	<div class="row right">
		<a href="quit">회원 탈퇴</a>
	</div>
</form>

<c:if test="${param.error != null}">
<h4><font color="red">비밀번호가 일치하지 않습니다</font></h4>
</c:if>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>