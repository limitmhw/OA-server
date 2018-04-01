package model.po;

import java.util.Date;

public class Wexcel {
    private Integer id;

    private String name;

    private Integer gongChengId;

    private String exceltype;

    private Date createdate;

    private String excelstatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGongChengId() {
        return gongChengId;
    }

    public void setGongChengId(Integer gongChengId) {
        this.gongChengId = gongChengId;
    }

    public String getExceltype() {
        return exceltype;
    }

    public void setExceltype(String exceltype) {
        this.exceltype = exceltype == null ? null : exceltype.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getExcelstatus() {
        return excelstatus;
    }

    public void setExcelstatus(String excelstatus) {
        this.excelstatus = excelstatus == null ? null : excelstatus.trim();
    }
}