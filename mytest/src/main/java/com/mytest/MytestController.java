package com.mytest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MytestController {

	   @RequestMapping("/reJDH.do")
	   public String hello(Model model) {
	      System.out.println("�ȳ��ϼ���");
	      model.addAttribute("message","hello.jsp�Դϴ�.!");
	      return "hello";
	   }   
	}