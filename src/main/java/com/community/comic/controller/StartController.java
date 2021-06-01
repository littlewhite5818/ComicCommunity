package com.comiccommunity.comic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：hanzhigang
 * @Date : 2021/5/29 10:10 AM
 */
@RestController
public class StartController {

    @RequestMapping("/hello")
    public String handler01(){
        return "Hello World";
    }


}
