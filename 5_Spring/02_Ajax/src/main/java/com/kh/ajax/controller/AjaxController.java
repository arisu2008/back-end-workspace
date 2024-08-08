package com.kh.ajax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	private int count = 0;
	
	@Autowired
	
	@ResponseBody
	@GetMapping("/encoding")
	public String encoding(String nickname) {
		System.out.println("encoding");
		return nickname;
	}
	
	@ResponseBody
	@PostMapping("/check")
	public void check(String id) {
		System.out.println(service.idCheckid);
	}
}
