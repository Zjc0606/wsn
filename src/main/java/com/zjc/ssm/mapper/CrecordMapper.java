package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Crecord;
import com.zjc.ssm.pojo.CrecordExample;
import com.zjc.ssm.vo.HistoryRecordVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 根据条件查询历史记录
     */
    List<HistoryRecordVo> findHistoryRecord(String assetnum, String partname, String date, String today);
}