package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Crecord;
import com.zjc.ssm.pojo.CrecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrecordMapper {
    int countByExample(CrecordExample example);

    int deleteByExample(CrecordExample example);

    int deleteByPrimaryKey(Integer unidcrecord);

    int insert(Crecord record);

    int insertSelective(Crecord record);

    List<Crecord> selectByExample(CrecordExample example);

    Crecord selectByPrimaryKey(Integer unidcrecord);

    int updateByExampleSelective(@Param("record") Crecord record, @Param("example") CrecordExample example);

    int updateByExample(@Param("record") Crecord record, @Param("example") CrecordExample example);

    int updateByPrimaryKeySelective(Crecord record);

    int updateByPrimaryKey(Crecord record);
}