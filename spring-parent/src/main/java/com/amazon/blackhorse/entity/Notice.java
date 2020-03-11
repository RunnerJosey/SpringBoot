package com.amazon.blackhorse.entity;

import java.io.Serializable;

public class Notice implements Serializable {
    public static final long serialVersionUID = 5679176319867604937L;
    private long id;
    private String title;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
