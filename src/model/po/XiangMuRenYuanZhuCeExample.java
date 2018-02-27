package model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class XiangMuRenYuanZhuCeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XiangMuRenYuanZhuCeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andRenYuanIdIsNull() {
            addCriterion("ren_yuan_id_ is null");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdIsNotNull() {
            addCriterion("ren_yuan_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdEqualTo(Integer value) {
            addCriterion("ren_yuan_id_ =", value, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdNotEqualTo(Integer value) {
            addCriterion("ren_yuan_id_ <>", value, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdGreaterThan(Integer value) {
            addCriterion("ren_yuan_id_ >", value, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ren_yuan_id_ >=", value, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdLessThan(Integer value) {
            addCriterion("ren_yuan_id_ <", value, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdLessThanOrEqualTo(Integer value) {
            addCriterion("ren_yuan_id_ <=", value, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdIn(List<Integer> values) {
            addCriterion("ren_yuan_id_ in", values, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdNotIn(List<Integer> values) {
            addCriterion("ren_yuan_id_ not in", values, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdBetween(Integer value1, Integer value2) {
            addCriterion("ren_yuan_id_ between", value1, value2, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andRenYuanIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ren_yuan_id_ not between", value1, value2, "renYuanId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdIsNull() {
            addCriterion("xiang_mu_id_ is null");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdIsNotNull() {
            addCriterion("xiang_mu_id_ is not null");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdEqualTo(Integer value) {
            addCriterion("xiang_mu_id_ =", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdNotEqualTo(Integer value) {
            addCriterion("xiang_mu_id_ <>", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdGreaterThan(Integer value) {
            addCriterion("xiang_mu_id_ >", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiang_mu_id_ >=", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdLessThan(Integer value) {
            addCriterion("xiang_mu_id_ <", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdLessThanOrEqualTo(Integer value) {
            addCriterion("xiang_mu_id_ <=", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdIn(List<Integer> values) {
            addCriterion("xiang_mu_id_ in", values, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdNotIn(List<Integer> values) {
            addCriterion("xiang_mu_id_ not in", values, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdBetween(Integer value1, Integer value2) {
            addCriterion("xiang_mu_id_ between", value1, value2, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xiang_mu_id_ not between", value1, value2, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengIsNull() {
            addCriterion("gang_wei_ming_cheng_ is null");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengIsNotNull() {
            addCriterion("gang_wei_ming_cheng_ is not null");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengEqualTo(String value) {
            addCriterion("gang_wei_ming_cheng_ =", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengNotEqualTo(String value) {
            addCriterion("gang_wei_ming_cheng_ <>", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengGreaterThan(String value) {
            addCriterion("gang_wei_ming_cheng_ >", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengGreaterThanOrEqualTo(String value) {
            addCriterion("gang_wei_ming_cheng_ >=", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengLessThan(String value) {
            addCriterion("gang_wei_ming_cheng_ <", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengLessThanOrEqualTo(String value) {
            addCriterion("gang_wei_ming_cheng_ <=", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengLike(String value) {
            addCriterion("gang_wei_ming_cheng_ like", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengNotLike(String value) {
            addCriterion("gang_wei_ming_cheng_ not like", value, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengIn(List<String> values) {
            addCriterion("gang_wei_ming_cheng_ in", values, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengNotIn(List<String> values) {
            addCriterion("gang_wei_ming_cheng_ not in", values, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengBetween(String value1, String value2) {
            addCriterion("gang_wei_ming_cheng_ between", value1, value2, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andGangWeiMingChengNotBetween(String value1, String value2) {
            addCriterion("gang_wei_ming_cheng_ not between", value1, value2, "gangWeiMingCheng");
            return (Criteria) this;
        }

        public Criteria andZhiWuIsNull() {
            addCriterion("zhi_wu_ is null");
            return (Criteria) this;
        }

        public Criteria andZhiWuIsNotNull() {
            addCriterion("zhi_wu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhiWuEqualTo(String value) {
            addCriterion("zhi_wu_ =", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotEqualTo(String value) {
            addCriterion("zhi_wu_ <>", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuGreaterThan(String value) {
            addCriterion("zhi_wu_ >", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_wu_ >=", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuLessThan(String value) {
            addCriterion("zhi_wu_ <", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuLessThanOrEqualTo(String value) {
            addCriterion("zhi_wu_ <=", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuLike(String value) {
            addCriterion("zhi_wu_ like", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotLike(String value) {
            addCriterion("zhi_wu_ not like", value, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuIn(List<String> values) {
            addCriterion("zhi_wu_ in", values, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotIn(List<String> values) {
            addCriterion("zhi_wu_ not in", values, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuBetween(String value1, String value2) {
            addCriterion("zhi_wu_ between", value1, value2, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andZhiWuNotBetween(String value1, String value2) {
            addCriterion("zhi_wu_ not between", value1, value2, "zhiWu");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenIsNull() {
            addCriterion("suo_shu_bu_men_ is null");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenIsNotNull() {
            addCriterion("suo_shu_bu_men_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenEqualTo(String value) {
            addCriterion("suo_shu_bu_men_ =", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenNotEqualTo(String value) {
            addCriterion("suo_shu_bu_men_ <>", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenGreaterThan(String value) {
            addCriterion("suo_shu_bu_men_ >", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenGreaterThanOrEqualTo(String value) {
            addCriterion("suo_shu_bu_men_ >=", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenLessThan(String value) {
            addCriterion("suo_shu_bu_men_ <", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenLessThanOrEqualTo(String value) {
            addCriterion("suo_shu_bu_men_ <=", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenLike(String value) {
            addCriterion("suo_shu_bu_men_ like", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenNotLike(String value) {
            addCriterion("suo_shu_bu_men_ not like", value, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenIn(List<String> values) {
            addCriterion("suo_shu_bu_men_ in", values, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenNotIn(List<String> values) {
            addCriterion("suo_shu_bu_men_ not in", values, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenBetween(String value1, String value2) {
            addCriterion("suo_shu_bu_men_ between", value1, value2, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andSuoShuBuMenNotBetween(String value1, String value2) {
            addCriterion("suo_shu_bu_men_ not between", value1, value2, "suoShuBuMen");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianIsNull() {
            addCriterion("dao_gang_shi_jian_ is null");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianIsNotNull() {
            addCriterion("dao_gang_shi_jian_ is not null");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianEqualTo(Date value) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ =", value, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianNotEqualTo(Date value) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ <>", value, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianGreaterThan(Date value) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ >", value, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ >=", value, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianLessThan(Date value) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ <", value, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ <=", value, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianIn(List<Date> values) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ in", values, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianNotIn(List<Date> values) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ not in", values, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ between", value1, value2, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andDaoGangShiJianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dao_gang_shi_jian_ not between", value1, value2, "daoGangShiJian");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiIsNull() {
            addCriterion("gang_wei_xing_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiIsNotNull() {
            addCriterion("gang_wei_xing_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiEqualTo(String value) {
            addCriterion("gang_wei_xing_zhi_ =", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiNotEqualTo(String value) {
            addCriterion("gang_wei_xing_zhi_ <>", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiGreaterThan(String value) {
            addCriterion("gang_wei_xing_zhi_ >", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiGreaterThanOrEqualTo(String value) {
            addCriterion("gang_wei_xing_zhi_ >=", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiLessThan(String value) {
            addCriterion("gang_wei_xing_zhi_ <", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiLessThanOrEqualTo(String value) {
            addCriterion("gang_wei_xing_zhi_ <=", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiLike(String value) {
            addCriterion("gang_wei_xing_zhi_ like", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiNotLike(String value) {
            addCriterion("gang_wei_xing_zhi_ not like", value, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiIn(List<String> values) {
            addCriterion("gang_wei_xing_zhi_ in", values, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiNotIn(List<String> values) {
            addCriterion("gang_wei_xing_zhi_ not in", values, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiBetween(String value1, String value2) {
            addCriterion("gang_wei_xing_zhi_ between", value1, value2, "gangWeiXingZhi");
            return (Criteria) this;
        }

        public Criteria andGangWeiXingZhiNotBetween(String value1, String value2) {
            addCriterion("gang_wei_xing_zhi_ not between", value1, value2, "gangWeiXingZhi");
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