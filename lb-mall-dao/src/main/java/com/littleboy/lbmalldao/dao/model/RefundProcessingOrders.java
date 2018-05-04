package com.littleboy.lbmalldao.dao.model;

public class RefundProcessingOrders {
    private Integer id;

    private String platformid;

    private String outpaymentid;

    private String refundfee;

    private String subpartner;

    private String outTradeNo;

    private String transactionId;

    private Integer queryCount;

    private String refundState;

    private String outRefundNo;

    private String notifyurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlatformid() {
        return platformid;
    }

    public void setPlatformid(String platformid) {
        this.platformid = platformid == null ? null : platformid.trim();
    }

    public String getOutpaymentid() {
        return outpaymentid;
    }

    public void setOutpaymentid(String outpaymentid) {
        this.outpaymentid = outpaymentid == null ? null : outpaymentid.trim();
    }

    public String getRefundfee() {
        return refundfee;
    }

    public void setRefundfee(String refundfee) {
        this.refundfee = refundfee == null ? null : refundfee.trim();
    }

    public String getSubpartner() {
        return subpartner;
    }

    public void setSubpartner(String subpartner) {
        this.subpartner = subpartner == null ? null : subpartner.trim();
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Integer getQueryCount() {
        return queryCount;
    }

    public void setQueryCount(Integer queryCount) {
        this.queryCount = queryCount;
    }

    public String getRefundState() {
        return refundState;
    }

    public void setRefundState(String refundState) {
        this.refundState = refundState == null ? null : refundState.trim();
    }

    public String getOutRefundNo() {
        return outRefundNo;
    }

    public void setOutRefundNo(String outRefundNo) {
        this.outRefundNo = outRefundNo == null ? null : outRefundNo.trim();
    }

    public String getNotifyurl() {
        return notifyurl;
    }

    public void setNotifyurl(String notifyurl) {
        this.notifyurl = notifyurl == null ? null : notifyurl.trim();
    }
}