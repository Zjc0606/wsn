package com.zjc.ssm.condition;

/**
 * @author 安徽大学.赵继传
 * @Description: 历史记录查询条件
 * @create 2017-11-23-15:54
 */
public class HistoryRecordCondition {
    private String assetnum;
    private String partname;
    private String date;
    private String today;

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum;
    }

    public String getPartname() {
        return partname;
    }

    public void setPartname(String partname) {
        this.partname = partname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }
}
