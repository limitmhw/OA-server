package model.po;

public class GongCheng {
    private Integer id;

    private String name;

    private Integer xiangMuId;

    private String danXiangGongCheng;

    private String guiMoMianJi;

    private String guiMoChangDu;

    private String guiMoQiTa;

    private String yanGao;

    private String zongGao;

    private String diShangDiXiaCengShu;

    private String gongChengLeiBie;

    private String jieGouLeiXing;

    private String jiChuJieGou;

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

    public String getDanXiangGongCheng() {
        return danXiangGongCheng;
    }

    public void setDanXiangGongCheng(String danXiangGongCheng) {
        this.danXiangGongCheng = danXiangGongCheng == null ? null : danXiangGongCheng.trim();
    }

    public String getGuiMoMianJi() {
        return guiMoMianJi;
    }

    public void setGuiMoMianJi(String guiMoMianJi) {
        this.guiMoMianJi = guiMoMianJi == null ? null : guiMoMianJi.trim();
    }

    public String getGuiMoChangDu() {
        return guiMoChangDu;
    }

    public void setGuiMoChangDu(String guiMoChangDu) {
        this.guiMoChangDu = guiMoChangDu == null ? null : guiMoChangDu.trim();
    }

    public String getGuiMoQiTa() {
        return guiMoQiTa;
    }

    public void setGuiMoQiTa(String guiMoQiTa) {
        this.guiMoQiTa = guiMoQiTa == null ? null : guiMoQiTa.trim();
    }

    public String getYanGao() {
        return yanGao;
    }

    public void setYanGao(String yanGao) {
        this.yanGao = yanGao == null ? null : yanGao.trim();
    }

    public String getZongGao() {
        return zongGao;
    }

    public void setZongGao(String zongGao) {
        this.zongGao = zongGao == null ? null : zongGao.trim();
    }

    public String getDiShangDiXiaCengShu() {
        return diShangDiXiaCengShu;
    }

    public void setDiShangDiXiaCengShu(String diShangDiXiaCengShu) {
        this.diShangDiXiaCengShu = diShangDiXiaCengShu == null ? null : diShangDiXiaCengShu.trim();
    }

    public String getGongChengLeiBie() {
        return gongChengLeiBie;
    }

    public void setGongChengLeiBie(String gongChengLeiBie) {
        this.gongChengLeiBie = gongChengLeiBie == null ? null : gongChengLeiBie.trim();
    }

    public String getJieGouLeiXing() {
        return jieGouLeiXing;
    }

    public void setJieGouLeiXing(String jieGouLeiXing) {
        this.jieGouLeiXing = jieGouLeiXing == null ? null : jieGouLeiXing.trim();
    }

    public String getJiChuJieGou() {
        return jiChuJieGou;
    }

    public void setJiChuJieGou(String jiChuJieGou) {
        this.jiChuJieGou = jiChuJieGou == null ? null : jiChuJieGou.trim();
    }
}