package com.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MytestController {

	   @RequestMapping("/reJDH.do")
	   public String hello(Model model) {
	      System.out.println("안녕하세요");
	      model.addAttribute("message","hello.jsp입니다.!");
	      return "hello";
	   }   
	}