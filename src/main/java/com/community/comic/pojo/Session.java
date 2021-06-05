package com.community.comic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author: hanzhigang
 * @Date : 2021/6/5 16:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Session {
    private String session_key;
    private String session_data;
    private Timestamp expire_date;

    @Override
    public String toString() {
        return "Session{" +
                "session_key='" + session_key + '\'' +
                ", session_data='" + session_data + '\'' +
                ", expire_date=" + expire_date +
                '}';
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getSession_data() {
        return session_data;
    }

    public void setSession_data(String session_data) {
        this.session_data = session_data;
    }

    public Timestamp getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Timestamp expire_date) {
        this.expire_date = expire_date;
    }
}
