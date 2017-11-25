package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Cplan;
import com.zjc.ssm.pojo.CplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    public void updateResult(String cplannum,String assetnum, String executeby,String result,String devicenote);

    public void updateResults(String cplannum,String assetnum, String executeby,String result,String devicenote);

    String findRegular(String cplannum);

}