package com.zjc.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjc.ssm.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

/**
 * @author 安徽大学.赵继传
 * @Description:
 * @create 2017-11-19-14:45
 */
@Controller
public class TaskController {
    @Autowired
    TaskService taskService;

    @RequestMapping(value = "/task")
    @ResponseBody
    public JSONObject getTask(HttpServletRequest request) throws Exception {
        request.setCharacterEncoding("UTF-8");
        StringBuilder data = new StringBuilder();
        String line = null;
        BufferedReader reader = request.getReader();
        while((line = reader.readLine()) != null){
            data.append(line);
        }
        JSONObject result=taskService.getTask(data.toString());

        return result;
    }
}
