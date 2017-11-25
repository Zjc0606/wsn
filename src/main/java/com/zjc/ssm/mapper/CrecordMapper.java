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

    //判断第一次点检结果是否为空
    String findResult1(String cplannum,String assetnum,String clinenum);
    //判断第二次点检结果是否为空
    String findResult2(String cplannum,String assetnum,String clinenum);
    //判断第三次点检结果是否为空
    String findResult3(String cplannum,String assetnum,String clinenum);

    /**
     *分别插入四次点检记录
     */
    void insertIntoResult1(String cplannum,String dodate,String doregular,String assetnum,String clinenum,String partloc,
                                  String content,String standard,String result,String record,String time);
    void updateResult2(String result,String record,String time,String cplannum,String assetnum,String clinenum);
    void updateResult3(String result,String record,String time,String cplannum,String assetnum,String clinenum);
    void updateResult4(String result,String record,String time,String cplannum,String assetnum,String clinenum);
}