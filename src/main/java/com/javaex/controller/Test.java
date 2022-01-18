package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class Test {

	//필드
	
	//생성자
	
	//메소드gs
	
	//메소드일반
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})//@RequestMapping=("/list")로 쓰는거랑 똑같음 getPost메소드 다포함
	public String TestPrint() {
		System.out.println("TestPrint1");
		
		return "/WEB-INF/views/Test.jsp";
	}
	
	@RequestMapping(value="/read", method= {RequestMethod.GET, RequestMethod.POST})
	public String TestPrint2() {
		System.out.println("TestPrint2");
		
		return "/WEB-INF/views/Test.jsp";
	
	}

	@RequestMapping(value="/writeForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String TestPrint3() {
		System.out.println("TestPrint3");
		
		return "/WEB-INF/views/Test.jsp";
	
	}

	
}
