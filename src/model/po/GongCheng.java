package model.po;

public class GongCheng {
    private Integer id;

    private String name;

    private Integer xiangMuId;

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

    public Integer getXiangMuId() {
        return xiangMuId;
    }

    public void setXiangMuId(Integer xiangMuId) {
        this.xiangMuId = xiangMuId;
    }
}