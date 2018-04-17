package model.po;

import java.util.ArrayList;
import java.util.List;

public class ChengBenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChengBenExample() {
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

        public Criteria andNaRongMiaoShuIsNull() {
            addCriterion("na_rong_miao_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuIsNotNull() {
            addCriterion("na_rong_miao_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuEqualTo(String value) {
            addCriterion("na_rong_miao_shu_ =", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuNotEqualTo(String value) {
            addCriterion("na_rong_miao_shu_ <>", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuGreaterThan(String value) {
            addCriterion("na_rong_miao_shu_ >", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuGreaterThanOrEqualTo(String value) {
            addCriterion("na_rong_miao_shu_ >=", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuLessThan(String value) {
            addCriterion("na_rong_miao_shu_ <", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuLessThanOrEqualTo(String value) {
            addCriterion("na_rong_miao_shu_ <=", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuLike(String value) {
            addCriterion("na_rong_miao_shu_ like", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuNotLike(String value) {
            addCriterion("na_rong_miao_shu_ not like", value, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuIn(List<String> values) {
            addCriterion("na_rong_miao_shu_ in", values, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuNotIn(List<String> values) {
            addCriterion("na_rong_miao_shu_ not in", values, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuBetween(String value1, String value2) {
            addCriterion("na_rong_miao_shu_ between", value1, value2, "naRongMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongMiaoShuNotBetween(String value1, String value2) {
            addCriterion("na_rong_miao_shu_ not between", value1, value2, "naRongMiaoShu");
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

        public Criteria andChengBenTypeIsNull() {
            addCriterion("cheng_ben_type is null");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeIsNotNull() {
            addCriterion("cheng_ben_type is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeEqualTo(String value) {
            addCriterion("cheng_ben_type =", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeNotEqualTo(String value) {
            addCriterion("cheng_ben_type <>", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeGreaterThan(String value) {
            addCriterion("cheng_ben_type >", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_type >=", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeLessThan(String value) {
            addCriterion("cheng_ben_type <", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_type <=", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeLike(String value) {
            addCriterion("cheng_ben_type like", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeNotLike(String value) {
            addCriterion("cheng_ben_type not like", value, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeIn(List<String> values) {
            addCriterion("cheng_ben_type in", values, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeNotIn(List<String> values) {
            addCriterion("cheng_ben_type not in", values, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeBetween(String value1, String value2) {
            addCriterion("cheng_ben_type between", value1, value2, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andChengBenTypeNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_type not between", value1, value2, "chengBenType");
            return (Criteria) this;
        }

        public Criteria andTypeChildIsNull() {
            addCriterion("type_child is null");
            return (Criteria) this;
        }

        public Criteria andTypeChildIsNotNull() {
            addCriterion("type_child is not null");
            return (Criteria) this;
        }

        public Criteria andTypeChildEqualTo(String value) {
            addCriterion("type_child =", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildNotEqualTo(String value) {
            addCriterion("type_child <>", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildGreaterThan(String value) {
            addCriterion("type_child >", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildGreaterThanOrEqualTo(String value) {
            addCriterion("type_child >=", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildLessThan(String value) {
            addCriterion("type_child <", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildLessThanOrEqualTo(String value) {
            addCriterion("type_child <=", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildLike(String value) {
            addCriterion("type_child like", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildNotLike(String value) {
            addCriterion("type_child not like", value, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildIn(List<String> values) {
            addCriterion("type_child in", values, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildNotIn(List<String> values) {
            addCriterion("type_child not in", values, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildBetween(String value1, String value2) {
            addCriterion("type_child between", value1, value2, "typeChild");
            return (Criteria) this;
        }

        public Criteria andTypeChildNotBetween(String value1, String value2) {
            addCriterion("type_child not between", value1, value2, "typeChild");
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