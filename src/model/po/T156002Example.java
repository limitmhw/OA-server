package model.po;

import java.util.ArrayList;
import java.util.List;

public class T156002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T156002Example() {
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

        public Criteria andZongYuSuanShuShuLiangIsNull() {
            addCriterion("zong_yu_suan_shu_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangIsNotNull() {
            addCriterion("zong_yu_suan_shu_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ =", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangNotEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ <>", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangGreaterThan(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ >", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ >=", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangLessThan(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ <", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangLessThanOrEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ <=", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangLike(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ like", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangNotLike(String value) {
            addCriterion("zong_yu_suan_shu_shu_liang_ not like", value, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangIn(List<String> values) {
            addCriterion("zong_yu_suan_shu_shu_liang_ in", values, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangNotIn(List<String> values) {
            addCriterion("zong_yu_suan_shu_shu_liang_ not in", values, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangBetween(String value1, String value2) {
            addCriterion("zong_yu_suan_shu_shu_liang_ between", value1, value2, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuShuLiangNotBetween(String value1, String value2) {
            addCriterion("zong_yu_suan_shu_shu_liang_ not between", value1, value2, "zongYuSuanShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaIsNull() {
            addCriterion("zong_yu_suan_shu_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaIsNotNull() {
            addCriterion("zong_yu_suan_shu_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ =", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaNotEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ <>", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaGreaterThan(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ >", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ >=", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaLessThan(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ <", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaLessThanOrEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ <=", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaLike(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ like", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaNotLike(String value) {
            addCriterion("zong_yu_suan_shu_dan_jia_ not like", value, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaIn(List<String> values) {
            addCriterion("zong_yu_suan_shu_dan_jia_ in", values, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaNotIn(List<String> values) {
            addCriterion("zong_yu_suan_shu_dan_jia_ not in", values, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaBetween(String value1, String value2) {
            addCriterion("zong_yu_suan_shu_dan_jia_ between", value1, value2, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuDanJiaNotBetween(String value1, String value2) {
            addCriterion("zong_yu_suan_shu_dan_jia_ not between", value1, value2, "zongYuSuanShuDanJia");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEIsNull() {
            addCriterion("zong_yu_suan_shu_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEIsNotNull() {
            addCriterion("zong_yu_suan_shu_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ =", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinENotEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ <>", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEGreaterThan(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ >", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEGreaterThanOrEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ >=", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinELessThan(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ <", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinELessThanOrEqualTo(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ <=", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinELike(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ like", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinENotLike(String value) {
            addCriterion("zong_yu_suan_shu_jin_e_ not like", value, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEIn(List<String> values) {
            addCriterion("zong_yu_suan_shu_jin_e_ in", values, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinENotIn(List<String> values) {
            addCriterion("zong_yu_suan_shu_jin_e_ not in", values, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinEBetween(String value1, String value2) {
            addCriterion("zong_yu_suan_shu_jin_e_ between", value1, value2, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andZongYuSuanShuJinENotBetween(String value1, String value2) {
            addCriterion("zong_yu_suan_shu_jin_e_ not between", value1, value2, "zongYuSuanShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangIsNull() {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangIsNotNull() {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ =", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangNotEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ <>", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangGreaterThan(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ >", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ >=", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangLessThan(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ <", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangLessThanOrEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ <=", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangLike(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ like", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangNotLike(String value) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ not like", value, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangIn(List<String> values) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ in", values, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangNotIn(List<String> values) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ not in", values, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangBetween(String value1, String value2) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ between", value1, value2, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuShuLiangNotBetween(String value1, String value2) {
            addCriterion("yi_wan_cai_gou_shu_shu_liang_ not between", value1, value2, "yiWanCaiGouShuShuLiang");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEIsNull() {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEIsNotNull() {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ =", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinENotEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ <>", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEGreaterThan(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ >", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEGreaterThanOrEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ >=", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinELessThan(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ <", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinELessThanOrEqualTo(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ <=", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinELike(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ like", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinENotLike(String value) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ not like", value, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEIn(List<String> values) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ in", values, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinENotIn(List<String> values) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ not in", values, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinEBetween(String value1, String value2) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ between", value1, value2, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andYiWanCaiGouShuJinENotBetween(String value1, String value2) {
            addCriterion("yi_wan_cai_gou_shu_jin_e_ not between", value1, value2, "yiWanCaiGouShuJinE");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangIsNull() {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangIsNotNull() {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ =", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangNotEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ <>", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangGreaterThan(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ >", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ >=", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangLessThan(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ <", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangLessThanOrEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ <=", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangLike(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ like", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangNotLike(String value) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ not like", value, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangIn(List<String> values) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ in", values, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangNotIn(List<String> values) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ not in", values, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangBetween(String value1, String value2) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ between", value1, value2, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuShengYuLiangNotBetween(String value1, String value2) {
            addCriterion("wei_wan_yu_kong_shu_sheng_yu_liang_ not between", value1, value2, "weiWanYuKongShuShengYuLiang");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaIsNull() {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaIsNotNull() {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ =", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaNotEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ <>", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaGreaterThan(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ >", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ >=", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaLessThan(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ <", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaLessThanOrEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ <=", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaLike(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ like", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaNotLike(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ not like", value, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaIn(List<String> values) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ in", values, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaNotIn(List<String> values) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ not in", values, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaBetween(String value1, String value2) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ between", value1, value2, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuCeDanJiaNotBetween(String value1, String value2) {
            addCriterion("wei_wan_yu_kong_shu_yu_ce_dan_jia_ not between", value1, value2, "weiWanYuKongShuYuCeDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaIsNull() {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ is null");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaIsNotNull() {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ is not null");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ =", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaNotEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ <>", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaGreaterThan(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ >", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaGreaterThanOrEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ >=", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaLessThan(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ <", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaLessThanOrEqualTo(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ <=", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaLike(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ like", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaNotLike(String value) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ not like", value, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaIn(List<String> values) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ in", values, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaNotIn(List<String> values) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ not in", values, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaBetween(String value1, String value2) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ between", value1, value2, "weiWanYuKongShuYuKongDanJia");
            return (Criteria) this;
        }

        public Criteria andWeiWanYuKongShuYuKongDanJiaNotBetween(String value1, String value2) {
            addCriterion("wei_wan_yu_kong_shu_yu_kong_dan_jia_ not between", value1, value2, "weiWanYuKongShuYuKongDanJia");
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