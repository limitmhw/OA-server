package model.po;

public class T151002 {
    private Integer id;

    private Integer tableId;

    private Integer trOrder;

    private String trType;

    private String jiHuaXiangMu;

    private String chengBenJiangDiLv;

    private String chengBenZeRenRen;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getTrOrder() {
        return trOrder;
    }

    public void setTrOrder(Integer trOrder) {
        this.trOrder = trOrder;
    }

    public String getTrType() {
        return trType;
    }

    public void setTrType(String trType) {
        this.trType = trType == null ? null : trType.trim();
    }

    public String getJiHuaXiangMu() {
        return jiHuaXiangMu;
    }

    public void setJiHuaXiangMu(String jiHuaXiangMu) {
        this.jiHuaXiangMu = jiHuaXiangMu == null ? null : jiHuaXiangMu.trim();
    }

    public String getChengBenJiangDiLv() {
        return chengBenJiangDiLv;
    }

    public void setChengBenJiangDiLv(String chengBenJiangDiLv) {
        this.chengBenJiangDiLv = chengBenJiangDiLv == null ? null : chengBenJiangDiLv.trim();
    }

    public String getChengBenZeRenRen() {
        return chengBenZeRenRen;
    }

    public void setChengBenZeRenRen(String chengBenZeRenRen) {
        this.chengBenZeRenRen = chengBenZeRenRen == null ? null : chengBenZeRenRen.trim();
    }
}