package com.comiccommunity.comic.utils;

/**
 * @author：hanzhigang
 * @Date : 2020/3/16 3:37 下午
 */
public class RetResponse {

    private final static String SUCCESS = "success";
    private final static String FAILED = "error";

    public static <T> RetResult<T> makeOKRsp() {

        return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS);
    }

    public static <T> RetResult<T> makeOKRsp(T data) {

        return new RetResult<T>().setCode(RetCode.SUCCESS).setMsg(SUCCESS).setData(data);
    }

    public static <T> RetResult<T> makeErrRsp() {

        return new RetResult<T>().setCode(RetCode.FAIL).setMsg(FAILED);
    }

    public static <T> RetResult<T> makeRsp(int code, String msg) {

        return new RetResult<T>().setCode(code).setMsg(msg);
    }

    public static <T> RetResult<T> makeRsp(int code, String msg, T data) {

        return new RetResult<T>().setCode(code).setMsg(msg).setData(data);
    }
}
