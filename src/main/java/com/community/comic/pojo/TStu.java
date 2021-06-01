package com.community.comic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author：hanzhigang
 * @Date : 2021/5/30 3:54 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TStu implements Serializable {
    private int stu_id;
    private String stu_nm;
    private String sex;
    private int class_no;

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getStu_nm() {
        return stu_nm;
    }

    public void setStu_nm(String stu_nm) {
        this.stu_nm = stu_nm;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }
}
