package com.wyk.mapper;

import com.wyk.pojo.Danmaku;
import com.wyk.pojo.DanmakuExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DanmakuMapper {
    long countByExample(DanmakuExample example);

    int deleteByExample(DanmakuExample example);

    int deleteByPrimaryKey(Integer danmakuId);

    int insert(Danmaku record);

    int insertSelective(Danmaku record);

    List<Danmaku> selectByExample(DanmakuExample example);

    Danmaku selectByPrimaryKey(Integer danmakuId);

    int updateByExampleSelective(@Param("record") Danmaku record, @Param("example") DanmakuExample example);

    int updateByExample(@Param("record") Danmaku record, @Param("example") DanmakuExample example);

    int updateByPrimaryKeySelective(Danmaku record);

    int updateByPrimaryKey(Danmaku record);

    List<Danmaku> selectPage(Integer danmaku_videoid);
}
