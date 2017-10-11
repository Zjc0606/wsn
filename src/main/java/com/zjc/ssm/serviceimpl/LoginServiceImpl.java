package com.zjc.ssm.serviceimpl;

import com.alibaba.fastjson.JSONObject;
import com.zjc.ssm.mapper.AssetMapper;
import com.zjc.ssm.mapper.PersonMapper;
import com.zjc.ssm.pojo.Person;
import com.zjc.ssm.pojo.PersonExample;
import com.zjc.ssm.service.LoginService;
import com.zjc.ssm.util.MD5Utils;
import com.zjc.ssm.vo.AssetVo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zjc on 2017/5/25.
 * 工艺登录service实现
 */
public class LoginServiceImpl implements LoginService {
    @Autowired
    private PersonMapper personMapper;
    @Autowired
    private AssetMapper assetMapper;

    @Override
    public JSONObject login(String username, String password) {
        PersonExample personExample=new PersonExample();
        PersonExample.Criteria criteria=personExample.createCriteria();
        criteria.andLoginidEqualTo(username);
        JSONObject result = new JSONObject();
        List<Person> list=personMapper.selectByExample(personExample);
        if (list.size()==0){
            result.put("msg", "用户名不存在");
            result.put("Assets", "");
        }else if (list.get(0).getPassword().equals(MD5Utils.encode(password))){
            //查询设备表
            List<AssetVo> assets = assetMapper.getAssets();
            result.put("msg", "SUCCESS");
            result.put("Assets", assets);
        }else {
            result.put("msg", "密码错误");
            result.put("Assets", "");
        }
        return result;
    }
}
