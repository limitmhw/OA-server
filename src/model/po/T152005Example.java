package model.po;

import java.util.ArrayList;
import java.util.List;

public class T152005Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T152005Example() {
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

        public Criteria andBianHaoIsNull() {
            addCriterion("bian_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andBianHaoIsNotNull() {
            addCriterion("bian_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andBianHaoEqualTo(String value) {
            addCriterion("bian_hao_ =", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoNotEqualTo(String value) {
            addCriterion("bian_hao_ <>", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoGreaterThan(String value) {
            addCriterion("bian_hao_ >", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoGreaterThanOrEqualTo(String value) {
            addCriterion("bian_hao_ >=", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoLessThan(String value) {
            addCriterion("bian_hao_ <", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoLessThanOrEqualTo(String value) {
            addCriterion("bian_hao_ <=", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoLike(String value) {
            addCriterion("bian_hao_ like", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoNotLike(String value) {
            addCriterion("bian_hao_ not like", value, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoIn(List<String> values) {
            addCriterion("bian_hao_ in", values, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoNotIn(List<String> values) {
            addCriterion("bian_hao_ not in", values, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoBetween(String value1, String value2) {
            addCriterion("bian_hao_ between", value1, value2, "bianHao");
            return (Criteria) this;
        }

        public Criteria andBianHaoNotBetween(String value1, String value2) {
            addCriterion("bian_hao_ not between", value1, value2, "bianHao");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenIsNull() {
            addCriterion("cai_liao_ming_chen_ is null");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenIsNotNull() {
            addCriterion("cai_liao_ming_chen_ is not null");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenEqualTo(String value) {
            addCriterion("cai_liao_ming_chen_ =", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenNotEqualTo(String value) {
            addCriterion("cai_liao_ming_chen_ <>", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenGreaterThan(String value) {
            addCriterion("cai_liao_ming_chen_ >", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenGreaterThanOrEqualTo(String value) {
            addCriterion("cai_liao_ming_chen_ >=", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenLessThan(String value) {
            addCriterion("cai_liao_ming_chen_ <", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenLessThanOrEqualTo(String value) {
            addCriterion("cai_liao_ming_chen_ <=", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenLike(String value) {
            addCriterion("cai_liao_ming_chen_ like", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenNotLike(String value) {
            addCriterion("cai_liao_ming_chen_ not like", value, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenIn(List<String> values) {
            addCriterion("cai_liao_ming_chen_ in", values, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenNotIn(List<String> values) {
            addCriterion("cai_liao_ming_chen_ not in", values, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenBetween(String value1, String value2) {
            addCriterion("cai_liao_ming_chen_ between", value1, value2, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andCaiLiaoMingChenNotBetween(String value1, String value2) {
            addCriterion("cai_liao_ming_chen_ not between", value1, value2, "caiLiaoMingChen");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoIsNull() {
            addCriterion("gui_ge_xing_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoIsNotNull() {
            addCriterion("gui_ge_xing_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoEqualTo(String value) {
            addCriterion("gui_ge_xing_hao_ =", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoNotEqualTo(String value) {
            addCriterion("gui_ge_xing_hao_ <>", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoGreaterThan(String value) {
            addCriterion("gui_ge_xing_hao_ >", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoGreaterThanOrEqualTo(String value) {
            addCriterion("gui_ge_xing_hao_ >=", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoLessThan(String value) {
            addCriterion("gui_ge_xing_hao_ <", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoLessThanOrEqualTo(String value) {
            addCriterion("gui_ge_xing_hao_ <=", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoLike(String value) {
            addCriterion("gui_ge_xing_hao_ like", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoNotLike(String value) {
            addCriterion("gui_ge_xing_hao_ not like", value, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoIn(List<String> values) {
            addCriterion("gui_ge_xing_hao_ in", values, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoNotIn(List<String> values) {
            addCriterion("gui_ge_xing_hao_ not in", values, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoBetween(String value1, String value2) {
            addCriterion("gui_ge_xing_hao_ between", value1, value2, "guiGeXingHao");
            return (Criteria) this;
        }

        public Criteria andGuiGeXingHaoNotBetween(String value1, String value2) {
            addCriterion("gui_ge_xing_hao_ not between", value1, value2, "guiGeXingHao");
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

        public Criteria andShuLiangIsNull() {
            addCriterion("shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andShuLiangIsNotNull() {
            addCriterion("shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andShuLiangEqualTo(String value) {
            addCriterion("shu_liang_ =", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotEqualTo(String value) {
            addCriterion("shu_liang_ <>", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangGreaterThan(String value) {
            addCriterion("shu_liang_ >", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("shu_liang_ >=", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangLessThan(String value) {
            addCriterion("shu_liang_ <", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangLessThanOrEqualTo(String value) {
            addCriterion("shu_liang_ <=", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangLike(String value) {
            addCriterion("shu_liang_ like", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotLike(String value) {
            addCriterion("shu_liang_ not like", value, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangIn(List<String> values) {
            addCriterion("shu_liang_ in", values, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotIn(List<String> values) {
            addCriterion("shu_liang_ not in", values, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangBetween(String value1, String value2) {
            addCriterion("shu_liang_ between", value1, value2, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andShuLiangNotBetween(String value1, String value2) {
            addCriterion("shu_liang_ not between", value1, value2, "shuLiang");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaIsNull() {
            addCriterion("tou_biao_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaIsNotNull() {
            addCriterion("tou_biao_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaEqualTo(String value) {
            addCriterion("tou_biao_dan_jia_ =", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaNotEqualTo(String value) {
            addCriterion("tou_biao_dan_jia_ <>", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaGreaterThan(String value) {
            addCriterion("tou_biao_dan_jia_ >", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("tou_biao_dan_jia_ >=", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaLessThan(String value) {
            addCriterion("tou_biao_dan_jia_ <", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaLessThanOrEqualTo(String value) {
            addCriterion("tou_biao_dan_jia_ <=", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaLike(String value) {
            addCriterion("tou_biao_dan_jia_ like", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaNotLike(String value) {
            addCriterion("tou_biao_dan_jia_ not like", value, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaIn(List<String> values) {
            addCriterion("tou_biao_dan_jia_ in", values, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaNotIn(List<String> values) {
            addCriterion("tou_biao_dan_jia_ not in", values, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaBetween(String value1, String value2) {
            addCriterion("tou_biao_dan_jia_ between", value1, value2, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoDanJiaNotBetween(String value1, String value2) {
            addCriterion("tou_biao_dan_jia_ not between", value1, value2, "touBiaoDanJia");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiIsNull() {
            addCriterion("tou_biao_he_ji_ is null");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiIsNotNull() {
            addCriterion("tou_biao_he_ji_ is not null");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiEqualTo(String value) {
            addCriterion("tou_biao_he_ji_ =", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiNotEqualTo(String value) {
            addCriterion("tou_biao_he_ji_ <>", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiGreaterThan(String value) {
            addCriterion("tou_biao_he_ji_ >", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiGreaterThanOrEqualTo(String value) {
            addCriterion("tou_biao_he_ji_ >=", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiLessThan(String value) {
            addCriterion("tou_biao_he_ji_ <", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiLessThanOrEqualTo(String value) {
            addCriterion("tou_biao_he_ji_ <=", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiLike(String value) {
            addCriterion("tou_biao_he_ji_ like", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiNotLike(String value) {
            addCriterion("tou_biao_he_ji_ not like", value, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiIn(List<String> values) {
            addCriterion("tou_biao_he_ji_ in", values, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiNotIn(List<String> values) {
            addCriterion("tou_biao_he_ji_ not in", values, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiBetween(String value1, String value2) {
            addCriterion("tou_biao_he_ji_ between", value1, value2, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andTouBiaoHeJiNotBetween(String value1, String value2) {
            addCriterion("tou_biao_he_ji_ not between", value1, value2, "touBiaoHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaIsNull() {
            addCriterion("ce_suan_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaIsNotNull() {
            addCriterion("ce_suan_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaEqualTo(String value) {
            addCriterion("ce_suan_dan_jia_ =", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaNotEqualTo(String value) {
            addCriterion("ce_suan_dan_jia_ <>", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaGreaterThan(String value) {
            addCriterion("ce_suan_dan_jia_ >", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("ce_suan_dan_jia_ >=", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaLessThan(String value) {
            addCriterion("ce_suan_dan_jia_ <", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaLessThanOrEqualTo(String value) {
            addCriterion("ce_suan_dan_jia_ <=", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaLike(String value) {
            addCriterion("ce_suan_dan_jia_ like", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaNotLike(String value) {
            addCriterion("ce_suan_dan_jia_ not like", value, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaIn(List<String> values) {
            addCriterion("ce_suan_dan_jia_ in", values, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaNotIn(List<String> values) {
            addCriterion("ce_suan_dan_jia_ not in", values, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaBetween(String value1, String value2) {
            addCriterion("ce_suan_dan_jia_ between", value1, value2, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanDanJiaNotBetween(String value1, String value2) {
            addCriterion("ce_suan_dan_jia_ not between", value1, value2, "ceSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiIsNull() {
            addCriterion("ce_suan_he_ji_ is null");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiIsNotNull() {
            addCriterion("ce_suan_he_ji_ is not null");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiEqualTo(String value) {
            addCriterion("ce_suan_he_ji_ =", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiNotEqualTo(String value) {
            addCriterion("ce_suan_he_ji_ <>", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiGreaterThan(String value) {
            addCriterion("ce_suan_he_ji_ >", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiGreaterThanOrEqualTo(String value) {
            addCriterion("ce_suan_he_ji_ >=", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiLessThan(String value) {
            addCriterion("ce_suan_he_ji_ <", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiLessThanOrEqualTo(String value) {
            addCriterion("ce_suan_he_ji_ <=", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiLike(String value) {
            addCriterion("ce_suan_he_ji_ like", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiNotLike(String value) {
            addCriterion("ce_suan_he_ji_ not like", value, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiIn(List<String> values) {
            addCriterion("ce_suan_he_ji_ in", values, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiNotIn(List<String> values) {
            addCriterion("ce_suan_he_ji_ not in", values, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiBetween(String value1, String value2) {
            addCriterion("ce_suan_he_ji_ between", value1, value2, "ceSuanHeJi");
            return (Criteria) this;
        }

        public Criteria andCeSuanHeJiNotBetween(String value1, String value2) {
            addCriterion("ce_suan_he_ji_ not between", value1, value2, "ceSuanHeJi");
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