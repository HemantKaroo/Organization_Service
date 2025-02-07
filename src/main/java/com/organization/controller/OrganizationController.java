package com.organization.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class OrganizationController {

    @RequestMapping("/hello")
    public String printHello(){
        return "Hello Organization Service";
    }
}
