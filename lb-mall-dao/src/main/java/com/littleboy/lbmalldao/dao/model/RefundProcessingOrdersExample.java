package com.littleboy.lbmalldao.dao.model;

import java.util.ArrayList;
import java.util.List;

public class RefundProcessingOrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundProcessingOrdersExample() {
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

        public Criteria andPlatformidIsNull() {
            addCriterion("platformId is null");
            return (Criteria) this;
        }

        public Criteria andPlatformidIsNotNull() {
            addCriterion("platformId is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformidEqualTo(String value) {
            addCriterion("platformId =", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotEqualTo(String value) {
            addCriterion("platformId <>", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThan(String value) {
            addCriterion("platformId >", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidGreaterThanOrEqualTo(String value) {
            addCriterion("platformId >=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThan(String value) {
            addCriterion("platformId <", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLessThanOrEqualTo(String value) {
            addCriterion("platformId <=", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidLike(String value) {
            addCriterion("platformId like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotLike(String value) {
            addCriterion("platformId not like", value, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidIn(List<String> values) {
            addCriterion("platformId in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotIn(List<String> values) {
            addCriterion("platformId not in", values, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidBetween(String value1, String value2) {
            addCriterion("platformId between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andPlatformidNotBetween(String value1, String value2) {
            addCriterion("platformId not between", value1, value2, "platformid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidIsNull() {
            addCriterion("outPaymentId is null");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidIsNotNull() {
            addCriterion("outPaymentId is not null");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidEqualTo(String value) {
            addCriterion("outPaymentId =", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidNotEqualTo(String value) {
            addCriterion("outPaymentId <>", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidGreaterThan(String value) {
            addCriterion("outPaymentId >", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidGreaterThanOrEqualTo(String value) {
            addCriterion("outPaymentId >=", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidLessThan(String value) {
            addCriterion("outPaymentId <", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidLessThanOrEqualTo(String value) {
            addCriterion("outPaymentId <=", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidLike(String value) {
            addCriterion("outPaymentId like", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidNotLike(String value) {
            addCriterion("outPaymentId not like", value, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidIn(List<String> values) {
            addCriterion("outPaymentId in", values, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidNotIn(List<String> values) {
            addCriterion("outPaymentId not in", values, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidBetween(String value1, String value2) {
            addCriterion("outPaymentId between", value1, value2, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andOutpaymentidNotBetween(String value1, String value2) {
            addCriterion("outPaymentId not between", value1, value2, "outpaymentid");
            return (Criteria) this;
        }

        public Criteria andRefundfeeIsNull() {
            addCriterion("refundFee is null");
            return (Criteria) this;
        }

        public Criteria andRefundfeeIsNotNull() {
            addCriterion("refundFee is not null");
            return (Criteria) this;
        }

        public Criteria andRefundfeeEqualTo(String value) {
            addCriterion("refundFee =", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotEqualTo(String value) {
            addCriterion("refundFee <>", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeGreaterThan(String value) {
            addCriterion("refundFee >", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeGreaterThanOrEqualTo(String value) {
            addCriterion("refundFee >=", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeLessThan(String value) {
            addCriterion("refundFee <", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeLessThanOrEqualTo(String value) {
            addCriterion("refundFee <=", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeLike(String value) {
            addCriterion("refundFee like", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotLike(String value) {
            addCriterion("refundFee not like", value, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeIn(List<String> values) {
            addCriterion("refundFee in", values, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotIn(List<String> values) {
            addCriterion("refundFee not in", values, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeBetween(String value1, String value2) {
            addCriterion("refundFee between", value1, value2, "refundfee");
            return (Criteria) this;
        }

        public Criteria andRefundfeeNotBetween(String value1, String value2) {
            addCriterion("refundFee not between", value1, value2, "refundfee");
            return (Criteria) this;
        }

        public Criteria andSubpartnerIsNull() {
            addCriterion("subpartner is null");
            return (Criteria) this;
        }

        public Criteria andSubpartnerIsNotNull() {
            addCriterion("subpartner is not null");
            return (Criteria) this;
        }

        public Criteria andSubpartnerEqualTo(String value) {
            addCriterion("subpartner =", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerNotEqualTo(String value) {
            addCriterion("subpartner <>", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerGreaterThan(String value) {
            addCriterion("subpartner >", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerGreaterThanOrEqualTo(String value) {
            addCriterion("subpartner >=", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerLessThan(String value) {
            addCriterion("subpartner <", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerLessThanOrEqualTo(String value) {
            addCriterion("subpartner <=", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerLike(String value) {
            addCriterion("subpartner like", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerNotLike(String value) {
            addCriterion("subpartner not like", value, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerIn(List<String> values) {
            addCriterion("subpartner in", values, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerNotIn(List<String> values) {
            addCriterion("subpartner not in", values, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerBetween(String value1, String value2) {
            addCriterion("subpartner between", value1, value2, "subpartner");
            return (Criteria) this;
        }

        public Criteria andSubpartnerNotBetween(String value1, String value2) {
            addCriterion("subpartner not between", value1, value2, "subpartner");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNull() {
            addCriterion("out_trade_no is null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIsNotNull() {
            addCriterion("out_trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoEqualTo(String value) {
            addCriterion("out_trade_no =", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotEqualTo(String value) {
            addCriterion("out_trade_no <>", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThan(String value) {
            addCriterion("out_trade_no >", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_trade_no >=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThan(String value) {
            addCriterion("out_trade_no <", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLessThanOrEqualTo(String value) {
            addCriterion("out_trade_no <=", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoLike(String value) {
            addCriterion("out_trade_no like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotLike(String value) {
            addCriterion("out_trade_no not like", value, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoIn(List<String> values) {
            addCriterion("out_trade_no in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotIn(List<String> values) {
            addCriterion("out_trade_no not in", values, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoBetween(String value1, String value2) {
            addCriterion("out_trade_no between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andOutTradeNoNotBetween(String value1, String value2) {
            addCriterion("out_trade_no not between", value1, value2, "outTradeNo");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNull() {
            addCriterion("query_count is null");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNotNull() {
            addCriterion("query_count is not null");
            return (Criteria) this;
        }

        public Criteria andQueryCountEqualTo(Integer value) {
            addCriterion("query_count =", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotEqualTo(Integer value) {
            addCriterion("query_count <>", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThan(Integer value) {
            addCriterion("query_count >", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_count >=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThan(Integer value) {
            addCriterion("query_count <", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThanOrEqualTo(Integer value) {
            addCriterion("query_count <=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountIn(List<Integer> values) {
            addCriterion("query_count in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotIn(List<Integer> values) {
            addCriterion("query_count not in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountBetween(Integer value1, Integer value2) {
            addCriterion("query_count between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("query_count not between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNull() {
            addCriterion("refund_state is null");
            return (Criteria) this;
        }

        public Criteria andRefundStateIsNotNull() {
            addCriterion("refund_state is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStateEqualTo(String value) {
            addCriterion("refund_state =", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotEqualTo(String value) {
            addCriterion("refund_state <>", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThan(String value) {
            addCriterion("refund_state >", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateGreaterThanOrEqualTo(String value) {
            addCriterion("refund_state >=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThan(String value) {
            addCriterion("refund_state <", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLessThanOrEqualTo(String value) {
            addCriterion("refund_state <=", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateLike(String value) {
            addCriterion("refund_state like", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotLike(String value) {
            addCriterion("refund_state not like", value, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateIn(List<String> values) {
            addCriterion("refund_state in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotIn(List<String> values) {
            addCriterion("refund_state not in", values, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateBetween(String value1, String value2) {
            addCriterion("refund_state between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andRefundStateNotBetween(String value1, String value2) {
            addCriterion("refund_state not between", value1, value2, "refundState");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNull() {
            addCriterion("out_refund_no is null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIsNotNull() {
            addCriterion("out_refund_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoEqualTo(String value) {
            addCriterion("out_refund_no =", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotEqualTo(String value) {
            addCriterion("out_refund_no <>", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThan(String value) {
            addCriterion("out_refund_no >", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_refund_no >=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThan(String value) {
            addCriterion("out_refund_no <", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLessThanOrEqualTo(String value) {
            addCriterion("out_refund_no <=", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoLike(String value) {
            addCriterion("out_refund_no like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotLike(String value) {
            addCriterion("out_refund_no not like", value, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoIn(List<String> values) {
            addCriterion("out_refund_no in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotIn(List<String> values) {
            addCriterion("out_refund_no not in", values, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoBetween(String value1, String value2) {
            addCriterion("out_refund_no between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andOutRefundNoNotBetween(String value1, String value2) {
            addCriterion("out_refund_no not between", value1, value2, "outRefundNo");
            return (Criteria) this;
        }

        public Criteria andNotifyurlIsNull() {
            addCriterion("notifyUrl is null");
            return (Criteria) this;
        }

        public Criteria andNotifyurlIsNotNull() {
            addCriterion("notifyUrl is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyurlEqualTo(String value) {
            addCriterion("notifyUrl =", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotEqualTo(String value) {
            addCriterion("notifyUrl <>", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlGreaterThan(String value) {
            addCriterion("notifyUrl >", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlGreaterThanOrEqualTo(String value) {
            addCriterion("notifyUrl >=", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlLessThan(String value) {
            addCriterion("notifyUrl <", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlLessThanOrEqualTo(String value) {
            addCriterion("notifyUrl <=", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlLike(String value) {
            addCriterion("notifyUrl like", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotLike(String value) {
            addCriterion("notifyUrl not like", value, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlIn(List<String> values) {
            addCriterion("notifyUrl in", values, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotIn(List<String> values) {
            addCriterion("notifyUrl not in", values, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlBetween(String value1, String value2) {
            addCriterion("notifyUrl between", value1, value2, "notifyurl");
            return (Criteria) this;
        }

        public Criteria andNotifyurlNotBetween(String value1, String value2) {
            addCriterion("notifyUrl not between", value1, value2, "notifyurl");
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