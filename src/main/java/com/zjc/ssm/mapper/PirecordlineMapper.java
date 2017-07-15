package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Pirecordline;
import com.zjc.ssm.pojo.PirecordlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PirecordlineMapper {
    int countByExample(PirecordlineExample example);

    int deleteByExample(PirecordlineExample example);

    int deleteByPrimaryKey(Long pirecordlineid);

    int insert(Pirecordline record);

    int insertSelective(Pirecordline record);

    List<Pirecordline> selectByExample(PirecordlineExample example);

    Pirecordline selectByPrimaryKey(Long pirecordlineid);

    int updateByExampleSelective(@Param("record") Pirecordline record, @Param("example") PirecordlineExample example);

    int updateByExample(@Param("record") Pirecordline record, @Param("example") PirecordlineExample example);

    int updateByPrimaryKeySelective(Pirecordline record);

    int updateByPrimaryKey(Pirecordline record);
}