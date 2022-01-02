package com.kh.onemile.service.map;

import org.springframework.beans.factory.annotation.Autowired;

import com.kh.onemile.entity.map.MapDTO;
import com.kh.onemile.repository.map.MapDao;
import com.kh.onemile.util.Sequence;

public class MapServiceImpl implements MapService{
	private final String seqName = "map_seq";
	@Autowired
	private MapDao mapDao; 
	@Autowired
	private Sequence seq;
	
	@Override
	public int regMap(MapDTO mapDTO) {
		int mapNo = seq.nextSequence(seqName);
		mapDTO.setMapNo(mapNo);
		
		mapDao.regMap(mapDTO);
		return mapNo;
	}
}
