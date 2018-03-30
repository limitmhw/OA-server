package model.po;

import java.util.ArrayList;
import java.util.List;

public class T158004Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T158004Example() {
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

        public Criteria andXuHaoIsNull() {
            addCriterion("xu_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andXuHaoIsNotNull() {
            addCriterion("xu_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andXuHaoEqualTo(String value) {
            addCriterion("xu_hao_ =", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoNotEqualTo(String value) {
            addCriterion("xu_hao_ <>", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoGreaterThan(String value) {
            addCriterion("xu_hao_ >", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoGreaterThanOrEqualTo(String value) {
            addCriterion("xu_hao_ >=", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoLessThan(String value) {
            addCriterion("xu_hao_ <", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoLessThanOrEqualTo(String value) {
            addCriterion("xu_hao_ <=", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoLike(String value) {
            addCriterion("xu_hao_ like", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoNotLike(String value) {
            addCriterion("xu_hao_ not like", value, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoIn(List<String> values) {
            addCriterion("xu_hao_ in", values, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoNotIn(List<String> values) {
            addCriterion("xu_hao_ not in", values, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoBetween(String value1, String value2) {
            addCriterion("xu_hao_ between", value1, value2, "xuHao");
            return (Criteria) this;
        }

        public Criteria andXuHaoNotBetween(String value1, String value2) {
            addCriterion("xu_hao_ not between", value1, value2, "xuHao");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenIsNull() {
            addCriterion("wu_zi_ming_chen_ is null");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenIsNotNull() {
            addCriterion("wu_zi_ming_chen_ is not null");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenEqualTo(String value) {
            addCriterion("wu_zi_ming_chen_ =", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenNotEqualTo(String value) {
            addCriterion("wu_zi_ming_chen_ <>", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenGreaterThan(String value) {
            addCriterion("wu_zi_ming_chen_ >", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenGreaterThanOrEqualTo(String value) {
            addCriterion("wu_zi_ming_chen_ >=", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenLessThan(String value) {
            addCriterion("wu_zi_ming_chen_ <", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenLessThanOrEqualTo(String value) {
            addCriterion("wu_zi_ming_chen_ <=", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenLike(String value) {
            addCriterion("wu_zi_ming_chen_ like", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenNotLike(String value) {
            addCriterion("wu_zi_ming_chen_ not like", value, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenIn(List<String> values) {
            addCriterion("wu_zi_ming_chen_ in", values, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenNotIn(List<String> values) {
            addCriterion("wu_zi_ming_chen_ not in", values, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenBetween(String value1, String value2) {
            addCriterion("wu_zi_ming_chen_ between", value1, value2, "wuZiMingChen");
            return (Criteria) this;
        }

        public Criteria andWuZiMingChenNotBetween(String value1, String value2) {
            addCriterion("wu_zi_ming_chen_ not between", value1, value2, "wuZiMingChen");
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

        public Criteria andZuLinDanJiaDanWeiIsNull() {
            addCriterion("zu_lin_dan_jia_dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiIsNotNull() {
            addCriterion("zu_lin_dan_jia_dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ =", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiNotEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ <>", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiGreaterThan(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ >", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ >=", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiLessThan(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ <", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ <=", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiLike(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ like", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiNotLike(String value) {
            addCriterion("zu_lin_dan_jia_dan_wei_ not like", value, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiIn(List<String> values) {
            addCriterion("zu_lin_dan_jia_dan_wei_ in", values, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiNotIn(List<String> values) {
            addCriterion("zu_lin_dan_jia_dan_wei_ not in", values, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiBetween(String value1, String value2) {
            addCriterion("zu_lin_dan_jia_dan_wei_ between", value1, value2, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaDanWeiNotBetween(String value1, String value2) {
            addCriterion("zu_lin_dan_jia_dan_wei_ not between", value1, value2, "zuLinDanJiaDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuIsNull() {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuIsNotNull() {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ =", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuNotEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ <>", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuGreaterThan(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ >", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ >=", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuLessThan(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ <", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ <=", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuLike(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ like", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuNotLike(String value) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ not like", value, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuIn(List<String> values) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ in", values, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuNotIn(List<String> values) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ not in", values, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuBetween(String value1, String value2) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ between", value1, value2, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaYuSuanShuNotBetween(String value1, String value2) {
            addCriterion("zu_lin_dan_jia_yu_suan_shu_ not between", value1, value2, "zuLinDanJiaYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuIsNull() {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuIsNotNull() {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ =", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuNotEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ <>", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuGreaterThan(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ >", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ >=", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuLessThan(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ <", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ <=", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuLike(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ like", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuNotLike(String value) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ not like", value, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuIn(List<String> values) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ in", values, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuNotIn(List<String> values) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ not in", values, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuBetween(String value1, String value2) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ between", value1, value2, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinDanJiaShiJiShuNotBetween(String value1, String value2) {
            addCriterion("zu_lin_dan_jia_shi_ji_shu_ not between", value1, value2, "zuLinDanJiaShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiIsNull() {
            addCriterion("zu_lin_shu_liang_dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiIsNotNull() {
            addCriterion("zu_lin_shu_liang_dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ =", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiNotEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ <>", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiGreaterThan(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ >", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ >=", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiLessThan(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ <", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ <=", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiLike(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ like", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiNotLike(String value) {
            addCriterion("zu_lin_shu_liang_dan_wei_ not like", value, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiIn(List<String> values) {
            addCriterion("zu_lin_shu_liang_dan_wei_ in", values, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiNotIn(List<String> values) {
            addCriterion("zu_lin_shu_liang_dan_wei_ not in", values, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiBetween(String value1, String value2) {
            addCriterion("zu_lin_shu_liang_dan_wei_ between", value1, value2, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangDanWeiNotBetween(String value1, String value2) {
            addCriterion("zu_lin_shu_liang_dan_wei_ not between", value1, value2, "zuLinShuLiangDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuIsNull() {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuIsNotNull() {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ =", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuNotEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ <>", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuGreaterThan(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ >", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ >=", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuLessThan(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ <", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ <=", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuLike(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ like", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuNotLike(String value) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ not like", value, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuIn(List<String> values) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ in", values, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuNotIn(List<String> values) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ not in", values, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuBetween(String value1, String value2) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ between", value1, value2, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangYuSuanShuNotBetween(String value1, String value2) {
            addCriterion("zu_lin_shu_liang_yu_suan_shu_ not between", value1, value2, "zuLinShuLiangYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuIsNull() {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuIsNotNull() {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ =", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuNotEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ <>", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuGreaterThan(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ >", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ >=", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuLessThan(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ <", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ <=", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuLike(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ like", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuNotLike(String value) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ not like", value, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuIn(List<String> values) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ in", values, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuNotIn(List<String> values) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ not in", values, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuBetween(String value1, String value2) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ between", value1, value2, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShuLiangShiJiShuNotBetween(String value1, String value2) {
            addCriterion("zu_lin_shu_liang_shi_ji_shu_ not between", value1, value2, "zuLinShuLiangShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiIsNull() {
            addCriterion("zu_lin_shi_jian_dan_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiIsNotNull() {
            addCriterion("zu_lin_shi_jian_dan_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ =", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiNotEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ <>", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiGreaterThan(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ >", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ >=", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiLessThan(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ <", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ <=", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiLike(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ like", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiNotLike(String value) {
            addCriterion("zu_lin_shi_jian_dan_wei_ not like", value, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiIn(List<String> values) {
            addCriterion("zu_lin_shi_jian_dan_wei_ in", values, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiNotIn(List<String> values) {
            addCriterion("zu_lin_shi_jian_dan_wei_ not in", values, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiBetween(String value1, String value2) {
            addCriterion("zu_lin_shi_jian_dan_wei_ between", value1, value2, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianDanWeiNotBetween(String value1, String value2) {
            addCriterion("zu_lin_shi_jian_dan_wei_ not between", value1, value2, "zuLinShiJianDanWei");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuIsNull() {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuIsNotNull() {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ =", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuNotEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ <>", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuGreaterThan(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ >", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ >=", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuLessThan(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ <", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ <=", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuLike(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ like", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuNotLike(String value) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ not like", value, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuIn(List<String> values) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ in", values, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuNotIn(List<String> values) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ not in", values, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuBetween(String value1, String value2) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ between", value1, value2, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianYuSuanShuNotBetween(String value1, String value2) {
            addCriterion("zu_lin_shi_jian_yu_suan_shu_ not between", value1, value2, "zuLinShiJianYuSuanShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuIsNull() {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuIsNotNull() {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ =", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuNotEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ <>", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuGreaterThan(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ >", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuGreaterThanOrEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ >=", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuLessThan(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ <", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuLessThanOrEqualTo(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ <=", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuLike(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ like", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuNotLike(String value) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ not like", value, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuIn(List<String> values) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ in", values, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuNotIn(List<String> values) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ not in", values, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuBetween(String value1, String value2) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ between", value1, value2, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andZuLinShiJianShiJiShuNotBetween(String value1, String value2) {
            addCriterion("zu_lin_shi_jian_shi_ji_shu_ not between", value1, value2, "zuLinShiJianShiJiShu");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiIsNull() {
            addCriterion("yu_suan_cheng_ben_he_ji_ is null");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiIsNotNull() {
            addCriterion("yu_suan_cheng_ben_he_ji_ is not null");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ =", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiNotEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ <>", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiGreaterThan(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ >", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiGreaterThanOrEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ >=", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiLessThan(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ <", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiLessThanOrEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ <=", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiLike(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ like", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiNotLike(String value) {
            addCriterion("yu_suan_cheng_ben_he_ji_ not like", value, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiIn(List<String> values) {
            addCriterion("yu_suan_cheng_ben_he_ji_ in", values, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiNotIn(List<String> values) {
            addCriterion("yu_suan_cheng_ben_he_ji_ not in", values, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiBetween(String value1, String value2) {
            addCriterion("yu_suan_cheng_ben_he_ji_ between", value1, value2, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenHeJiNotBetween(String value1, String value2) {
            addCriterion("yu_suan_cheng_ben_he_ji_ not between", value1, value2, "yuSuanChengBenHeJi");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaIsNull() {
            addCriterion("shi_ji_cheng_ben_he_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaIsNotNull() {
            addCriterion("shi_ji_cheng_ben_he_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaEqualTo(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ =", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaNotEqualTo(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ <>", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaGreaterThan(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ >", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaGreaterThanOrEqualTo(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ >=", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaLessThan(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ <", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaLessThanOrEqualTo(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ <=", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaLike(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ like", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaNotLike(String value) {
            addCriterion("shi_ji_cheng_ben_he_jia_ not like", value, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaIn(List<String> values) {
            addCriterion("shi_ji_cheng_ben_he_jia_ in", values, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaNotIn(List<String> values) {
            addCriterion("shi_ji_cheng_ben_he_jia_ not in", values, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaBetween(String value1, String value2) {
            addCriterion("shi_ji_cheng_ben_he_jia_ between", value1, value2, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andShiJiChengBenHeJiaNotBetween(String value1, String value2) {
            addCriterion("shi_ji_cheng_ben_he_jia_ not between", value1, value2, "shiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuIsNull() {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ is null");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuIsNotNull() {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuEqualTo(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ =", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuNotEqualTo(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ <>", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuGreaterThan(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ >", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuGreaterThanOrEqualTo(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ >=", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuLessThan(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ <", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuLessThanOrEqualTo(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ <=", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuLike(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ like", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuNotLike(String value) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ not like", value, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuIn(List<String> values) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ in", values, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuNotIn(List<String> values) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ not in", values, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuBetween(String value1, String value2) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ between", value1, value2, "suoShuChengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andSuoShuChengBenXiangMuNotBetween(String value1, String value2) {
            addCriterion("suo_shu_cheng_ben_xiang_mu_ not between", value1, value2, "suoShuChengBenXiangMu");
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