package com.zjc.ssm.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zjc on 2017/11/19.
 * 工艺点检任务制定的service
 */
public interface TaskService {
    JSONObject getTask(String planSet);

}
