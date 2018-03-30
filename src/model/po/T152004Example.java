package model.po;

import java.util.ArrayList;
import java.util.List;

public class T152004Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T152004Example() {
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

        public Criteria andChengBenBianMaIsNull() {
            addCriterion("cheng_ben_bian_ma_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaIsNotNull() {
            addCriterion("cheng_ben_bian_ma_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaEqualTo(String value) {
            addCriterion("cheng_ben_bian_ma_ =", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaNotEqualTo(String value) {
            addCriterion("cheng_ben_bian_ma_ <>", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaGreaterThan(String value) {
            addCriterion("cheng_ben_bian_ma_ >", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_bian_ma_ >=", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaLessThan(String value) {
            addCriterion("cheng_ben_bian_ma_ <", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_bian_ma_ <=", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaLike(String value) {
            addCriterion("cheng_ben_bian_ma_ like", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaNotLike(String value) {
            addCriterion("cheng_ben_bian_ma_ not like", value, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaIn(List<String> values) {
            addCriterion("cheng_ben_bian_ma_ in", values, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaNotIn(List<String> values) {
            addCriterion("cheng_ben_bian_ma_ not in", values, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaBetween(String value1, String value2) {
            addCriterion("cheng_ben_bian_ma_ between", value1, value2, "chengBenBianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenBianMaNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_bian_ma_ not between", value1, value2, "chengBenBianMa");
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

        public Criteria andDanJiaIsNull() {
            addCriterion("dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andDanJiaIsNotNull() {
            addCriterion("dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andDanJiaEqualTo(String value) {
            addCriterion("dan_jia_ =", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotEqualTo(String value) {
            addCriterion("dan_jia_ <>", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaGreaterThan(String value) {
            addCriterion("dan_jia_ >", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("dan_jia_ >=", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaLessThan(String value) {
            addCriterion("dan_jia_ <", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaLessThanOrEqualTo(String value) {
            addCriterion("dan_jia_ <=", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaLike(String value) {
            addCriterion("dan_jia_ like", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotLike(String value) {
            addCriterion("dan_jia_ not like", value, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaIn(List<String> values) {
            addCriterion("dan_jia_ in", values, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotIn(List<String> values) {
            addCriterion("dan_jia_ not in", values, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaBetween(String value1, String value2) {
            addCriterion("dan_jia_ between", value1, value2, "danJia");
            return (Criteria) this;
        }

        public Criteria andDanJiaNotBetween(String value1, String value2) {
            addCriterion("dan_jia_ not between", value1, value2, "danJia");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuIsNull() {
            addCriterion("ji_suan_ji_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuIsNotNull() {
            addCriterion("ji_suan_ji_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuEqualTo(String value) {
            addCriterion("ji_suan_ji_shu_ =", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuNotEqualTo(String value) {
            addCriterion("ji_suan_ji_shu_ <>", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuGreaterThan(String value) {
            addCriterion("ji_suan_ji_shu_ >", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuGreaterThanOrEqualTo(String value) {
            addCriterion("ji_suan_ji_shu_ >=", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuLessThan(String value) {
            addCriterion("ji_suan_ji_shu_ <", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuLessThanOrEqualTo(String value) {
            addCriterion("ji_suan_ji_shu_ <=", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuLike(String value) {
            addCriterion("ji_suan_ji_shu_ like", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuNotLike(String value) {
            addCriterion("ji_suan_ji_shu_ not like", value, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuIn(List<String> values) {
            addCriterion("ji_suan_ji_shu_ in", values, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuNotIn(List<String> values) {
            addCriterion("ji_suan_ji_shu_ not in", values, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuBetween(String value1, String value2) {
            addCriterion("ji_suan_ji_shu_ between", value1, value2, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andJiSuanJiShuNotBetween(String value1, String value2) {
            addCriterion("ji_suan_ji_shu_ not between", value1, value2, "jiSuanJiShu");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenIsNull() {
            addCriterion("yu_suan_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenIsNotNull() {
            addCriterion("yu_suan_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ =", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ <>", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenGreaterThan(String value) {
            addCriterion("yu_suan_cheng_ben_ >", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ >=", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenLessThan(String value) {
            addCriterion("yu_suan_cheng_ben_ <", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenLessThanOrEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ <=", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenLike(String value) {
            addCriterion("yu_suan_cheng_ben_ like", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotLike(String value) {
            addCriterion("yu_suan_cheng_ben_ not like", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenIn(List<String> values) {
            addCriterion("yu_suan_cheng_ben_ in", values, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotIn(List<String> values) {
            addCriterion("yu_suan_cheng_ben_ not in", values, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenBetween(String value1, String value2) {
            addCriterion("yu_suan_cheng_ben_ between", value1, value2, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotBetween(String value1, String value2) {
            addCriterion("yu_suan_cheng_ben_ not between", value1, value2, "yuSuanChengBen");
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