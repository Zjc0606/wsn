package com.zjc.ssm.pojo;

import java.util.Date;

public class Pirecord {
    private Long piplanid;

    private String piplannum;

    private Integer day;

    private String department;

    private String piprofession;

    private String drawupby;

    private Date drawupdate;

    private String executeby;

    private Date piplandate;

    private Date pidate;

    private String pirecordnum;

    private String assetnum;

    private String location;

    private String pistdnum;

    private Integer isstop;

    private String platefrom;

    private Date enterdate;

    private String pitype;

    private String siteid;

    private String result;

    private Boolean uploadflag;

    private Date uploadtime;

    public Long getPiplanid() {
        return piplanid;
    }

    public void setPiplanid(Long piplanid) {
        this.piplanid = piplanid;
    }

    public String getPiplannum() {
        return piplannum;
    }

    public void setPiplannum(String piplannum) {
        this.piplannum = piplannum == null ? null : piplannum.trim();
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPiprofession() {
        return piprofession;
    }

    public void setPiprofession(String piprofession) {
        this.piprofession = piprofession == null ? null : piprofession.trim();
    }

    public String getDrawupby() {
        return drawupby;
    }

    public void setDrawupby(String drawupby) {
        this.drawupby = drawupby == null ? null : drawupby.trim();
    }

    public Date getDrawupdate() {
        return drawupdate;
    }

    public void setDrawupdate(Date drawupdate) {
        this.drawupdate = drawupdate;
    }

    public String getExecuteby() {
        return executeby;
    }

    public void setExecuteby(String executeby) {
        this.executeby = executeby == null ? null : executeby.trim();
    }

    public Date getPiplandate() {
        return piplandate;
    }

    public void setPiplandate(Date piplandate) {
        this.piplandate = piplandate;
    }

    public Date getPidate() {
        return pidate;
    }

    public void setPidate(Date pidate) {
        this.pidate = pidate;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getPistdnum() {
        return pistdnum;
    }

    public void setPistdnum(String pistdnum) {
        this.pistdnum = pistdnum == null ? null : pistdnum.trim();
    }

    public Integer getIsstop() {
        return isstop;
    }

    public void setIsstop(Integer isstop) {
        this.isstop = isstop;
    }

    public String getPlatefrom() {
        return platefrom;
    }

    public void setPlatefrom(String platefrom) {
        this.platefrom = platefrom == null ? null : platefrom.trim();
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    public String getPitype() {
        return pitype;
    }

    public void setPitype(String pitype) {
        this.pitype = pitype == null ? null : pitype.trim();
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
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