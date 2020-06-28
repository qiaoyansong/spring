package com.spring.service;

import java.util.List;

import com.spring.entity.Info;

public interface InfoService {
	public List<Info> getAllInfo();
	public Info getInfoById(long id);
	public boolean updateInfoById(Info info);
	public boolean deleteInfoById(long id);
	public boolean insertInfo(Info info);
}
