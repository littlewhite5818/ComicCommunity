package com.community.comic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hanzhigang
 * @Date : 2021/6/5 16:07
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthUserUserPermissions {

    private int id;
    private int user_id;
    private int permission_id;
    private int available;

    @Override
    public String toString() {
        return "AuthUserUserPermissions{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", permission_id=" + permission_id +
                ", available=" + available +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(int permission_id) {
        this.permission_id = permission_id;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
