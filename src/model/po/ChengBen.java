package model.po;

public class ChengBen {
    private Integer id;

    private String chengBenBianMa;

    private String chengBenXiangMu;

    private String naRongMiaoShu;

    private String beiZhu;

    private String chengBenType;

    private String typeChild;

    private Integer trOrder;

    private Integer tableId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getNaRongMiaoShu() {
        return naRongMiaoShu;
    }

    public void setNaRongMiaoShu(String naRongMiaoShu) {
        this.naRongMiaoShu = naRongMiaoShu == null ? null : naRongMiaoShu.trim();
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }

    public String getChengBenType() {
        return chengBenType;
    }

    public void setChengBenType(String chengBenType) {
        this.chengBenType = chengBenType == null ? null : chengBenType.trim();
    }

    public String getTypeChild() {
        return typeChild;
    }

    public void setTypeChild(String typeChild) {
        this.typeChild = typeChild == null ? null : typeChild.trim();
    }

    public Integer getTrOrder() {
        return trOrder;
    }

    public void setTrOrder(Integer trOrder) {
        this.trOrder = trOrder;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }
}