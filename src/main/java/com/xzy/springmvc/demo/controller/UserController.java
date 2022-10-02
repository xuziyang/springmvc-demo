package com.xzy.springmvc.demo.controller;

import com.xzy.springmvc.demo.entity.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("user")
public class UserController {
    
    // @InitBinder
    // public void initBinder(WebDataBinder binder) {
    //     DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    //     CustomDateEditor dateEditor = new CustomDateEditor(df, true);
    //     binder.registerCustomEditor(Date.class, dateEditor);
    // }
    //
    
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
    
    @ResponseBody
    @RequestMapping("handle91")
    public String handle91(@Valid User user, BindingResult bindingResult) {
        System.out.println(user);
        if(bindingResult.hasErrors()){
            return "error";
        }
        return "ok";
    }
    
    
}
