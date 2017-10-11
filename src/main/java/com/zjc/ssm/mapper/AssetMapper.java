package com.zjc.ssm.mapper;

import com.zjc.ssm.pojo.Asset;
import com.zjc.ssm.pojo.AssetExample;
import com.zjc.ssm.vo.AssetVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AssetMapper {
    int countByExample(AssetExample example);

    int deleteByExample(AssetExample example);

    int deleteByPrimaryKey(Integer assetuid);

    int insert(Asset record);

    int insertSelective(Asset record);

    List<Asset> selectByExample(AssetExample example);

    Asset selectByPrimaryKey(Integer assetuid);

    int updateByExampleSelective(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByExample(@Param("record") Asset record, @Param("example") AssetExample example);

    int updateByPrimaryKeySelective(Asset record);

    int updateByPrimaryKey(Asset record);

    /**
     * 查询设备列表
     */
    public List<AssetVo> getAssets();
}