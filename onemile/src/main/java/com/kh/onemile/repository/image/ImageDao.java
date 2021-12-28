package com.kh.onemile.repository.image;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.kh.onemile.entity.image.ImageDTO;

public interface ImageDao {
	void regImage(ImageDTO imageDto, MultipartFile multipartFile) throws IllegalStateException, IOException;
	int getSeq();
	boolean deleteImage(int imageNo);
	ImageDTO get(int imageNo);
	byte[] load(int imageNo) throws IOException;
	List<ImageDTO> listByBoardNo(int boardNo);
}
