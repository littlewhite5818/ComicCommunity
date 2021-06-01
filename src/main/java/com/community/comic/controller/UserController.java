package com.community.comic.controller;

import com.community.comic.pojo.TStu;
import com.community.comic.service.UserService;
import com.community.comic.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 4:22 PM
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseData
    @RequestMapping("/user/{id}")
    public List<TStu> selUser(@PathVariable("id") int id){
        return userService.sel(id);
    }

}
