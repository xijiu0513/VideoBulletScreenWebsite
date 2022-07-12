package com.wyk.service.impl;

import com.wyk.mapper.UserMapper;
import com.wyk.mapper.VideoMapper;
import com.wyk.mapper.VideotypeMapper;
import com.wyk.pojo.Video;
import com.wyk.pojo.VideoExample;
import com.wyk.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    VideoMapper videoMapper;

    @Autowired
    UserMapper userMapper;

    @Autowired
    VideotypeMapper videotypeMapper;

    @Override
    public List<Video> selectAllVideo() {

        return videoMapper.UnionselectAllVideo();
    }

    @Override
    public Video selectVideoById(Integer Videoid) {
        Video video = videoMapper.selectByPrimaryKey(Videoid);
        video.setUser(userMapper.selectByPrimaryKey(video.getVideoAuthorid()));
        video.setVideotypepojo(videotypeMapper.selectByPrimaryKey(video.getVideoType()));
        return video;
    }

    @Override
    public List<Video> selectMyVideo(Integer userId) {
        VideoExample example = new VideoExample();
        VideoExample.Criteria criteria = example.createCriteria();
        criteria.andVideoAuthoridEqualTo(userId);
        return videoMapper.selectByExample(example);
    }

    @Override
    public boolean uploadVideo(Video video) {
        try {
            videoMapper.insert(video);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
