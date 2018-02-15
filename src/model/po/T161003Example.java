package model.po;

import java.util.ArrayList;
import java.util.List;

public class T161003Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T161003Example() {
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

        public Criteria andYuSuanZhiShuLiangIsNull() {
            addCriterion("yu_suan_zhi_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangIsNotNull() {
            addCriterion("yu_suan_zhi_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangEqualTo(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ =", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangNotEqualTo(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ <>", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangGreaterThan(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ >", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ >=", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangLessThan(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ <", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangLessThanOrEqualTo(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ <=", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangLike(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ like", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangNotLike(String value) {
            addCriterion("yu_suan_zhi_shu_liang_ not like", value, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangIn(List<String> values) {
            addCriterion("yu_suan_zhi_shu_liang_ in", values, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangNotIn(List<String> values) {
            addCriterion("yu_suan_zhi_shu_liang_ not in", values, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangBetween(String value1, String value2) {
            addCriterion("yu_suan_zhi_shu_liang_ between", value1, value2, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiShuLiangNotBetween(String value1, String value2) {
            addCriterion("yu_suan_zhi_shu_liang_ not between", value1, value2, "yuSuanZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaIsNull() {
            addCriterion("yu_suan_zhi_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaIsNotNull() {
            addCriterion("yu_suan_zhi_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaEqualTo(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ =", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaNotEqualTo(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ <>", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaGreaterThan(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ >", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ >=", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaLessThan(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ <", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaLessThanOrEqualTo(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ <=", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaLike(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ like", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaNotLike(String value) {
            addCriterion("yu_suan_zhi_dan_jia_ not like", value, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaIn(List<String> values) {
            addCriterion("yu_suan_zhi_dan_jia_ in", values, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaNotIn(List<String> values) {
            addCriterion("yu_suan_zhi_dan_jia_ not in", values, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaBetween(String value1, String value2) {
            addCriterion("yu_suan_zhi_dan_jia_ between", value1, value2, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiDanJiaNotBetween(String value1, String value2) {
            addCriterion("yu_suan_zhi_dan_jia_ not between", value1, value2, "yuSuanZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEIsNull() {
            addCriterion("yu_suan_zhi_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEIsNotNull() {
            addCriterion("yu_suan_zhi_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEEqualTo(String value) {
            addCriterion("yu_suan_zhi_jin_e_ =", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinENotEqualTo(String value) {
            addCriterion("yu_suan_zhi_jin_e_ <>", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEGreaterThan(String value) {
            addCriterion("yu_suan_zhi_jin_e_ >", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEGreaterThanOrEqualTo(String value) {
            addCriterion("yu_suan_zhi_jin_e_ >=", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinELessThan(String value) {
            addCriterion("yu_suan_zhi_jin_e_ <", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinELessThanOrEqualTo(String value) {
            addCriterion("yu_suan_zhi_jin_e_ <=", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinELike(String value) {
            addCriterion("yu_suan_zhi_jin_e_ like", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinENotLike(String value) {
            addCriterion("yu_suan_zhi_jin_e_ not like", value, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEIn(List<String> values) {
            addCriterion("yu_suan_zhi_jin_e_ in", values, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinENotIn(List<String> values) {
            addCriterion("yu_suan_zhi_jin_e_ not in", values, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinEBetween(String value1, String value2) {
            addCriterion("yu_suan_zhi_jin_e_ between", value1, value2, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYuSuanZhiJinENotBetween(String value1, String value2) {
            addCriterion("yu_suan_zhi_jin_e_ not between", value1, value2, "yuSuanZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangIsNull() {
            addCriterion("shi_ji_zhi_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangIsNotNull() {
            addCriterion("shi_ji_zhi_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangEqualTo(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ =", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangNotEqualTo(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ <>", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangGreaterThan(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ >", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ >=", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangLessThan(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ <", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangLessThanOrEqualTo(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ <=", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangLike(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ like", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangNotLike(String value) {
            addCriterion("shi_ji_zhi_shu_liang_ not like", value, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangIn(List<String> values) {
            addCriterion("shi_ji_zhi_shu_liang_ in", values, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangNotIn(List<String> values) {
            addCriterion("shi_ji_zhi_shu_liang_ not in", values, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangBetween(String value1, String value2) {
            addCriterion("shi_ji_zhi_shu_liang_ between", value1, value2, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiShuLiangNotBetween(String value1, String value2) {
            addCriterion("shi_ji_zhi_shu_liang_ not between", value1, value2, "shiJiZhiShuLiang");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaIsNull() {
            addCriterion("shi_ji_zhi_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaIsNotNull() {
            addCriterion("shi_ji_zhi_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaEqualTo(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ =", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaNotEqualTo(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ <>", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaGreaterThan(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ >", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ >=", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaLessThan(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ <", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaLessThanOrEqualTo(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ <=", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaLike(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ like", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaNotLike(String value) {
            addCriterion("shi_ji_zhi_dan_jia_ not like", value, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaIn(List<String> values) {
            addCriterion("shi_ji_zhi_dan_jia_ in", values, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaNotIn(List<String> values) {
            addCriterion("shi_ji_zhi_dan_jia_ not in", values, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaBetween(String value1, String value2) {
            addCriterion("shi_ji_zhi_dan_jia_ between", value1, value2, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiDanJiaNotBetween(String value1, String value2) {
            addCriterion("shi_ji_zhi_dan_jia_ not between", value1, value2, "shiJiZhiDanJia");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEIsNull() {
            addCriterion("shi_ji_zhi_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEIsNotNull() {
            addCriterion("shi_ji_zhi_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEEqualTo(String value) {
            addCriterion("shi_ji_zhi_jin_e_ =", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinENotEqualTo(String value) {
            addCriterion("shi_ji_zhi_jin_e_ <>", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEGreaterThan(String value) {
            addCriterion("shi_ji_zhi_jin_e_ >", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEGreaterThanOrEqualTo(String value) {
            addCriterion("shi_ji_zhi_jin_e_ >=", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinELessThan(String value) {
            addCriterion("shi_ji_zhi_jin_e_ <", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinELessThanOrEqualTo(String value) {
            addCriterion("shi_ji_zhi_jin_e_ <=", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinELike(String value) {
            addCriterion("shi_ji_zhi_jin_e_ like", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinENotLike(String value) {
            addCriterion("shi_ji_zhi_jin_e_ not like", value, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEIn(List<String> values) {
            addCriterion("shi_ji_zhi_jin_e_ in", values, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinENotIn(List<String> values) {
            addCriterion("shi_ji_zhi_jin_e_ not in", values, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinEBetween(String value1, String value2) {
            addCriterion("shi_ji_zhi_jin_e_ between", value1, value2, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andShiJiZhiJinENotBetween(String value1, String value2) {
            addCriterion("shi_ji_zhi_jin_e_ not between", value1, value2, "shiJiZhiJinE");
            return (Criteria) this;
        }

        public Criteria andYingKuiIsNull() {
            addCriterion("ying_kui_ is null");
            return (Criteria) this;
        }

        public Criteria andYingKuiIsNotNull() {
            addCriterion("ying_kui_ is not null");
            return (Criteria) this;
        }

        public Criteria andYingKuiEqualTo(String value) {
            addCriterion("ying_kui_ =", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiNotEqualTo(String value) {
            addCriterion("ying_kui_ <>", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiGreaterThan(String value) {
            addCriterion("ying_kui_ >", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiGreaterThanOrEqualTo(String value) {
            addCriterion("ying_kui_ >=", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiLessThan(String value) {
            addCriterion("ying_kui_ <", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiLessThanOrEqualTo(String value) {
            addCriterion("ying_kui_ <=", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiLike(String value) {
            addCriterion("ying_kui_ like", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiNotLike(String value) {
            addCriterion("ying_kui_ not like", value, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiIn(List<String> values) {
            addCriterion("ying_kui_ in", values, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiNotIn(List<String> values) {
            addCriterion("ying_kui_ not in", values, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiBetween(String value1, String value2) {
            addCriterion("ying_kui_ between", value1, value2, "yingKui");
            return (Criteria) this;
        }

        public Criteria andYingKuiNotBetween(String value1, String value2) {
            addCriterion("ying_kui_ not between", value1, value2, "yingKui");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaIsNull() {
            addCriterion("liang_cha_ying_xiang_liang_cha_ is null");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaIsNotNull() {
            addCriterion("liang_cha_ying_xiang_liang_cha_ is not null");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ =", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaNotEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ <>", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaGreaterThan(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ >", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaGreaterThanOrEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ >=", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaLessThan(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ <", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaLessThanOrEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ <=", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaLike(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ like", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaNotLike(String value) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ not like", value, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaIn(List<String> values) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ in", values, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaNotIn(List<String> values) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ not in", values, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaBetween(String value1, String value2) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ between", value1, value2, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangLiangChaNotBetween(String value1, String value2) {
            addCriterion("liang_cha_ying_xiang_liang_cha_ not between", value1, value2, "liangChaYingXiangLiangCha");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEIsNull() {
            addCriterion("liang_cha_ying_xiang_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEIsNotNull() {
            addCriterion("liang_cha_ying_xiang_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ =", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinENotEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ <>", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEGreaterThan(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ >", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEGreaterThanOrEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ >=", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinELessThan(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ <", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinELessThanOrEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ <=", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinELike(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ like", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinENotLike(String value) {
            addCriterion("liang_cha_ying_xiang_jin_e_ not like", value, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEIn(List<String> values) {
            addCriterion("liang_cha_ying_xiang_jin_e_ in", values, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinENotIn(List<String> values) {
            addCriterion("liang_cha_ying_xiang_jin_e_ not in", values, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinEBetween(String value1, String value2) {
            addCriterion("liang_cha_ying_xiang_jin_e_ between", value1, value2, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangJinENotBetween(String value1, String value2) {
            addCriterion("liang_cha_ying_xiang_jin_e_ not between", value1, value2, "liangChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiIsNull() {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ is null");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiIsNotNull() {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ is not null");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ =", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiNotEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ <>", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiGreaterThan(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ >", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiGreaterThanOrEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ >=", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiLessThan(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ <", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiLessThanOrEqualTo(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ <=", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiLike(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ like", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiNotLike(String value) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ not like", value, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiIn(List<String> values) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ in", values, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiNotIn(List<String> values) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ not in", values, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiBetween(String value1, String value2) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ between", value1, value2, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andLiangChaYingXiangZhanBiNotBetween(String value1, String value2) {
            addCriterion("liang_cha_ying_xiang_zhan_bi_ not between", value1, value2, "liangChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaIsNull() {
            addCriterion("jia_cha_ying_xiang_jia_cha_ is null");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaIsNotNull() {
            addCriterion("jia_cha_ying_xiang_jia_cha_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ =", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaNotEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ <>", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaGreaterThan(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ >", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaGreaterThanOrEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ >=", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaLessThan(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ <", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaLessThanOrEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ <=", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaLike(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ like", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaNotLike(String value) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ not like", value, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaIn(List<String> values) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ in", values, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaNotIn(List<String> values) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ not in", values, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaBetween(String value1, String value2) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ between", value1, value2, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJiaChaNotBetween(String value1, String value2) {
            addCriterion("jia_cha_ying_xiang_jia_cha_ not between", value1, value2, "jiaChaYingXiangJiaCha");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEIsNull() {
            addCriterion("jia_cha_ying_xiang_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEIsNotNull() {
            addCriterion("jia_cha_ying_xiang_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ =", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinENotEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ <>", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEGreaterThan(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ >", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEGreaterThanOrEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ >=", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinELessThan(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ <", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinELessThanOrEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ <=", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinELike(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ like", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinENotLike(String value) {
            addCriterion("jia_cha_ying_xiang_jin_e_ not like", value, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEIn(List<String> values) {
            addCriterion("jia_cha_ying_xiang_jin_e_ in", values, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinENotIn(List<String> values) {
            addCriterion("jia_cha_ying_xiang_jin_e_ not in", values, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinEBetween(String value1, String value2) {
            addCriterion("jia_cha_ying_xiang_jin_e_ between", value1, value2, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangJinENotBetween(String value1, String value2) {
            addCriterion("jia_cha_ying_xiang_jin_e_ not between", value1, value2, "jiaChaYingXiangJinE");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiIsNull() {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ is null");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiIsNotNull() {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ =", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiNotEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ <>", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiGreaterThan(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ >", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiGreaterThanOrEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ >=", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiLessThan(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ <", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiLessThanOrEqualTo(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ <=", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiLike(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ like", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiNotLike(String value) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ not like", value, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiIn(List<String> values) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ in", values, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiNotIn(List<String> values) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ not in", values, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiBetween(String value1, String value2) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ between", value1, value2, "jiaChaYingXiangZhanBi");
            return (Criteria) this;
        }

        public Criteria andJiaChaYingXiangZhanBiNotBetween(String value1, String value2) {
            addCriterion("jia_cha_ying_xiang_zhan_bi_ not between", value1, value2, "jiaChaYingXiangZhanBi");
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