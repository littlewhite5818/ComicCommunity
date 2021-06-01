package com.community.comic.utils;

/**
 * @author：hanzhigang
 * @Date : 2020/3/16 3:36 下午
 */
public class RetResult<T> {

    public int code;

    public String msg;

    public T data;

    public int getCode() {
        return code;
    }

    public RetResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public RetResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public RetResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    public RetResult<T> setCode(RetCode success) {
        this.code = success.code;
        return this;
    }
}
