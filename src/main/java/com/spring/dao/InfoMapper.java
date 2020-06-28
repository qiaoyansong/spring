package com.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.entity.Info;
@Mapper
public interface InfoMapper {
	public List<Info> getAllInfo();
	public Info getInfoById(long id);
	public int updateInfoById(Info info);
	public int deleteInfoById(long id);
	public int insertInfo(Info info);
}
