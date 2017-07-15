package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Cplan;
import com.zjc.ssm.pojo.CplanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CplanMapper {
    int countByExample(CplanExample example);

    int deleteByExample(CplanExample example);

    int deleteByPrimaryKey(Integer unidcplan);

    int insert(Cplan record);

    int insertSelective(Cplan record);

    List<Cplan> selectByExample(CplanExample example);

    Cplan selectByPrimaryKey(Integer unidcplan);

    int updateByExampleSelective(@Param("record") Cplan record, @Param("example") CplanExample example);

    int updateByExample(@Param("record") Cplan record, @Param("example") CplanExample example);

    int updateByPrimaryKeySelective(Cplan record);

    int updateByPrimaryKey(Cplan record);
}