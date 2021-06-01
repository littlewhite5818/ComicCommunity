package com.community.comic.utils;

import java.lang.annotation.*;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 5:15 PM
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Documented
public @interface ResponseData {
}
