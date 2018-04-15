package com.STS.machine.pojo.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class OrderExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OrderExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        private static final long serialVersionUID = 1L;

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

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(String value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(String value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(String value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(String value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(String value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(String value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLike(String value) {
            addCriterion("oid like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotLike(String value) {
            addCriterion("oid not like", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<String> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<String> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(String value1, String value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(String value1, String value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andBeginidIsNull() {
            addCriterion("beginId is null");
            return (Criteria) this;
        }

        public Criteria andBeginidIsNotNull() {
            addCriterion("beginId is not null");
            return (Criteria) this;
        }

        public Criteria andBeginidEqualTo(Integer value) {
            addCriterion("beginId =", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotEqualTo(Integer value) {
            addCriterion("beginId <>", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidGreaterThan(Integer value) {
            addCriterion("beginId >", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("beginId >=", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidLessThan(Integer value) {
            addCriterion("beginId <", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidLessThanOrEqualTo(Integer value) {
            addCriterion("beginId <=", value, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidIn(List<Integer> values) {
            addCriterion("beginId in", values, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotIn(List<Integer> values) {
            addCriterion("beginId not in", values, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidBetween(Integer value1, Integer value2) {
            addCriterion("beginId between", value1, value2, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginidNotBetween(Integer value1, Integer value2) {
            addCriterion("beginId not between", value1, value2, "beginid");
            return (Criteria) this;
        }

        public Criteria andBeginnameIsNull() {
            addCriterion("beginName is null");
            return (Criteria) this;
        }

        public Criteria andBeginnameIsNotNull() {
            addCriterion("beginName is not null");
            return (Criteria) this;
        }

        public Criteria andBeginnameEqualTo(String value) {
            addCriterion("beginName =", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameNotEqualTo(String value) {
            addCriterion("beginName <>", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameGreaterThan(String value) {
            addCriterion("beginName >", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameGreaterThanOrEqualTo(String value) {
            addCriterion("beginName >=", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameLessThan(String value) {
            addCriterion("beginName <", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameLessThanOrEqualTo(String value) {
            addCriterion("beginName <=", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameLike(String value) {
            addCriterion("beginName like", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameNotLike(String value) {
            addCriterion("beginName not like", value, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameIn(List<String> values) {
            addCriterion("beginName in", values, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameNotIn(List<String> values) {
            addCriterion("beginName not in", values, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameBetween(String value1, String value2) {
            addCriterion("beginName between", value1, value2, "beginname");
            return (Criteria) this;
        }

        public Criteria andBeginnameNotBetween(String value1, String value2) {
            addCriterion("beginName not between", value1, value2, "beginname");
            return (Criteria) this;
        }

        public Criteria andEndidIsNull() {
            addCriterion("endId is null");
            return (Criteria) this;
        }

        public Criteria andEndidIsNotNull() {
            addCriterion("endId is not null");
            return (Criteria) this;
        }

        public Criteria andEndidEqualTo(Integer value) {
            addCriterion("endId =", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotEqualTo(Integer value) {
            addCriterion("endId <>", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidGreaterThan(Integer value) {
            addCriterion("endId >", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidGreaterThanOrEqualTo(Integer value) {
            addCriterion("endId >=", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLessThan(Integer value) {
            addCriterion("endId <", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidLessThanOrEqualTo(Integer value) {
            addCriterion("endId <=", value, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidIn(List<Integer> values) {
            addCriterion("endId in", values, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotIn(List<Integer> values) {
            addCriterion("endId not in", values, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidBetween(Integer value1, Integer value2) {
            addCriterion("endId between", value1, value2, "endid");
            return (Criteria) this;
        }

        public Criteria andEndidNotBetween(Integer value1, Integer value2) {
            addCriterion("endId not between", value1, value2, "endid");
            return (Criteria) this;
        }

        public Criteria andEndnameIsNull() {
            addCriterion("endName is null");
            return (Criteria) this;
        }

        public Criteria andEndnameIsNotNull() {
            addCriterion("endName is not null");
            return (Criteria) this;
        }

        public Criteria andEndnameEqualTo(String value) {
            addCriterion("endName =", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotEqualTo(String value) {
            addCriterion("endName <>", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameGreaterThan(String value) {
            addCriterion("endName >", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameGreaterThanOrEqualTo(String value) {
            addCriterion("endName >=", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameLessThan(String value) {
            addCriterion("endName <", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameLessThanOrEqualTo(String value) {
            addCriterion("endName <=", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameLike(String value) {
            addCriterion("endName like", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotLike(String value) {
            addCriterion("endName not like", value, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameIn(List<String> values) {
            addCriterion("endName in", values, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotIn(List<String> values) {
            addCriterion("endName not in", values, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameBetween(String value1, String value2) {
            addCriterion("endName between", value1, value2, "endname");
            return (Criteria) this;
        }

        public Criteria andEndnameNotBetween(String value1, String value2) {
            addCriterion("endName not between", value1, value2, "endname");
            return (Criteria) this;
        }

        public Criteria andTicnumIsNull() {
            addCriterion("ticNum is null");
            return (Criteria) this;
        }

        public Criteria andTicnumIsNotNull() {
            addCriterion("ticNum is not null");
            return (Criteria) this;
        }

        public Criteria andTicnumEqualTo(Integer value) {
            addCriterion("ticNum =", value, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumNotEqualTo(Integer value) {
            addCriterion("ticNum <>", value, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumGreaterThan(Integer value) {
            addCriterion("ticNum >", value, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ticNum >=", value, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumLessThan(Integer value) {
            addCriterion("ticNum <", value, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumLessThanOrEqualTo(Integer value) {
            addCriterion("ticNum <=", value, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumIn(List<Integer> values) {
            addCriterion("ticNum in", values, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumNotIn(List<Integer> values) {
            addCriterion("ticNum not in", values, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumBetween(Integer value1, Integer value2) {
            addCriterion("ticNum between", value1, value2, "ticnum");
            return (Criteria) this;
        }

        public Criteria andTicnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ticNum not between", value1, value2, "ticnum");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        private static final long serialVersionUID = 1L;

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