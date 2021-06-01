package com.community.comic.utils;

/**
 * @author：hanzhigang
 * @Date : 2020/3/16 3:32 下午
 */
public enum RetCode {

//    成功
    SUCCESS(200),
//    失败
    FAIL(400),

//    未认证，签名错误
    UNAUTHORIZED(401),

//    接口不存在
    NOT_FOUND(404),

//    服务器内部错误
    INTERNAL_SERVER(500);


    public int code;

    RetCode(int i) {
        this.code = i;
    }
}
