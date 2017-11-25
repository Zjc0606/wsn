package com.zjc.ssm.serviceimpl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zjc.ssm.mapper.CplanMapper;
import com.zjc.ssm.mapper.CrecordMapper;
import com.zjc.ssm.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 安徽大学.赵继传
 * @Description: 终端点检结果上传数据的处理
 * @create 2017-11-24-22:09
 */
public class CheckServiceImpl implements CheckService {
    @Autowired
    private CplanMapper cplanMapper;
    @Autowired
    private CrecordMapper crecordMapper;

    @Override
    public void saveResult(String data) throws Exception{
        JSONObject jsonObject = JSONObject.parseObject(data);
        //任务表数据
        String taskPlan = jsonObject.getString("Task");
        //记录表数据
        String record = jsonObject.getString("GYrecord");
        savePlan(taskPlan);
        saveRecord(record);
    }

    /**
     * 更新计划表
     */
    @Override
    public void savePlan(String taskPlan) {
        if (!"".equals(taskPlan)&&taskPlan!=null) {
            JSONArray jsonArray = JSON.parseArray(taskPlan);
            String[] tasksGY = new String[8];
            for(int i=0;i<jsonArray.size();i++) {
                tasksGY[0] = jsonArray.getJSONObject(i).getString("CPLANNUM");
                tasksGY[1] = jsonArray.getJSONObject(i).getString("ASSETNUM");
                tasksGY[2] = jsonArray.getJSONObject(i).getString("CSTDNUM");
                tasksGY[3] = jsonArray.getJSONObject(i).getString("EXECUTEBY");
                tasksGY[4] = jsonArray.getJSONObject(i).getString("DRAWUPDATE");
                tasksGY[5] = jsonArray.getJSONObject(i).getString("REGULAR");
                tasksGY[6] = jsonArray.getJSONObject(i).getString("RESULT");
                tasksGY[7] = jsonArray.getJSONObject(i).getString("DEVICENOTE");
                if (tasksGY[6].equals("停运")) {
                    cplanMapper.updateResults(tasksGY[0], tasksGY[1], tasksGY[3],tasksGY[6],tasksGY[7]);
                } else {
                    cplanMapper.updateResult(tasksGY[0], tasksGY[1], tasksGY[3],tasksGY[6],tasksGY[7]);
                }
            }
        }
    }

    /**
     * 保存点检记录
     */
    @Override
    public void saveRecord(String record) {
        JSONArray jsonArray = JSON.parseArray(record);
        String cplannum = jsonArray.getJSONObject(0).getString("CPLANNUM");
        String regular = cplanMapper.findRegular(cplannum);
        SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat time1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dotime = time.format(new Date());//获取当前日期
        String enterdate = time1.format(new Date());//获取当前日期时间
        for(int i=0;i<jsonArray.size();i++){
            saveData(dotime+(regular),enterdate,dotime,jsonArray.getJSONObject(i));
        }
    }

    @Override
    public void saveData(String doregular, String time, String dodate, JSONObject jsonObject) {
        String cplannum = jsonObject.getString("CPLANNUM");
        String assetnum = jsonObject.getString("ASSETNUM");
        String clinenum = jsonObject.getString("CLINENUM");
        String result = jsonObject.getString("RESULT");
        String record = jsonObject.getString("RECORD");
        String partloc = jsonObject.getString("PARTLOC");
        String content = jsonObject.getString("CONTENT");
        String standard = jsonObject.getString("STANDARD");
        String result1 = crecordMapper.findResult1(cplannum, assetnum, clinenum);
        if(result1!=null){
            if( crecordMapper.findResult2(cplannum, assetnum, clinenum)!=null){
                if(crecordMapper.findResult3(cplannum, assetnum, clinenum)!=null){
                    crecordMapper.updateResult4(result, record, time, cplannum, assetnum, clinenum);
                }else{
                    crecordMapper.updateResult3(result, record, time, cplannum, assetnum, clinenum);
                }
            }else{
                crecordMapper.updateResult2(result, record, time, cplannum, assetnum, clinenum);
            }
        }else{
            crecordMapper.insertIntoResult1(cplannum, dodate, doregular, assetnum, clinenum, partloc, content, standard, result, record, time);
        }
    }
}
