package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/hello")
public class TestHello {
	@RequestMapping(value="/xinchao", method=RequestMethod.GET)
	
	public String xinchao() {
		return "xin chao";
	}
}
