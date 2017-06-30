package com.spring.boot.web.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * Created by wangziqing on 17/6/30.
 */
@RestController
public class HelloResource {

    @RequestMapping("/")
    public String hello(HttpSession httpSession){
        httpSession.setAttribute("ww","dd");
        return "hello";
    }
}
