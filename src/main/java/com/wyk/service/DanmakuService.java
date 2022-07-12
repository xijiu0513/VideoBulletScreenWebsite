package com.wyk.service;

import com.wyk.pojo.Danmaku;
import com.wyk.utils.PageRequest;
import com.wyk.utils.PageResult;

import java.util.List;

public interface DanmakuService {

    //获取特定视频的所有弹幕
    List<Danmaku> getAllDanmakuByVideoId(Integer videoId);

    List<Danmaku> getAllDanmakuByVideoIdWithPage(Integer videoId);

    //获取特定视频未被举报的弹幕
    List<Danmaku> getUnBanDanmakuByVideoId(Integer videoId);

    //根据Id查询弹幕
    Danmaku getDanmakuById(Integer danmakuId);

    //给某个视频发送弹幕
    boolean sendDanmaku(Danmaku danmaku);

    //举报某个弹幕
    boolean banTheDanmaku(Integer danmakuId);

    //修改弹幕状态
    boolean switchTheDanmakuStatus(Integer danmakuId, Integer danmakuStatus);

    //查询弹幕是否已被屏蔽
    boolean checkDanmakuStatus(Integer danmakuId);

    /**
     * 分页查询接口
     * 这里统一封装了分页请求和结果，避免直接引入具体框架的分页对象, 如MyBatis或JPA的分页对象
     * 从而避免因为替换ORM框架而导致服务层、控制层的分页接口也需要变动的情况，替换ORM框架也不会
     * 影响服务层以上的分页接口，起到了解耦的作用
     *
     * @param pageRequest 自定义，统一分页查询请求
     * @return PageResult 自定义，统一分页查询结果
     */
    PageResult findPage(PageRequest pageRequest);
}
