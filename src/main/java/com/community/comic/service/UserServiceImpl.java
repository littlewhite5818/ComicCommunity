package com.community.comic.service;

import com.community.comic.mapper.UserMapper;
import com.community.comic.pojo.TStu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 4:19 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<TStu> sel(int id) {
        return userMapper.sel(id);
    }
}
