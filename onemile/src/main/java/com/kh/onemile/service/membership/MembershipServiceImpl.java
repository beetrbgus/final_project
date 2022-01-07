package com.kh.onemile.service.membership;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.onemile.entity.product.MembershipDTO;
import com.kh.onemile.repository.membership.MembershipDao;
import com.kh.onemile.vo.kakaopay.ConfirmVO;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class MembershipServiceImpl implements MembershipService{
	@Autowired
	private MembershipDao membershipDao;
	@Override
	public ConfirmVO getConfirm(int productNo,int quantity) {
		
		log.debug("productNo        "+productNo);
		MembershipDTO membershipDTO =membershipDao.search(productNo);
		
		ConfirmVO confirmVO= new ConfirmVO();
		confirmVO.setPrice(membershipDTO.getMspPrice());
		confirmVO.setProductNo(membershipDTO.getMspNo());
		confirmVO.setQuantity(1);
		confirmVO.setType("정기");
		confirmVO.setProductName(membershipDTO.getMspProduct());
		
		return confirmVO;
	}
}