package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Pirecord;
import com.zjc.ssm.pojo.PirecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PirecordMapper {
    int countByExample(PirecordExample example);

    int deleteByExample(PirecordExample example);

    int deleteByPrimaryKey(Long piplanid);

    int insert(Pirecord record);

    int insertSelective(Pirecord record);

    List<Pirecord> selectByExample(PirecordExample example);

    Pirecord selectByPrimaryKey(Long piplanid);

    int updateByExampleSelective(@Param("record") Pirecord record, @Param("example") PirecordExample example);

    int updateByExample(@Param("record") Pirecord record, @Param("example") PirecordExample example);

    int updateByPrimaryKeySelective(Pirecord record);

    int updateByPrimaryKey(Pirecord record);
}