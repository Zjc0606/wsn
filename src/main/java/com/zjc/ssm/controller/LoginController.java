package com.zjc.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
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

    private RuntimeSchema<BaseCondition> schema = RuntimeSchema.createFrom(BaseCondition.class);

    // 商品查询
    @RequestMapping("/test")
    @ResponseBody
    public JSONObject queryItems(HttpServletRequest request, BaseCondition baseCondition) throws Exception {
        //测试forward后request是否可以共享
        HttpSession session = request.getSession();
        JSONObject result = new JSONObject();
//        String s1 =(String) session.getAttribute("username");
        try {
            JSONObject obj= JSONObject.parseObject(session.getAttribute("userInfo").toString());
            result.put("msg","session已存在");
            result.put("sessionId", session.getId());
            result.put("username",  obj.get("username"));
            result.put("password", obj.get("password"));
            return result;
        } catch (Exception e) {
            result.put("msg","session不存在");
            session.setAttribute("userInfo",JSONObject.toJSONString(baseCondition));
            return result;
        }
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
