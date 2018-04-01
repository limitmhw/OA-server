package model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WexcelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WexcelExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGongChengIdIsNull() {
            addCriterion("gong_cheng_id is null");
            return (Criteria) this;
        }

        public Criteria andGongChengIdIsNotNull() {
            addCriterion("gong_cheng_id is not null");
            return (Criteria) this;
        }

        public Criteria andGongChengIdEqualTo(Integer value) {
            addCriterion("gong_cheng_id =", value, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdNotEqualTo(Integer value) {
            addCriterion("gong_cheng_id <>", value, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdGreaterThan(Integer value) {
            addCriterion("gong_cheng_id >", value, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("gong_cheng_id >=", value, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdLessThan(Integer value) {
            addCriterion("gong_cheng_id <", value, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdLessThanOrEqualTo(Integer value) {
            addCriterion("gong_cheng_id <=", value, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdIn(List<Integer> values) {
            addCriterion("gong_cheng_id in", values, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdNotIn(List<Integer> values) {
            addCriterion("gong_cheng_id not in", values, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdBetween(Integer value1, Integer value2) {
            addCriterion("gong_cheng_id between", value1, value2, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andGongChengIdNotBetween(Integer value1, Integer value2) {
            addCriterion("gong_cheng_id not between", value1, value2, "gongChengId");
            return (Criteria) this;
        }

        public Criteria andExceltypeIsNull() {
            addCriterion("excelType is null");
            return (Criteria) this;
        }

        public Criteria andExceltypeIsNotNull() {
            addCriterion("excelType is not null");
            return (Criteria) this;
        }

        public Criteria andExceltypeEqualTo(String value) {
            addCriterion("excelType =", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeNotEqualTo(String value) {
            addCriterion("excelType <>", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeGreaterThan(String value) {
            addCriterion("excelType >", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeGreaterThanOrEqualTo(String value) {
            addCriterion("excelType >=", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeLessThan(String value) {
            addCriterion("excelType <", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeLessThanOrEqualTo(String value) {
            addCriterion("excelType <=", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeLike(String value) {
            addCriterion("excelType like", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeNotLike(String value) {
            addCriterion("excelType not like", value, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeIn(List<String> values) {
            addCriterion("excelType in", values, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeNotIn(List<String> values) {
            addCriterion("excelType not in", values, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeBetween(String value1, String value2) {
            addCriterion("excelType between", value1, value2, "exceltype");
            return (Criteria) this;
        }

        public Criteria andExceltypeNotBetween(String value1, String value2) {
            addCriterion("excelType not between", value1, value2, "exceltype");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andExcelstatusIsNull() {
            addCriterion("excelStatus is null");
            return (Criteria) this;
        }

        public Criteria andExcelstatusIsNotNull() {
            addCriterion("excelStatus is not null");
            return (Criteria) this;
        }

        public Criteria andExcelstatusEqualTo(String value) {
            addCriterion("excelStatus =", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusNotEqualTo(String value) {
            addCriterion("excelStatus <>", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusGreaterThan(String value) {
            addCriterion("excelStatus >", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusGreaterThanOrEqualTo(String value) {
            addCriterion("excelStatus >=", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusLessThan(String value) {
            addCriterion("excelStatus <", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusLessThanOrEqualTo(String value) {
            addCriterion("excelStatus <=", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusLike(String value) {
            addCriterion("excelStatus like", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusNotLike(String value) {
            addCriterion("excelStatus not like", value, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusIn(List<String> values) {
            addCriterion("excelStatus in", values, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusNotIn(List<String> values) {
            addCriterion("excelStatus not in", values, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusBetween(String value1, String value2) {
            addCriterion("excelStatus between", value1, value2, "excelstatus");
            return (Criteria) this;
        }

        public Criteria andExcelstatusNotBetween(String value1, String value2) {
            addCriterion("excelStatus not between", value1, value2, "excelstatus");
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