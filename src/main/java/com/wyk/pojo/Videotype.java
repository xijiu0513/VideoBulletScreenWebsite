package com.wyk.pojo;

public class Videotype {
    private Integer videotypeId;

    private String videotypeName;

    public Integer getVideotypeId() {
        return videotypeId;
    }

    public void setVideotypeId(Integer videotypeId) {
        this.videotypeId = videotypeId;
    }

    public String getVideotypeName() {
        return videotypeName;
    }

    public void setVideotypeName(String videotypeName) {
        this.videotypeName = videotypeName == null ? null : videotypeName.trim();
    }
}
