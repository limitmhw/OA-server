package model.po;

import java.util.ArrayList;
import java.util.List;

public class T151002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T151002Example() {
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

        public Criteria andJiHuaXiangMuIsNull() {
            addCriterion("ji_hua_xiang_mu_ is null");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuIsNotNull() {
            addCriterion("ji_hua_xiang_mu_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ =", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ <>", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuGreaterThan(String value) {
            addCriterion("ji_hua_xiang_mu_ >", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuGreaterThanOrEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ >=", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuLessThan(String value) {
            addCriterion("ji_hua_xiang_mu_ <", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuLessThanOrEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ <=", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuLike(String value) {
            addCriterion("ji_hua_xiang_mu_ like", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotLike(String value) {
            addCriterion("ji_hua_xiang_mu_ not like", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuIn(List<String> values) {
            addCriterion("ji_hua_xiang_mu_ in", values, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotIn(List<String> values) {
            addCriterion("ji_hua_xiang_mu_ not in", values, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuBetween(String value1, String value2) {
            addCriterion("ji_hua_xiang_mu_ between", value1, value2, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotBetween(String value1, String value2) {
            addCriterion("ji_hua_xiang_mu_ not between", value1, value2, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvIsNull() {
            addCriterion("cheng_ben_jiang_di_lv_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvIsNotNull() {
            addCriterion("cheng_ben_jiang_di_lv_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ =", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvNotEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ <>", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvGreaterThan(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ >", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ >=", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvLessThan(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ <", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ <=", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvLike(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ like", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvNotLike(String value) {
            addCriterion("cheng_ben_jiang_di_lv_ not like", value, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvIn(List<String> values) {
            addCriterion("cheng_ben_jiang_di_lv_ in", values, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvNotIn(List<String> values) {
            addCriterion("cheng_ben_jiang_di_lv_ not in", values, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvBetween(String value1, String value2) {
            addCriterion("cheng_ben_jiang_di_lv_ between", value1, value2, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_jiang_di_lv_ not between", value1, value2, "chengBenJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenIsNull() {
            addCriterion("cheng_ben_ze_ren_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenIsNotNull() {
            addCriterion("cheng_ben_ze_ren_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenEqualTo(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ =", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenNotEqualTo(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ <>", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenGreaterThan(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ >", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ >=", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenLessThan(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ <", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ <=", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenLike(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ like", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenNotLike(String value) {
            addCriterion("cheng_ben_ze_ren_ren_ not like", value, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenIn(List<String> values) {
            addCriterion("cheng_ben_ze_ren_ren_ in", values, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenNotIn(List<String> values) {
            addCriterion("cheng_ben_ze_ren_ren_ not in", values, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenBetween(String value1, String value2) {
            addCriterion("cheng_ben_ze_ren_ren_ between", value1, value2, "chengBenZeRenRen");
            return (Criteria) this;
        }

        public Criteria andChengBenZeRenRenNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_ze_ren_ren_ not between", value1, value2, "chengBenZeRenRen");
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