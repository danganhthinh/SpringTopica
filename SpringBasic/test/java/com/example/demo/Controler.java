package com.example.demo;

import org.aspectj.util.LangUtil.ProcessController.Thrown;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controler {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	public String error() throws Exception{
		throw new Exception("testing");
	}
}
