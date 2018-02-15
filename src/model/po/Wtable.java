package model.po;

public class Wtable {
    private Integer id;

    private String tabletype;

    private String wenDangBianHao;

    private Integer excelId;

    private String biaoDanBianHao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTabletype() {
        return tabletype;
    }

    public void setTabletype(String tabletype) {
        this.tabletype = tabletype == null ? null : tabletype.trim();
    }

    public String getWenDangBianHao() {
        return wenDangBianHao;
    }

    public void setWenDangBianHao(String wenDangBianHao) {
        this.wenDangBianHao = wenDangBianHao == null ? null : wenDangBianHao.trim();
    }

    public Integer getExcelId() {
        return excelId;
    }

    public void setExcelId(Integer excelId) {
        this.excelId = excelId;
    }

    public String getBiaoDanBianHao() {
        return biaoDanBianHao;
    }

    public void setBiaoDanBianHao(String biaoDanBianHao) {
        this.biaoDanBianHao = biaoDanBianHao == null ? null : biaoDanBianHao.trim();
    }
}