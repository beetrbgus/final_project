package com.kh.onemile.dto.miles;

import java.util.Date;

import lombok.Data;

//마일즈  DTO
@Data
public class MilesDTO {
	private int milesNo;
	private String smallName;
	private int memberNo;
	private int adNo;
	
	private String name;
	private String context;
	private String location;
	private Date regDate;
	private String viewYN;
}
