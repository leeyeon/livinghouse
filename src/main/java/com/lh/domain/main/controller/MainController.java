package com.lh.domain.main.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MainController {

	@GetMapping(value = {"","/"})
	public String main(Model model) {

		log.info("Hello CommonController ~~~~ ");

		model.addAttribute("name", "livinghouse");

		return "index";
	}
}
