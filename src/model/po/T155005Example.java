package model.po;

import java.util.ArrayList;
import java.util.List;

public class T155005Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T155005Example() {
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

        public Criteria andChengBenBianHaoIsNull() {
            addCriterion("cheng_ben_bian_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoIsNotNull() {
            addCriterion("cheng_ben_bian_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoEqualTo(String value) {
            addCriterion("cheng_ben_bian_hao_ =", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoNotEqualTo(String value) {
            addCriterion("cheng_ben_bian_hao_ <>", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoGreaterThan(String value) {
            addCriterion("cheng_ben_bian_hao_ >", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_bian_hao_ >=", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoLessThan(String value) {
            addCriterion("cheng_ben_bian_hao_ <", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_bian_hao_ <=", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoLike(String value) {
            addCriterion("cheng_ben_bian_hao_ like", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoNotLike(String value) {
            addCriterion("cheng_ben_bian_hao_ not like", value, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoIn(List<String> values) {
            addCriterion("cheng_ben_bian_hao_ in", values, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoNotIn(List<String> values) {
            addCriterion("cheng_ben_bian_hao_ not in", values, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoBetween(String value1, String value2) {
            addCriterion("cheng_ben_bian_hao_ between", value1, value2, "chengBenBianHao");
            return (Criteria) this;
        }

        public Criteria andChengBenBianHaoNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_bian_hao_ not between", value1, value2, "chengBenBianHao");
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

        public Criteria andYuSuanChengBenIsNull() {
            addCriterion("yu_suan_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenIsNotNull() {
            addCriterion("yu_suan_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ =", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ <>", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenGreaterThan(String value) {
            addCriterion("yu_suan_cheng_ben_ >", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ >=", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenLessThan(String value) {
            addCriterion("yu_suan_cheng_ben_ <", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenLessThanOrEqualTo(String value) {
            addCriterion("yu_suan_cheng_ben_ <=", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenLike(String value) {
            addCriterion("yu_suan_cheng_ben_ like", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotLike(String value) {
            addCriterion("yu_suan_cheng_ben_ not like", value, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenIn(List<String> values) {
            addCriterion("yu_suan_cheng_ben_ in", values, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotIn(List<String> values) {
            addCriterion("yu_suan_cheng_ben_ not in", values, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenBetween(String value1, String value2) {
            addCriterion("yu_suan_cheng_ben_ between", value1, value2, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andYuSuanChengBenNotBetween(String value1, String value2) {
            addCriterion("yu_suan_cheng_ben_ not between", value1, value2, "yuSuanChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenIsNull() {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenIsNotNull() {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenEqualTo(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ =", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenNotEqualTo(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ <>", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenGreaterThan(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ >", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ >=", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenLessThan(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ <", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenLessThanOrEqualTo(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ <=", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenLike(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ like", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenNotLike(String value) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ not like", value, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenIn(List<String> values) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ in", values, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenNotIn(List<String> values) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ not in", values, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenBetween(String value1, String value2) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ between", value1, value2, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andZhiQiMoYiFaShengChengBenNotBetween(String value1, String value2) {
            addCriterion("zhi_qi_mo_yi_fa_sheng_cheng_ben_ not between", value1, value2, "zhiQiMoYiFaShengChengBen");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianIsNull() {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianIsNotNull() {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ =", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianNotEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ <>", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianGreaterThan(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ >", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ >=", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianLessThan(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ <", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ <=", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianLike(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ like", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianNotLike(String value) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ not like", value, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ in", values, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianNotIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ not in", values, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ between", value1, value2, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianZongYuSuanShiJianNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_zong_yu_suan_shi_jian_ not between", value1, value2, "chengBenShiJianZongYuSuanShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianIsNull() {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianIsNotNull() {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ =", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianNotEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ <>", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianGreaterThan(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ >", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ >=", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianLessThan(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ <", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ <=", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianLike(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ like", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianNotLike(String value) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ not like", value, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ in", values, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianNotIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ not in", values, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ between", value1, value2, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYiFaShengShiJianNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_yi_fa_sheng_shi_jian_ not between", value1, value2, "chengBenShiJianYiFaShengShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianIsNull() {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianIsNotNull() {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ =", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianNotEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ <>", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianGreaterThan(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ >", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ >=", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianLessThan(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ <", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ <=", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianLike(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ like", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianNotLike(String value) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ not like", value, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ in", values, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianNotIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ not in", values, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ between", value1, value2, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianYuSuanShengYuShiJianNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_yu_suan_sheng_yu_shi_jian_ not between", value1, value2, "chengBenShiJianYuSuanShengYuShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianIsNull() {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianIsNotNull() {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ =", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianNotEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ <>", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianGreaterThan(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ >", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ >=", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianLessThan(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ <", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ <=", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianLike(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ like", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianNotLike(String value) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ not like", value, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ in", values, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianNotIn(List<String> values) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ not in", values, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ between", value1, value2, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andChengBenShiJianHuaiXuYaoShiJianNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_shi_jian_huai_xu_yao_shi_jian_ not between", value1, value2, "chengBenShiJianHuaiXuYaoShiJian");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuIsNull() {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuIsNotNull() {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ =", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuNotEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ <>", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuGreaterThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ >", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ >=", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuLessThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ <", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuLessThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ <=", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ like", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuNotLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ not like", value, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ in", values, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuNotIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ not in", values, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ between", value1, value2, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuYueDuYuKongShuNotBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_yue_du_yu_kong_shu_ not between", value1, value2, "shengYuChengBenYuKongShuYueDuYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuIsNull() {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuIsNotNull() {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ =", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuNotEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ <>", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuGreaterThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ >", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ >=", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuLessThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ <", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuLessThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ <=", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ like", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuNotLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ not like", value, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ in", values, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuNotIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ not in", values, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ between", value1, value2, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuKongShuZongYuKongShuNotBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_kong_shu_zong_yu_kong_shu_ not between", value1, value2, "shengYuChengBenYuKongShuZongYuKongShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuIsNull() {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuIsNotNull() {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ =", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuNotEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ <>", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuGreaterThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ >", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ >=", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuLessThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ <", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuLessThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ <=", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ like", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuNotLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ not like", value, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ in", values, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuNotIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ not in", values, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ between", value1, value2, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuYueDuYuCeShuNotBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_yue_du_yu_ce_shu_ not between", value1, value2, "shengYuChengBenYuCeShuYueDuYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuIsNull() {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuIsNotNull() {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ =", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuNotEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ <>", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuGreaterThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ >", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ >=", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuLessThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ <", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuLessThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ <=", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ like", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuNotLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ not like", value, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ in", values, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuNotIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ not in", values, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ between", value1, value2, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuZongYuCeShuNotBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_zong_yu_ce_shu_ not between", value1, value2, "shengYuChengBenYuCeShuZongYuCeShu");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoIsNull() {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ is null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoIsNotNull() {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ is not null");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ =", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoNotEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ <>", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoGreaterThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ >", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoGreaterThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ >=", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoLessThan(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ <", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoLessThanOrEqualTo(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ <=", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ like", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoNotLike(String value) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ not like", value, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ in", values, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoNotIn(List<String> values) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ not in", values, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ between", value1, value2, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShengYuChengBenYuCeShuJieChaoNotBetween(String value1, String value2) {
            addCriterion("sheng_yu_cheng_ben_yu_ce_shu_jie_chao_ not between", value1, value2, "shengYuChengBenYuCeShuJieChao");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenIsNull() {
            addCriterion("shi_ji_yu_ji_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenIsNotNull() {
            addCriterion("shi_ji_yu_ji_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenEqualTo(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ =", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenNotEqualTo(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ <>", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenGreaterThan(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ >", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ >=", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenLessThan(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ <", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenLessThanOrEqualTo(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ <=", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenLike(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ like", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenNotLike(String value) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ not like", value, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenIn(List<String> values) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ in", values, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenNotIn(List<String> values) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ not in", values, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenBetween(String value1, String value2) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ between", value1, value2, "shiJiYuJiChengBen");
            return (Criteria) this;
        }

        public Criteria andShiJiYuJiChengBenNotBetween(String value1, String value2) {
            addCriterion("shi_ji_yu_ji_cheng_ben_ not between", value1, value2, "shiJiYuJiChengBen");
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