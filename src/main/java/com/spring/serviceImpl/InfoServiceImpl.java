package com.spring.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.InfoMapper;
import com.spring.entity.Info;
import com.spring.service.InfoService;
@Service
public class InfoServiceImpl implements InfoService {
	@Autowired
	private InfoMapper infoMapper;
	public List<Info> getAllInfo() {
		return infoMapper.getAllInfo();
	}
	public Info getInfoById(long id) {
		return infoMapper.getInfoById(id);
	}

	public boolean updateInfoById(Info info) {
		int result = infoMapper.updateInfoById(info);
		return result == 1? true: false;
	}

	@Override
	public boolean deleteInfoById(long id) {
		int result = infoMapper.deleteInfoById(id);
		return result == 1? true: false;
	}

	@Override
	public boolean insertInfo(Info info) {
		int result = infoMapper.insertInfo(info);
		return result == 1? true: false;
		
	}

}
