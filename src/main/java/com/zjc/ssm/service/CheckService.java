package com.zjc.ssm.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zjc on 2017/11/19.
 * 工艺点检任务制定的service
 */
public interface CheckService {
    void saveResult(String data) throws Exception;

    void savePlan(String plan);

    void saveRecord(String record);

    void saveData(String doregular, String time, String dodate, JSONObject jsonObject);
}
