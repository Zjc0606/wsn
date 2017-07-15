package com.zjc.ssm.controller;

import com.zjc.ssm.service.ProLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zjc on 2017/5/24.
 * 人员信息的controller
 */
@Controller
@RequestMapping("/pro")
public class PersonController {
    @Autowired
    ProLoginService proLoginService;

    // 商品查询
    @RequestMapping("/test")
    public ModelAndView queryItems(HttpServletRequest request) throws Exception {
        //测试forward后request是否可以共享
        System.out.println("1111111");


        return null;
    }

    //@RequestParam里边指定request传入参数名称和形参进行绑定。
    //通过required属性指定参数是否必须要传入
    //通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定。
    @RequestMapping(value="/login",method={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public Object Login(String username,String password)throws Exception {

        //调用service根据用户名和密码判断登录信息
        Object result= proLoginService.login(username, password);

        return result;
    }

}
