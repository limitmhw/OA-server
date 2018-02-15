package model.po;

import java.util.ArrayList;
import java.util.List;

public class T159002Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public T159002Example() {
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

        public Criteria andJiHuaXiangMuIsNull() {
            addCriterion("ji_hua_xiang_mu_ is null");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuIsNotNull() {
            addCriterion("ji_hua_xiang_mu_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ =", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ <>", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuGreaterThan(String value) {
            addCriterion("ji_hua_xiang_mu_ >", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuGreaterThanOrEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ >=", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuLessThan(String value) {
            addCriterion("ji_hua_xiang_mu_ <", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuLessThanOrEqualTo(String value) {
            addCriterion("ji_hua_xiang_mu_ <=", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuLike(String value) {
            addCriterion("ji_hua_xiang_mu_ like", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotLike(String value) {
            addCriterion("ji_hua_xiang_mu_ not like", value, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuIn(List<String> values) {
            addCriterion("ji_hua_xiang_mu_ in", values, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotIn(List<String> values) {
            addCriterion("ji_hua_xiang_mu_ not in", values, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuBetween(String value1, String value2) {
            addCriterion("ji_hua_xiang_mu_ between", value1, value2, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andJiHuaXiangMuNotBetween(String value1, String value2) {
            addCriterion("ji_hua_xiang_mu_ not between", value1, value2, "jiHuaXiangMu");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiIsNull() {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiIsNotNull() {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ =", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiNotEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ <>", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiGreaterThan(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ >", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiGreaterThanOrEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ >=", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiLessThan(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ <", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiLessThanOrEqualTo(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ <=", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiLike(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ like", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiNotLike(String value) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ not like", value, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiIn(List<String> values) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ in", values, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiNotIn(List<String> values) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ not in", values, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiBetween(String value1, String value2) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ between", value1, value2, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andChengBenJiangDiLvMuBiaoZhiNotBetween(String value1, String value2) {
            addCriterion("cheng_ben_jiang_di_lv_mu_biao_zhi_ not between", value1, value2, "chengBenJiangDiLvMuBiaoZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenIsNull() {
            addCriterion("ben_qi_shu_zong_fen_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenIsNotNull() {
            addCriterion("ben_qi_shu_zong_fen_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenEqualTo(String value) {
            addCriterion("ben_qi_shu_zong_fen_ =", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenNotEqualTo(String value) {
            addCriterion("ben_qi_shu_zong_fen_ <>", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenGreaterThan(String value) {
            addCriterion("ben_qi_shu_zong_fen_ >", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_zong_fen_ >=", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenLessThan(String value) {
            addCriterion("ben_qi_shu_zong_fen_ <", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_zong_fen_ <=", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenLike(String value) {
            addCriterion("ben_qi_shu_zong_fen_ like", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenNotLike(String value) {
            addCriterion("ben_qi_shu_zong_fen_ not like", value, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenIn(List<String> values) {
            addCriterion("ben_qi_shu_zong_fen_ in", values, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenNotIn(List<String> values) {
            addCriterion("ben_qi_shu_zong_fen_ not in", values, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_zong_fen_ between", value1, value2, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuZongFenNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_zong_fen_ not between", value1, value2, "benQiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoIsNull() {
            addCriterion("ben_qi_shu_da_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoIsNotNull() {
            addCriterion("ben_qi_shu_da_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoEqualTo(String value) {
            addCriterion("ben_qi_shu_da_biao_ =", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoNotEqualTo(String value) {
            addCriterion("ben_qi_shu_da_biao_ <>", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoGreaterThan(String value) {
            addCriterion("ben_qi_shu_da_biao_ >", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_da_biao_ >=", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoLessThan(String value) {
            addCriterion("ben_qi_shu_da_biao_ <", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_da_biao_ <=", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoLike(String value) {
            addCriterion("ben_qi_shu_da_biao_ like", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoNotLike(String value) {
            addCriterion("ben_qi_shu_da_biao_ not like", value, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoIn(List<String> values) {
            addCriterion("ben_qi_shu_da_biao_ in", values, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoNotIn(List<String> values) {
            addCriterion("ben_qi_shu_da_biao_ not in", values, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_da_biao_ between", value1, value2, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuDaBiaoNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_da_biao_ not between", value1, value2, "benQiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoIsNull() {
            addCriterion("ben_qi_shu_wei_da_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoIsNotNull() {
            addCriterion("ben_qi_shu_wei_da_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoEqualTo(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ =", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoNotEqualTo(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ <>", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoGreaterThan(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ >", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ >=", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoLessThan(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ <", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ <=", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoLike(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ like", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoNotLike(String value) {
            addCriterion("ben_qi_shu_wei_da_biao_ not like", value, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoIn(List<String> values) {
            addCriterion("ben_qi_shu_wei_da_biao_ in", values, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoNotIn(List<String> values) {
            addCriterion("ben_qi_shu_wei_da_biao_ not in", values, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_wei_da_biao_ between", value1, value2, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuWeiDaBiaoNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_wei_da_biao_ not between", value1, value2, "benQiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiIsNull() {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiIsNotNull() {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ =", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiNotEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ <>", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiGreaterThan(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ >", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiGreaterThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ >=", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiLessThan(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ <", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiLessThanOrEqualTo(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ <=", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiLike(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ like", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiNotLike(String value) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ not like", value, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiIn(List<String> values) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ in", values, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiNotIn(List<String> values) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ not in", values, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ between", value1, value2, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andBenQiShuShiJiJiaQuanPingJunZhiNotBetween(String value1, String value2) {
            addCriterion("ben_qi_shu_shi_ji_jia_quan_ping_jun_zhi_ not between", value1, value2, "benQiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenIsNull() {
            addCriterion("lei_ji_shu_zong_fen_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenIsNotNull() {
            addCriterion("lei_ji_shu_zong_fen_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenEqualTo(String value) {
            addCriterion("lei_ji_shu_zong_fen_ =", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenNotEqualTo(String value) {
            addCriterion("lei_ji_shu_zong_fen_ <>", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenGreaterThan(String value) {
            addCriterion("lei_ji_shu_zong_fen_ >", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_zong_fen_ >=", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenLessThan(String value) {
            addCriterion("lei_ji_shu_zong_fen_ <", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_zong_fen_ <=", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenLike(String value) {
            addCriterion("lei_ji_shu_zong_fen_ like", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenNotLike(String value) {
            addCriterion("lei_ji_shu_zong_fen_ not like", value, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenIn(List<String> values) {
            addCriterion("lei_ji_shu_zong_fen_ in", values, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenNotIn(List<String> values) {
            addCriterion("lei_ji_shu_zong_fen_ not in", values, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_zong_fen_ between", value1, value2, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuZongFenNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_zong_fen_ not between", value1, value2, "leiJiShuZongFen");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoIsNull() {
            addCriterion("lei_ji_shu_da_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoIsNotNull() {
            addCriterion("lei_ji_shu_da_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoEqualTo(String value) {
            addCriterion("lei_ji_shu_da_biao_ =", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoNotEqualTo(String value) {
            addCriterion("lei_ji_shu_da_biao_ <>", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoGreaterThan(String value) {
            addCriterion("lei_ji_shu_da_biao_ >", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_da_biao_ >=", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoLessThan(String value) {
            addCriterion("lei_ji_shu_da_biao_ <", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_da_biao_ <=", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoLike(String value) {
            addCriterion("lei_ji_shu_da_biao_ like", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoNotLike(String value) {
            addCriterion("lei_ji_shu_da_biao_ not like", value, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoIn(List<String> values) {
            addCriterion("lei_ji_shu_da_biao_ in", values, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoNotIn(List<String> values) {
            addCriterion("lei_ji_shu_da_biao_ not in", values, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_da_biao_ between", value1, value2, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuDaBiaoNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_da_biao_ not between", value1, value2, "leiJiShuDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoIsNull() {
            addCriterion("lei_ji_shu_wei_da_biao_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoIsNotNull() {
            addCriterion("lei_ji_shu_wei_da_biao_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoEqualTo(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ =", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoNotEqualTo(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ <>", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoGreaterThan(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ >", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ >=", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoLessThan(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ <", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ <=", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoLike(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ like", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoNotLike(String value) {
            addCriterion("lei_ji_shu_wei_da_biao_ not like", value, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoIn(List<String> values) {
            addCriterion("lei_ji_shu_wei_da_biao_ in", values, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoNotIn(List<String> values) {
            addCriterion("lei_ji_shu_wei_da_biao_ not in", values, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_wei_da_biao_ between", value1, value2, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuWeiDaBiaoNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_wei_da_biao_ not between", value1, value2, "leiJiShuWeiDaBiao");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiIsNull() {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ is null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiIsNotNull() {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ is not null");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ =", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiNotEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ <>", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiGreaterThan(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ >", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiGreaterThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ >=", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiLessThan(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ <", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiLessThanOrEqualTo(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ <=", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiLike(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ like", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiNotLike(String value) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ not like", value, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiIn(List<String> values) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ in", values, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiNotIn(List<String> values) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ not in", values, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ between", value1, value2, "leiJiShuShiJiJiaQuanPingJunZhi");
            return (Criteria) this;
        }

        public Criteria andLeiJiShuShiJiJiaQuanPingJunZhiNotBetween(String value1, String value2) {
            addCriterion("lei_ji_shu_shi_ji_jia_quan_ping_jun_zhi_ not between", value1, value2, "leiJiShuShiJiJiaQuanPingJunZhi");
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