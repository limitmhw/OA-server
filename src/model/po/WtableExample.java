package model.po;

import java.util.ArrayList;
import java.util.List;

public class WtableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtableExample() {
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

        public Criteria andTabletypeIsNull() {
            addCriterion("tableType is null");
            return (Criteria) this;
        }

        public Criteria andTabletypeIsNotNull() {
            addCriterion("tableType is not null");
            return (Criteria) this;
        }

        public Criteria andTabletypeEqualTo(String value) {
            addCriterion("tableType =", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotEqualTo(String value) {
            addCriterion("tableType <>", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeGreaterThan(String value) {
            addCriterion("tableType >", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeGreaterThanOrEqualTo(String value) {
            addCriterion("tableType >=", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeLessThan(String value) {
            addCriterion("tableType <", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeLessThanOrEqualTo(String value) {
            addCriterion("tableType <=", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeLike(String value) {
            addCriterion("tableType like", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotLike(String value) {
            addCriterion("tableType not like", value, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeIn(List<String> values) {
            addCriterion("tableType in", values, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotIn(List<String> values) {
            addCriterion("tableType not in", values, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeBetween(String value1, String value2) {
            addCriterion("tableType between", value1, value2, "tabletype");
            return (Criteria) this;
        }

        public Criteria andTabletypeNotBetween(String value1, String value2) {
            addCriterion("tableType not between", value1, value2, "tabletype");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoIsNull() {
            addCriterion("wen_dang_bian_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoIsNotNull() {
            addCriterion("wen_dang_bian_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoEqualTo(String value) {
            addCriterion("wen_dang_bian_hao_ =", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoNotEqualTo(String value) {
            addCriterion("wen_dang_bian_hao_ <>", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoGreaterThan(String value) {
            addCriterion("wen_dang_bian_hao_ >", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoGreaterThanOrEqualTo(String value) {
            addCriterion("wen_dang_bian_hao_ >=", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoLessThan(String value) {
            addCriterion("wen_dang_bian_hao_ <", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoLessThanOrEqualTo(String value) {
            addCriterion("wen_dang_bian_hao_ <=", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoLike(String value) {
            addCriterion("wen_dang_bian_hao_ like", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoNotLike(String value) {
            addCriterion("wen_dang_bian_hao_ not like", value, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoIn(List<String> values) {
            addCriterion("wen_dang_bian_hao_ in", values, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoNotIn(List<String> values) {
            addCriterion("wen_dang_bian_hao_ not in", values, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoBetween(String value1, String value2) {
            addCriterion("wen_dang_bian_hao_ between", value1, value2, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andWenDangBianHaoNotBetween(String value1, String value2) {
            addCriterion("wen_dang_bian_hao_ not between", value1, value2, "wenDangBianHao");
            return (Criteria) this;
        }

        public Criteria andExcelIdIsNull() {
            addCriterion("excel_id is null");
            return (Criteria) this;
        }

        public Criteria andExcelIdIsNotNull() {
            addCriterion("excel_id is not null");
            return (Criteria) this;
        }

        public Criteria andExcelIdEqualTo(Integer value) {
            addCriterion("excel_id =", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdNotEqualTo(Integer value) {
            addCriterion("excel_id <>", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdGreaterThan(Integer value) {
            addCriterion("excel_id >", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("excel_id >=", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdLessThan(Integer value) {
            addCriterion("excel_id <", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdLessThanOrEqualTo(Integer value) {
            addCriterion("excel_id <=", value, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdIn(List<Integer> values) {
            addCriterion("excel_id in", values, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdNotIn(List<Integer> values) {
            addCriterion("excel_id not in", values, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdBetween(Integer value1, Integer value2) {
            addCriterion("excel_id between", value1, value2, "excelId");
            return (Criteria) this;
        }

        public Criteria andExcelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("excel_id not between", value1, value2, "excelId");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoIsNull() {
            addCriterion("biao_dan_bian_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoIsNotNull() {
            addCriterion("biao_dan_bian_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoEqualTo(String value) {
            addCriterion("biao_dan_bian_hao_ =", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoNotEqualTo(String value) {
            addCriterion("biao_dan_bian_hao_ <>", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoGreaterThan(String value) {
            addCriterion("biao_dan_bian_hao_ >", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoGreaterThanOrEqualTo(String value) {
            addCriterion("biao_dan_bian_hao_ >=", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoLessThan(String value) {
            addCriterion("biao_dan_bian_hao_ <", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoLessThanOrEqualTo(String value) {
            addCriterion("biao_dan_bian_hao_ <=", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoLike(String value) {
            addCriterion("biao_dan_bian_hao_ like", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoNotLike(String value) {
            addCriterion("biao_dan_bian_hao_ not like", value, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoIn(List<String> values) {
            addCriterion("biao_dan_bian_hao_ in", values, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoNotIn(List<String> values) {
            addCriterion("biao_dan_bian_hao_ not in", values, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoBetween(String value1, String value2) {
            addCriterion("biao_dan_bian_hao_ between", value1, value2, "biaoDanBianHao");
            return (Criteria) this;
        }

        public Criteria andBiaoDanBianHaoNotBetween(String value1, String value2) {
            addCriterion("biao_dan_bian_hao_ not between", value1, value2, "biaoDanBianHao");
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