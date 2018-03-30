package model.po;

import java.util.ArrayList;
import java.util.List;

public class T153002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T153002Example() {
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

        public Criteria andBenQiShuDiaoZhengEIsNull() {
            addCriterion("ben_qi_shu_diao_zheng_e_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengEIsNotNull() {
            addCriterion("ben_qi_shu_diao_zheng_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengEEqualTo(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ =", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengENotEqualTo(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ <>", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengEGreaterThan(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ >", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengEGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ >=", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengELessThan(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ <", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengELessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ <=", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengELike(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ like", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengENotLike(String value) {
            addCriterion("ben_qi_shu_diao_zheng_e_ not like", value, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengEIn(List<String> values) {
            addCriterion("ben_qi_shu_diao_zheng_e_ in", values, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengENotIn(List<String> values) {
            addCriterion("ben_qi_shu_diao_zheng_e_ not in", values, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengEBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_diao_zheng_e_ between", value1, value2, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDiaoZhengENotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_diao_zheng_e_ not between", value1, value2, "benQiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangIsNull() {
            addCriterion("ben_qi_shu_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangIsNotNull() {
            addCriterion("ben_qi_shu_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangEqualTo(String value) {
            addCriterion("ben_qi_shu_shu_liang_ =", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangNotEqualTo(String value) {
            addCriterion("ben_qi_shu_shu_liang_ <>", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangGreaterThan(String value) {
            addCriterion("ben_qi_shu_shu_liang_ >", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_shu_liang_ >=", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangLessThan(String value) {
            addCriterion("ben_qi_shu_shu_liang_ <", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_shu_liang_ <=", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangLike(String value) {
            addCriterion("ben_qi_shu_shu_liang_ like", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangNotLike(String value) {
            addCriterion("ben_qi_shu_shu_liang_ not like", value, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangIn(List<String> values) {
            addCriterion("ben_qi_shu_shu_liang_ in", values, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangNotIn(List<String> values) {
            addCriterion("ben_qi_shu_shu_liang_ not in", values, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_shu_liang_ between", value1, value2, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShuLiangNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_shu_liang_ not between", value1, value2, "benQiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeIsNull() {
            addCriterion("ben_qi_shu_jia_ge_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeIsNotNull() {
            addCriterion("ben_qi_shu_jia_ge_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeEqualTo(String value) {
            addCriterion("ben_qi_shu_jia_ge_ =", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeNotEqualTo(String value) {
            addCriterion("ben_qi_shu_jia_ge_ <>", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeGreaterThan(String value) {
            addCriterion("ben_qi_shu_jia_ge_ >", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_jia_ge_ >=", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeLessThan(String value) {
            addCriterion("ben_qi_shu_jia_ge_ <", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_jia_ge_ <=", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeLike(String value) {
            addCriterion("ben_qi_shu_jia_ge_ like", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeNotLike(String value) {
            addCriterion("ben_qi_shu_jia_ge_ not like", value, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeIn(List<String> values) {
            addCriterion("ben_qi_shu_jia_ge_ in", values, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeNotIn(List<String> values) {
            addCriterion("ben_qi_shu_jia_ge_ not in", values, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_jia_ge_ between", value1, value2, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiaGeNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_jia_ge_ not between", value1, value2, "benQiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaIsNull() {
            addCriterion("ben_qi_shu_qi_ta_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaIsNotNull() {
            addCriterion("ben_qi_shu_qi_ta_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaEqualTo(String value) {
            addCriterion("ben_qi_shu_qi_ta_ =", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaNotEqualTo(String value) {
            addCriterion("ben_qi_shu_qi_ta_ <>", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaGreaterThan(String value) {
            addCriterion("ben_qi_shu_qi_ta_ >", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_qi_ta_ >=", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaLessThan(String value) {
            addCriterion("ben_qi_shu_qi_ta_ <", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_qi_ta_ <=", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaLike(String value) {
            addCriterion("ben_qi_shu_qi_ta_ like", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaNotLike(String value) {
            addCriterion("ben_qi_shu_qi_ta_ not like", value, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaIn(List<String> values) {
            addCriterion("ben_qi_shu_qi_ta_ in", values, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaNotIn(List<String> values) {
            addCriterion("ben_qi_shu_qi_ta_ not in", values, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_qi_ta_ between", value1, value2, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andBenQiShuQiTaNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_qi_ta_ not between", value1, value2, "benQiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEIsNull() {
            addCriterion("lei_ji_shu_diao_zheng_e_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEIsNotNull() {
            addCriterion("lei_ji_shu_diao_zheng_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEEqualTo(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ =", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengENotEqualTo(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ <>", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEGreaterThan(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ >", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ >=", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengELessThan(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ <", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengELessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ <=", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengELike(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ like", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengENotLike(String value) {
            addCriterion("lei_ji_shu_diao_zheng_e_ not like", value, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEIn(List<String> values) {
            addCriterion("lei_ji_shu_diao_zheng_e_ in", values, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengENotIn(List<String> values) {
            addCriterion("lei_ji_shu_diao_zheng_e_ not in", values, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengEBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_diao_zheng_e_ between", value1, value2, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDiaoZhengENotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_diao_zheng_e_ not between", value1, value2, "leiJiShuDiaoZhengE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangIsNull() {
            addCriterion("lei_ji_shu_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangIsNotNull() {
            addCriterion("lei_ji_shu_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangEqualTo(String value) {
            addCriterion("lei_ji_shu_shu_liang_ =", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangNotEqualTo(String value) {
            addCriterion("lei_ji_shu_shu_liang_ <>", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangGreaterThan(String value) {
            addCriterion("lei_ji_shu_shu_liang_ >", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_shu_liang_ >=", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangLessThan(String value) {
            addCriterion("lei_ji_shu_shu_liang_ <", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_shu_liang_ <=", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangLike(String value) {
            addCriterion("lei_ji_shu_shu_liang_ like", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangNotLike(String value) {
            addCriterion("lei_ji_shu_shu_liang_ not like", value, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangIn(List<String> values) {
            addCriterion("lei_ji_shu_shu_liang_ in", values, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangNotIn(List<String> values) {
            addCriterion("lei_ji_shu_shu_liang_ not in", values, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_shu_liang_ between", value1, value2, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShuLiangNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_shu_liang_ not between", value1, value2, "leiJiShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeIsNull() {
            addCriterion("lei_ji_shu_jia_ge_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeIsNotNull() {
            addCriterion("lei_ji_shu_jia_ge_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeEqualTo(String value) {
            addCriterion("lei_ji_shu_jia_ge_ =", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeNotEqualTo(String value) {
            addCriterion("lei_ji_shu_jia_ge_ <>", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeGreaterThan(String value) {
            addCriterion("lei_ji_shu_jia_ge_ >", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_jia_ge_ >=", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeLessThan(String value) {
            addCriterion("lei_ji_shu_jia_ge_ <", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_jia_ge_ <=", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeLike(String value) {
            addCriterion("lei_ji_shu_jia_ge_ like", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeNotLike(String value) {
            addCriterion("lei_ji_shu_jia_ge_ not like", value, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeIn(List<String> values) {
            addCriterion("lei_ji_shu_jia_ge_ in", values, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeNotIn(List<String> values) {
            addCriterion("lei_ji_shu_jia_ge_ not in", values, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_jia_ge_ between", value1, value2, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiaGeNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_jia_ge_ not between", value1, value2, "leiJiShuJiaGe");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaIsNull() {
            addCriterion("lei_ji_shu_qi_ta_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaIsNotNull() {
            addCriterion("lei_ji_shu_qi_ta_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaEqualTo(String value) {
            addCriterion("lei_ji_shu_qi_ta_ =", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaNotEqualTo(String value) {
            addCriterion("lei_ji_shu_qi_ta_ <>", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaGreaterThan(String value) {
            addCriterion("lei_ji_shu_qi_ta_ >", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_qi_ta_ >=", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaLessThan(String value) {
            addCriterion("lei_ji_shu_qi_ta_ <", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_qi_ta_ <=", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaLike(String value) {
            addCriterion("lei_ji_shu_qi_ta_ like", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaNotLike(String value) {
            addCriterion("lei_ji_shu_qi_ta_ not like", value, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaIn(List<String> values) {
            addCriterion("lei_ji_shu_qi_ta_ in", values, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaNotIn(List<String> values) {
            addCriterion("lei_ji_shu_qi_ta_ not in", values, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_qi_ta_ between", value1, value2, "leiJiShuQiTa");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuQiTaNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_qi_ta_ not between", value1, value2, "leiJiShuQiTa");
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