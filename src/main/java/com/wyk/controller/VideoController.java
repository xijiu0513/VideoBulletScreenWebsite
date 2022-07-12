package com.wyk.controller;

import com.wyk.pojo.*;
import com.wyk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class VideoController {
    @Autowired
    VideoService videoService;

    @Autowired
    UserService userService;

    @Autowired
    DanmakuService danmakuService;

    @RequestMapping("/")
    public String index(Model model) {
        List<Video> videoList = videoService.selectAllVideo();
        model.addAttribute("videoList", videoList);
        return "VideoList";
    }

    @RequestMapping("VideoList")
    public String AllVideo(Model model) {
        List<Video> videoList = videoService.selectAllVideo();
        model.addAttribute("videoList", videoList);
        return "VideoList";
    }

    @RequestMapping("Video/{VideoId}")
    public String VideoPage(Model model, @PathVariable("VideoId") Integer VideoId, HttpSession session) {
        Video video = videoService.selectVideoById(VideoId);
        model.addAttribute("video", video);
        List<Danmaku> danmakus = danmakuService.getUnBanDanmakuByVideoId(VideoId);
        try {
            User LoginUser = userService.selectUserByUserId((Integer) session.getAttribute("LoginUserId"));
            model.addAttribute("LoginUser", LoginUser);
            danmakus = danmakuService.getAllDanmakuByVideoId(VideoId);
        } catch (Exception e) {
            System.out.println(e);
        }

        model.addAttribute("danmakus", danmakus);

        return "Video";
    }

    @RequestMapping("VideoPage/{VideoId}")
    public String VideoPage2(Model model, @PathVariable("VideoId") Integer VideoId, HttpSession session) {
        Video video = videoService.selectVideoById(VideoId);
        model.addAttribute("video", video);
        List<Danmaku> danmakus = danmakuService.getUnBanDanmakuByVideoId(VideoId);
        try {
            User LoginUser = userService.selectUserByUserId((Integer) session.getAttribute("LoginUserId"));
            model.addAttribute("LoginUser", LoginUser);
            danmakus = danmakuService.getAllDanmakuByVideoId(VideoId);
        } catch (Exception e) {
            System.out.println(e);
        }

        model.addAttribute("danmakus", danmakus);

        return "VideoNoDanmaku";
    }

}
