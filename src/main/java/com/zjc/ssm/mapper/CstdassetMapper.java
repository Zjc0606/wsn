package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Cstdasset;
import com.zjc.ssm.pojo.CstdassetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CstdassetMapper {
    int countByExample(CstdassetExample example);

    int deleteByExample(CstdassetExample example);

    int deleteByPrimaryKey(Integer cstdassetid);

    int insert(Cstdasset record);

    int insertSelective(Cstdasset record);

    List<Cstdasset> selectByExample(CstdassetExample example);

    Cstdasset selectByPrimaryKey(Integer cstdassetid);

    int updateByExampleSelective(@Param("record") Cstdasset record, @Param("example") CstdassetExample example);

    int updateByExample(@Param("record") Cstdasset record, @Param("example") CstdassetExample example);

    int updateByPrimaryKeySelective(Cstdasset record);

    int updateByPrimaryKey(Cstdasset record);

    /**
     * 根据设备编码查询对应设备的点检标准
     * @param assetnum
     * @return
     */
    String findCstdnum(String assetnum);
}