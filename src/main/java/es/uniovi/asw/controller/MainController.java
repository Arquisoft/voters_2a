package es.uniovi.asw.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.uniovi.asw.model.UserInfo;

@RestController
public class MainController {

    @RequestMapping("/user")
    public UserInfo user() {
        return new UserInfo("pepe",0);
    }

    @RequestMapping("/")
    public String landing() {
        return "User Management Service";
    }
}