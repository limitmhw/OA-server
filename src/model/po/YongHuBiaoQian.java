package model.po;

public class YongHuBiaoQian {
    private Integer id;

    private String biaoQianMing;

    private Integer suoShuGongSi;

    private String beiZhu;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBiaoQianMing() {
        return biaoQianMing;
    }

    public void setBiaoQianMing(String biaoQianMing) {
        this.biaoQianMing = biaoQianMing == null ? null : biaoQianMing.trim();
    }

    public Integer getSuoShuGongSi() {
        return suoShuGongSi;
    }

    public void setSuoShuGongSi(Integer suoShuGongSi) {
        this.suoShuGongSi = suoShuGongSi;
    }

    public String getBeiZhu() {
        return beiZhu;
    }

    public void setBeiZhu(String beiZhu) {
        this.beiZhu = beiZhu == null ? null : beiZhu.trim();
    }
}