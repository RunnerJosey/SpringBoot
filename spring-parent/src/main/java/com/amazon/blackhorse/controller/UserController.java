package com.amazon.blackhorse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 整合FreeMarket,对应user.ftl  ，
 */
@Controller
public class UserController {

    @GetMapping(name = "/user")
    public String findAll(Model model){
        model.addAttribute("title","用户数据");
        return "user";
    }
}
