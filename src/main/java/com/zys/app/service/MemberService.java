package com.zys.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 调用service-member服务
 * @author ASUS
 *
 */

@Service
public class MemberService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	// @HystrixCommand(fallbackMethod = "orderError")  //:实现服务降级
	public List<String> getOderInfoByUserList(){
		return  restTemplate.getForObject("http://service-member/getUserList", List.class);
		
	}
	
	
	public List<String> orderError() {
		List<String> listUser = new ArrayList<String>();
		listUser.add("not orderUser list");
		return listUser;
	}

}
