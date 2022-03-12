package com.lh.domain.common.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommonController {
	
	private static final Logger logger = LoggerFactory.getLogger(CommonController.class);
	
	@RequestMapping(value = {"","/"}, method = RequestMethod.GET)
	public String main(Model model) {
		
		logger.info("Hello CommonController ~~~~ ");
		
		model.addAttribute("name", "livinghouse");
		
		return "index";
	}

}
