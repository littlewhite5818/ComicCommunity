package com.community.comic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: hanzhigang
 * @Date : 2021/6/5 16:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComicContent {

    private int id;
    private int contentid;
    private String content_url;
    private int content_second_id;
    private int available;

    @Override
    public String toString() {
        return "ComicContent{" +
                "id=" + id +
                ", contentid=" + contentid +
                ", content_url='" + content_url + '\'' +
                ", content_second_id=" + content_second_id +
                ", available=" + available +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContentid() {
        return contentid;
    }

    public void setContentid(int contentid) {
        this.contentid = contentid;
    }

    public String getContent_url() {
        return content_url;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public int getContent_second_id() {
        return content_second_id;
    }

    public void setContent_second_id(int content_second_id) {
        this.content_second_id = content_second_id;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }
}
