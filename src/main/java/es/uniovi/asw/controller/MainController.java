package es.uniovi.asw.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.uniovi.asw.model.UserInfo;

@RestController
public class MainController {
	private final String OK = "OK";
	private final String KO = "FALLO";

	@RequestMapping("/")
	public String landing() {
		return "Voters 2a Service";
	}

	@RequestMapping(value = "/validar", method = RequestMethod.POST)
	public String validar(@RequestBody UserInfo user) {
		if (user == null) {
			return this.KO;
		}
		
		// TODO: validar que email y clave no sean nulos ni vacios
		
		System.out.println("if");
		if(user.getEmail().equals("a@a.com") && user.getPassword().equals("123")) {
			return this.OK;
		}
	
		return this.KO;
	}

}
