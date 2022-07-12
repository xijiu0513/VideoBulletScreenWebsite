package com.wyk.controller;

import com.wyk.mapper.DanmakuMapper;
import com.wyk.pojo.*;
import com.wyk.service.*;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class DanmakuController {
    @Autowired
    DanmakuService danmakuService;
    @Autowired
    UserService userService;
    @Autowired
    DanmakuMapper danmakuMapper;

    @RequestMapping("/SendDanmaku")
    @ResponseBody
    public String sendDanmaku(Integer DanmakuVideoid, Integer DanmakuVideotime,
                              String DanmakuContent, String DanmakuColor,
                              Integer DanmakuType, Integer DanmakuSize,
                              HttpSession session, Model model) {

        Danmaku danmaku = new Danmaku();
        try {
            User user = userService.selectUserByUserId((Integer) session.getAttribute("LoginUserId"));
            danmaku.setDanmakuSenderid(user.getUserId());
        } catch (Exception e) {
            danmaku.setDanmakuSenderid(0);
        }

        danmaku.setDanmakuVideoid(DanmakuVideoid);
        danmaku.setDanmakuVideotime(DanmakuVideotime);
        danmaku.setDanmakuStringTime();

        danmaku.setDanmakuContent(DanmakuContent);
        danmaku.setDanmakuColor(DanmakuColor);
        danmaku.setDanmakuType(DanmakuType);
        danmaku.setDanmakuSendtime(new Date());
        danmaku.setDanmakuFontsize(16);
        danmaku.setDanmakuStatus(0);
        danmaku.setDanmakuId(danmakuMapper.insert(danmaku));
        String JsonDanmaku = JSON.toJSONString(danmaku);
        System.out.println("JsonDanmaku  :  " + JsonDanmaku);

        return JsonDanmaku;
    }

    //设置弹幕状态
    @RequestMapping("/setDanmakuStatus/{danmakuId}/{danmakuStatus}")
    @ResponseBody
    public String SetDanmakuStatus(@PathVariable("danmakuId") Integer danmakuId, @PathVariable("danmakuStatus") Integer danmakuStatus, HttpSession session) {
        try {
            danmakuService.switchTheDanmakuStatus(danmakuId, danmakuStatus);
        } catch (Exception e) {
            System.out.println(e);
            return "failed";
        }
        return "successed";
    }

    @RequestMapping("/getDanmakuData/{videoId}.json")
    @ResponseBody
    @CrossOrigin
    public String getDanmakuData(@PathVariable("videoId") Integer videoId, HttpSession session) {
        List<Danmaku> danmakus = danmakuService.getUnBanDanmakuByVideoId(videoId);
        ArrayList<Object> DanmakuData = new ArrayList<Object>();
        DanmakuData.add(danmakus);
        int LoginUserId = 0;

        try {
            LoginUserId = (int) session.getAttribute("LoginUserId");
        } catch (Exception e) {
            System.out.println(e);
        }
        String JsonDanmakuData = JSON.toJSONString(DanmakuData);
        return JsonDanmakuData;
    }

    //分页查询
    @RequestMapping("/getDanmakuDataPage/{videoId}")
    @ResponseBody
    public String getDanmakuPage(@PathVariable("videoId") Integer videoId, @RequestParam("page") Integer page, HttpSession session) {
        return "";
    }

    @RequestMapping("/sendDanmakuByUrl/{videoId}")
    @ResponseBody
    public String sendDanmakuByUrl(@PathVariable("videoId") Integer videoId, String danmu, HttpSession session) {
        System.out.println("弹幕信息:" + danmu);
        JSONObject jsonDanmaku = JSONObject.parseObject(danmu);
        Danmaku danmaku = new Danmaku();
        danmaku.setDanmakuVideoid(videoId);
        danmaku.setDanmakuVideotime(jsonDanmaku.getInteger("time"));
        danmaku.setDanmakuContent(jsonDanmaku.getString("text"));
        danmaku.setDanmakuColor(jsonDanmaku.getString("color"));
        danmaku.setDanmakuType(jsonDanmaku.getInteger("position"));
        danmaku.setDanmakuFontsize(jsonDanmaku.getInteger("size"));
        danmaku.setDanmakuSendtime(new Date());
        danmaku.setDanmakuStatus(0);
        try {
            User user = userService.selectUserByUserId((Integer) session.getAttribute("LoginUserId"));
            danmaku.setDanmakuSenderid(user.getUserId());
        } catch (Exception e) {
            danmaku.setDanmakuSenderid(0);
        }
        System.out.println(danmaku.toString());
        danmakuService.sendDanmaku(danmaku);
        return "";
    }

    @RequestMapping("/getDanmakuDataByUrl/{videoId}")
    @ResponseBody
    public String getDanmakuDataByUrl(@PathVariable("videoId") Integer videoId, HttpSession session) {
        List<Danmaku> danmakus = danmakuService.getUnBanDanmakuByVideoId(videoId);
        ArrayList<Danmaku> danmakuArrayList = new ArrayList<>();
        int LoginUserId = 0;
        try {
            LoginUserId = (int) session.getAttribute("LoginUserId");
        } catch (Exception e) {
            System.out.println(e);
            danmakuArrayList = (ArrayList<Danmaku>) danmakus;
        }

        ArrayList<jsDanmaku_v2> jsDanmakuV2s = new ArrayList<>();
        for (Danmaku danmaku : danmakuArrayList) {
            jsDanmaku_v2 jsDmV2 = new jsDanmaku_v2();
            jsDmV2.setText(danmaku.getDanmakuContent());
            jsDmV2.setColor(danmaku.getDanmakuColor());
            jsDmV2.setPosition(danmaku.getDanmakuType());
            jsDmV2.setSize(danmaku.getDanmakuFontsize());
            jsDmV2.setTime(danmaku.getDanmakuVideotime());
            jsDanmakuV2s.add(jsDmV2);
        }

        return JSON.toJSONString(jsDanmakuV2s);
    }

}
