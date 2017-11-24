package com.zjc.ssm.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zjc.ssm.mapper.CrecordMapper;
import com.zjc.ssm.service.HistoryRecordService;
import com.zjc.ssm.vo.HistoryRecordVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zjc on 2017/5/25.
 * 工艺历史记录查询service实现
 */
public class HistoryRecordServiceImpl implements HistoryRecordService {

    @Autowired
    private CrecordMapper crecordMapper;


    @Override
    public JSONArray findHistoryRecord(String assetnum, String partname, String date, String today) {
        List<HistoryRecordVo> list=crecordMapper.findHistoryRecord(assetnum, partname, date, today);
        return JSON.parseArray(JSON.toJSONString(list));
    }
}
