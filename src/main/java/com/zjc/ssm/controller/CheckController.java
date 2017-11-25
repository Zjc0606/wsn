package com.zjc.ssm.controller;

import com.zjc.ssm.service.CheckService;
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
public class CheckController {
    @Autowired
    CheckService checkService;

    @RequestMapping(value = "/check")
    @ResponseBody
    public String getTask(HttpServletRequest request) throws Exception {
        request.setCharacterEncoding("UTF-8");
        StringBuilder data = new StringBuilder();
        String line = null;
        BufferedReader reader = request.getReader();
        while((line = reader.readLine()) != null){
            data.append(line);
        }
        try {
            checkService.saveResult(data.toString());
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}
