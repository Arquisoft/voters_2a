package es.uniovi.asw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.uniovi.asw.model.UserInfo;
import es.uniovi.asw.service.UserService;

@RestController
public class MainController {
	private final String OK = "OK";
	private final String KO = "FALLO";

	@Autowired
	private UserService userService;

	@RequestMapping("/")
	public String landing() {
		return "Voters 2a Service";
	}

	/*
	 * { "email":"a@a.com", "password": "13" }
	 */
	@RequestMapping(value = "/validar", method = RequestMethod.POST)
	public String validar(@RequestBody UserInfo user) {
		if (user == null)
			return this.KO;
		else if (user.getEmail() == null || user.getPassword() == null || user.getEmail().isEmpty()
				|| user.getPassword().isEmpty())
			return this.KO;

		else if (user.getEmail().equals("a@a.com") && user.getPassword().equals("123"))
			return this.OK;

		else if (this.userService.validar(user))
			return this.OK;

		return this.KO;
	}

}
