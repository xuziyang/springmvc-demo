package com.xzy.springmvc.demo.controller;

import com.xzy.springmvc.demo.entity.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        CustomDateEditor dateEditor = new CustomDateEditor(df, true);
        binder.registerCustomEditor(Date.class, dateEditor);
    }
    
    @ModelAttribute
    public void MyModelAttribute(Model model){
        // o1 = model;
        // User user = new User();
        // user.setId(1);
        // user.setName("张三");
        // user.setAge(12);
        // user.setPassword("123");
        // model.addAttribute("user",user);
        // System.out.println("modelAttribute:"+user);
        // o3 = user;
    }
    
    
    @RequestMapping("/user")
    public User user(@RequestHeader("User-Agent") String agent) {
        return null;
    }
    
}
