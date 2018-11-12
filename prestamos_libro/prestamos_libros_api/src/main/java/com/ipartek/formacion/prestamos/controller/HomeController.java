package com.ipartek.formacion.prestamos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)

	//Spring usa un ViewResolver y se encarga de manda la vista correstondiente
	public String home() {
		return "index";
	}
}
