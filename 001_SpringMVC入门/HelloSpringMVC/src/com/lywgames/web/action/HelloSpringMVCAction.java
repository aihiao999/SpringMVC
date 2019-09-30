package com.lywgames.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloSpringMVCAction {
	@RequestMapping("helloSpringMVC")
	public ModelAndView springMVC() {
		System.out.println("来到了helloSpringMVC方法");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("msg", "hello SpringMVC请求成功。");
		modelAndView.setViewName("/hello.jsp");
		return modelAndView;
	}
}
