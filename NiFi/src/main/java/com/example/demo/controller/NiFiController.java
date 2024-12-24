package com.example.demo.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Header;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.ActiveFlightsEntity;
import com.example.demo.repository.TestRepository;

@RestController
public class NiFiController {

	@Autowired
	private TestRepository testRepository;
	
	/**
	 * 서버 구동 테스트
	 */
	@GetMapping("/nifi")
	public String test() {
		return "test"; 
	}

	/**
	 * airlineInfoGetList 조회 
	 */
	@PostMapping("/airlineInfoGetList")
	public ResponseDTO<List<ActiveFlightsEntity>> airlineInfoGetList() {
		List<ActiveFlightsEntity> list = testRepository.airlineInfoGetList();
		
        // Header 세팅
        Header header = new Header();
        header.setRqstTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

        if(list != null) {
        	header.setResult(true);
        	return new ResponseDTO<>(header, list);
        }else {
        	header.setResult(false);
        	return new ResponseDTO<>(header, null);
        	
        }
	}
	

	
}
