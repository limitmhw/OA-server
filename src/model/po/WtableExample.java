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

        public Criteria andXiangMuMingChenDanXiangGongChengIsNull() {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ is null");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengIsNotNull() {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ is not null");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ =", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengNotEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ <>", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengGreaterThan(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ >", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengGreaterThanOrEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ >=", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengLessThan(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ <", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengLessThanOrEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ <=", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengLike(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ like", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengNotLike(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ not like", value, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengIn(List<String> values) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ in", values, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengNotIn(List<String> values) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ not in", values, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengBetween(String value1, String value2) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ between", value1, value2, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengNotBetween(String value1, String value2) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_ not between", value1, value2, "xiangMuMingChenDanXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieIsNull() {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ is null");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieIsNotNull() {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ is not null");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ =", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieNotEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ <>", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieGreaterThan(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ >", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ >=", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieLessThan(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ <", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieLessThanOrEqualTo(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ <=", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieLike(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ like", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieNotLike(String value) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ not like", value, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieIn(List<String> values) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ in", values, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieNotIn(List<String> values) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ not in", values, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieBetween(String value1, String value2) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ between", value1, value2, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andXiangMuMingChenDanXiangGongChengZhuanYeLeiBieNotBetween(String value1, String value2) {
            addCriterion("xiang_mu_ming_chen_dan_xiang_gong_cheng_zhuan_ye_lei_bie_ not between", value1, value2, "xiangMuMingChenDanXiangGongChengZhuanYeLeiBie");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenIsNull() {
            addCriterion("tong_ji_yue_fen_ is null");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenIsNotNull() {
            addCriterion("tong_ji_yue_fen_ is not null");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenEqualTo(String value) {
            addCriterion("tong_ji_yue_fen_ =", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenNotEqualTo(String value) {
            addCriterion("tong_ji_yue_fen_ <>", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenGreaterThan(String value) {
            addCriterion("tong_ji_yue_fen_ >", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenGreaterThanOrEqualTo(String value) {
            addCriterion("tong_ji_yue_fen_ >=", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenLessThan(String value) {
            addCriterion("tong_ji_yue_fen_ <", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenLessThanOrEqualTo(String value) {
            addCriterion("tong_ji_yue_fen_ <=", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenLike(String value) {
            addCriterion("tong_ji_yue_fen_ like", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenNotLike(String value) {
            addCriterion("tong_ji_yue_fen_ not like", value, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenIn(List<String> values) {
            addCriterion("tong_ji_yue_fen_ in", values, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenNotIn(List<String> values) {
            addCriterion("tong_ji_yue_fen_ not in", values, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenBetween(String value1, String value2) {
            addCriterion("tong_ji_yue_fen_ between", value1, value2, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiYueFenNotBetween(String value1, String value2) {
            addCriterion("tong_ji_yue_fen_ not between", value1, value2, "tongJiYueFen");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiIsNull() {
            addCriterion("tong_ji_ri_qi_ is null");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiIsNotNull() {
            addCriterion("tong_ji_ri_qi_ is not null");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiEqualTo(String value) {
            addCriterion("tong_ji_ri_qi_ =", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiNotEqualTo(String value) {
            addCriterion("tong_ji_ri_qi_ <>", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiGreaterThan(String value) {
            addCriterion("tong_ji_ri_qi_ >", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiGreaterThanOrEqualTo(String value) {
            addCriterion("tong_ji_ri_qi_ >=", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiLessThan(String value) {
            addCriterion("tong_ji_ri_qi_ <", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiLessThanOrEqualTo(String value) {
            addCriterion("tong_ji_ri_qi_ <=", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiLike(String value) {
            addCriterion("tong_ji_ri_qi_ like", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiNotLike(String value) {
            addCriterion("tong_ji_ri_qi_ not like", value, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiIn(List<String> values) {
            addCriterion("tong_ji_ri_qi_ in", values, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiNotIn(List<String> values) {
            addCriterion("tong_ji_ri_qi_ not in", values, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiBetween(String value1, String value2) {
            addCriterion("tong_ji_ri_qi_ between", value1, value2, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andTongJiRiQiNotBetween(String value1, String value2) {
            addCriterion("tong_ji_ri_qi_ not between", value1, value2, "tongJiRiQi");
            return (Criteria) this;
        }

        public Criteria andDanWeiIsNull() {
            addCriterion("dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andDanWeiIsNotNull() {
            addCriterion("dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andDanWeiEqualTo(String value) {
            addCriterion("dan_wei_ =", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotEqualTo(String value) {
            addCriterion("dan_wei_ <>", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiGreaterThan(String value) {
            addCriterion("dan_wei_ >", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("dan_wei_ >=", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiLessThan(String value) {
            addCriterion("dan_wei_ <", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiLessThanOrEqualTo(String value) {
            addCriterion("dan_wei_ <=", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiLike(String value) {
            addCriterion("dan_wei_ like", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotLike(String value) {
            addCriterion("dan_wei_ not like", value, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiIn(List<String> values) {
            addCriterion("dan_wei_ in", values, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotIn(List<String> values) {
            addCriterion("dan_wei_ not in", values, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiBetween(String value1, String value2) {
            addCriterion("dan_wei_ between", value1, value2, "danWei");
            return (Criteria) this;
        }

        public Criteria andDanWeiNotBetween(String value1, String value2) {
            addCriterion("dan_wei_ not between", value1, value2, "danWei");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenIsNull() {
            addCriterion("bian_zhi_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenIsNotNull() {
            addCriterion("bian_zhi_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenEqualTo(String value) {
            addCriterion("bian_zhi_ren_ =", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenNotEqualTo(String value) {
            addCriterion("bian_zhi_ren_ <>", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenGreaterThan(String value) {
            addCriterion("bian_zhi_ren_ >", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenGreaterThanOrEqualTo(String value) {
            addCriterion("bian_zhi_ren_ >=", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenLessThan(String value) {
            addCriterion("bian_zhi_ren_ <", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenLessThanOrEqualTo(String value) {
            addCriterion("bian_zhi_ren_ <=", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenLike(String value) {
            addCriterion("bian_zhi_ren_ like", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenNotLike(String value) {
            addCriterion("bian_zhi_ren_ not like", value, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenIn(List<String> values) {
            addCriterion("bian_zhi_ren_ in", values, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenNotIn(List<String> values) {
            addCriterion("bian_zhi_ren_ not in", values, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenBetween(String value1, String value2) {
            addCriterion("bian_zhi_ren_ between", value1, value2, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRenNotBetween(String value1, String value2) {
            addCriterion("bian_zhi_ren_ not between", value1, value2, "bianZhiRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenIsNull() {
            addCriterion("shen_he_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andShenHeRenIsNotNull() {
            addCriterion("shen_he_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenHeRenEqualTo(String value) {
            addCriterion("shen_he_ren_ =", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenNotEqualTo(String value) {
            addCriterion("shen_he_ren_ <>", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenGreaterThan(String value) {
            addCriterion("shen_he_ren_ >", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenGreaterThanOrEqualTo(String value) {
            addCriterion("shen_he_ren_ >=", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenLessThan(String value) {
            addCriterion("shen_he_ren_ <", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenLessThanOrEqualTo(String value) {
            addCriterion("shen_he_ren_ <=", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenLike(String value) {
            addCriterion("shen_he_ren_ like", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenNotLike(String value) {
            addCriterion("shen_he_ren_ not like", value, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenIn(List<String> values) {
            addCriterion("shen_he_ren_ in", values, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenNotIn(List<String> values) {
            addCriterion("shen_he_ren_ not in", values, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenBetween(String value1, String value2) {
            addCriterion("shen_he_ren_ between", value1, value2, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenHeRenNotBetween(String value1, String value2) {
            addCriterion("shen_he_ren_ not between", value1, value2, "shenHeRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenIsNull() {
            addCriterion("shen_pi_ren_ is null");
            return (Criteria) this;
        }

        public Criteria andShenPiRenIsNotNull() {
            addCriterion("shen_pi_ren_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiRenEqualTo(String value) {
            addCriterion("shen_pi_ren_ =", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenNotEqualTo(String value) {
            addCriterion("shen_pi_ren_ <>", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenGreaterThan(String value) {
            addCriterion("shen_pi_ren_ >", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenGreaterThanOrEqualTo(String value) {
            addCriterion("shen_pi_ren_ >=", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenLessThan(String value) {
            addCriterion("shen_pi_ren_ <", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenLessThanOrEqualTo(String value) {
            addCriterion("shen_pi_ren_ <=", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenLike(String value) {
            addCriterion("shen_pi_ren_ like", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenNotLike(String value) {
            addCriterion("shen_pi_ren_ not like", value, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenIn(List<String> values) {
            addCriterion("shen_pi_ren_ in", values, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenNotIn(List<String> values) {
            addCriterion("shen_pi_ren_ not in", values, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenBetween(String value1, String value2) {
            addCriterion("shen_pi_ren_ between", value1, value2, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andShenPiRenNotBetween(String value1, String value2) {
            addCriterion("shen_pi_ren_ not between", value1, value2, "shenPiRen");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiIsNull() {
            addCriterion("bian_zhi_ri_qi_ is null");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiIsNotNull() {
            addCriterion("bian_zhi_ri_qi_ is not null");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiEqualTo(String value) {
            addCriterion("bian_zhi_ri_qi_ =", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiNotEqualTo(String value) {
            addCriterion("bian_zhi_ri_qi_ <>", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiGreaterThan(String value) {
            addCriterion("bian_zhi_ri_qi_ >", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiGreaterThanOrEqualTo(String value) {
            addCriterion("bian_zhi_ri_qi_ >=", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiLessThan(String value) {
            addCriterion("bian_zhi_ri_qi_ <", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiLessThanOrEqualTo(String value) {
            addCriterion("bian_zhi_ri_qi_ <=", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiLike(String value) {
            addCriterion("bian_zhi_ri_qi_ like", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiNotLike(String value) {
            addCriterion("bian_zhi_ri_qi_ not like", value, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiIn(List<String> values) {
            addCriterion("bian_zhi_ri_qi_ in", values, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiNotIn(List<String> values) {
            addCriterion("bian_zhi_ri_qi_ not in", values, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiBetween(String value1, String value2) {
            addCriterion("bian_zhi_ri_qi_ between", value1, value2, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andBianZhiRiQiNotBetween(String value1, String value2) {
            addCriterion("bian_zhi_ri_qi_ not between", value1, value2, "bianZhiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiIsNull() {
            addCriterion("shen_he_ri_qi_ is null");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiIsNotNull() {
            addCriterion("shen_he_ri_qi_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiEqualTo(String value) {
            addCriterion("shen_he_ri_qi_ =", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiNotEqualTo(String value) {
            addCriterion("shen_he_ri_qi_ <>", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiGreaterThan(String value) {
            addCriterion("shen_he_ri_qi_ >", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiGreaterThanOrEqualTo(String value) {
            addCriterion("shen_he_ri_qi_ >=", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiLessThan(String value) {
            addCriterion("shen_he_ri_qi_ <", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiLessThanOrEqualTo(String value) {
            addCriterion("shen_he_ri_qi_ <=", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiLike(String value) {
            addCriterion("shen_he_ri_qi_ like", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiNotLike(String value) {
            addCriterion("shen_he_ri_qi_ not like", value, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiIn(List<String> values) {
            addCriterion("shen_he_ri_qi_ in", values, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiNotIn(List<String> values) {
            addCriterion("shen_he_ri_qi_ not in", values, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiBetween(String value1, String value2) {
            addCriterion("shen_he_ri_qi_ between", value1, value2, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenHeRiQiNotBetween(String value1, String value2) {
            addCriterion("shen_he_ri_qi_ not between", value1, value2, "shenHeRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiIsNull() {
            addCriterion("shen_pi_ri_qi_ is null");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiIsNotNull() {
            addCriterion("shen_pi_ri_qi_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiEqualTo(String value) {
            addCriterion("shen_pi_ri_qi_ =", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiNotEqualTo(String value) {
            addCriterion("shen_pi_ri_qi_ <>", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiGreaterThan(String value) {
            addCriterion("shen_pi_ri_qi_ >", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiGreaterThanOrEqualTo(String value) {
            addCriterion("shen_pi_ri_qi_ >=", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiLessThan(String value) {
            addCriterion("shen_pi_ri_qi_ <", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiLessThanOrEqualTo(String value) {
            addCriterion("shen_pi_ri_qi_ <=", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiLike(String value) {
            addCriterion("shen_pi_ri_qi_ like", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiNotLike(String value) {
            addCriterion("shen_pi_ri_qi_ not like", value, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiIn(List<String> values) {
            addCriterion("shen_pi_ri_qi_ in", values, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiNotIn(List<String> values) {
            addCriterion("shen_pi_ri_qi_ not in", values, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiBetween(String value1, String value2) {
            addCriterion("shen_pi_ri_qi_ between", value1, value2, "shenPiRiQi");
            return (Criteria) this;
        }

        public Criteria andShenPiRiQiNotBetween(String value1, String value2) {
            addCriterion("shen_pi_ri_qi_ not between", value1, value2, "shenPiRiQi");
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