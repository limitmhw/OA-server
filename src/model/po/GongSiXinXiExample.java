package model.po;

import java.util.ArrayList;
import java.util.List;

public class GongSiXinXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GongSiXinXiExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengIsNull() {
            addCriterion("qi_ye_ming_cheng_ is null");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengIsNotNull() {
            addCriterion("qi_ye_ming_cheng_ is not null");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengEqualTo(String value) {
            addCriterion("qi_ye_ming_cheng_ =", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengNotEqualTo(String value) {
            addCriterion("qi_ye_ming_cheng_ <>", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengGreaterThan(String value) {
            addCriterion("qi_ye_ming_cheng_ >", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("qi_ye_ming_cheng_ >=", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengLessThan(String value) {
            addCriterion("qi_ye_ming_cheng_ <", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengLessThanOrEqualTo(String value) {
            addCriterion("qi_ye_ming_cheng_ <=", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengLike(String value) {
            addCriterion("qi_ye_ming_cheng_ like", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengNotLike(String value) {
            addCriterion("qi_ye_ming_cheng_ not like", value, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengIn(List<String> values) {
            addCriterion("qi_ye_ming_cheng_ in", values, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengNotIn(List<String> values) {
            addCriterion("qi_ye_ming_cheng_ not in", values, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengBetween(String value1, String value2) {
            addCriterion("qi_ye_ming_cheng_ between", value1, value2, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andQiYeMingChengNotBetween(String value1, String value2) {
            addCriterion("qi_ye_ming_cheng_ not between", value1, value2, "qiYeMingCheng");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingIsNull() {
            addCriterion("gong_si_lei_xing_ is null");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingIsNotNull() {
            addCriterion("gong_si_lei_xing_ is not null");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingEqualTo(String value) {
            addCriterion("gong_si_lei_xing_ =", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingNotEqualTo(String value) {
            addCriterion("gong_si_lei_xing_ <>", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingGreaterThan(String value) {
            addCriterion("gong_si_lei_xing_ >", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingGreaterThanOrEqualTo(String value) {
            addCriterion("gong_si_lei_xing_ >=", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingLessThan(String value) {
            addCriterion("gong_si_lei_xing_ <", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingLessThanOrEqualTo(String value) {
            addCriterion("gong_si_lei_xing_ <=", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingLike(String value) {
            addCriterion("gong_si_lei_xing_ like", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingNotLike(String value) {
            addCriterion("gong_si_lei_xing_ not like", value, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingIn(List<String> values) {
            addCriterion("gong_si_lei_xing_ in", values, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingNotIn(List<String> values) {
            addCriterion("gong_si_lei_xing_ not in", values, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingBetween(String value1, String value2) {
            addCriterion("gong_si_lei_xing_ between", value1, value2, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiLeiXingNotBetween(String value1, String value2) {
            addCriterion("gong_si_lei_xing_ not between", value1, value2, "gongSiLeiXing");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiIsNull() {
            addCriterion("zhu_ce_di_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiIsNotNull() {
            addCriterion("zhu_ce_di_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiEqualTo(String value) {
            addCriterion("zhu_ce_di_zhi_ =", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiNotEqualTo(String value) {
            addCriterion("zhu_ce_di_zhi_ <>", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiGreaterThan(String value) {
            addCriterion("zhu_ce_di_zhi_ >", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiGreaterThanOrEqualTo(String value) {
            addCriterion("zhu_ce_di_zhi_ >=", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiLessThan(String value) {
            addCriterion("zhu_ce_di_zhi_ <", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiLessThanOrEqualTo(String value) {
            addCriterion("zhu_ce_di_zhi_ <=", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiLike(String value) {
            addCriterion("zhu_ce_di_zhi_ like", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiNotLike(String value) {
            addCriterion("zhu_ce_di_zhi_ not like", value, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiIn(List<String> values) {
            addCriterion("zhu_ce_di_zhi_ in", values, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiNotIn(List<String> values) {
            addCriterion("zhu_ce_di_zhi_ not in", values, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiBetween(String value1, String value2) {
            addCriterion("zhu_ce_di_zhi_ between", value1, value2, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andZhuCeDiZhiNotBetween(String value1, String value2) {
            addCriterion("zhu_ce_di_zhi_ not between", value1, value2, "zhuCeDiZhi");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenIsNull() {
            addCriterion("fa_ding_dai_biao_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenIsNotNull() {
            addCriterion("fa_ding_dai_biao_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenEqualTo(String value) {
            addCriterion("fa_ding_dai_biao_ren_ =", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenNotEqualTo(String value) {
            addCriterion("fa_ding_dai_biao_ren_ <>", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenGreaterThan(String value) {
            addCriterion("fa_ding_dai_biao_ren_ >", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenGreaterThanOrEqualTo(String value) {
            addCriterion("fa_ding_dai_biao_ren_ >=", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenLessThan(String value) {
            addCriterion("fa_ding_dai_biao_ren_ <", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenLessThanOrEqualTo(String value) {
            addCriterion("fa_ding_dai_biao_ren_ <=", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenLike(String value) {
            addCriterion("fa_ding_dai_biao_ren_ like", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenNotLike(String value) {
            addCriterion("fa_ding_dai_biao_ren_ not like", value, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenIn(List<String> values) {
            addCriterion("fa_ding_dai_biao_ren_ in", values, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenNotIn(List<String> values) {
            addCriterion("fa_ding_dai_biao_ren_ not in", values, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenBetween(String value1, String value2) {
            addCriterion("fa_ding_dai_biao_ren_ between", value1, value2, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andFaDingDaiBiaoRenNotBetween(String value1, String value2) {
            addCriterion("fa_ding_dai_biao_ren_ not between", value1, value2, "faDingDaiBiaoRen");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoIsNull() {
            addCriterion("gong_shang_zhu_ce_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoIsNotNull() {
            addCriterion("gong_shang_zhu_ce_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoEqualTo(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ =", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoNotEqualTo(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ <>", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoGreaterThan(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ >", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoGreaterThanOrEqualTo(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ >=", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoLessThan(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ <", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoLessThanOrEqualTo(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ <=", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoLike(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ like", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoNotLike(String value) {
            addCriterion("gong_shang_zhu_ce_hao_ not like", value, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoIn(List<String> values) {
            addCriterion("gong_shang_zhu_ce_hao_ in", values, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoNotIn(List<String> values) {
            addCriterion("gong_shang_zhu_ce_hao_ not in", values, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoBetween(String value1, String value2) {
            addCriterion("gong_shang_zhu_ce_hao_ between", value1, value2, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andGongShangZhuCeHaoNotBetween(String value1, String value2) {
            addCriterion("gong_shang_zhu_ce_hao_ not between", value1, value2, "gongShangZhuCeHao");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenIsNull() {
            addCriterion("zhu_ce_zi_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenIsNotNull() {
            addCriterion("zhu_ce_zi_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenEqualTo(String value) {
            addCriterion("zhu_ce_zi_ben_ =", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenNotEqualTo(String value) {
            addCriterion("zhu_ce_zi_ben_ <>", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenGreaterThan(String value) {
            addCriterion("zhu_ce_zi_ben_ >", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenGreaterThanOrEqualTo(String value) {
            addCriterion("zhu_ce_zi_ben_ >=", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenLessThan(String value) {
            addCriterion("zhu_ce_zi_ben_ <", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenLessThanOrEqualTo(String value) {
            addCriterion("zhu_ce_zi_ben_ <=", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenLike(String value) {
            addCriterion("zhu_ce_zi_ben_ like", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenNotLike(String value) {
            addCriterion("zhu_ce_zi_ben_ not like", value, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenIn(List<String> values) {
            addCriterion("zhu_ce_zi_ben_ in", values, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenNotIn(List<String> values) {
            addCriterion("zhu_ce_zi_ben_ not in", values, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenBetween(String value1, String value2) {
            addCriterion("zhu_ce_zi_ben_ between", value1, value2, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andZhuCeZiBenNotBetween(String value1, String value2) {
            addCriterion("zhu_ce_zi_ben_ not between", value1, value2, "zhuCeZiBen");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangIsNull() {
            addCriterion("kai_hu_yin_hang_ is null");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangIsNotNull() {
            addCriterion("kai_hu_yin_hang_ is not null");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangEqualTo(String value) {
            addCriterion("kai_hu_yin_hang_ =", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangNotEqualTo(String value) {
            addCriterion("kai_hu_yin_hang_ <>", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangGreaterThan(String value) {
            addCriterion("kai_hu_yin_hang_ >", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangGreaterThanOrEqualTo(String value) {
            addCriterion("kai_hu_yin_hang_ >=", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangLessThan(String value) {
            addCriterion("kai_hu_yin_hang_ <", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangLessThanOrEqualTo(String value) {
            addCriterion("kai_hu_yin_hang_ <=", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangLike(String value) {
            addCriterion("kai_hu_yin_hang_ like", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangNotLike(String value) {
            addCriterion("kai_hu_yin_hang_ not like", value, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangIn(List<String> values) {
            addCriterion("kai_hu_yin_hang_ in", values, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangNotIn(List<String> values) {
            addCriterion("kai_hu_yin_hang_ not in", values, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangBetween(String value1, String value2) {
            addCriterion("kai_hu_yin_hang_ between", value1, value2, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuYinHangNotBetween(String value1, String value2) {
            addCriterion("kai_hu_yin_hang_ not between", value1, value2, "kaiHuYinHang");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoIsNull() {
            addCriterion("kai_hu_zhang_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoIsNotNull() {
            addCriterion("kai_hu_zhang_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoEqualTo(String value) {
            addCriterion("kai_hu_zhang_hao_ =", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoNotEqualTo(String value) {
            addCriterion("kai_hu_zhang_hao_ <>", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoGreaterThan(String value) {
            addCriterion("kai_hu_zhang_hao_ >", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoGreaterThanOrEqualTo(String value) {
            addCriterion("kai_hu_zhang_hao_ >=", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoLessThan(String value) {
            addCriterion("kai_hu_zhang_hao_ <", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoLessThanOrEqualTo(String value) {
            addCriterion("kai_hu_zhang_hao_ <=", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoLike(String value) {
            addCriterion("kai_hu_zhang_hao_ like", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoNotLike(String value) {
            addCriterion("kai_hu_zhang_hao_ not like", value, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoIn(List<String> values) {
            addCriterion("kai_hu_zhang_hao_ in", values, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoNotIn(List<String> values) {
            addCriterion("kai_hu_zhang_hao_ not in", values, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoBetween(String value1, String value2) {
            addCriterion("kai_hu_zhang_hao_ between", value1, value2, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andKaiHuZhangHaoNotBetween(String value1, String value2) {
            addCriterion("kai_hu_zhang_hao_ not between", value1, value2, "kaiHuZhangHao");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenIsNull() {
            addCriterion("wei_tuo_dai_li_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenIsNotNull() {
            addCriterion("wei_tuo_dai_li_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_ =", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenNotEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_ <>", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenGreaterThan(String value) {
            addCriterion("wei_tuo_dai_li_ren_ >", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenGreaterThanOrEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_ >=", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenLessThan(String value) {
            addCriterion("wei_tuo_dai_li_ren_ <", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenLessThanOrEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_ <=", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenLike(String value) {
            addCriterion("wei_tuo_dai_li_ren_ like", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenNotLike(String value) {
            addCriterion("wei_tuo_dai_li_ren_ not like", value, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenIn(List<String> values) {
            addCriterion("wei_tuo_dai_li_ren_ in", values, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenNotIn(List<String> values) {
            addCriterion("wei_tuo_dai_li_ren_ not in", values, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenBetween(String value1, String value2) {
            addCriterion("wei_tuo_dai_li_ren_ between", value1, value2, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenNotBetween(String value1, String value2) {
            addCriterion("wei_tuo_dai_li_ren_ not between", value1, value2, "weiTuoDaiLiRen");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuIsNull() {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ is null");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuIsNotNull() {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ is not null");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ =", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuNotEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ <>", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuGreaterThan(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ >", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuGreaterThanOrEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ >=", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuLessThan(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ <", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuLessThanOrEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ <=", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuLike(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ like", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuNotLike(String value) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ not like", value, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuIn(List<String> values) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ in", values, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuNotIn(List<String> values) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ not in", values, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuBetween(String value1, String value2) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ between", value1, value2, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenZhiWuNotBetween(String value1, String value2) {
            addCriterion("wei_tuo_dai_li_ren_zhi_wu_ not between", value1, value2, "weiTuoDaiLiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaIsNull() {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ is null");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaIsNotNull() {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ is not null");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ =", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaNotEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ <>", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaGreaterThan(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ >", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaGreaterThanOrEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ >=", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaLessThan(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ <", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaLessThanOrEqualTo(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ <=", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaLike(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ like", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaNotLike(String value) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ not like", value, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaIn(List<String> values) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ in", values, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaNotIn(List<String> values) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ not in", values, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaBetween(String value1, String value2) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ between", value1, value2, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andWeiTuoDaiLiRenDianHuaNotBetween(String value1, String value2) {
            addCriterion("wei_tuo_dai_li_ren_dian_hua_ not between", value1, value2, "weiTuoDaiLiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenIsNull() {
            addCriterion("lian_xi_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andLianXiRenIsNotNull() {
            addCriterion("lian_xi_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andLianXiRenEqualTo(String value) {
            addCriterion("lian_xi_ren_ =", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenNotEqualTo(String value) {
            addCriterion("lian_xi_ren_ <>", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenGreaterThan(String value) {
            addCriterion("lian_xi_ren_ >", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenGreaterThanOrEqualTo(String value) {
            addCriterion("lian_xi_ren_ >=", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenLessThan(String value) {
            addCriterion("lian_xi_ren_ <", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenLessThanOrEqualTo(String value) {
            addCriterion("lian_xi_ren_ <=", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenLike(String value) {
            addCriterion("lian_xi_ren_ like", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenNotLike(String value) {
            addCriterion("lian_xi_ren_ not like", value, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenIn(List<String> values) {
            addCriterion("lian_xi_ren_ in", values, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenNotIn(List<String> values) {
            addCriterion("lian_xi_ren_ not in", values, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenBetween(String value1, String value2) {
            addCriterion("lian_xi_ren_ between", value1, value2, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenNotBetween(String value1, String value2) {
            addCriterion("lian_xi_ren_ not between", value1, value2, "lianXiRen");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuIsNull() {
            addCriterion("lian_xi_ren_zhi_wu_ is null");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuIsNotNull() {
            addCriterion("lian_xi_ren_zhi_wu_ is not null");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuEqualTo(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ =", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuNotEqualTo(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ <>", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuGreaterThan(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ >", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuGreaterThanOrEqualTo(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ >=", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuLessThan(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ <", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuLessThanOrEqualTo(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ <=", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuLike(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ like", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuNotLike(String value) {
            addCriterion("lian_xi_ren_zhi_wu_ not like", value, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuIn(List<String> values) {
            addCriterion("lian_xi_ren_zhi_wu_ in", values, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuNotIn(List<String> values) {
            addCriterion("lian_xi_ren_zhi_wu_ not in", values, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuBetween(String value1, String value2) {
            addCriterion("lian_xi_ren_zhi_wu_ between", value1, value2, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenZhiWuNotBetween(String value1, String value2) {
            addCriterion("lian_xi_ren_zhi_wu_ not between", value1, value2, "lianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaIsNull() {
            addCriterion("lian_xi_ren_dian_hua_ is null");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaIsNotNull() {
            addCriterion("lian_xi_ren_dian_hua_ is not null");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaEqualTo(String value) {
            addCriterion("lian_xi_ren_dian_hua_ =", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaNotEqualTo(String value) {
            addCriterion("lian_xi_ren_dian_hua_ <>", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaGreaterThan(String value) {
            addCriterion("lian_xi_ren_dian_hua_ >", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaGreaterThanOrEqualTo(String value) {
            addCriterion("lian_xi_ren_dian_hua_ >=", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaLessThan(String value) {
            addCriterion("lian_xi_ren_dian_hua_ <", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaLessThanOrEqualTo(String value) {
            addCriterion("lian_xi_ren_dian_hua_ <=", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaLike(String value) {
            addCriterion("lian_xi_ren_dian_hua_ like", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaNotLike(String value) {
            addCriterion("lian_xi_ren_dian_hua_ not like", value, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaIn(List<String> values) {
            addCriterion("lian_xi_ren_dian_hua_ in", values, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaNotIn(List<String> values) {
            addCriterion("lian_xi_ren_dian_hua_ not in", values, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaBetween(String value1, String value2) {
            addCriterion("lian_xi_ren_dian_hua_ between", value1, value2, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andLianXiRenDianHuaNotBetween(String value1, String value2) {
            addCriterion("lian_xi_ren_dian_hua_ not between", value1, value2, "lianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangIsNull() {
            addCriterion("dian_zi_you_xiang_ is null");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangIsNotNull() {
            addCriterion("dian_zi_you_xiang_ is not null");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangEqualTo(String value) {
            addCriterion("dian_zi_you_xiang_ =", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangNotEqualTo(String value) {
            addCriterion("dian_zi_you_xiang_ <>", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangGreaterThan(String value) {
            addCriterion("dian_zi_you_xiang_ >", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangGreaterThanOrEqualTo(String value) {
            addCriterion("dian_zi_you_xiang_ >=", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangLessThan(String value) {
            addCriterion("dian_zi_you_xiang_ <", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangLessThanOrEqualTo(String value) {
            addCriterion("dian_zi_you_xiang_ <=", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangLike(String value) {
            addCriterion("dian_zi_you_xiang_ like", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangNotLike(String value) {
            addCriterion("dian_zi_you_xiang_ not like", value, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangIn(List<String> values) {
            addCriterion("dian_zi_you_xiang_ in", values, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangNotIn(List<String> values) {
            addCriterion("dian_zi_you_xiang_ not in", values, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangBetween(String value1, String value2) {
            addCriterion("dian_zi_you_xiang_ between", value1, value2, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andDianZiYouXiangNotBetween(String value1, String value2) {
            addCriterion("dian_zi_you_xiang_ not between", value1, value2, "dianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andChuanZhenIsNull() {
            addCriterion("chuan_zhen_ is null");
            return (Criteria) this;
        }

        public Criteria andChuanZhenIsNotNull() {
            addCriterion("chuan_zhen_ is not null");
            return (Criteria) this;
        }

        public Criteria andChuanZhenEqualTo(String value) {
            addCriterion("chuan_zhen_ =", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotEqualTo(String value) {
            addCriterion("chuan_zhen_ <>", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenGreaterThan(String value) {
            addCriterion("chuan_zhen_ >", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenGreaterThanOrEqualTo(String value) {
            addCriterion("chuan_zhen_ >=", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenLessThan(String value) {
            addCriterion("chuan_zhen_ <", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenLessThanOrEqualTo(String value) {
            addCriterion("chuan_zhen_ <=", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenLike(String value) {
            addCriterion("chuan_zhen_ like", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotLike(String value) {
            addCriterion("chuan_zhen_ not like", value, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenIn(List<String> values) {
            addCriterion("chuan_zhen_ in", values, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotIn(List<String> values) {
            addCriterion("chuan_zhen_ not in", values, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenBetween(String value1, String value2) {
            addCriterion("chuan_zhen_ between", value1, value2, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andChuanZhenNotBetween(String value1, String value2) {
            addCriterion("chuan_zhen_ not between", value1, value2, "chuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiIsNull() {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiIsNotNull() {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ =", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ <>", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ >", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ >=", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiLessThan(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ <", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ <=", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiLike(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ like", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiNotLike(String value) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ not like", value, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ in", values, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ not in", values, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ between", value1, value2, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouXiangXiDiZhiNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_xiang_xi_di_zhi_ not between", value1, value2, "banShiJiGouXiangXiDiZhi");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaIsNull() {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaIsNotNull() {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ =", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ <>", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ >", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ >=", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaLessThan(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ <", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ <=", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaLike(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ like", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaNotLike(String value) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ not like", value, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ in", values, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ not in", values, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ between", value1, value2, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouYouZhengBianMaNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_you_zheng_bian_ma_ not between", value1, value2, "banShiJiGouYouZhengBianMa");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenIsNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenIsNotNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ =", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ <>", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ >", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ >=", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenLessThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ <", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ <=", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ like", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenNotLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ not like", value, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ in", values, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ not in", values, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ between", value1, value2, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_ not between", value1, value2, "banShiJiGouLianXiRen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuIsNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuIsNotNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ =", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ <>", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ >", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ >=", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuLessThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ <", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ <=", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ like", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuNotLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ not like", value, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ in", values, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ not in", values, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ between", value1, value2, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenZhiWuNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_zhi_wu_ not between", value1, value2, "banShiJiGouLianXiRenZhiWu");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaIsNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaIsNotNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ =", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ <>", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ >", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ >=", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaLessThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ <", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ <=", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ like", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaNotLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ not like", value, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ in", values, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ not in", values, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ between", value1, value2, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianHuaNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_hua_ not between", value1, value2, "banShiJiGouLianXiRenDianHua");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangIsNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangIsNotNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ =", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ <>", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ >", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ >=", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangLessThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ <", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ <=", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ like", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangNotLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ not like", value, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ in", values, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ not in", values, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ between", value1, value2, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenDianZiYouXiangNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_dian_zi_you_xiang_ not between", value1, value2, "banShiJiGouLianXiRenDianZiYouXiang");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenIsNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ is null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenIsNotNull() {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ is not null");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ =", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenNotEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ <>", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenGreaterThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ >", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenGreaterThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ >=", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenLessThan(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ <", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenLessThanOrEqualTo(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ <=", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ like", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenNotLike(String value) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ not like", value, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ in", values, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenNotIn(List<String> values) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ not in", values, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ between", value1, value2, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andBanShiJiGouLianXiRenChuanZhenNotBetween(String value1, String value2) {
            addCriterion("ban_shi_ji_gou_lian_xi_ren_chuan_zhen_ not between", value1, value2, "banShiJiGouLianXiRenChuanZhen");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingIsNull() {
            addCriterion("gong_si_ji_lu_lei_xing_ is null");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingIsNotNull() {
            addCriterion("gong_si_ji_lu_lei_xing_ is not null");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingEqualTo(Integer value) {
            addCriterion("gong_si_ji_lu_lei_xing_ =", value, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingNotEqualTo(Integer value) {
            addCriterion("gong_si_ji_lu_lei_xing_ <>", value, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingGreaterThan(Integer value) {
            addCriterion("gong_si_ji_lu_lei_xing_ >", value, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingGreaterThanOrEqualTo(Integer value) {
            addCriterion("gong_si_ji_lu_lei_xing_ >=", value, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingLessThan(Integer value) {
            addCriterion("gong_si_ji_lu_lei_xing_ <", value, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingLessThanOrEqualTo(Integer value) {
            addCriterion("gong_si_ji_lu_lei_xing_ <=", value, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingIn(List<Integer> values) {
            addCriterion("gong_si_ji_lu_lei_xing_ in", values, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingNotIn(List<Integer> values) {
            addCriterion("gong_si_ji_lu_lei_xing_ not in", values, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingBetween(Integer value1, Integer value2) {
            addCriterion("gong_si_ji_lu_lei_xing_ between", value1, value2, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }

        public Criteria andGongSiJiLuLeiXingNotBetween(Integer value1, Integer value2) {
            addCriterion("gong_si_ji_lu_lei_xing_ not between", value1, value2, "gongSiJiLuLeiXing");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}