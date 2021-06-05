package com.community.comic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hanzhigang
 * @Date : 2021/6/5 16:06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthGroupPremissions {
    private int id;
    private int group_id;
    private int permission_id;
    private int available;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
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

    @Override
    public String toString() {
        return "AuthGroupPremissions{" +
                "id=" + id +
                ", group_id=" + group_id +
                ", permission_id=" + permission_id +
                ", available=" + available +
                '}';
    }
}
