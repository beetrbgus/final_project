package com.kh.onemile.service.email;

public interface EmailService {
	//인증번호 전송
	void sendCertificationNumber(String email);
	void sendAcceptEmail(String email);
	void sendDeclineEmail(String email);
}