package com.wyk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DanmakuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DanmakuExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andDanmakuIdIsNull() {
            addCriterion("danmaku_id is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdIsNotNull() {
            addCriterion("danmaku_id is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdEqualTo(Integer value) {
            addCriterion("danmaku_id =", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotEqualTo(Integer value) {
            addCriterion("danmaku_id <>", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdGreaterThan(Integer value) {
            addCriterion("danmaku_id >", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmaku_id >=", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdLessThan(Integer value) {
            addCriterion("danmaku_id <", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdLessThanOrEqualTo(Integer value) {
            addCriterion("danmaku_id <=", value, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdIn(List<Integer> values) {
            addCriterion("danmaku_id in", values, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotIn(List<Integer> values) {
            addCriterion("danmaku_id not in", values, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_id between", value1, value2, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_id not between", value1, value2, "danmakuId");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidIsNull() {
            addCriterion("danmaku_videoid is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidIsNotNull() {
            addCriterion("danmaku_videoid is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidEqualTo(Integer value) {
            addCriterion("danmaku_videoid =", value, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidNotEqualTo(Integer value) {
            addCriterion("danmaku_videoid <>", value, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidGreaterThan(Integer value) {
            addCriterion("danmaku_videoid >", value, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmaku_videoid >=", value, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidLessThan(Integer value) {
            addCriterion("danmaku_videoid <", value, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidLessThanOrEqualTo(Integer value) {
            addCriterion("danmaku_videoid <=", value, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidIn(List<Integer> values) {
            addCriterion("danmaku_videoid in", values, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidNotIn(List<Integer> values) {
            addCriterion("danmaku_videoid not in", values, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_videoid between", value1, value2, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideoidNotBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_videoid not between", value1, value2, "danmakuVideoid");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeIsNull() {
            addCriterion("danmaku_videotime is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeIsNotNull() {
            addCriterion("danmaku_videotime is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeEqualTo(Integer value) {
            addCriterion("danmaku_videotime =", value, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeNotEqualTo(Integer value) {
            addCriterion("danmaku_videotime <>", value, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeGreaterThan(Integer value) {
            addCriterion("danmaku_videotime >", value, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmaku_videotime >=", value, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeLessThan(Integer value) {
            addCriterion("danmaku_videotime <", value, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeLessThanOrEqualTo(Integer value) {
            addCriterion("danmaku_videotime <=", value, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeIn(List<Integer> values) {
            addCriterion("danmaku_videotime in", values, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeNotIn(List<Integer> values) {
            addCriterion("danmaku_videotime not in", values, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_videotime between", value1, value2, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuVideotimeNotBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_videotime not between", value1, value2, "danmakuVideotime");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentIsNull() {
            addCriterion("danmaku_content is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentIsNotNull() {
            addCriterion("danmaku_content is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentEqualTo(String value) {
            addCriterion("danmaku_content =", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentNotEqualTo(String value) {
            addCriterion("danmaku_content <>", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentGreaterThan(String value) {
            addCriterion("danmaku_content >", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentGreaterThanOrEqualTo(String value) {
            addCriterion("danmaku_content >=", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentLessThan(String value) {
            addCriterion("danmaku_content <", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentLessThanOrEqualTo(String value) {
            addCriterion("danmaku_content <=", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentLike(String value) {
            addCriterion("danmaku_content like", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentNotLike(String value) {
            addCriterion("danmaku_content not like", value, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentIn(List<String> values) {
            addCriterion("danmaku_content in", values, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentNotIn(List<String> values) {
            addCriterion("danmaku_content not in", values, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentBetween(String value1, String value2) {
            addCriterion("danmaku_content between", value1, value2, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuContentNotBetween(String value1, String value2) {
            addCriterion("danmaku_content not between", value1, value2, "danmakuContent");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorIsNull() {
            addCriterion("danmaku_color is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorIsNotNull() {
            addCriterion("danmaku_color is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorEqualTo(String value) {
            addCriterion("danmaku_color =", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorNotEqualTo(String value) {
            addCriterion("danmaku_color <>", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorGreaterThan(String value) {
            addCriterion("danmaku_color >", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorGreaterThanOrEqualTo(String value) {
            addCriterion("danmaku_color >=", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorLessThan(String value) {
            addCriterion("danmaku_color <", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorLessThanOrEqualTo(String value) {
            addCriterion("danmaku_color <=", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorLike(String value) {
            addCriterion("danmaku_color like", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorNotLike(String value) {
            addCriterion("danmaku_color not like", value, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorIn(List<String> values) {
            addCriterion("danmaku_color in", values, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorNotIn(List<String> values) {
            addCriterion("danmaku_color not in", values, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorBetween(String value1, String value2) {
            addCriterion("danmaku_color between", value1, value2, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuColorNotBetween(String value1, String value2) {
            addCriterion("danmaku_color not between", value1, value2, "danmakuColor");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeIsNull() {
            addCriterion("danmaku_type is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeIsNotNull() {
            addCriterion("danmaku_type is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeEqualTo(Integer value) {
            addCriterion("danmaku_type =", value, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeNotEqualTo(Integer value) {
            addCriterion("danmaku_type <>", value, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeGreaterThan(Integer value) {
            addCriterion("danmaku_type >", value, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmaku_type >=", value, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeLessThan(Integer value) {
            addCriterion("danmaku_type <", value, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeLessThanOrEqualTo(Integer value) {
            addCriterion("danmaku_type <=", value, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeIn(List<Integer> values) {
            addCriterion("danmaku_type in", values, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeNotIn(List<Integer> values) {
            addCriterion("danmaku_type not in", values, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_type between", value1, value2, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_type not between", value1, value2, "danmakuType");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeIsNull() {
            addCriterion("danmaku_fontsize is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeIsNotNull() {
            addCriterion("danmaku_fontsize is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeEqualTo(Double value) {
            addCriterion("danmaku_fontsize =", value, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeNotEqualTo(Double value) {
            addCriterion("danmaku_fontsize <>", value, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeGreaterThan(Double value) {
            addCriterion("danmaku_fontsize >", value, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeGreaterThanOrEqualTo(Double value) {
            addCriterion("danmaku_fontsize >=", value, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeLessThan(Double value) {
            addCriterion("danmaku_fontsize <", value, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeLessThanOrEqualTo(Double value) {
            addCriterion("danmaku_fontsize <=", value, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeIn(List<Double> values) {
            addCriterion("danmaku_fontsize in", values, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeNotIn(List<Double> values) {
            addCriterion("danmaku_fontsize not in", values, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeBetween(Double value1, Double value2) {
            addCriterion("danmaku_fontsize between", value1, value2, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuFontsizeNotBetween(Double value1, Double value2) {
            addCriterion("danmaku_fontsize not between", value1, value2, "danmakuFontsize");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidIsNull() {
            addCriterion("danmaku_senderid is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidIsNotNull() {
            addCriterion("danmaku_senderid is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidEqualTo(Integer value) {
            addCriterion("danmaku_senderid =", value, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidNotEqualTo(Integer value) {
            addCriterion("danmaku_senderid <>", value, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidGreaterThan(Integer value) {
            addCriterion("danmaku_senderid >", value, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmaku_senderid >=", value, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidLessThan(Integer value) {
            addCriterion("danmaku_senderid <", value, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidLessThanOrEqualTo(Integer value) {
            addCriterion("danmaku_senderid <=", value, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidIn(List<Integer> values) {
            addCriterion("danmaku_senderid in", values, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidNotIn(List<Integer> values) {
            addCriterion("danmaku_senderid not in", values, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_senderid between", value1, value2, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSenderidNotBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_senderid not between", value1, value2, "danmakuSenderid");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeIsNull() {
            addCriterion("danmaku_sendtime is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeIsNotNull() {
            addCriterion("danmaku_sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeEqualTo(Date value) {
            addCriterion("danmaku_sendtime =", value, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeNotEqualTo(Date value) {
            addCriterion("danmaku_sendtime <>", value, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeGreaterThan(Date value) {
            addCriterion("danmaku_sendtime >", value, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("danmaku_sendtime >=", value, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeLessThan(Date value) {
            addCriterion("danmaku_sendtime <", value, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("danmaku_sendtime <=", value, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeIn(List<Date> values) {
            addCriterion("danmaku_sendtime in", values, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeNotIn(List<Date> values) {
            addCriterion("danmaku_sendtime not in", values, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeBetween(Date value1, Date value2) {
            addCriterion("danmaku_sendtime between", value1, value2, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("danmaku_sendtime not between", value1, value2, "danmakuSendtime");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusIsNull() {
            addCriterion("danmaku_status is null");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusIsNotNull() {
            addCriterion("danmaku_status is not null");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusEqualTo(Integer value) {
            addCriterion("danmaku_status =", value, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusNotEqualTo(Integer value) {
            addCriterion("danmaku_status <>", value, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusGreaterThan(Integer value) {
            addCriterion("danmaku_status >", value, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("danmaku_status >=", value, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusLessThan(Integer value) {
            addCriterion("danmaku_status <", value, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("danmaku_status <=", value, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusIn(List<Integer> values) {
            addCriterion("danmaku_status in", values, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusNotIn(List<Integer> values) {
            addCriterion("danmaku_status not in", values, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_status between", value1, value2, "danmakuStatus");
            return (Criteria) this;
        }

        public Criteria andDanmakuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("danmaku_status not between", value1, value2, "danmakuStatus");
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
