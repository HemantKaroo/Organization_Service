package com.organization.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class OrganizationController {

    @RequestMapping("/hello")
    public String printHello(){
        String string = "Hello Organization Service";
        return string;
    }
}
