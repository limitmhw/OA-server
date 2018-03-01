package model.po;

public class Eauthority {
    private Integer id;

    private Integer gongChengId;

    private Integer yongHuZuId;

    private String mask;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGongChengId() {
        return gongChengId;
    }

    public void setGongChengId(Integer gongChengId) {
        this.gongChengId = gongChengId;
    }

    public Integer getYongHuZuId() {
        return yongHuZuId;
    }

    public void setYongHuZuId(Integer yongHuZuId) {
        this.yongHuZuId = yongHuZuId;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask == null ? null : mask.trim();
    }
}