package model.po;

public class T158002 {
    private Integer id;

    private Integer tableId;

    private Integer trOrder;

    private String trType;

    private String chengBenBianMa;

    private String chengBenXiangMu;

    private String naRongFanWeiMiaoShu;

    private String yuSuanChengBen;

    private String shiJiChengBen;

    private String beiZhu;

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

    public String getChengBenBianMa() {
        return chengBenBianMa;
    }

    public void setChengBenBianMa(String chengBenBianMa) {
        this.chengBenBianMa = chengBenBianMa == null ? null : chengBenBianMa.trim();
    }

    public String getChengBenXiangMu() {
        return chengBenXiangMu;
    }

    public void setChengBenXiangMu(String chengBenXiangMu) {
        this.chengBenXiangMu = chengBenXiangMu == null ? null : chengBenXiangMu.trim();
    }

    public String getNaRongFanWeiMiaoShu() {
        return naRongFanWeiMiaoShu;
    }

    public void setNaRongFanWeiMiaoShu(String naRongFanWeiMiaoShu) {
        this.naRongFanWeiMiaoShu = naRongFanWeiMiaoShu == null ? null : naRongFanWeiMiaoShu.trim();
    }

    public String getYuSuanChengBen() {
        return yuSuanChengBen;
    }

    public void setYuSuanChengBen(String yuSuanChengBen) {
        this.yuSuanChengBen = yuSuanChengBen == null ? null : yuSuanChengBen.trim();
    }

    public String getShiJiChengBen() {
        return shiJiChengBen;
    }

    public void setShiJiChengBen(String shiJiChengBen) {
        this.shiJiChengBen = shiJiChengBen == null ? null : shiJiChengBen.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }
}