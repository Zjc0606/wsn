package com.zjc.ssm.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zjc.ssm.mapper.CstdassetMapper;
import com.zjc.ssm.mapper.TaskMapper;
import com.zjc.ssm.service.TaskService;
import com.zjc.ssm.vo.TaskGY;
import com.zjc.ssm.vo.TaskStdGY;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by zjc on 2017/5/25.
 * 工艺登录service实现
 */
public class TaskServiceImpl implements TaskService {
    @Autowired
    private CstdassetMapper cstdassetMapper;
    @Autowired
    private TaskMapper taskMapper;


    @Override
    public JSONObject getTask(String data) {
        JSONObject jsonObject = JSONObject.parseObject(data);
        String Planstr = jsonObject.getString("PlanSet");
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String drawupdate = time.format(new Date());//获取当前日期时间
        String cplannum = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        JSONObject result = new JSONObject();
        if(!Planstr.equals("")) {

            JSONArray jsonrecord = JSONArray.parseArray(Planstr);
            try {
                for (int i = 0; i < jsonrecord.size(); i++) {
                    String assetnum = jsonrecord.getJSONObject(i).getString("ASSETNUM");
                    String regular = jsonrecord.getJSONObject(i).getString("REGULAR");
                    String executeby = jsonrecord.getJSONObject(i).getString("EXECUTEBY");
                    String type = jsonrecord.getJSONObject(i).getString("TYPE");
                    //查询该设备对应的点检标准
                    String Cstdnum = cstdassetMapper.findCstdnum(assetnum);
                    taskMapper.insertIntoCplan(Cstdnum, cplannum, executeby, drawupdate, assetnum, regular, type);
                }
                String regular = jsonrecord.getJSONObject(0).getString("REGULAR");
                String executeby = jsonrecord.getJSONObject(0).getString("EXECUTEBY");
                String type = jsonrecord.getJSONObject(0).getString("TYPE");
                //获取计划表
                List<TaskGY> taskGY=taskMapper.findTask(executeby, regular, type);
                //获取标准表
                List<TaskStdGY> taskStdGY=taskMapper.findTaskStd(executeby, regular, type);
                //封装结果集
                result.put("PlanGY", JSON.toJSON(taskGY));
                result.put("StdGY", JSON.toJSON(taskStdGY));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}
