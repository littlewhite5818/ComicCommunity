package com.community.comic.service;

import com.community.comic.pojo.AuthUser;

import java.util.List;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 4:19 PM
 */
public interface UserService {
    List<AuthUser> sel(int id);
}
