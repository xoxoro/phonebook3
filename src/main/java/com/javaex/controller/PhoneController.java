package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Controller
@RequestMapping(value="/phone")
public class PhoneController {

	//필드
	
	//생성자
	
	//메소드gs
	
	//메소드일반(디스패처서블릿과 통신중)

	@RequestMapping(value="/writeForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String writeForm() {
		System.out.println("PhoneController > writeForm");
		return "/WEB-INF/views/writeForm.jsp";
	}
	
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@ModelAttribute PersonVo personVo) {
		System.out.println("PhoneController > write");
		System.out.println(personVo);
		
		//저장
		PhoneDao phoneDao = new PhoneDao();
		phoneDao.personInsert(personVo);
		
		//리다이렉트
		return "redirect:/phone/list";
	}
	
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		//모델이란 새로운 주소를 만들어서 모델을 넣어줌
		//컨트롤러에서 모델을 통해 프론트컨트롤러로 보냄
		System.out.println("PhoneController > list");
		
		//dao에서 리스트를 가져온다
		PhoneDao phoneDao = new PhoneDao();
		List<PersonVo> personList = phoneDao.getPersonList();
		System.out.println(personList.toString());
		
		//컨트롤러-->디스패처 서블릿한테 데이터를 보냄(=model)
		model.addAttribute("personList", personList);
		
		//디스패처 서블릿한테 jsp정보를 리턴한다(view)
		return "/WEB-INF/views/list.jsp";
	}
	
	@RequestMapping(value="/updateForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String updateForm(@RequestParam("id") int id, Model model) { //컨트롤러에서 모델을 통해 프론트컨트롤러로 보내
		System.out.println("PhoneController > updateForm");
		
		PhoneDao phoneDao = new PhoneDao();
		PersonVo Pvo = phoneDao.getPerson(id);
				
		//컨트롤러-->디스패처 서블릿한테 데이터를 보냄(=model)
		model.addAttribute("Pvo", Pvo);
		
		return "/WEB-INF/views/updateForm.jsp";
	}
	
	@RequestMapping(value="/update", method= {RequestMethod.GET, RequestMethod.POST})
	public String update(@RequestParam("personId") int id, @ModelAttribute PersonVo personVo) {
		System.out.println("PhoneController > update");
		System.out.println(id);
		
		//수정할 값불러와서 personUpdate 한다
		PhoneDao phoneDao = new PhoneDao();
		phoneDao.personUpdate(personVo);
		PersonVo Pvo = phoneDao.getPerson(id);
		System.out.println("수정완료");
		
		//디스패처 서블릿한테 jsp정보를 리턴한다(view)
		return "redirect:/phone/list";	
	}
	

	@RequestMapping(value="/delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(@ModelAttribute PersonVo personVo) {
		System.out.println("PhoneController > delete");
		
		System.out.println(personVo);
		
		PhoneDao phoneDao = new PhoneDao();
		phoneDao.personInsert(personVo);
		
		//리다이렉트
		return "redirect:/phone/list";	
	}
	
	/*
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@ModelAttribute PersonVo personVo) {
		System.out.println("PhoneController > write");
	
		System.out.println(personVo);
		//저장
		return "/WEB-INF/views/write.jsp";
	}
	*/
	
	/*
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@ModelAttribute PersonVo personVo,
						@RequestParam("company") String company) {
		System.out.println("PhoneController > write");
	
		System.out.println(personVo);
		System.out.println(company);
		
		//저장
		return "/WEB-INF/views/write.jsp";
	}
	*/
	
	/*
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@RequestParam("name") String name, 
						@RequestParam("hp") String hp, 
						@RequestParam("company") String company) {
		System.out.println("PhoneController > write");
		
		System.out.println(name);
		System.out.println(hp);
		System.out.println(company);
		
		PersonVo personVo = new PersonVo(name, hp, company);
		
		//저장
		return "/WEB-INF/views/write.jsp";
	}
	*/
	/*
	@RequestMapping(value="/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String write(@RequestParam("name") String name, 
						@RequestParam("hp") String hp, 
						@RequestParam("company") String company) {
		System.out.println("PhoneController > write");
		
		System.out.println(name);
		System.out.println(hp);
		System.out.println(company);
		
		PersonVo personVo = new PersonVo(name, hp, company);
		
		PhoneDao phoneDao = new PhoneDao();
		phoneDao.personInsert(personVo);
		
		
		//저장
		return "/WEB-INF/views/write.jsp";
	}
	*/


}
