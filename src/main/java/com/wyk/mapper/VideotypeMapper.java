package com.wyk.mapper;

import com.wyk.pojo.Videotype;
import com.wyk.pojo.VideotypeExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface VideotypeMapper {
    long countByExample(VideotypeExample example);

    int deleteByExample(VideotypeExample example);

    int deleteByPrimaryKey(Integer videotypeId);

    int insert(Videotype record);

    int insertSelective(Videotype record);

    List<Videotype> selectByExample(VideotypeExample example);

    Videotype selectByPrimaryKey(Integer videotypeId);

    int updateByExampleSelective(@Param("record") Videotype record, @Param("example") VideotypeExample example);

    int updateByExample(@Param("record") Videotype record, @Param("example") VideotypeExample example);

    int updateByPrimaryKeySelective(Videotype record);

    int updateByPrimaryKey(Videotype record);
}
