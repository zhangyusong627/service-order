package com.zys.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 调用service-member服务
 * @author ASUS
 *
 */
@Service
public class MemberService {
	
	@Autowired
	RestTemplate restTemplate;
	
	public List<String> getOderInfoByUserList(){
		
		return  restTemplate.getForObject("http://service-member/getUserList", List.class);
		
	}

}
