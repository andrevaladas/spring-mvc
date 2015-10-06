package com.valadas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@RequestMapping("/web")
	public String hello(@RequestParam(value = "name", required = false, defaultValue = "Valadas") String name, Model model) {
		model.addAttribute("name", name);
		return "web";
	}
}