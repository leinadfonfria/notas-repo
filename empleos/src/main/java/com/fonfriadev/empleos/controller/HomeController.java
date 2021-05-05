package com.fonfriadev.empleos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String mostrarHome(Model model) {
		model.addAttribute("mensaje", "Empleos App");
		return "home";
	}
}
