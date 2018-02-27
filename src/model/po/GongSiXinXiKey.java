package model.po;

public class GongSiXinXiKey {
    private Integer id;

    private String qiYeMingCheng;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQiYeMingCheng() {
        return qiYeMingCheng;
    }

    public void setQiYeMingCheng(String qiYeMingCheng) {
        this.qiYeMingCheng = qiYeMingCheng == null ? null : qiYeMingCheng.trim();
    }
}