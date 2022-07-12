package com.wyk.pojo;

import java.util.Date;

public class Video {
    private Integer videoId;

    private String videoName;

    private String videoUrl;

    private String videoPic;

    private Integer videoAuthorid;

    private String videoInfo;

    private Date videoTime;

    private Integer videoType;

    private Integer videoPlaycount;

    private User user;

    private Videotype videotypepojo;


    public Integer getVideoId() {
        return videoId;
    }

    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? null : videoName.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getVideoPic() {
        return videoPic;
    }

    public void setVideoPic(String videoPic) {
        this.videoPic = videoPic == null ? null : videoPic.trim();
    }

    public Integer getVideoAuthorid() {
        return videoAuthorid;
    }

    public void setVideoAuthorid(Integer videoAuthorid) {
        this.videoAuthorid = videoAuthorid;
    }

    public String getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(String videoInfo) {
        this.videoInfo = videoInfo == null ? null : videoInfo.trim();
    }

    public Date getVideoTime() {
        return videoTime;
    }

    public void setVideoTime(Date videoTime) {
        this.videoTime = videoTime;
    }

    public Integer getVideoType() {
        return videoType;
    }

    public void setVideoType(Integer videoType) {
        this.videoType = videoType;
    }

    public Integer getVideoPlaycount() {
        return videoPlaycount;
    }

    public void setVideoPlaycount(Integer videoPlaycount) {
        this.videoPlaycount = videoPlaycount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Videotype getVideotypepojo() {
        return videotypepojo;
    }

    public void setVideotypepojo(Videotype videotypepojo) {
        this.videotypepojo = videotypepojo;
    }
}
