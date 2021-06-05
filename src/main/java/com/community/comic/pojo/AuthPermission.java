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
public class AuthPermission {
    private int id;
    private String name;
    private int content_type_id;
    private String codename;
    private int available;

    @Override
    public String toString() {
        return "AuthPermission{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content_type_id=" + content_type_id +
                ", codename='" + codename + '\'' +
                ", available=" + available +
                '}';
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getContent_type_id() {
        return content_type_id;
    }

    public void setContent_type_id(int content_type_id) {
        this.content_type_id = content_type_id;
    }

    public String getCodename() {
        return codename;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }
}
