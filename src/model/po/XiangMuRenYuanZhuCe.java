package model.po;

import java.util.Date;

public class XiangMuRenYuanZhuCe {
    private Integer id;

    private Integer renYuanId;

    private Integer xiangMuId;

    private String gangWeiMingCheng;

    private String zhiWu;

    private String suoShuBuMen;

    private Date daoGangShiJian;

    private String gangWeiXingZhi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRenYuanId() {
        return renYuanId;
    }

    public void setRenYuanId(Integer renYuanId) {
        this.renYuanId = renYuanId;
    }

    public Integer getXiangMuId() {
        return xiangMuId;
    }

    public void setXiangMuId(Integer xiangMuId) {
        this.xiangMuId = xiangMuId;
    }

    public String getGangWeiMingCheng() {
        return gangWeiMingCheng;
    }

    public void setGangWeiMingCheng(String gangWeiMingCheng) {
        this.gangWeiMingCheng = gangWeiMingCheng == null ? null : gangWeiMingCheng.trim();
    }

    public String getZhiWu() {
        return zhiWu;
    }

    public void setZhiWu(String zhiWu) {
        this.zhiWu = zhiWu == null ? null : zhiWu.trim();
    }

    public String getSuoShuBuMen() {
        return suoShuBuMen;
    }

    public void setSuoShuBuMen(String suoShuBuMen) {
        this.suoShuBuMen = suoShuBuMen == null ? null : suoShuBuMen.trim();
    }

    public Date getDaoGangShiJian() {
        return daoGangShiJian;
    }

    public void setDaoGangShiJian(Date daoGangShiJian) {
        this.daoGangShiJian = daoGangShiJian;
    }

    public String getGangWeiXingZhi() {
        return gangWeiXingZhi;
    }

    public void setGangWeiXingZhi(String gangWeiXingZhi) {
        this.gangWeiXingZhi = gangWeiXingZhi == null ? null : gangWeiXingZhi.trim();
    }
}