package com.zys.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zys.app.service.MemberService;

@RestController
public class OrderController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/getOrderByUserList")
	public List<String> getOrderByUserList(){
		System.err.println("订单服务开始调用会员服务");
		return memberService.getOderInfoByUserList();
	}
	
	@RequestMapping("/getTestZuulOrder")
	public  String testZuul(){
		return "this is 订单服务";
		
	}

}
