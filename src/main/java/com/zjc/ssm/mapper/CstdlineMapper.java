package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Cstdline;
import com.zjc.ssm.pojo.CstdlineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CstdlineMapper {
    int countByExample(CstdlineExample example);

    int deleteByExample(CstdlineExample example);

    int deleteByPrimaryKey(Integer unid);

    int insert(Cstdline record);

    int insertSelective(Cstdline record);

    List<Cstdline> selectByExample(CstdlineExample example);

    Cstdline selectByPrimaryKey(Integer unid);

    int updateByExampleSelective(@Param("record") Cstdline record, @Param("example") CstdlineExample example);

    int updateByExample(@Param("record") Cstdline record, @Param("example") CstdlineExample example);

    int updateByPrimaryKeySelective(Cstdline record);

    int updateByPrimaryKey(Cstdline record);
}