package model.po;

import java.util.ArrayList;
import java.util.List;

public class GongChengExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GongChengExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdIsNull() {
            addCriterion("xiang_mu_id is null");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdIsNotNull() {
            addCriterion("xiang_mu_id is not null");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdEqualTo(Integer value) {
            addCriterion("xiang_mu_id =", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdNotEqualTo(Integer value) {
            addCriterion("xiang_mu_id <>", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdGreaterThan(Integer value) {
            addCriterion("xiang_mu_id >", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("xiang_mu_id >=", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdLessThan(Integer value) {
            addCriterion("xiang_mu_id <", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdLessThanOrEqualTo(Integer value) {
            addCriterion("xiang_mu_id <=", value, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdIn(List<Integer> values) {
            addCriterion("xiang_mu_id in", values, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdNotIn(List<Integer> values) {
            addCriterion("xiang_mu_id not in", values, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdBetween(Integer value1, Integer value2) {
            addCriterion("xiang_mu_id between", value1, value2, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andXiangMuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("xiang_mu_id not between", value1, value2, "xiangMuId");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengIsNull() {
            addCriterion("dan_xiang_gong_cheng_ is null");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengIsNotNull() {
            addCriterion("dan_xiang_gong_cheng_ is not null");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengEqualTo(String value) {
            addCriterion("dan_xiang_gong_cheng_ =", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengNotEqualTo(String value) {
            addCriterion("dan_xiang_gong_cheng_ <>", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengGreaterThan(String value) {
            addCriterion("dan_xiang_gong_cheng_ >", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengGreaterThanOrEqualTo(String value) {
            addCriterion("dan_xiang_gong_cheng_ >=", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengLessThan(String value) {
            addCriterion("dan_xiang_gong_cheng_ <", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengLessThanOrEqualTo(String value) {
            addCriterion("dan_xiang_gong_cheng_ <=", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengLike(String value) {
            addCriterion("dan_xiang_gong_cheng_ like", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengNotLike(String value) {
            addCriterion("dan_xiang_gong_cheng_ not like", value, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengIn(List<String> values) {
            addCriterion("dan_xiang_gong_cheng_ in", values, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengNotIn(List<String> values) {
            addCriterion("dan_xiang_gong_cheng_ not in", values, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengBetween(String value1, String value2) {
            addCriterion("dan_xiang_gong_cheng_ between", value1, value2, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andDanXiangGongChengNotBetween(String value1, String value2) {
            addCriterion("dan_xiang_gong_cheng_ not between", value1, value2, "danXiangGongCheng");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiIsNull() {
            addCriterion("gui_mo_mian_ji_ is null");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiIsNotNull() {
            addCriterion("gui_mo_mian_ji_ is not null");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiEqualTo(String value) {
            addCriterion("gui_mo_mian_ji_ =", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiNotEqualTo(String value) {
            addCriterion("gui_mo_mian_ji_ <>", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiGreaterThan(String value) {
            addCriterion("gui_mo_mian_ji_ >", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiGreaterThanOrEqualTo(String value) {
            addCriterion("gui_mo_mian_ji_ >=", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiLessThan(String value) {
            addCriterion("gui_mo_mian_ji_ <", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiLessThanOrEqualTo(String value) {
            addCriterion("gui_mo_mian_ji_ <=", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiLike(String value) {
            addCriterion("gui_mo_mian_ji_ like", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiNotLike(String value) {
            addCriterion("gui_mo_mian_ji_ not like", value, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiIn(List<String> values) {
            addCriterion("gui_mo_mian_ji_ in", values, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiNotIn(List<String> values) {
            addCriterion("gui_mo_mian_ji_ not in", values, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiBetween(String value1, String value2) {
            addCriterion("gui_mo_mian_ji_ between", value1, value2, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoMianJiNotBetween(String value1, String value2) {
            addCriterion("gui_mo_mian_ji_ not between", value1, value2, "guiMoMianJi");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuIsNull() {
            addCriterion("gui_mo_chang_du_ is null");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuIsNotNull() {
            addCriterion("gui_mo_chang_du_ is not null");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuEqualTo(String value) {
            addCriterion("gui_mo_chang_du_ =", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuNotEqualTo(String value) {
            addCriterion("gui_mo_chang_du_ <>", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuGreaterThan(String value) {
            addCriterion("gui_mo_chang_du_ >", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuGreaterThanOrEqualTo(String value) {
            addCriterion("gui_mo_chang_du_ >=", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuLessThan(String value) {
            addCriterion("gui_mo_chang_du_ <", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuLessThanOrEqualTo(String value) {
            addCriterion("gui_mo_chang_du_ <=", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuLike(String value) {
            addCriterion("gui_mo_chang_du_ like", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuNotLike(String value) {
            addCriterion("gui_mo_chang_du_ not like", value, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuIn(List<String> values) {
            addCriterion("gui_mo_chang_du_ in", values, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuNotIn(List<String> values) {
            addCriterion("gui_mo_chang_du_ not in", values, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuBetween(String value1, String value2) {
            addCriterion("gui_mo_chang_du_ between", value1, value2, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoChangDuNotBetween(String value1, String value2) {
            addCriterion("gui_mo_chang_du_ not between", value1, value2, "guiMoChangDu");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaIsNull() {
            addCriterion("gui_mo_qi_ta_ is null");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaIsNotNull() {
            addCriterion("gui_mo_qi_ta_ is not null");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaEqualTo(String value) {
            addCriterion("gui_mo_qi_ta_ =", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaNotEqualTo(String value) {
            addCriterion("gui_mo_qi_ta_ <>", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaGreaterThan(String value) {
            addCriterion("gui_mo_qi_ta_ >", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaGreaterThanOrEqualTo(String value) {
            addCriterion("gui_mo_qi_ta_ >=", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaLessThan(String value) {
            addCriterion("gui_mo_qi_ta_ <", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaLessThanOrEqualTo(String value) {
            addCriterion("gui_mo_qi_ta_ <=", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaLike(String value) {
            addCriterion("gui_mo_qi_ta_ like", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaNotLike(String value) {
            addCriterion("gui_mo_qi_ta_ not like", value, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaIn(List<String> values) {
            addCriterion("gui_mo_qi_ta_ in", values, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaNotIn(List<String> values) {
            addCriterion("gui_mo_qi_ta_ not in", values, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaBetween(String value1, String value2) {
            addCriterion("gui_mo_qi_ta_ between", value1, value2, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andGuiMoQiTaNotBetween(String value1, String value2) {
            addCriterion("gui_mo_qi_ta_ not between", value1, value2, "guiMoQiTa");
            return (Criteria) this;
        }

        public Criteria andYanGaoIsNull() {
            addCriterion("yan_gao_ is null");
            return (Criteria) this;
        }

        public Criteria andYanGaoIsNotNull() {
            addCriterion("yan_gao_ is not null");
            return (Criteria) this;
        }

        public Criteria andYanGaoEqualTo(String value) {
            addCriterion("yan_gao_ =", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoNotEqualTo(String value) {
            addCriterion("yan_gao_ <>", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoGreaterThan(String value) {
            addCriterion("yan_gao_ >", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoGreaterThanOrEqualTo(String value) {
            addCriterion("yan_gao_ >=", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoLessThan(String value) {
            addCriterion("yan_gao_ <", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoLessThanOrEqualTo(String value) {
            addCriterion("yan_gao_ <=", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoLike(String value) {
            addCriterion("yan_gao_ like", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoNotLike(String value) {
            addCriterion("yan_gao_ not like", value, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoIn(List<String> values) {
            addCriterion("yan_gao_ in", values, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoNotIn(List<String> values) {
            addCriterion("yan_gao_ not in", values, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoBetween(String value1, String value2) {
            addCriterion("yan_gao_ between", value1, value2, "yanGao");
            return (Criteria) this;
        }

        public Criteria andYanGaoNotBetween(String value1, String value2) {
            addCriterion("yan_gao_ not between", value1, value2, "yanGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoIsNull() {
            addCriterion("zong_gao_ is null");
            return (Criteria) this;
        }

        public Criteria andZongGaoIsNotNull() {
            addCriterion("zong_gao_ is not null");
            return (Criteria) this;
        }

        public Criteria andZongGaoEqualTo(String value) {
            addCriterion("zong_gao_ =", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoNotEqualTo(String value) {
            addCriterion("zong_gao_ <>", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoGreaterThan(String value) {
            addCriterion("zong_gao_ >", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoGreaterThanOrEqualTo(String value) {
            addCriterion("zong_gao_ >=", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoLessThan(String value) {
            addCriterion("zong_gao_ <", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoLessThanOrEqualTo(String value) {
            addCriterion("zong_gao_ <=", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoLike(String value) {
            addCriterion("zong_gao_ like", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoNotLike(String value) {
            addCriterion("zong_gao_ not like", value, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoIn(List<String> values) {
            addCriterion("zong_gao_ in", values, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoNotIn(List<String> values) {
            addCriterion("zong_gao_ not in", values, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoBetween(String value1, String value2) {
            addCriterion("zong_gao_ between", value1, value2, "zongGao");
            return (Criteria) this;
        }

        public Criteria andZongGaoNotBetween(String value1, String value2) {
            addCriterion("zong_gao_ not between", value1, value2, "zongGao");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuIsNull() {
            addCriterion("di_shang_di_xia_ceng_shu_ is null");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuIsNotNull() {
            addCriterion("di_shang_di_xia_ceng_shu_ is not null");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuEqualTo(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ =", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuNotEqualTo(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ <>", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuGreaterThan(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ >", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuGreaterThanOrEqualTo(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ >=", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuLessThan(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ <", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuLessThanOrEqualTo(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ <=", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuLike(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ like", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuNotLike(String value) {
            addCriterion("di_shang_di_xia_ceng_shu_ not like", value, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuIn(List<String> values) {
            addCriterion("di_shang_di_xia_ceng_shu_ in", values, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuNotIn(List<String> values) {
            addCriterion("di_shang_di_xia_ceng_shu_ not in", values, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuBetween(String value1, String value2) {
            addCriterion("di_shang_di_xia_ceng_shu_ between", value1, value2, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andDiShangDiXiaCengShuNotBetween(String value1, String value2) {
            addCriterion("di_shang_di_xia_ceng_shu_ not between", value1, value2, "diShangDiXiaCengShu");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieIsNull() {
            addCriterion("gong_cheng_lei_bie_ is null");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieIsNotNull() {
            addCriterion("gong_cheng_lei_bie_ is not null");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieEqualTo(String value) {
            addCriterion("gong_cheng_lei_bie_ =", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieNotEqualTo(String value) {
            addCriterion("gong_cheng_lei_bie_ <>", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieGreaterThan(String value) {
            addCriterion("gong_cheng_lei_bie_ >", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieGreaterThanOrEqualTo(String value) {
            addCriterion("gong_cheng_lei_bie_ >=", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieLessThan(String value) {
            addCriterion("gong_cheng_lei_bie_ <", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieLessThanOrEqualTo(String value) {
            addCriterion("gong_cheng_lei_bie_ <=", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieLike(String value) {
            addCriterion("gong_cheng_lei_bie_ like", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieNotLike(String value) {
            addCriterion("gong_cheng_lei_bie_ not like", value, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieIn(List<String> values) {
            addCriterion("gong_cheng_lei_bie_ in", values, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieNotIn(List<String> values) {
            addCriterion("gong_cheng_lei_bie_ not in", values, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieBetween(String value1, String value2) {
            addCriterion("gong_cheng_lei_bie_ between", value1, value2, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andGongChengLeiBieNotBetween(String value1, String value2) {
            addCriterion("gong_cheng_lei_bie_ not between", value1, value2, "gongChengLeiBie");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingIsNull() {
            addCriterion("jie_gou_lei_xing_ is null");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingIsNotNull() {
            addCriterion("jie_gou_lei_xing_ is not null");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingEqualTo(String value) {
            addCriterion("jie_gou_lei_xing_ =", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingNotEqualTo(String value) {
            addCriterion("jie_gou_lei_xing_ <>", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingGreaterThan(String value) {
            addCriterion("jie_gou_lei_xing_ >", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingGreaterThanOrEqualTo(String value) {
            addCriterion("jie_gou_lei_xing_ >=", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingLessThan(String value) {
            addCriterion("jie_gou_lei_xing_ <", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingLessThanOrEqualTo(String value) {
            addCriterion("jie_gou_lei_xing_ <=", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingLike(String value) {
            addCriterion("jie_gou_lei_xing_ like", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingNotLike(String value) {
            addCriterion("jie_gou_lei_xing_ not like", value, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingIn(List<String> values) {
            addCriterion("jie_gou_lei_xing_ in", values, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingNotIn(List<String> values) {
            addCriterion("jie_gou_lei_xing_ not in", values, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingBetween(String value1, String value2) {
            addCriterion("jie_gou_lei_xing_ between", value1, value2, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJieGouLeiXingNotBetween(String value1, String value2) {
            addCriterion("jie_gou_lei_xing_ not between", value1, value2, "jieGouLeiXing");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouIsNull() {
            addCriterion("ji_chu_jie_gou_ is null");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouIsNotNull() {
            addCriterion("ji_chu_jie_gou_ is not null");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouEqualTo(String value) {
            addCriterion("ji_chu_jie_gou_ =", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouNotEqualTo(String value) {
            addCriterion("ji_chu_jie_gou_ <>", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouGreaterThan(String value) {
            addCriterion("ji_chu_jie_gou_ >", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouGreaterThanOrEqualTo(String value) {
            addCriterion("ji_chu_jie_gou_ >=", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouLessThan(String value) {
            addCriterion("ji_chu_jie_gou_ <", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouLessThanOrEqualTo(String value) {
            addCriterion("ji_chu_jie_gou_ <=", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouLike(String value) {
            addCriterion("ji_chu_jie_gou_ like", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouNotLike(String value) {
            addCriterion("ji_chu_jie_gou_ not like", value, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouIn(List<String> values) {
            addCriterion("ji_chu_jie_gou_ in", values, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouNotIn(List<String> values) {
            addCriterion("ji_chu_jie_gou_ not in", values, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouBetween(String value1, String value2) {
            addCriterion("ji_chu_jie_gou_ between", value1, value2, "jiChuJieGou");
            return (Criteria) this;
        }

        public Criteria andJiChuJieGouNotBetween(String value1, String value2) {
            addCriterion("ji_chu_jie_gou_ not between", value1, value2, "jiChuJieGou");
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