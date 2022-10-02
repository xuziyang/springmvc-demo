package com.xzy.springmvc.demo.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class User {
    
    @Pattern(regexp="w{4,30}", message = "长度不符合条件")
    private String name;
    
    private Integer age;
    
    @DateTimeFormat(pattern="yyyyMMdd")
    private Date birthday;
}
