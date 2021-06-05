package com.community.comic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hanzhigang
 * @Date : 2021/6/5 16:36
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComicType {

    private int id;
    private int cid;
    private int tid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "ComicType{" +
                "id=" + id +
                ", cid=" + cid +
                ", tid=" + tid +
                '}';
    }
}
