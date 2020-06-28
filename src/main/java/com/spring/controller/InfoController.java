package com.spring.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Info;
import com.spring.service.InfoService;

@RestController
@CrossOrigin
public class InfoController {
	@Autowired
	private InfoService infoService;
	@GetMapping("allInfo")
	List<Info> getAllInfo(){
		return infoService.getAllInfo();
	}
	@PostMapping(value="/getInfoById",consumes= {MediaType.APPLICATION_JSON_VALUE})
	Info getInfoById(@RequestBody Info info) {
		return infoService.getInfoById(info.getId());
	}
	@PostMapping(value="/updateInfoById",consumes= {MediaType.APPLICATION_JSON_VALUE})
	boolean updateInfoById(@RequestBody Info info) {
		return infoService.updateInfoById(info);
	}
	@PostMapping(value="/deleteInfoById",consumes= {MediaType.APPLICATION_JSON_VALUE})
	boolean deleteInfoById(@RequestBody Info info) {
		return infoService.deleteInfoById(info.getId());
	}
	@PostMapping(value="/insertInfo",consumes= {MediaType.APPLICATION_JSON_VALUE})
	boolean insertInfo(@RequestBody Info info) {
		return infoService.insertInfo(info);
	}
}
