package com.wyk.service;

import com.wyk.pojo.Video;

import java.util.List;

public interface VideoService {
    //所有视频信息
    List<Video> selectAllVideo();

    //根据视频ID查询视频信息
    Video selectVideoById(Integer Videoid);

    //根据UserId查询视频
    List<Video> selectMyVideo(Integer userId);

    boolean uploadVideo(Video video);
}
