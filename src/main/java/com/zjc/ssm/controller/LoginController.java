package com.zjc.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjc.ssm.condition.BaseCondition;
import com.zjc.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by zjc on 2017/5/24.
 * 人员信息的controller
 */
@Controller
public class LoginController {
    @Autowired
    LoginService loginService;

    // 商品查询
    @RequestMapping("/test")
    @ResponseBody
    public JSONObject queryItems(HttpServletRequest request, BaseCondition baseCondition) throws Exception {
        //测试forward后request是否可以共享
        HttpSession session = request.getSession();
        String ss = (String) session.getAttribute("username");
        JSONObject result = new JSONObject();
        if (baseCondition.getUsername().equals(ss)) {
            result.put("msg","session已存在");
            result.put("sessionId", session.getId());
            result.put("username", session.getAttribute("username"));
            result.put("password", session.getAttribute("password"));
        } else {
            result.put("msg","session不存在");
            session.setAttribute("username", baseCondition.getUsername());
            session.setAttribute("password", baseCondition.getPassword());
        }
        return result;
    }

    //@RequestParam里边指定request传入参数名称和形参进行绑定。
    @RequestMapping(value = "/login")
    @ResponseBody
    public JSONObject Login(HttpServletRequest request) throws Exception {
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        //调用service根据用户名和密码判断登录信息
        JSONObject result = loginService.login(username, password);

        return result;
    }

}
