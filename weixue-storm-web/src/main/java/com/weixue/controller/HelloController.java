package com.weixue.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weixue
 * @version 1.0
 * @Date: 19/4/9 14:41
 */
@RestController
@RequestMapping("/helloController")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "风暴之灵";
    }
}
