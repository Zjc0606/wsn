package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Cstd;
import com.zjc.ssm.pojo.CstdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstdMapper {
    int countByExample(CstdExample example);

    int deleteByExample(CstdExample example);

    int deleteByPrimaryKey(Integer cstdunid);

    int insert(Cstd record);

    int insertSelective(Cstd record);

    List<Cstd> selectByExample(CstdExample example);

    Cstd selectByPrimaryKey(Integer cstdunid);

    int updateByExampleSelective(@Param("record") Cstd record, @Param("example") CstdExample example);

    int updateByExample(@Param("record") Cstd record, @Param("example") CstdExample example);

    int updateByPrimaryKeySelective(Cstd record);

    int updateByPrimaryKey(Cstd record);
}