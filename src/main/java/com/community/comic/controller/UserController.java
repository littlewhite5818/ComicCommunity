package com.community.comic.controller;

import com.community.comic.pojo.AuthUser;
import com.community.comic.service.UserService;
import com.community.comic.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "user",method = RequestMethod.GET)
    public List<AuthUser> selUser(@RequestParam("id") int id){
        return userService.sel(id);
    }

    @ResponseData
    @RequestMapping(value = "userstring",method = RequestMethod.GET)
    public String selString(@RequestParam("id") int id){
        return "韩志刚";
    }

}
