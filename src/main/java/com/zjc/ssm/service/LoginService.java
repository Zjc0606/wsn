package com.zjc.ssm.service;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zjc on 2017/5/24.
 * 专业登录的service
 */
public interface LoginService {
    JSONObject login(String username, String password);
}
