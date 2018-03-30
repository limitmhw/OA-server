package model.po;

import java.util.ArrayList;
import java.util.List;

public class T152002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T152002Example() {
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

        public Criteria andTableIdIsNull() {
            addCriterion("table_id is null");
            return (Criteria) this;
        }

        public Criteria andTableIdIsNotNull() {
            addCriterion("table_id is not null");
            return (Criteria) this;
        }

        public Criteria andTableIdEqualTo(Integer value) {
            addCriterion("table_id =", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotEqualTo(Integer value) {
            addCriterion("table_id <>", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThan(Integer value) {
            addCriterion("table_id >", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("table_id >=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThan(Integer value) {
            addCriterion("table_id <", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdLessThanOrEqualTo(Integer value) {
            addCriterion("table_id <=", value, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdIn(List<Integer> values) {
            addCriterion("table_id in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotIn(List<Integer> values) {
            addCriterion("table_id not in", values, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdBetween(Integer value1, Integer value2) {
            addCriterion("table_id between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTableIdNotBetween(Integer value1, Integer value2) {
            addCriterion("table_id not between", value1, value2, "tableId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIsNull() {
            addCriterion("tr_order is null");
            return (Criteria) this;
        }

        public Criteria andTrOrderIsNotNull() {
            addCriterion("tr_order is not null");
            return (Criteria) this;
        }

        public Criteria andTrOrderEqualTo(Integer value) {
            addCriterion("tr_order =", value, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderNotEqualTo(Integer value) {
            addCriterion("tr_order <>", value, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderGreaterThan(Integer value) {
            addCriterion("tr_order >", value, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("tr_order >=", value, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderLessThan(Integer value) {
            addCriterion("tr_order <", value, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderLessThanOrEqualTo(Integer value) {
            addCriterion("tr_order <=", value, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderIn(List<Integer> values) {
            addCriterion("tr_order in", values, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderNotIn(List<Integer> values) {
            addCriterion("tr_order not in", values, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderBetween(Integer value1, Integer value2) {
            addCriterion("tr_order between", value1, value2, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("tr_order not between", value1, value2, "trOrder");
            return (Criteria) this;
        }

        public Criteria andTrTypeIsNull() {
            addCriterion("tr_type is null");
            return (Criteria) this;
        }

        public Criteria andTrTypeIsNotNull() {
            addCriterion("tr_type is not null");
            return (Criteria) this;
        }

        public Criteria andTrTypeEqualTo(String value) {
            addCriterion("tr_type =", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeNotEqualTo(String value) {
            addCriterion("tr_type <>", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeGreaterThan(String value) {
            addCriterion("tr_type >", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tr_type >=", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeLessThan(String value) {
            addCriterion("tr_type <", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeLessThanOrEqualTo(String value) {
            addCriterion("tr_type <=", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeLike(String value) {
            addCriterion("tr_type like", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeNotLike(String value) {
            addCriterion("tr_type not like", value, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeIn(List<String> values) {
            addCriterion("tr_type in", values, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeNotIn(List<String> values) {
            addCriterion("tr_type not in", values, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeBetween(String value1, String value2) {
            addCriterion("tr_type between", value1, value2, "trType");
            return (Criteria) this;
        }

        public Criteria andTrTypeNotBetween(String value1, String value2) {
            addCriterion("tr_type not between", value1, value2, "trType");
            return (Criteria) this;
        }

        public Criteria andBianMaIsNull() {
            addCriterion("bian_ma_ is null");
            return (Criteria) this;
        }

        public Criteria andBianMaIsNotNull() {
            addCriterion("bian_ma_ is not null");
            return (Criteria) this;
        }

        public Criteria andBianMaEqualTo(String value) {
            addCriterion("bian_ma_ =", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotEqualTo(String value) {
            addCriterion("bian_ma_ <>", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaGreaterThan(String value) {
            addCriterion("bian_ma_ >", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaGreaterThanOrEqualTo(String value) {
            addCriterion("bian_ma_ >=", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaLessThan(String value) {
            addCriterion("bian_ma_ <", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaLessThanOrEqualTo(String value) {
            addCriterion("bian_ma_ <=", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaLike(String value) {
            addCriterion("bian_ma_ like", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotLike(String value) {
            addCriterion("bian_ma_ not like", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaIn(List<String> values) {
            addCriterion("bian_ma_ in", values, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotIn(List<String> values) {
            addCriterion("bian_ma_ not in", values, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaBetween(String value1, String value2) {
            addCriterion("bian_ma_ between", value1, value2, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotBetween(String value1, String value2) {
            addCriterion("bian_ma_ not between", value1, value2, "bianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuIsNull() {
            addCriterion("cheng_ben_xiang_mu_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuIsNotNull() {
            addCriterion("cheng_ben_xiang_mu_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ =", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ <>", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuGreaterThan(String value) {
            addCriterion("cheng_ben_xiang_mu_ >", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ >=", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuLessThan(String value) {
            addCriterion("cheng_ben_xiang_mu_ <", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ <=", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuLike(String value) {
            addCriterion("cheng_ben_xiang_mu_ like", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotLike(String value) {
            addCriterion("cheng_ben_xiang_mu_ not like", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuIn(List<String> values) {
            addCriterion("cheng_ben_xiang_mu_ in", values, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotIn(List<String> values) {
            addCriterion("cheng_ben_xiang_mu_ not in", values, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuBetween(String value1, String value2) {
            addCriterion("cheng_ben_xiang_mu_ between", value1, value2, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_xiang_mu_ not between", value1, value2, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuIsNull() {
            addCriterion("na_rong_fan_wei_miao_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuIsNotNull() {
            addCriterion("na_rong_fan_wei_miao_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ =", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ <>", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuGreaterThan(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ >", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuGreaterThanOrEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ >=", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuLessThan(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ <", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuLessThanOrEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ <=", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuLike(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ like", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotLike(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ not like", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuIn(List<String> values) {
            addCriterion("na_rong_fan_wei_miao_shu_ in", values, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotIn(List<String> values) {
            addCriterion("na_rong_fan_wei_miao_shu_ not in", values, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuBetween(String value1, String value2) {
            addCriterion("na_rong_fan_wei_miao_shu_ between", value1, value2, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotBetween(String value1, String value2) {
            addCriterion("na_rong_fan_wei_miao_shu_ not between", value1, value2, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenIsNull() {
            addCriterion("chu_shi_yu_suan_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenIsNotNull() {
            addCriterion("chu_shi_yu_suan_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenEqualTo(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ =", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenNotEqualTo(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ <>", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenGreaterThan(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ >", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ >=", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenLessThan(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ <", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenLessThanOrEqualTo(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ <=", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenLike(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ like", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenNotLike(String value) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ not like", value, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenIn(List<String> values) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ in", values, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenNotIn(List<String> values) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ not in", values, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenBetween(String value1, String value2) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ between", value1, value2, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andChuShiYuSuanChengBenNotBetween(String value1, String value2) {
            addCriterion("chu_shi_yu_suan_cheng_ben_ not between", value1, value2, "chuShiYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenIsNull() {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenIsNotNull() {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenEqualTo(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ =", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenNotEqualTo(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ <>", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenGreaterThan(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ >", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ >=", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenLessThan(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ <", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenLessThanOrEqualTo(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ <=", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenLike(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ like", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenNotLike(String value) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ not like", value, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenIn(List<String> values) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ in", values, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenNotIn(List<String> values) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ not in", values, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenBetween(String value1, String value2) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ between", value1, value2, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andDiaoZhengHouYuSuanChengBenNotBetween(String value1, String value2) {
            addCriterion("diao_zheng_hou_yu_suan_cheng_ben_ not between", value1, value2, "diaoZhengHouYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuIsNull() {
            addCriterion("ben_qi_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuIsNotNull() {
            addCriterion("ben_qi_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuEqualTo(String value) {
            addCriterion("ben_qi_shu_ =", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuNotEqualTo(String value) {
            addCriterion("ben_qi_shu_ <>", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuGreaterThan(String value) {
            addCriterion("ben_qi_shu_ >", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_ >=", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuLessThan(String value) {
            addCriterion("ben_qi_shu_ <", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_ <=", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuLike(String value) {
            addCriterion("ben_qi_shu_ like", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuNotLike(String value) {
            addCriterion("ben_qi_shu_ not like", value, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuIn(List<String> values) {
            addCriterion("ben_qi_shu_ in", values, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuNotIn(List<String> values) {
            addCriterion("ben_qi_shu_ not in", values, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_ between", value1, value2, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_ not between", value1, value2, "benQiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuIsNull() {
            addCriterion("lei_ji_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuIsNotNull() {
            addCriterion("lei_ji_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuEqualTo(String value) {
            addCriterion("lei_ji_shu_ =", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuNotEqualTo(String value) {
            addCriterion("lei_ji_shu_ <>", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuGreaterThan(String value) {
            addCriterion("lei_ji_shu_ >", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_ >=", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuLessThan(String value) {
            addCriterion("lei_ji_shu_ <", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_ <=", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuLike(String value) {
            addCriterion("lei_ji_shu_ like", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuNotLike(String value) {
            addCriterion("lei_ji_shu_ not like", value, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuIn(List<String> values) {
            addCriterion("lei_ji_shu_ in", values, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuNotIn(List<String> values) {
            addCriterion("lei_ji_shu_ not in", values, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_ between", value1, value2, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_ not between", value1, value2, "leiJiShu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIsNull() {
            addCriterion("bei_zhu_ is null");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIsNotNull() {
            addCriterion("bei_zhu_ is not null");
            return (Criteria) this;
        }

        public Criteria andBeiZhuEqualTo(String value) {
            addCriterion("bei_zhu_ =", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotEqualTo(String value) {
            addCriterion("bei_zhu_ <>", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuGreaterThan(String value) {
            addCriterion("bei_zhu_ >", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuGreaterThanOrEqualTo(String value) {
            addCriterion("bei_zhu_ >=", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLessThan(String value) {
            addCriterion("bei_zhu_ <", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLessThanOrEqualTo(String value) {
            addCriterion("bei_zhu_ <=", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuLike(String value) {
            addCriterion("bei_zhu_ like", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotLike(String value) {
            addCriterion("bei_zhu_ not like", value, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuIn(List<String> values) {
            addCriterion("bei_zhu_ in", values, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotIn(List<String> values) {
            addCriterion("bei_zhu_ not in", values, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuBetween(String value1, String value2) {
            addCriterion("bei_zhu_ between", value1, value2, "beiZhu");
            return (Criteria) this;
        }

        public Criteria andBeiZhuNotBetween(String value1, String value2) {
            addCriterion("bei_zhu_ not between", value1, value2, "beiZhu");
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