package model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XiangMuXinXiExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiangMuXinXiExample() {
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

        public Criteria andXiangMuMingChenIsNull() {
            addCriterion("xiang_mu_ming_chen_ is null");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenIsNotNull() {
            addCriterion("xiang_mu_ming_chen_ is not null");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_ =", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenNotEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_ <>", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenGreaterThan(String value) {
            addCriterion("xiang_mu_ming_chen_ >", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenGreaterThanOrEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_ >=", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenLessThan(String value) {
            addCriterion("xiang_mu_ming_chen_ <", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenLessThanOrEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_ <=", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenLike(String value) {
            addCriterion("xiang_mu_ming_chen_ like", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenNotLike(String value) {
            addCriterion("xiang_mu_ming_chen_ not like", value, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenIn(List<String> values) {
            addCriterion("xiang_mu_ming_chen_ in", values, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenNotIn(List<String> values) {
            addCriterion("xiang_mu_ming_chen_ not in", values, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenBetween(String value1, String value2) {
            addCriterion("xiang_mu_ming_chen_ between", value1, value2, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenNotBetween(String value1, String value2) {
            addCriterion("xiang_mu_ming_chen_ not between", value1, value2, "xiangMuMingChen");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuIsNull() {
            addCriterion("xiang_mu_yong_tu_ is null");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuIsNotNull() {
            addCriterion("xiang_mu_yong_tu_ is not null");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuEqualTo(String value) {
            addCriterion("xiang_mu_yong_tu_ =", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuNotEqualTo(String value) {
            addCriterion("xiang_mu_yong_tu_ <>", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuGreaterThan(String value) {
            addCriterion("xiang_mu_yong_tu_ >", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuGreaterThanOrEqualTo(String value) {
            addCriterion("xiang_mu_yong_tu_ >=", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuLessThan(String value) {
            addCriterion("xiang_mu_yong_tu_ <", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuLessThanOrEqualTo(String value) {
            addCriterion("xiang_mu_yong_tu_ <=", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuLike(String value) {
            addCriterion("xiang_mu_yong_tu_ like", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuNotLike(String value) {
            addCriterion("xiang_mu_yong_tu_ not like", value, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuIn(List<String> values) {
            addCriterion("xiang_mu_yong_tu_ in", values, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuNotIn(List<String> values) {
            addCriterion("xiang_mu_yong_tu_ not in", values, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuBetween(String value1, String value2) {
            addCriterion("xiang_mu_yong_tu_ between", value1, value2, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andXiangMuYongTuNotBetween(String value1, String value2) {
            addCriterion("xiang_mu_yong_tu_ not between", value1, value2, "xiangMuYongTu");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianIsNull() {
            addCriterion("gong_cheng_di_dian_ is null");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianIsNotNull() {
            addCriterion("gong_cheng_di_dian_ is not null");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianEqualTo(String value) {
            addCriterion("gong_cheng_di_dian_ =", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianNotEqualTo(String value) {
            addCriterion("gong_cheng_di_dian_ <>", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianGreaterThan(String value) {
            addCriterion("gong_cheng_di_dian_ >", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianGreaterThanOrEqualTo(String value) {
            addCriterion("gong_cheng_di_dian_ >=", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianLessThan(String value) {
            addCriterion("gong_cheng_di_dian_ <", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianLessThanOrEqualTo(String value) {
            addCriterion("gong_cheng_di_dian_ <=", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianLike(String value) {
            addCriterion("gong_cheng_di_dian_ like", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianNotLike(String value) {
            addCriterion("gong_cheng_di_dian_ not like", value, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianIn(List<String> values) {
            addCriterion("gong_cheng_di_dian_ in", values, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianNotIn(List<String> values) {
            addCriterion("gong_cheng_di_dian_ not in", values, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianBetween(String value1, String value2) {
            addCriterion("gong_cheng_di_dian_ between", value1, value2, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andGongChengDiDianNotBetween(String value1, String value2) {
            addCriterion("gong_cheng_di_dian_ not between", value1, value2, "gongChengDiDian");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiIsNull() {
            addCriterion("tou_zi_xing_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiIsNotNull() {
            addCriterion("tou_zi_xing_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiEqualTo(String value) {
            addCriterion("tou_zi_xing_zhi_ =", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiNotEqualTo(String value) {
            addCriterion("tou_zi_xing_zhi_ <>", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiGreaterThan(String value) {
            addCriterion("tou_zi_xing_zhi_ >", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiGreaterThanOrEqualTo(String value) {
            addCriterion("tou_zi_xing_zhi_ >=", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiLessThan(String value) {
            addCriterion("tou_zi_xing_zhi_ <", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiLessThanOrEqualTo(String value) {
            addCriterion("tou_zi_xing_zhi_ <=", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiLike(String value) {
            addCriterion("tou_zi_xing_zhi_ like", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiNotLike(String value) {
            addCriterion("tou_zi_xing_zhi_ not like", value, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiIn(List<String> values) {
            addCriterion("tou_zi_xing_zhi_ in", values, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiNotIn(List<String> values) {
            addCriterion("tou_zi_xing_zhi_ not in", values, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiBetween(String value1, String value2) {
            addCriterion("tou_zi_xing_zhi_ between", value1, value2, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andTouZiXingZhiNotBetween(String value1, String value2) {
            addCriterion("tou_zi_xing_zhi_ not between", value1, value2, "touZiXingZhi");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiIsNull() {
            addCriterion("jian_she_dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiIsNotNull() {
            addCriterion("jian_she_dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiEqualTo(String value) {
            addCriterion("jian_she_dan_wei_ =", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiNotEqualTo(String value) {
            addCriterion("jian_she_dan_wei_ <>", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiGreaterThan(String value) {
            addCriterion("jian_she_dan_wei_ >", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("jian_she_dan_wei_ >=", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiLessThan(String value) {
            addCriterion("jian_she_dan_wei_ <", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiLessThanOrEqualTo(String value) {
            addCriterion("jian_she_dan_wei_ <=", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiLike(String value) {
            addCriterion("jian_she_dan_wei_ like", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiNotLike(String value) {
            addCriterion("jian_she_dan_wei_ not like", value, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiIn(List<String> values) {
            addCriterion("jian_she_dan_wei_ in", values, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiNotIn(List<String> values) {
            addCriterion("jian_she_dan_wei_ not in", values, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiBetween(String value1, String value2) {
            addCriterion("jian_she_dan_wei_ between", value1, value2, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiNotBetween(String value1, String value2) {
            addCriterion("jian_she_dan_wei_ not between", value1, value2, "jianSheDanWei");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoIsNull() {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoIsNotNull() {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoEqualTo(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ =", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoNotEqualTo(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ <>", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoGreaterThan(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ >", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ >=", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoLessThan(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ <", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoLessThanOrEqualTo(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ <=", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoLike(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ like", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoNotLike(String value) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ not like", value, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoIn(List<String> values) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ in", values, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoNotIn(List<String> values) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ not in", values, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoBetween(String value1, String value2) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ between", value1, value2, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianSheDanWeiZhuGongDiDaiBiaoNotBetween(String value1, String value2) {
            addCriterion("jian_she_dan_wei_zhu_gong_di_dai_biao_ not between", value1, value2, "jianSheDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiIsNull() {
            addCriterion("she_ji_dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiIsNotNull() {
            addCriterion("she_ji_dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiEqualTo(String value) {
            addCriterion("she_ji_dan_wei_ =", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiNotEqualTo(String value) {
            addCriterion("she_ji_dan_wei_ <>", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiGreaterThan(String value) {
            addCriterion("she_ji_dan_wei_ >", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("she_ji_dan_wei_ >=", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiLessThan(String value) {
            addCriterion("she_ji_dan_wei_ <", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiLessThanOrEqualTo(String value) {
            addCriterion("she_ji_dan_wei_ <=", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiLike(String value) {
            addCriterion("she_ji_dan_wei_ like", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiNotLike(String value) {
            addCriterion("she_ji_dan_wei_ not like", value, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiIn(List<String> values) {
            addCriterion("she_ji_dan_wei_ in", values, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiNotIn(List<String> values) {
            addCriterion("she_ji_dan_wei_ not in", values, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiBetween(String value1, String value2) {
            addCriterion("she_ji_dan_wei_ between", value1, value2, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiNotBetween(String value1, String value2) {
            addCriterion("she_ji_dan_wei_ not between", value1, value2, "sheJiDanWei");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoIsNull() {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoIsNotNull() {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoEqualTo(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ =", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoNotEqualTo(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ <>", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoGreaterThan(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ >", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ >=", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoLessThan(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ <", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoLessThanOrEqualTo(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ <=", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoLike(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ like", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoNotLike(String value) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ not like", value, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoIn(List<String> values) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ in", values, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoNotIn(List<String> values) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ not in", values, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoBetween(String value1, String value2) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ between", value1, value2, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andSheJiDanWeiZhuGongDiDaiBiaoNotBetween(String value1, String value2) {
            addCriterion("she_ji_dan_wei_zhu_gong_di_dai_biao_ not between", value1, value2, "sheJiDanWeiZhuGongDiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiIsNull() {
            addCriterion("jian_li_dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiIsNotNull() {
            addCriterion("jian_li_dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiEqualTo(String value) {
            addCriterion("jian_li_dan_wei_ =", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiNotEqualTo(String value) {
            addCriterion("jian_li_dan_wei_ <>", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiGreaterThan(String value) {
            addCriterion("jian_li_dan_wei_ >", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("jian_li_dan_wei_ >=", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiLessThan(String value) {
            addCriterion("jian_li_dan_wei_ <", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiLessThanOrEqualTo(String value) {
            addCriterion("jian_li_dan_wei_ <=", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiLike(String value) {
            addCriterion("jian_li_dan_wei_ like", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiNotLike(String value) {
            addCriterion("jian_li_dan_wei_ not like", value, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiIn(List<String> values) {
            addCriterion("jian_li_dan_wei_ in", values, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiNotIn(List<String> values) {
            addCriterion("jian_li_dan_wei_ not in", values, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiBetween(String value1, String value2) {
            addCriterion("jian_li_dan_wei_ between", value1, value2, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDanWeiNotBetween(String value1, String value2) {
            addCriterion("jian_li_dan_wei_ not between", value1, value2, "jianLiDanWei");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoIsNull() {
            addCriterion("jian_li_dai_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoIsNotNull() {
            addCriterion("jian_li_dai_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoEqualTo(String value) {
            addCriterion("jian_li_dai_biao_ =", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoNotEqualTo(String value) {
            addCriterion("jian_li_dai_biao_ <>", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoGreaterThan(String value) {
            addCriterion("jian_li_dai_biao_ >", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("jian_li_dai_biao_ >=", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoLessThan(String value) {
            addCriterion("jian_li_dai_biao_ <", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoLessThanOrEqualTo(String value) {
            addCriterion("jian_li_dai_biao_ <=", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoLike(String value) {
            addCriterion("jian_li_dai_biao_ like", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoNotLike(String value) {
            addCriterion("jian_li_dai_biao_ not like", value, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoIn(List<String> values) {
            addCriterion("jian_li_dai_biao_ in", values, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoNotIn(List<String> values) {
            addCriterion("jian_li_dai_biao_ not in", values, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoBetween(String value1, String value2) {
            addCriterion("jian_li_dai_biao_ between", value1, value2, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andJianLiDaiBiaoNotBetween(String value1, String value2) {
            addCriterion("jian_li_dai_biao_ not between", value1, value2, "jianLiDaiBiao");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiIsNull() {
            addCriterion("kai_gong_ri_qi_ is null");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiIsNotNull() {
            addCriterion("kai_gong_ri_qi_ is not null");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiEqualTo(Date value) {
            addCriterion("kai_gong_ri_qi_ =", value, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiNotEqualTo(Date value) {
            addCriterion("kai_gong_ri_qi_ <>", value, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiGreaterThan(Date value) {
            addCriterion("kai_gong_ri_qi_ >", value, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiGreaterThanOrEqualTo(Date value) {
            addCriterion("kai_gong_ri_qi_ >=", value, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiLessThan(Date value) {
            addCriterion("kai_gong_ri_qi_ <", value, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiLessThanOrEqualTo(Date value) {
            addCriterion("kai_gong_ri_qi_ <=", value, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiIn(List<Date> values) {
            addCriterion("kai_gong_ri_qi_ in", values, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiNotIn(List<Date> values) {
            addCriterion("kai_gong_ri_qi_ not in", values, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiBetween(Date value1, Date value2) {
            addCriterion("kai_gong_ri_qi_ between", value1, value2, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andKaiGongRiQiNotBetween(Date value1, Date value2) {
            addCriterion("kai_gong_ri_qi_ not between", value1, value2, "kaiGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiIsNull() {
            addCriterion("jun_gong_ri_qi_ is null");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiIsNotNull() {
            addCriterion("jun_gong_ri_qi_ is not null");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiEqualTo(Date value) {
            addCriterion("jun_gong_ri_qi_ =", value, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiNotEqualTo(Date value) {
            addCriterion("jun_gong_ri_qi_ <>", value, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiGreaterThan(Date value) {
            addCriterion("jun_gong_ri_qi_ >", value, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiGreaterThanOrEqualTo(Date value) {
            addCriterion("jun_gong_ri_qi_ >=", value, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiLessThan(Date value) {
            addCriterion("jun_gong_ri_qi_ <", value, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiLessThanOrEqualTo(Date value) {
            addCriterion("jun_gong_ri_qi_ <=", value, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiIn(List<Date> values) {
            addCriterion("jun_gong_ri_qi_ in", values, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiNotIn(List<Date> values) {
            addCriterion("jun_gong_ri_qi_ not in", values, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiBetween(Date value1, Date value2) {
            addCriterion("jun_gong_ri_qi_ between", value1, value2, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andJunGongRiQiNotBetween(Date value1, Date value2) {
            addCriterion("jun_gong_ri_qi_ not between", value1, value2, "junGongRiQi");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuIsNull() {
            addCriterion("gong_qi_tian_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuIsNotNull() {
            addCriterion("gong_qi_tian_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuEqualTo(String value) {
            addCriterion("gong_qi_tian_shu_ =", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuNotEqualTo(String value) {
            addCriterion("gong_qi_tian_shu_ <>", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuGreaterThan(String value) {
            addCriterion("gong_qi_tian_shu_ >", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuGreaterThanOrEqualTo(String value) {
            addCriterion("gong_qi_tian_shu_ >=", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuLessThan(String value) {
            addCriterion("gong_qi_tian_shu_ <", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuLessThanOrEqualTo(String value) {
            addCriterion("gong_qi_tian_shu_ <=", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuLike(String value) {
            addCriterion("gong_qi_tian_shu_ like", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuNotLike(String value) {
            addCriterion("gong_qi_tian_shu_ not like", value, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuIn(List<String> values) {
            addCriterion("gong_qi_tian_shu_ in", values, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuNotIn(List<String> values) {
            addCriterion("gong_qi_tian_shu_ not in", values, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuBetween(String value1, String value2) {
            addCriterion("gong_qi_tian_shu_ between", value1, value2, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andGongQiTianShuNotBetween(String value1, String value2) {
            addCriterion("gong_qi_tian_shu_ not between", value1, value2, "gongQiTianShu");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoIsNull() {
            addCriterion("zhi_liang_mu_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoIsNotNull() {
            addCriterion("zhi_liang_mu_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoEqualTo(String value) {
            addCriterion("zhi_liang_mu_biao_ =", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoNotEqualTo(String value) {
            addCriterion("zhi_liang_mu_biao_ <>", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoGreaterThan(String value) {
            addCriterion("zhi_liang_mu_biao_ >", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_liang_mu_biao_ >=", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoLessThan(String value) {
            addCriterion("zhi_liang_mu_biao_ <", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoLessThanOrEqualTo(String value) {
            addCriterion("zhi_liang_mu_biao_ <=", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoLike(String value) {
            addCriterion("zhi_liang_mu_biao_ like", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoNotLike(String value) {
            addCriterion("zhi_liang_mu_biao_ not like", value, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoIn(List<String> values) {
            addCriterion("zhi_liang_mu_biao_ in", values, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoNotIn(List<String> values) {
            addCriterion("zhi_liang_mu_biao_ not in", values, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoBetween(String value1, String value2) {
            addCriterion("zhi_liang_mu_biao_ between", value1, value2, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andZhiLiangMuBiaoNotBetween(String value1, String value2) {
            addCriterion("zhi_liang_mu_biao_ not between", value1, value2, "zhiLiangMuBiao");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanIsNull() {
            addCriterion("he_tong_jia_kuan_ is null");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanIsNotNull() {
            addCriterion("he_tong_jia_kuan_ is not null");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanEqualTo(String value) {
            addCriterion("he_tong_jia_kuan_ =", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanNotEqualTo(String value) {
            addCriterion("he_tong_jia_kuan_ <>", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanGreaterThan(String value) {
            addCriterion("he_tong_jia_kuan_ >", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanGreaterThanOrEqualTo(String value) {
            addCriterion("he_tong_jia_kuan_ >=", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanLessThan(String value) {
            addCriterion("he_tong_jia_kuan_ <", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanLessThanOrEqualTo(String value) {
            addCriterion("he_tong_jia_kuan_ <=", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanLike(String value) {
            addCriterion("he_tong_jia_kuan_ like", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanNotLike(String value) {
            addCriterion("he_tong_jia_kuan_ not like", value, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanIn(List<String> values) {
            addCriterion("he_tong_jia_kuan_ in", values, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanNotIn(List<String> values) {
            addCriterion("he_tong_jia_kuan_ not in", values, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanBetween(String value1, String value2) {
            addCriterion("he_tong_jia_kuan_ between", value1, value2, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andHeTongJiaKuanNotBetween(String value1, String value2) {
            addCriterion("he_tong_jia_kuan_ not between", value1, value2, "heTongJiaKuan");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiIsNull() {
            addCriterion("cheng_bao_fang_shi_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiIsNotNull() {
            addCriterion("cheng_bao_fang_shi_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiEqualTo(String value) {
            addCriterion("cheng_bao_fang_shi_ =", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiNotEqualTo(String value) {
            addCriterion("cheng_bao_fang_shi_ <>", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiGreaterThan(String value) {
            addCriterion("cheng_bao_fang_shi_ >", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_bao_fang_shi_ >=", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiLessThan(String value) {
            addCriterion("cheng_bao_fang_shi_ <", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiLessThanOrEqualTo(String value) {
            addCriterion("cheng_bao_fang_shi_ <=", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiLike(String value) {
            addCriterion("cheng_bao_fang_shi_ like", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiNotLike(String value) {
            addCriterion("cheng_bao_fang_shi_ not like", value, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiIn(List<String> values) {
            addCriterion("cheng_bao_fang_shi_ in", values, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiNotIn(List<String> values) {
            addCriterion("cheng_bao_fang_shi_ not in", values, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiBetween(String value1, String value2) {
            addCriterion("cheng_bao_fang_shi_ between", value1, value2, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andChengBaoFangShiNotBetween(String value1, String value2) {
            addCriterion("cheng_bao_fang_shi_ not between", value1, value2, "chengBaoFangShi");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiIsNull() {
            addCriterion("shen_he_zhuang_tai_ is null");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiIsNotNull() {
            addCriterion("shen_he_zhuang_tai_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiEqualTo(Integer value) {
            addCriterion("shen_he_zhuang_tai_ =", value, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiNotEqualTo(Integer value) {
            addCriterion("shen_he_zhuang_tai_ <>", value, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiGreaterThan(Integer value) {
            addCriterion("shen_he_zhuang_tai_ >", value, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiGreaterThanOrEqualTo(Integer value) {
            addCriterion("shen_he_zhuang_tai_ >=", value, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiLessThan(Integer value) {
            addCriterion("shen_he_zhuang_tai_ <", value, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiLessThanOrEqualTo(Integer value) {
            addCriterion("shen_he_zhuang_tai_ <=", value, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiIn(List<Integer> values) {
            addCriterion("shen_he_zhuang_tai_ in", values, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiNotIn(List<Integer> values) {
            addCriterion("shen_he_zhuang_tai_ not in", values, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiBetween(Integer value1, Integer value2) {
            addCriterion("shen_he_zhuang_tai_ between", value1, value2, "shenHeZhuangTai");
            return (Criteria) this;
        }

        public Criteria andShenHeZhuangTaiNotBetween(Integer value1, Integer value2) {
            addCriterion("shen_he_zhuang_tai_ not between", value1, value2, "shenHeZhuangTai");
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