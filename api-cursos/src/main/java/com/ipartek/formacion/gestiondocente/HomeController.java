package com.ipartek.formacion.gestiondocente;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
public class HomeController {
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String Home() {
		return "index";
		
	}

}