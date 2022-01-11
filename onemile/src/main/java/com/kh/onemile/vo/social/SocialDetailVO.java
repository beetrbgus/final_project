package com.kh.onemile.vo.social;

import java.util.List;

import com.kh.onemile.entity.image.ImageDTO;

import lombok.Data;

@Data
public class SocialDetailVO {
	//소셜링 테이블에서 보여줘야 할 내용들
	private int socialNo;
	private String title;
	private String type; //대분류
	private String smalltype; //소분류
	private String starDate;
	private String endDate;
	private String context;
	
	private int minpeople;
	private int maxpeople;
	private List<ParticipateVO> participate;
	//회원 테이블에서 보여줘야 할 내용들
	private int memberNo;
	private String nick;
	private String regdate;
	private int profileImgNo;	
	private List<ImageDTO> imageInfo;
	//지도 테이블에서 보여줘야 할 내용들.
	private int mapNo;
	private double lat;
	private double lng;
	private String detailAddress;
	
}