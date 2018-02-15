package model.po;

import java.util.ArrayList;
import java.util.List;

public class T157002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T157002Example() {
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

        public Criteria andBianMaIsNull() {
            addCriterion("bian_ma_ is null");
            return (Criteria) this;
        }

        public Criteria andBianMaIsNotNull() {
            addCriterion("bian_ma_ is not null");
            return (Criteria) this;
        }

        public Criteria andBianMaEqualTo(String value) {
            addCriterion("bian_ma_ =", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotEqualTo(String value) {
            addCriterion("bian_ma_ <>", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaGreaterThan(String value) {
            addCriterion("bian_ma_ >", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaGreaterThanOrEqualTo(String value) {
            addCriterion("bian_ma_ >=", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaLessThan(String value) {
            addCriterion("bian_ma_ <", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaLessThanOrEqualTo(String value) {
            addCriterion("bian_ma_ <=", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaLike(String value) {
            addCriterion("bian_ma_ like", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotLike(String value) {
            addCriterion("bian_ma_ not like", value, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaIn(List<String> values) {
            addCriterion("bian_ma_ in", values, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotIn(List<String> values) {
            addCriterion("bian_ma_ not in", values, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaBetween(String value1, String value2) {
            addCriterion("bian_ma_ between", value1, value2, "bianMa");
            return (Criteria) this;
        }

        public Criteria andBianMaNotBetween(String value1, String value2) {
            addCriterion("bian_ma_ not between", value1, value2, "bianMa");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuIsNull() {
            addCriterion("cheng_ben_xiang_mu_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuIsNotNull() {
            addCriterion("cheng_ben_xiang_mu_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ =", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ <>", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuGreaterThan(String value) {
            addCriterion("cheng_ben_xiang_mu_ >", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ >=", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuLessThan(String value) {
            addCriterion("cheng_ben_xiang_mu_ <", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_xiang_mu_ <=", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuLike(String value) {
            addCriterion("cheng_ben_xiang_mu_ like", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotLike(String value) {
            addCriterion("cheng_ben_xiang_mu_ not like", value, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuIn(List<String> values) {
            addCriterion("cheng_ben_xiang_mu_ in", values, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotIn(List<String> values) {
            addCriterion("cheng_ben_xiang_mu_ not in", values, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuBetween(String value1, String value2) {
            addCriterion("cheng_ben_xiang_mu_ between", value1, value2, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenXiangMuNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_xiang_mu_ not between", value1, value2, "chengBenXiangMu");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenIsNull() {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenIsNotNull() {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenEqualTo(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ =", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenNotEqualTo(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ <>", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenGreaterThan(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ >", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ >=", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenLessThan(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ <", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ <=", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenLike(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ like", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenNotLike(String value) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ not like", value, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenIn(List<String> values) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ in", values, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenNotIn(List<String> values) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ not in", values, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ between", value1, value2, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuYuSuanChengBenNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_yu_suan_cheng_ben_ not between", value1, value2, "benQiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenIsNull() {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenIsNotNull() {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ =", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenNotEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ <>", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenGreaterThan(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ >", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ >=", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenLessThan(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ <", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ <=", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenLike(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ like", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenNotLike(String value) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ not like", value, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenIn(List<String> values) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ in", values, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenNotIn(List<String> values) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ not in", values, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ between", value1, value2, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiChengBenNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_shi_ji_cheng_ben_ not between", value1, value2, "benQiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEIsNull() {
            addCriterion("ben_qi_shu_jiang_di_e_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEIsNotNull() {
            addCriterion("ben_qi_shu_jiang_di_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ =", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiENotEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ <>", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEGreaterThan(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ >", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ >=", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiELessThan(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ <", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiELessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ <=", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiELike(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ like", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiENotLike(String value) {
            addCriterion("ben_qi_shu_jiang_di_e_ not like", value, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEIn(List<String> values) {
            addCriterion("ben_qi_shu_jiang_di_e_ in", values, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiENotIn(List<String> values) {
            addCriterion("ben_qi_shu_jiang_di_e_ not in", values, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiEBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_jiang_di_e_ between", value1, value2, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiENotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_jiang_di_e_ not between", value1, value2, "benQiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvIsNull() {
            addCriterion("ben_qi_shu_jiang_di_lv_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvIsNotNull() {
            addCriterion("ben_qi_shu_jiang_di_lv_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ =", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvNotEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ <>", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvGreaterThan(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ >", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ >=", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvLessThan(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ <", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ <=", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvLike(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ like", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvNotLike(String value) {
            addCriterion("ben_qi_shu_jiang_di_lv_ not like", value, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvIn(List<String> values) {
            addCriterion("ben_qi_shu_jiang_di_lv_ in", values, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvNotIn(List<String> values) {
            addCriterion("ben_qi_shu_jiang_di_lv_ not in", values, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_jiang_di_lv_ between", value1, value2, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andBenQiShuJiangDiLvNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_jiang_di_lv_ not between", value1, value2, "benQiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenIsNull() {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenIsNotNull() {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenEqualTo(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ =", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenNotEqualTo(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ <>", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenGreaterThan(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ >", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ >=", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenLessThan(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ <", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ <=", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenLike(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ like", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenNotLike(String value) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ not like", value, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenIn(List<String> values) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ in", values, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenNotIn(List<String> values) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ not in", values, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ between", value1, value2, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuYuSuanChengBenNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_yu_suan_cheng_ben_ not between", value1, value2, "leiJiShuYuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenIsNull() {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenIsNotNull() {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ =", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenNotEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ <>", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenGreaterThan(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ >", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ >=", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenLessThan(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ <", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ <=", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenLike(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ like", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenNotLike(String value) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ not like", value, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenIn(List<String> values) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ in", values, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenNotIn(List<String> values) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ not in", values, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ between", value1, value2, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiChengBenNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_shi_ji_cheng_ben_ not between", value1, value2, "leiJiShuShiJiChengBen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEIsNull() {
            addCriterion("lei_ji_shu_jiang_di_e_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEIsNotNull() {
            addCriterion("lei_ji_shu_jiang_di_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ =", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiENotEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ <>", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEGreaterThan(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ >", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ >=", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiELessThan(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ <", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiELessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ <=", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiELike(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ like", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiENotLike(String value) {
            addCriterion("lei_ji_shu_jiang_di_e_ not like", value, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEIn(List<String> values) {
            addCriterion("lei_ji_shu_jiang_di_e_ in", values, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiENotIn(List<String> values) {
            addCriterion("lei_ji_shu_jiang_di_e_ not in", values, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiEBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_jiang_di_e_ between", value1, value2, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiENotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_jiang_di_e_ not between", value1, value2, "leiJiShuJiangDiE");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvIsNull() {
            addCriterion("lei_ji_shu_jiang_di_lv_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvIsNotNull() {
            addCriterion("lei_ji_shu_jiang_di_lv_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ =", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvNotEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ <>", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvGreaterThan(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ >", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ >=", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvLessThan(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ <", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ <=", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvLike(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ like", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvNotLike(String value) {
            addCriterion("lei_ji_shu_jiang_di_lv_ not like", value, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvIn(List<String> values) {
            addCriterion("lei_ji_shu_jiang_di_lv_ in", values, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvNotIn(List<String> values) {
            addCriterion("lei_ji_shu_jiang_di_lv_ not in", values, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_jiang_di_lv_ between", value1, value2, "leiJiShuJiangDiLv");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuJiangDiLvNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_jiang_di_lv_ not between", value1, value2, "leiJiShuJiangDiLv");
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