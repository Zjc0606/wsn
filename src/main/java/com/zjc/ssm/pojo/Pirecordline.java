package com.zjc.ssm.pojo;

import java.util.Date;

public class Pirecordline {
    private Long pirecordlineid;

    private String piplannum;

    private String pirecordnum;

    private String assetnum;

    private Integer pirecordlinenum;

    private String partloc;

    private String content;

    private String method;

    private String standard;

    private String period;

    private Date dodate;

    private String result;

    private String record;

    private Integer undone;

    private Boolean uploadflag;

    private Date uploadtime;

    public Long getPirecordlineid() {
        return pirecordlineid;
    }

    public void setPirecordlineid(Long pirecordlineid) {
        this.pirecordlineid = pirecordlineid;
    }

    public String getPiplannum() {
        return piplannum;
    }

    public void setPiplannum(String piplannum) {
        this.piplannum = piplannum == null ? null : piplannum.trim();
    }

    public String getPirecordnum() {
        return pirecordnum;
    }

    public void setPirecordnum(String pirecordnum) {
        this.pirecordnum = pirecordnum == null ? null : pirecordnum.trim();
    }

    public String getAssetnum() {
        return assetnum;
    }

    public void setAssetnum(String assetnum) {
        this.assetnum = assetnum == null ? null : assetnum.trim();
    }

    public Integer getPirecordlinenum() {
        return pirecordlinenum;
    }

    public void setPirecordlinenum(Integer pirecordlinenum) {
        this.pirecordlinenum = pirecordlinenum;
    }

    public String getPartloc() {
        return partloc;
    }

    public void setPartloc(String partloc) {
        this.partloc = partloc == null ? null : partloc.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard == null ? null : standard.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
    }

    public Date getDodate() {
        return dodate;
    }

    public void setDodate(Date dodate) {
        this.dodate = dodate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public Integer getUndone() {
        return undone;
    }

    public void setUndone(Integer undone) {
        this.undone = undone;
    }

    public Boolean getUploadflag() {
        return uploadflag;
    }

    public void setUploadflag(Boolean uploadflag) {
        this.uploadflag = uploadflag;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }
}