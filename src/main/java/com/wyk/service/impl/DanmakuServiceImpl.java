package com.wyk.service.impl;

import com.wyk.mapper.DanmakuMapper;
import com.wyk.pojo.Danmaku;
import com.wyk.pojo.DanmakuExample;
import com.wyk.service.DanmakuService;
import com.wyk.utils.PageRequest;
import com.wyk.utils.PageResult;
import com.wyk.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DanmakuServiceImpl implements DanmakuService {
    @Autowired
    DanmakuMapper danmakuMapper;

    @Override
    public List<Danmaku> getAllDanmakuByVideoId(Integer videoId) {
        DanmakuExample example = new DanmakuExample();
        DanmakuExample.Criteria criteria = example.createCriteria();
        criteria.andDanmakuVideoidEqualTo(videoId);
        example.setOrderByClause("danmaku_videotime ASC");
        List<Danmaku> danmakus = danmakuMapper.selectByExample(example);
        return danmakus;
    }

    @Override
    public List<Danmaku> getAllDanmakuByVideoIdWithPage(Integer videoId) {
        return null;
    }

    @Override
    public List<Danmaku> getUnBanDanmakuByVideoId(Integer videoId) {
        DanmakuExample example = new DanmakuExample();
        example.setOrderByClause("danmaku_videotime ASC");
        DanmakuExample.Criteria criteria = example.createCriteria();
        criteria.andDanmakuVideoidEqualTo(videoId);
        criteria.andDanmakuStatusEqualTo(0);
        List<Danmaku> danmakus = danmakuMapper.selectByExample(example);
        return danmakus;
    }

    @Override
    public Danmaku getDanmakuById(Integer danmakuId) {
        Danmaku danmaku = danmakuMapper.selectByPrimaryKey(danmakuId);
        return danmaku;
    }

    @Override
    public boolean sendDanmaku(Danmaku danmaku) {
        try {
            danmakuMapper.insert(danmaku);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean banTheDanmaku(Integer danmakuId) {
        try {
            //提交到管理员的举报信息
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean switchTheDanmakuStatus(Integer danmakuId, Integer danmakuStatus) {
        try {
            Danmaku danmaku = danmakuMapper.selectByPrimaryKey(danmakuId);
            danmaku.setDanmakuStatus(danmakuStatus);
            danmakuMapper.updateByPrimaryKeySelective(danmaku);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public boolean checkDanmakuStatus(Integer danmakuId) {
        Danmaku danmaku = danmakuMapper.selectByPrimaryKey(danmakuId);
        if (danmaku.getDanmakuStatus() == 0)
            return false;
        return true;
    }


    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest, getPageInfo(pageRequest));
    }

    private PageInfo<Danmaku> getPageInfo(PageRequest pageRequest) {
        int pageNum = pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<Danmaku> danmakus = danmakuMapper.selectPage(1);
        return new PageInfo<Danmaku>(danmakus);
    }

}
