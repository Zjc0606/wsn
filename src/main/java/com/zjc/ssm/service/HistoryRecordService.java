package com.zjc.ssm.service;

import com.alibaba.fastjson.JSONArray;

/**
 * Created by zjc on 2017/11/19.
 * 工艺点检查询历史记录的service
 */
public interface HistoryRecordService {
    JSONArray findHistoryRecord(String assetnum, String partname, String date, String today);

}
