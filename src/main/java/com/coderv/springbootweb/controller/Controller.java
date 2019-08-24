package com.coderv.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/token")
public class Controller {

    @RequestMapping("/interceptor")
    public  String  testInterceptor(){
        return "恭喜你通过了拦截器来到了这里,我的CSDN：https://blog.csdn.net/feichitianxia";
    }
}
