package model.po;

import java.util.ArrayList;
import java.util.List;

public class YongHuBiaoQianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YongHuBiaoQianExample() {
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

        public Criteria andBiaoQianMingIsNull() {
            addCriterion("biao_qian_ming_ is null");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingIsNotNull() {
            addCriterion("biao_qian_ming_ is not null");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingEqualTo(String value) {
            addCriterion("biao_qian_ming_ =", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingNotEqualTo(String value) {
            addCriterion("biao_qian_ming_ <>", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingGreaterThan(String value) {
            addCriterion("biao_qian_ming_ >", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingGreaterThanOrEqualTo(String value) {
            addCriterion("biao_qian_ming_ >=", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingLessThan(String value) {
            addCriterion("biao_qian_ming_ <", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingLessThanOrEqualTo(String value) {
            addCriterion("biao_qian_ming_ <=", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingLike(String value) {
            addCriterion("biao_qian_ming_ like", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingNotLike(String value) {
            addCriterion("biao_qian_ming_ not like", value, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingIn(List<String> values) {
            addCriterion("biao_qian_ming_ in", values, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingNotIn(List<String> values) {
            addCriterion("biao_qian_ming_ not in", values, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingBetween(String value1, String value2) {
            addCriterion("biao_qian_ming_ between", value1, value2, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andBiaoQianMingNotBetween(String value1, String value2) {
            addCriterion("biao_qian_ming_ not between", value1, value2, "biaoQianMing");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiIsNull() {
            addCriterion("suo_shu_gong_si_ is null");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiIsNotNull() {
            addCriterion("suo_shu_gong_si_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiEqualTo(Integer value) {
            addCriterion("suo_shu_gong_si_ =", value, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiNotEqualTo(Integer value) {
            addCriterion("suo_shu_gong_si_ <>", value, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiGreaterThan(Integer value) {
            addCriterion("suo_shu_gong_si_ >", value, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiGreaterThanOrEqualTo(Integer value) {
            addCriterion("suo_shu_gong_si_ >=", value, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiLessThan(Integer value) {
            addCriterion("suo_shu_gong_si_ <", value, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiLessThanOrEqualTo(Integer value) {
            addCriterion("suo_shu_gong_si_ <=", value, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiIn(List<Integer> values) {
            addCriterion("suo_shu_gong_si_ in", values, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiNotIn(List<Integer> values) {
            addCriterion("suo_shu_gong_si_ not in", values, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiBetween(Integer value1, Integer value2) {
            addCriterion("suo_shu_gong_si_ between", value1, value2, "suoShuGongSi");
            return (Criteria) this;
        }

        public Criteria andSuoShuGongSiNotBetween(Integer value1, Integer value2) {
            addCriterion("suo_shu_gong_si_ not between", value1, value2, "suoShuGongSi");
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