package model.po;

import java.util.ArrayList;
import java.util.List;

public class T158003Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T158003Example() {
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

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaIsNull() {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaIsNotNull() {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ =", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaNotEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ <>", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaGreaterThan(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ >", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ >=", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaLessThan(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ <", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaLessThanOrEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ <=", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaLike(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ like", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaNotLike(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ not like", value, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaIn(List<String> values) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ in", values, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaNotIn(List<String> values) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ not in", values, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaBetween(String value1, String value2) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ between", value1, value2, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanDanJiaNotBetween(String value1, String value2) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_dan_jia_ not between", value1, value2, "benYueYuSuanChengBenYuSuanDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangIsNull() {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangIsNotNull() {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ =", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangNotEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ <>", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangGreaterThan(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ >", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangGreaterThanOrEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ >=", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangLessThan(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ <", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangLessThanOrEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ <=", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangLike(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ like", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangNotLike(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ not like", value, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangIn(List<String> values) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ in", values, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangNotIn(List<String> values) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ not in", values, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangBetween(String value1, String value2) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ between", value1, value2, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenYuSuanYongLiangNotBetween(String value1, String value2) {
            addCriterion("ben_yue_yu_suan_cheng_ben_yu_suan_yong_liang_ not between", value1, value2, "benYueYuSuanChengBenYuSuanYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaIsNull() {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaIsNotNull() {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ =", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaNotEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ <>", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaGreaterThan(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ >", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaGreaterThanOrEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ >=", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaLessThan(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ <", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaLessThanOrEqualTo(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ <=", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaLike(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ like", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaNotLike(String value) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ not like", value, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaIn(List<String> values) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ in", values, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaNotIn(List<String> values) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ not in", values, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaBetween(String value1, String value2) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ between", value1, value2, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueYuSuanChengBenHeJiaNotBetween(String value1, String value2) {
            addCriterion("ben_yue_yu_suan_cheng_ben_he_jia_ not between", value1, value2, "benYueYuSuanChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvIsNull() {
            addCriterion("sun_hao_lv_ is null");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvIsNotNull() {
            addCriterion("sun_hao_lv_ is not null");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvEqualTo(String value) {
            addCriterion("sun_hao_lv_ =", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvNotEqualTo(String value) {
            addCriterion("sun_hao_lv_ <>", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvGreaterThan(String value) {
            addCriterion("sun_hao_lv_ >", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvGreaterThanOrEqualTo(String value) {
            addCriterion("sun_hao_lv_ >=", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvLessThan(String value) {
            addCriterion("sun_hao_lv_ <", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvLessThanOrEqualTo(String value) {
            addCriterion("sun_hao_lv_ <=", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvLike(String value) {
            addCriterion("sun_hao_lv_ like", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvNotLike(String value) {
            addCriterion("sun_hao_lv_ not like", value, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvIn(List<String> values) {
            addCriterion("sun_hao_lv_ in", values, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvNotIn(List<String> values) {
            addCriterion("sun_hao_lv_ not in", values, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvBetween(String value1, String value2) {
            addCriterion("sun_hao_lv_ between", value1, value2, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andSunHaoLvNotBetween(String value1, String value2) {
            addCriterion("sun_hao_lv_ not between", value1, value2, "sunHaoLv");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaIsNull() {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaIsNotNull() {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ =", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaNotEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ <>", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaGreaterThan(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ >", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ >=", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaLessThan(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ <", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaLessThanOrEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ <=", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaLike(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ like", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaNotLike(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ not like", value, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaIn(List<String> values) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ in", values, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaNotIn(List<String> values) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ not in", values, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaBetween(String value1, String value2) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ between", value1, value2, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenCaiGouDanJiaNotBetween(String value1, String value2) {
            addCriterion("ben_yue_shi_ji_cheng_ben_cai_gou_dan_jia_ not between", value1, value2, "benYueShiJiChengBenCaiGouDanJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangIsNull() {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangIsNotNull() {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ =", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangNotEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ <>", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangGreaterThan(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ >", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangGreaterThanOrEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ >=", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangLessThan(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ <", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangLessThanOrEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ <=", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangLike(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ like", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangNotLike(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ not like", value, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangIn(List<String> values) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ in", values, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangNotIn(List<String> values) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ not in", values, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangBetween(String value1, String value2) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ between", value1, value2, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenShiJiYongLiangNotBetween(String value1, String value2) {
            addCriterion("ben_yue_shi_ji_cheng_ben_shi_ji_yong_liang_ not between", value1, value2, "benYueShiJiChengBenShiJiYongLiang");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaIsNull() {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaIsNotNull() {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ =", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaNotEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ <>", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaGreaterThan(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ >", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaGreaterThanOrEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ >=", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaLessThan(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ <", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaLessThanOrEqualTo(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ <=", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaLike(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ like", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaNotLike(String value) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ not like", value, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaIn(List<String> values) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ in", values, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaNotIn(List<String> values) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ not in", values, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaBetween(String value1, String value2) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ between", value1, value2, "benYueShiJiChengBenHeJia");
            return (Criteria) this;
        }

        public Criteria andBenYueShiJiChengBenHeJiaNotBetween(String value1, String value2) {
            addCriterion("ben_yue_shi_ji_cheng_ben_he_jia_ not between", value1, value2, "benYueShiJiChengBenHeJia");
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

        public Criteria andShiYongBuWeiIsNull() {
            addCriterion("shi_yong_bu_wei_ is null");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiIsNotNull() {
            addCriterion("shi_yong_bu_wei_ is not null");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiEqualTo(String value) {
            addCriterion("shi_yong_bu_wei_ =", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiNotEqualTo(String value) {
            addCriterion("shi_yong_bu_wei_ <>", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiGreaterThan(String value) {
            addCriterion("shi_yong_bu_wei_ >", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiGreaterThanOrEqualTo(String value) {
            addCriterion("shi_yong_bu_wei_ >=", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiLessThan(String value) {
            addCriterion("shi_yong_bu_wei_ <", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiLessThanOrEqualTo(String value) {
            addCriterion("shi_yong_bu_wei_ <=", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiLike(String value) {
            addCriterion("shi_yong_bu_wei_ like", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiNotLike(String value) {
            addCriterion("shi_yong_bu_wei_ not like", value, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiIn(List<String> values) {
            addCriterion("shi_yong_bu_wei_ in", values, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiNotIn(List<String> values) {
            addCriterion("shi_yong_bu_wei_ not in", values, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiBetween(String value1, String value2) {
            addCriterion("shi_yong_bu_wei_ between", value1, value2, "shiYongBuWei");
            return (Criteria) this;
        }

        public Criteria andShiYongBuWeiNotBetween(String value1, String value2) {
            addCriterion("shi_yong_bu_wei_ not between", value1, value2, "shiYongBuWei");
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