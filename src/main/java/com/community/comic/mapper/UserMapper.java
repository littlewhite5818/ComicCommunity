package com.community.comic.mapper;

import com.community.comic.pojo.TStu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 3:58 PM
 */
@Mapper
@Repository
public interface UserMapper {
    List<TStu> sel(int id);
}
