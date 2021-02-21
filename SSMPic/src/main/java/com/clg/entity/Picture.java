package com.clg.entity;

public class Picture {
    private int id;
    private String picname;
    private String content;

    public String getPicname() {
        return picname;
    }

    public void setPicname(String picname) {
        this.picname = picname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", picname='" + picname + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
