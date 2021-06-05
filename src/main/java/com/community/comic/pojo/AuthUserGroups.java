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
public class AuthUserGroups {

    private int id;
    private int user_id;
    private int group_id;
    private int available;

    @Override
    public String toString() {
        return "AuthUserGroups{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", group_id=" + group_id +
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

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
