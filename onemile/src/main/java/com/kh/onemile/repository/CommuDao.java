package com.kh.onemile.repository;

import com.kh.onemile.entity.commu.CommuDTO;

public interface CommuDao {
	void write(CommuDTO commuDto);
	int getSeq();
}