package model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YongHuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YongHuExample() {
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

        public Criteria andYongHuMingIsNull() {
            addCriterion("yong_hu_ming_ is null");
            return (Criteria) this;
        }

        public Criteria andYongHuMingIsNotNull() {
            addCriterion("yong_hu_ming_ is not null");
            return (Criteria) this;
        }

        public Criteria andYongHuMingEqualTo(String value) {
            addCriterion("yong_hu_ming_ =", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingNotEqualTo(String value) {
            addCriterion("yong_hu_ming_ <>", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingGreaterThan(String value) {
            addCriterion("yong_hu_ming_ >", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingGreaterThanOrEqualTo(String value) {
            addCriterion("yong_hu_ming_ >=", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingLessThan(String value) {
            addCriterion("yong_hu_ming_ <", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingLessThanOrEqualTo(String value) {
            addCriterion("yong_hu_ming_ <=", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingLike(String value) {
            addCriterion("yong_hu_ming_ like", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingNotLike(String value) {
            addCriterion("yong_hu_ming_ not like", value, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingIn(List<String> values) {
            addCriterion("yong_hu_ming_ in", values, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingNotIn(List<String> values) {
            addCriterion("yong_hu_ming_ not in", values, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingBetween(String value1, String value2) {
            addCriterion("yong_hu_ming_ between", value1, value2, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andYongHuMingNotBetween(String value1, String value2) {
            addCriterion("yong_hu_ming_ not between", value1, value2, "yongHuMing");
            return (Criteria) this;
        }

        public Criteria andMiMaIsNull() {
            addCriterion("mi_ma_ is null");
            return (Criteria) this;
        }

        public Criteria andMiMaIsNotNull() {
            addCriterion("mi_ma_ is not null");
            return (Criteria) this;
        }

        public Criteria andMiMaEqualTo(String value) {
            addCriterion("mi_ma_ =", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaNotEqualTo(String value) {
            addCriterion("mi_ma_ <>", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaGreaterThan(String value) {
            addCriterion("mi_ma_ >", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaGreaterThanOrEqualTo(String value) {
            addCriterion("mi_ma_ >=", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaLessThan(String value) {
            addCriterion("mi_ma_ <", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaLessThanOrEqualTo(String value) {
            addCriterion("mi_ma_ <=", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaLike(String value) {
            addCriterion("mi_ma_ like", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaNotLike(String value) {
            addCriterion("mi_ma_ not like", value, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaIn(List<String> values) {
            addCriterion("mi_ma_ in", values, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaNotIn(List<String> values) {
            addCriterion("mi_ma_ not in", values, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaBetween(String value1, String value2) {
            addCriterion("mi_ma_ between", value1, value2, "miMa");
            return (Criteria) this;
        }

        public Criteria andMiMaNotBetween(String value1, String value2) {
            addCriterion("mi_ma_ not between", value1, value2, "miMa");
            return (Criteria) this;
        }

        public Criteria andXingMingIsNull() {
            addCriterion("xing_ming_ is null");
            return (Criteria) this;
        }

        public Criteria andXingMingIsNotNull() {
            addCriterion("xing_ming_ is not null");
            return (Criteria) this;
        }

        public Criteria andXingMingEqualTo(String value) {
            addCriterion("xing_ming_ =", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingNotEqualTo(String value) {
            addCriterion("xing_ming_ <>", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingGreaterThan(String value) {
            addCriterion("xing_ming_ >", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingGreaterThanOrEqualTo(String value) {
            addCriterion("xing_ming_ >=", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingLessThan(String value) {
            addCriterion("xing_ming_ <", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingLessThanOrEqualTo(String value) {
            addCriterion("xing_ming_ <=", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingLike(String value) {
            addCriterion("xing_ming_ like", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingNotLike(String value) {
            addCriterion("xing_ming_ not like", value, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingIn(List<String> values) {
            addCriterion("xing_ming_ in", values, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingNotIn(List<String> values) {
            addCriterion("xing_ming_ not in", values, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingBetween(String value1, String value2) {
            addCriterion("xing_ming_ between", value1, value2, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingMingNotBetween(String value1, String value2) {
            addCriterion("xing_ming_ not between", value1, value2, "xingMing");
            return (Criteria) this;
        }

        public Criteria andXingBieIsNull() {
            addCriterion("xing_bie_ is null");
            return (Criteria) this;
        }

        public Criteria andXingBieIsNotNull() {
            addCriterion("xing_bie_ is not null");
            return (Criteria) this;
        }

        public Criteria andXingBieEqualTo(String value) {
            addCriterion("xing_bie_ =", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotEqualTo(String value) {
            addCriterion("xing_bie_ <>", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieGreaterThan(String value) {
            addCriterion("xing_bie_ >", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieGreaterThanOrEqualTo(String value) {
            addCriterion("xing_bie_ >=", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLessThan(String value) {
            addCriterion("xing_bie_ <", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLessThanOrEqualTo(String value) {
            addCriterion("xing_bie_ <=", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieLike(String value) {
            addCriterion("xing_bie_ like", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotLike(String value) {
            addCriterion("xing_bie_ not like", value, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieIn(List<String> values) {
            addCriterion("xing_bie_ in", values, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotIn(List<String> values) {
            addCriterion("xing_bie_ not in", values, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieBetween(String value1, String value2) {
            addCriterion("xing_bie_ between", value1, value2, "xingBie");
            return (Criteria) this;
        }

        public Criteria andXingBieNotBetween(String value1, String value2) {
            addCriterion("xing_bie_ not between", value1, value2, "xingBie");
            return (Criteria) this;
        }

        public Criteria andMinZuIsNull() {
            addCriterion("min_zu_ is null");
            return (Criteria) this;
        }

        public Criteria andMinZuIsNotNull() {
            addCriterion("min_zu_ is not null");
            return (Criteria) this;
        }

        public Criteria andMinZuEqualTo(String value) {
            addCriterion("min_zu_ =", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotEqualTo(String value) {
            addCriterion("min_zu_ <>", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuGreaterThan(String value) {
            addCriterion("min_zu_ >", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuGreaterThanOrEqualTo(String value) {
            addCriterion("min_zu_ >=", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuLessThan(String value) {
            addCriterion("min_zu_ <", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuLessThanOrEqualTo(String value) {
            addCriterion("min_zu_ <=", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuLike(String value) {
            addCriterion("min_zu_ like", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotLike(String value) {
            addCriterion("min_zu_ not like", value, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuIn(List<String> values) {
            addCriterion("min_zu_ in", values, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotIn(List<String> values) {
            addCriterion("min_zu_ not in", values, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuBetween(String value1, String value2) {
            addCriterion("min_zu_ between", value1, value2, "minZu");
            return (Criteria) this;
        }

        public Criteria andMinZuNotBetween(String value1, String value2) {
            addCriterion("min_zu_ not between", value1, value2, "minZu");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaIsNull() {
            addCriterion("shen_fen_zheng_hao_ma_ is null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaIsNotNull() {
            addCriterion("shen_fen_zheng_hao_ma_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaEqualTo(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ =", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaNotEqualTo(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ <>", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaGreaterThan(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ >", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaGreaterThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ >=", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaLessThan(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ <", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaLessThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ <=", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaLike(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ like", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaNotLike(String value) {
            addCriterion("shen_fen_zheng_hao_ma_ not like", value, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaIn(List<String> values) {
            addCriterion("shen_fen_zheng_hao_ma_ in", values, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaNotIn(List<String> values) {
            addCriterion("shen_fen_zheng_hao_ma_ not in", values, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_hao_ma_ between", value1, value2, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengHaoMaNotBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_hao_ma_ not between", value1, value2, "shenFenZhengHaoMa");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengIsNull() {
            addCriterion("shen_fen_zheng_zhao_zheng_ is null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengIsNotNull() {
            addCriterion("shen_fen_zheng_zhao_zheng_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ =", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengNotEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ <>", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengGreaterThan(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ >", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengGreaterThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ >=", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengLessThan(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ <", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengLessThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ <=", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengLike(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ like", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengNotLike(String value) {
            addCriterion("shen_fen_zheng_zhao_zheng_ not like", value, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengIn(List<String> values) {
            addCriterion("shen_fen_zheng_zhao_zheng_ in", values, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengNotIn(List<String> values) {
            addCriterion("shen_fen_zheng_zhao_zheng_ not in", values, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_zhao_zheng_ between", value1, value2, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoZhengNotBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_zhao_zheng_ not between", value1, value2, "shenFenZhengZhaoZheng");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanIsNull() {
            addCriterion("shen_fen_zheng_zhao_fan_ is null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanIsNotNull() {
            addCriterion("shen_fen_zheng_zhao_fan_ is not null");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ =", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanNotEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ <>", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanGreaterThan(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ >", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanGreaterThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ >=", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanLessThan(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ <", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanLessThanOrEqualTo(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ <=", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanLike(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ like", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanNotLike(String value) {
            addCriterion("shen_fen_zheng_zhao_fan_ not like", value, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanIn(List<String> values) {
            addCriterion("shen_fen_zheng_zhao_fan_ in", values, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanNotIn(List<String> values) {
            addCriterion("shen_fen_zheng_zhao_fan_ not in", values, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_zhao_fan_ between", value1, value2, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andShenFenZhengZhaoFanNotBetween(String value1, String value2) {
            addCriterion("shen_fen_zheng_zhao_fan_ not between", value1, value2, "shenFenZhengZhaoFan");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiIsNull() {
            addCriterion("jia_ting_zhu_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiIsNotNull() {
            addCriterion("jia_ting_zhu_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiEqualTo(String value) {
            addCriterion("jia_ting_zhu_zhi_ =", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiNotEqualTo(String value) {
            addCriterion("jia_ting_zhu_zhi_ <>", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiGreaterThan(String value) {
            addCriterion("jia_ting_zhu_zhi_ >", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiGreaterThanOrEqualTo(String value) {
            addCriterion("jia_ting_zhu_zhi_ >=", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiLessThan(String value) {
            addCriterion("jia_ting_zhu_zhi_ <", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiLessThanOrEqualTo(String value) {
            addCriterion("jia_ting_zhu_zhi_ <=", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiLike(String value) {
            addCriterion("jia_ting_zhu_zhi_ like", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiNotLike(String value) {
            addCriterion("jia_ting_zhu_zhi_ not like", value, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiIn(List<String> values) {
            addCriterion("jia_ting_zhu_zhi_ in", values, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiNotIn(List<String> values) {
            addCriterion("jia_ting_zhu_zhi_ not in", values, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiBetween(String value1, String value2) {
            addCriterion("jia_ting_zhu_zhi_ between", value1, value2, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andJiaTingZhuZhiNotBetween(String value1, String value2) {
            addCriterion("jia_ting_zhu_zhi_ not between", value1, value2, "jiaTingZhuZhi");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoIsNull() {
            addCriterion("lao_dong_he_tong_bian_hao_ is null");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoIsNotNull() {
            addCriterion("lao_dong_he_tong_bian_hao_ is not null");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoEqualTo(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ =", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoNotEqualTo(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ <>", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoGreaterThan(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ >", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoGreaterThanOrEqualTo(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ >=", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoLessThan(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ <", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoLessThanOrEqualTo(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ <=", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoLike(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ like", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoNotLike(String value) {
            addCriterion("lao_dong_he_tong_bian_hao_ not like", value, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoIn(List<String> values) {
            addCriterion("lao_dong_he_tong_bian_hao_ in", values, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoNotIn(List<String> values) {
            addCriterion("lao_dong_he_tong_bian_hao_ not in", values, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoBetween(String value1, String value2) {
            addCriterion("lao_dong_he_tong_bian_hao_ between", value1, value2, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andLaoDongHeTongBianHaoNotBetween(String value1, String value2) {
            addCriterion("lao_dong_he_tong_bian_hao_ not between", value1, value2, "laoDongHeTongBianHao");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsIsNull() {
            addCriterion("zheng_jian_zhao_ids_ is null");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsIsNotNull() {
            addCriterion("zheng_jian_zhao_ids_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsEqualTo(String value) {
            addCriterion("zheng_jian_zhao_ids_ =", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsNotEqualTo(String value) {
            addCriterion("zheng_jian_zhao_ids_ <>", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsGreaterThan(String value) {
            addCriterion("zheng_jian_zhao_ids_ >", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsGreaterThanOrEqualTo(String value) {
            addCriterion("zheng_jian_zhao_ids_ >=", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsLessThan(String value) {
            addCriterion("zheng_jian_zhao_ids_ <", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsLessThanOrEqualTo(String value) {
            addCriterion("zheng_jian_zhao_ids_ <=", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsLike(String value) {
            addCriterion("zheng_jian_zhao_ids_ like", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsNotLike(String value) {
            addCriterion("zheng_jian_zhao_ids_ not like", value, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsIn(List<String> values) {
            addCriterion("zheng_jian_zhao_ids_ in", values, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsNotIn(List<String> values) {
            addCriterion("zheng_jian_zhao_ids_ not in", values, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsBetween(String value1, String value2) {
            addCriterion("zheng_jian_zhao_ids_ between", value1, value2, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andZhengJianZhaoIdsNotBetween(String value1, String value2) {
            addCriterion("zheng_jian_zhao_ids_ not between", value1, value2, "zhengJianZhaoIds");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuIsNull() {
            addCriterion("suo_shu_yong_hu_zu_ is null");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuIsNotNull() {
            addCriterion("suo_shu_yong_hu_zu_ is not null");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuEqualTo(Integer value) {
            addCriterion("suo_shu_yong_hu_zu_ =", value, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuNotEqualTo(Integer value) {
            addCriterion("suo_shu_yong_hu_zu_ <>", value, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuGreaterThan(Integer value) {
            addCriterion("suo_shu_yong_hu_zu_ >", value, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuGreaterThanOrEqualTo(Integer value) {
            addCriterion("suo_shu_yong_hu_zu_ >=", value, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuLessThan(Integer value) {
            addCriterion("suo_shu_yong_hu_zu_ <", value, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuLessThanOrEqualTo(Integer value) {
            addCriterion("suo_shu_yong_hu_zu_ <=", value, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuIn(List<Integer> values) {
            addCriterion("suo_shu_yong_hu_zu_ in", values, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuNotIn(List<Integer> values) {
            addCriterion("suo_shu_yong_hu_zu_ not in", values, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuBetween(Integer value1, Integer value2) {
            addCriterion("suo_shu_yong_hu_zu_ between", value1, value2, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andSuoShuYongHuZuNotBetween(Integer value1, Integer value2) {
            addCriterion("suo_shu_yong_hu_zu_ not between", value1, value2, "suoShuYongHuZu");
            return (Criteria) this;
        }

        public Criteria andBiaoQianIsNull() {
            addCriterion("biao_qian_ is null");
            return (Criteria) this;
        }

        public Criteria andBiaoQianIsNotNull() {
            addCriterion("biao_qian_ is not null");
            return (Criteria) this;
        }

        public Criteria andBiaoQianEqualTo(Integer value) {
            addCriterion("biao_qian_ =", value, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianNotEqualTo(Integer value) {
            addCriterion("biao_qian_ <>", value, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianGreaterThan(Integer value) {
            addCriterion("biao_qian_ >", value, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianGreaterThanOrEqualTo(Integer value) {
            addCriterion("biao_qian_ >=", value, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianLessThan(Integer value) {
            addCriterion("biao_qian_ <", value, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianLessThanOrEqualTo(Integer value) {
            addCriterion("biao_qian_ <=", value, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianIn(List<Integer> values) {
            addCriterion("biao_qian_ in", values, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianNotIn(List<Integer> values) {
            addCriterion("biao_qian_ not in", values, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianBetween(Integer value1, Integer value2) {
            addCriterion("biao_qian_ between", value1, value2, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andBiaoQianNotBetween(Integer value1, Integer value2) {
            addCriterion("biao_qian_ not between", value1, value2, "biaoQian");
            return (Criteria) this;
        }

        public Criteria andQiYeIsNull() {
            addCriterion("qi_ye_ is null");
            return (Criteria) this;
        }

        public Criteria andQiYeIsNotNull() {
            addCriterion("qi_ye_ is not null");
            return (Criteria) this;
        }

        public Criteria andQiYeEqualTo(Integer value) {
            addCriterion("qi_ye_ =", value, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeNotEqualTo(Integer value) {
            addCriterion("qi_ye_ <>", value, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeGreaterThan(Integer value) {
            addCriterion("qi_ye_ >", value, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeGreaterThanOrEqualTo(Integer value) {
            addCriterion("qi_ye_ >=", value, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeLessThan(Integer value) {
            addCriterion("qi_ye_ <", value, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeLessThanOrEqualTo(Integer value) {
            addCriterion("qi_ye_ <=", value, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeIn(List<Integer> values) {
            addCriterion("qi_ye_ in", values, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeNotIn(List<Integer> values) {
            addCriterion("qi_ye_ not in", values, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeBetween(Integer value1, Integer value2) {
            addCriterion("qi_ye_ between", value1, value2, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQiYeNotBetween(Integer value1, Integer value2) {
            addCriterion("qi_ye_ not between", value1, value2, "qiYe");
            return (Criteria) this;
        }

        public Criteria andQuanXianIsNull() {
            addCriterion("quan_xian_ is null");
            return (Criteria) this;
        }

        public Criteria andQuanXianIsNotNull() {
            addCriterion("quan_xian_ is not null");
            return (Criteria) this;
        }

        public Criteria andQuanXianEqualTo(Integer value) {
            addCriterion("quan_xian_ =", value, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianNotEqualTo(Integer value) {
            addCriterion("quan_xian_ <>", value, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianGreaterThan(Integer value) {
            addCriterion("quan_xian_ >", value, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianGreaterThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_ >=", value, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianLessThan(Integer value) {
            addCriterion("quan_xian_ <", value, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianLessThanOrEqualTo(Integer value) {
            addCriterion("quan_xian_ <=", value, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianIn(List<Integer> values) {
            addCriterion("quan_xian_ in", values, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianNotIn(List<Integer> values) {
            addCriterion("quan_xian_ not in", values, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_ between", value1, value2, "quanXian");
            return (Criteria) this;
        }

        public Criteria andQuanXianNotBetween(Integer value1, Integer value2) {
            addCriterion("quan_xian_ not between", value1, value2, "quanXian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianIsNull() {
            addCriterion("zhu_ce_shi_jian_ is null");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianIsNotNull() {
            addCriterion("zhu_ce_shi_jian_ is not null");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianEqualTo(Date value) {
            addCriterion("zhu_ce_shi_jian_ =", value, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianNotEqualTo(Date value) {
            addCriterion("zhu_ce_shi_jian_ <>", value, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianGreaterThan(Date value) {
            addCriterion("zhu_ce_shi_jian_ >", value, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianGreaterThanOrEqualTo(Date value) {
            addCriterion("zhu_ce_shi_jian_ >=", value, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianLessThan(Date value) {
            addCriterion("zhu_ce_shi_jian_ <", value, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianLessThanOrEqualTo(Date value) {
            addCriterion("zhu_ce_shi_jian_ <=", value, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianIn(List<Date> values) {
            addCriterion("zhu_ce_shi_jian_ in", values, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianNotIn(List<Date> values) {
            addCriterion("zhu_ce_shi_jian_ not in", values, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianBetween(Date value1, Date value2) {
            addCriterion("zhu_ce_shi_jian_ between", value1, value2, "zhuCeShiJian");
            return (Criteria) this;
        }

        public Criteria andZhuCeShiJianNotBetween(Date value1, Date value2) {
            addCriterion("zhu_ce_shi_jian_ not between", value1, value2, "zhuCeShiJian");
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