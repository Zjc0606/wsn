package com.zjc.ssm.controller;

import com.alibaba.fastjson.JSONArray;
import com.zjc.ssm.service.HistoryRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 安徽大学.赵继传
 * @Description: 历史记录查询
 * @create 2017-11-19-14:45
 */
@Controller
public class HistoryRecordController {
    @Autowired
    HistoryRecordService historyRecordService;

    @RequestMapping(value = "/historyRecord")
    @ResponseBody
    public JSONArray getTask(String devicename, String partname, String date) throws Exception {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        String today = DateFormat.getDateInstance().format(new Date());
        Date d = null;
        String date1="";
        try{
            if (!"".equals(date)){
                d = sdf1.parse(URLDecoder.decode(date, "GB2312"));
                date1 = sdf2.format(d);//获取查询起始时间
            }
        }catch(ParseException e){
            e.printStackTrace();
        }
        String part = URLDecoder.decode(partname, "GB2312");
        return historyRecordService.findHistoryRecord(devicename,part , date1, today);
    }
}
