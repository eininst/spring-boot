package com.spring.boot.web.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by wangziqing on 17/6/30.
 */
@RestController
public class HelloResource {

    @Autowired
    private Environment env;

    @RequestMapping("/")
    public String hello(HttpSession httpSession){
        System.out.println(env.getProperty("server.port"));
        httpSession.setAttribute("ww","dd");
        return "hello";
    }
}
