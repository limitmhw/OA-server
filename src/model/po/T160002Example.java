package model.po;

import java.util.ArrayList;
import java.util.List;

public class T160002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T160002Example() {
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

        public Criteria andNaRongFanWeiMiaoShuIsNull() {
            addCriterion("na_rong_fan_wei_miao_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuIsNotNull() {
            addCriterion("na_rong_fan_wei_miao_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ =", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ <>", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuGreaterThan(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ >", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuGreaterThanOrEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ >=", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuLessThan(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ <", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuLessThanOrEqualTo(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ <=", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuLike(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ like", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotLike(String value) {
            addCriterion("na_rong_fan_wei_miao_shu_ not like", value, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuIn(List<String> values) {
            addCriterion("na_rong_fan_wei_miao_shu_ in", values, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotIn(List<String> values) {
            addCriterion("na_rong_fan_wei_miao_shu_ not in", values, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuBetween(String value1, String value2) {
            addCriterion("na_rong_fan_wei_miao_shu_ between", value1, value2, "naRongFanWeiMiaoShu");
            return (Criteria) this;
        }

        public Criteria andNaRongFanWeiMiaoShuNotBetween(String value1, String value2) {
            addCriterion("na_rong_fan_wei_miao_shu_ not between", value1, value2, "naRongFanWeiMiaoShu");
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

        public Criteria andJiHuaChengBenIsNull() {
            addCriterion("ji_hua_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenIsNotNull() {
            addCriterion("ji_hua_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenEqualTo(String value) {
            addCriterion("ji_hua_cheng_ben_ =", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenNotEqualTo(String value) {
            addCriterion("ji_hua_cheng_ben_ <>", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenGreaterThan(String value) {
            addCriterion("ji_hua_cheng_ben_ >", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("ji_hua_cheng_ben_ >=", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenLessThan(String value) {
            addCriterion("ji_hua_cheng_ben_ <", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenLessThanOrEqualTo(String value) {
            addCriterion("ji_hua_cheng_ben_ <=", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenLike(String value) {
            addCriterion("ji_hua_cheng_ben_ like", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenNotLike(String value) {
            addCriterion("ji_hua_cheng_ben_ not like", value, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenIn(List<String> values) {
            addCriterion("ji_hua_cheng_ben_ in", values, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenNotIn(List<String> values) {
            addCriterion("ji_hua_cheng_ben_ not in", values, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenBetween(String value1, String value2) {
            addCriterion("ji_hua_cheng_ben_ between", value1, value2, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andJiHuaChengBenNotBetween(String value1, String value2) {
            addCriterion("ji_hua_cheng_ben_ not between", value1, value2, "jiHuaChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenIsNull() {
            addCriterion("guo_cheng_cheng_ben_ is null");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenIsNotNull() {
            addCriterion("guo_cheng_cheng_ben_ is not null");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenEqualTo(String value) {
            addCriterion("guo_cheng_cheng_ben_ =", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenNotEqualTo(String value) {
            addCriterion("guo_cheng_cheng_ben_ <>", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenGreaterThan(String value) {
            addCriterion("guo_cheng_cheng_ben_ >", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenGreaterThanOrEqualTo(String value) {
            addCriterion("guo_cheng_cheng_ben_ >=", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenLessThan(String value) {
            addCriterion("guo_cheng_cheng_ben_ <", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenLessThanOrEqualTo(String value) {
            addCriterion("guo_cheng_cheng_ben_ <=", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenLike(String value) {
            addCriterion("guo_cheng_cheng_ben_ like", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenNotLike(String value) {
            addCriterion("guo_cheng_cheng_ben_ not like", value, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenIn(List<String> values) {
            addCriterion("guo_cheng_cheng_ben_ in", values, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenNotIn(List<String> values) {
            addCriterion("guo_cheng_cheng_ben_ not in", values, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenBetween(String value1, String value2) {
            addCriterion("guo_cheng_cheng_ben_ between", value1, value2, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andGuoChengChengBenNotBetween(String value1, String value2) {
            addCriterion("guo_cheng_cheng_ben_ not between", value1, value2, "guoChengChengBen");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEIsNull() {
            addCriterion("jie_chao_jin_e_ is null");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEIsNotNull() {
            addCriterion("jie_chao_jin_e_ is not null");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEEqualTo(String value) {
            addCriterion("jie_chao_jin_e_ =", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinENotEqualTo(String value) {
            addCriterion("jie_chao_jin_e_ <>", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEGreaterThan(String value) {
            addCriterion("jie_chao_jin_e_ >", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEGreaterThanOrEqualTo(String value) {
            addCriterion("jie_chao_jin_e_ >=", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinELessThan(String value) {
            addCriterion("jie_chao_jin_e_ <", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinELessThanOrEqualTo(String value) {
            addCriterion("jie_chao_jin_e_ <=", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinELike(String value) {
            addCriterion("jie_chao_jin_e_ like", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinENotLike(String value) {
            addCriterion("jie_chao_jin_e_ not like", value, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEIn(List<String> values) {
            addCriterion("jie_chao_jin_e_ in", values, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinENotIn(List<String> values) {
            addCriterion("jie_chao_jin_e_ not in", values, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinEBetween(String value1, String value2) {
            addCriterion("jie_chao_jin_e_ between", value1, value2, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoJinENotBetween(String value1, String value2) {
            addCriterion("jie_chao_jin_e_ not between", value1, value2, "jieChaoJinE");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiIsNull() {
            addCriterion("jie_chao_bi_li_ is null");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiIsNotNull() {
            addCriterion("jie_chao_bi_li_ is not null");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiEqualTo(String value) {
            addCriterion("jie_chao_bi_li_ =", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiNotEqualTo(String value) {
            addCriterion("jie_chao_bi_li_ <>", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiGreaterThan(String value) {
            addCriterion("jie_chao_bi_li_ >", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiGreaterThanOrEqualTo(String value) {
            addCriterion("jie_chao_bi_li_ >=", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiLessThan(String value) {
            addCriterion("jie_chao_bi_li_ <", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiLessThanOrEqualTo(String value) {
            addCriterion("jie_chao_bi_li_ <=", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiLike(String value) {
            addCriterion("jie_chao_bi_li_ like", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiNotLike(String value) {
            addCriterion("jie_chao_bi_li_ not like", value, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiIn(List<String> values) {
            addCriterion("jie_chao_bi_li_ in", values, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiNotIn(List<String> values) {
            addCriterion("jie_chao_bi_li_ not in", values, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiBetween(String value1, String value2) {
            addCriterion("jie_chao_bi_li_ between", value1, value2, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoBiLiNotBetween(String value1, String value2) {
            addCriterion("jie_chao_bi_li_ not between", value1, value2, "jieChaoBiLi");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangIsNull() {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ is null");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangIsNotNull() {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ is not null");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ =", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangNotEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ <>", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangGreaterThan(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ >", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangGreaterThanOrEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ >=", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangLessThan(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ <", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangLessThanOrEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ <=", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangLike(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ like", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangNotLike(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ not like", value, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangIn(List<String> values) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ in", values, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangNotIn(List<String> values) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ not in", values, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangBetween(String value1, String value2) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ between", value1, value2, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiShuLiangNotBetween(String value1, String value2) {
            addCriterion("jie_chao_yin_su_fen_xi_shu_liang_ not between", value1, value2, "jieChaoYinSuFenXiShuLiang");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeIsNull() {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ is null");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeIsNotNull() {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ is not null");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ =", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeNotEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ <>", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeGreaterThan(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ >", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeGreaterThanOrEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ >=", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeLessThan(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ <", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeLessThanOrEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ <=", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeLike(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ like", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeNotLike(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ not like", value, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeIn(List<String> values) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ in", values, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeNotIn(List<String> values) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ not in", values, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeBetween(String value1, String value2) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ between", value1, value2, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiJiaGeNotBetween(String value1, String value2) {
            addCriterion("jie_chao_yin_su_fen_xi_jia_ge_ not between", value1, value2, "jieChaoYinSuFenXiJiaGe");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaIsNull() {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ is null");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaIsNotNull() {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ is not null");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ =", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaNotEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ <>", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaGreaterThan(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ >", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaGreaterThanOrEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ >=", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaLessThan(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ <", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaLessThanOrEqualTo(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ <=", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaLike(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ like", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaNotLike(String value) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ not like", value, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaIn(List<String> values) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ in", values, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaNotIn(List<String> values) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ not in", values, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaBetween(String value1, String value2) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ between", value1, value2, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andJieChaoYinSuFenXiQiTaNotBetween(String value1, String value2) {
            addCriterion("jie_chao_yin_su_fen_xi_qi_ta_ not between", value1, value2, "jieChaoYinSuFenXiQiTa");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiIsNull() {
            addCriterion("zhuang_tai_ is null");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiIsNotNull() {
            addCriterion("zhuang_tai_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiEqualTo(String value) {
            addCriterion("zhuang_tai_ =", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiNotEqualTo(String value) {
            addCriterion("zhuang_tai_ <>", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiGreaterThan(String value) {
            addCriterion("zhuang_tai_ >", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiGreaterThanOrEqualTo(String value) {
            addCriterion("zhuang_tai_ >=", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiLessThan(String value) {
            addCriterion("zhuang_tai_ <", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiLessThanOrEqualTo(String value) {
            addCriterion("zhuang_tai_ <=", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiLike(String value) {
            addCriterion("zhuang_tai_ like", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiNotLike(String value) {
            addCriterion("zhuang_tai_ not like", value, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiIn(List<String> values) {
            addCriterion("zhuang_tai_ in", values, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiNotIn(List<String> values) {
            addCriterion("zhuang_tai_ not in", values, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiBetween(String value1, String value2) {
            addCriterion("zhuang_tai_ between", value1, value2, "zhuangTai");
            return (Criteria) this;
        }

        public Criteria andZhuangTaiNotBetween(String value1, String value2) {
            addCriterion("zhuang_tai_ not between", value1, value2, "zhuangTai");
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