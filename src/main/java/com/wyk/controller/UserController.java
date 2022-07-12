package com.wyk.controller;

import com.alibaba.fastjson.JSON;
import com.wyk.pojo.*;
import com.wyk.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    VideoService videoService;

    @Autowired
    DanmakuService danmakuService;

    @RequestMapping("head")
    public String head(HttpSession httpSession, Model model) {
        try {
            Integer LoginUserId = (Integer) httpSession.getAttribute("LoginUserId");
            User user = userService.selectUserByUserId(LoginUserId);
            model.addAttribute("LoginUser", user);
        } catch (Exception e) {
            System.out.println("没有登录");
        }

        return "include/head";
    }

    @RequestMapping("Login")
    public String LoginPage() {
        return "LoginAndRegister";
    }

    @RequestMapping("Register")
    public String RegisterPage(Model model) {
        model.addAttribute("t", 2);
        return "LoginAndRegister";
    }

    @RequestMapping("Logout")
    public String Logout(HttpSession httpSession) {
        httpSession.invalidate();

        return "redirect:/";
    }

    @RequestMapping("do/Login")
    public String CheckLogin(String userAccount, String password, HttpSession httpSession, Model model) {
        System.out.println("userAccount:" + userAccount + "   password:" + password);
        if (userService.checkUserPass(userAccount, password)) {
            User user = userService.selectUserByUserAccount(userAccount);
            httpSession.setAttribute("LoginUserId", user.getUserId());
            System.out.println("登陆成功!  :" + user.getUserId());
            return "redirect:/";
        } else {
            model.addAttribute("ErrorLogin", "账号或密码错误");
            System.out.println("登陆失败!");
            model.addAttribute("status", "littleWindows");
            return "LoginAndRegister";
        }

    }

    @RequestMapping("do/Register")
    public String UserRegister(String userAccount, String userPassword, String Email, String userNickname, Model model, HttpSession httpSession) {
        if (userService.checkUserAccountRepeated(userAccount)) {
            model.addAttribute("t", 2);
            System.out.println("用户名已被使用");
            model.addAttribute("Error", "用户名已被使用");
            return "LoginAndRegister";
        }

        try {
            User user = new User();
            user.setUserAccount(userAccount);
            user.setUserPassword(userPassword);
            user.setUserEmail(Email);
            user.setUserNickname(userNickname);
            user.setUserProfilepic("default.jpg");
            user.setUserType(1);
            userService.register(user);
        } catch (Exception e) {
            // 确保点击"注册账号"跳到相应页面
            model.addAttribute("t", 2);
            System.out.println("注册失败 请稍后重试");
            model.addAttribute("Error", "注册失败 请稍后重试");
            return "LoginAndRegister";
        }

        User user = userService.selectUserByUserAccount(userAccount);
        httpSession.setAttribute("LoginUserId", user.getUserId());
        return "redirect:/";

    }

    //personal
    //侧边栏
    @RequestMapping("personal/{type}")
    public String Personal(@PathVariable("type") String type, HttpSession httpSession, Model model) {
        try {
            model.addAttribute("type", type);
        } catch (Exception e) {
            model.addAttribute("type", "personal_self");
        }

        return "personal/personal";
    }

    //带参超链接处理
    @RequestMapping("personal/{type}/{Id}")
    public String PersonalWithId(@PathVariable("type") String type, @PathVariable("Id") String Id, HttpSession httpSession, Model model) {
        try {
            model.addAttribute("type", type);
            model.addAttribute("Id", Id);
        } catch (Exception e) {
            model.addAttribute("type", "personal_self");
        }

        return "personal/personal";
    }

    @RequestMapping("/include/personal_edit")
    public String personal_edit(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("LoginUserId") == null) {
            model.addAttribute("status", "littleWindows");
            return "LoginAndRegister";
        }

        Integer LoginUserId = (Integer) httpSession.getAttribute("LoginUserId");
        User user = userService.selectUserByUserId(LoginUserId);
        model.addAttribute("LoginUser", user);

        return "personal/include_personal_edit";
    }

    @RequestMapping("/include/personal_upload")
    public String personalUploadVideo(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("LoginUserId") == null) {
            model.addAttribute("status", "littleWindows");
            return "LoginAndRegister";
        }

        return "personal/include_personal_upload";
    }

    @RequestMapping("/include/personal_myvideo")
    public String myVideo(HttpSession httpSession, Model model) {
        if (httpSession.getAttribute("LoginUserId") == null) {
            model.addAttribute("status", "littleWindows");
            return "LoginAndRegister";
        }

        Integer LoginUserId = (Integer) httpSession.getAttribute("LoginUserId");
        List<Video> videoList = videoService.selectMyVideo(LoginUserId);
        model.addAttribute("videoList", videoList);
        return "personal/include_personal_myvideo";
    }

    @RequestMapping("/include/personal_DanmakuManager/{videoId}")
    public String myVideoDanmakuManager(@PathVariable("videoId") Integer videoId, HttpSession httpSession, Model model) {
        Integer page = null;
        try {
            page = (Integer) model.getAttribute("page");
        } catch (Exception e) {

        }

        Video video = videoService.selectVideoById(videoId);
        List<Danmaku> danmakus = danmakuService.getAllDanmakuByVideoId(videoId);
        if (page != null) {

        }
        model.addAttribute("video", video);
        model.addAttribute("danmakus", danmakus);

        return "personal/include_personal_danmakumanager";
    }

    @RequestMapping("/getDanmakuManagerData/{videoId}")
    @ResponseBody
    public String getDanmakuManagerData(@PathVariable("videoId") Integer videoId) {
        String JsonDanmakuManagerData = null;
        List<Danmaku> danmakus = danmakuService.getAllDanmakuByVideoId(videoId);
        JsonDanmakuManagerData = JSON.toJSONString(danmakus);

        return JsonDanmakuManagerData;
    }

    @RequestMapping("/do/personal_edit")
    public String edit_personal(String userNickName, String userAboutself, String userPassword, String userEmail, HttpSession httpSession, Model model) {
        User user = new User();
        try {
            user.setUserId((Integer) httpSession.getAttribute("LoginUserId"));
            user.setUserNickname(userNickName);
            user.setUserAboutself(userAboutself);
            user.setUserPassword(userPassword);
            user.setUserEmail(userEmail);
            userService.eidtUser(user);
        } catch (Exception e) {
            model.addAttribute("InfoMsg", "修改失败!");
        }
        model.addAttribute("type", "edit");
        return "personal/personal";
    }

    @RequestMapping("/do/personal_upload")
    public String upload_personal(String video_name, String video_url, String video_pic, String video_info, String video_type, Model model, HttpSession session) {
        Video video = new Video();
        try {
            video.setVideoAuthorid((int) session.getAttribute("LoginUserId"));
            video.setVideoName(video_name);
            video.setVideoUrl(video_url);
            video.setVideoPic(video_pic);
            video.setVideoInfo(video_info);
            video.setVideoType(Integer.valueOf(video_type));
            video.setVideoTime(new Date());
            video.setVideoPlaycount(0);
            videoService.uploadVideo(video);
        } catch (Exception e) {
            model.addAttribute("InfoMsg", "上传失败!");
        }

        model.addAttribute("InfoMsg", "上传成功!");
        model.addAttribute("type", "upload");

        return "personal/personal";
    }

    @RequestMapping(value = "/upload/pic", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> uploadPic(@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        String pathString = null;
        if (file != null) {
            pathString = "D:\\_Chrome\\VideoDanmakuWebSite\\src\\main\\resources\\static\\videoResouces\\" + file.getOriginalFilename();
        }
        Map map = new HashMap<String, Object>();
        try {
            File files = new File(pathString);
            System.out.println(pathString);
            //打印查看上传路径
            file.transferTo(files);
            map.put("msg", "ok");
            map.put("code", 200);
            map.put("data", file.getOriginalFilename());
        } catch (Exception e) {
            map.put("msg", "error");
            map.put("code", 0);
            e.printStackTrace();
        }

        return map;
    }

    @RequestMapping(value = "/upload/video", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> uploadVideo(@RequestParam("file") MultipartFile file) {
        System.out.println(file);
        String pathString = null;
        if (file != null) {
            pathString = "D:\\_Chrome\\VideoDanmakuWebSite\\src\\main\\resources\\static\\videoResouces\\" + file.getOriginalFilename();
        }
        Map map = new HashMap<String, Object>();
        try {
            File files = new File(pathString);
            System.out.println(pathString);
            file.transferTo(files);
            map.put("msg", "ok");
            map.put("code", 200);
            map.put("data", file.getOriginalFilename());
        } catch (Exception e) {
            map.put("msg", "error");
            map.put("code", 0);
            e.printStackTrace();
        }

        return map;
    }
}
