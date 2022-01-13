package com.kh.onemile.repository.social;

import java.util.List;

import com.kh.onemile.entity.social.SocialDTO;
import com.kh.onemile.vo.social.SocialDetailVO;
import com.kh.onemile.vo.social.SocialListVO;

public interface SocialDao {
	void reg(SocialDTO socialDto);
	boolean changeSocial(SocialDTO socialDto);
	SocialDTO detail(int socialNo);
	List<SocialListVO> list();
	List<SocialListVO> getList(String category);
	List<SocialDetailVO> getDetail(int socialNo);
	List<SocialDTO> getCount(int memberNo);
}
