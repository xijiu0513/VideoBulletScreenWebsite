package com.wyk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("video_url is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("video_url is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("video_url =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("video_url <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("video_url >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("video_url >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("video_url <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("video_url <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("video_url like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("video_url not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("video_url in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("video_url not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("video_url between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("video_url not between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoPicIsNull() {
            addCriterion("video_pic is null");
            return (Criteria) this;
        }

        public Criteria andVideoPicIsNotNull() {
            addCriterion("video_pic is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPicEqualTo(String value) {
            addCriterion("video_pic =", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicNotEqualTo(String value) {
            addCriterion("video_pic <>", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicGreaterThan(String value) {
            addCriterion("video_pic >", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicGreaterThanOrEqualTo(String value) {
            addCriterion("video_pic >=", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicLessThan(String value) {
            addCriterion("video_pic <", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicLessThanOrEqualTo(String value) {
            addCriterion("video_pic <=", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicLike(String value) {
            addCriterion("video_pic like", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicNotLike(String value) {
            addCriterion("video_pic not like", value, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicIn(List<String> values) {
            addCriterion("video_pic in", values, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicNotIn(List<String> values) {
            addCriterion("video_pic not in", values, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicBetween(String value1, String value2) {
            addCriterion("video_pic between", value1, value2, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoPicNotBetween(String value1, String value2) {
            addCriterion("video_pic not between", value1, value2, "videoPic");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridIsNull() {
            addCriterion("video__authorid is null");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridIsNotNull() {
            addCriterion("video__authorid is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridEqualTo(Integer value) {
            addCriterion("video__authorid =", value, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridNotEqualTo(Integer value) {
            addCriterion("video__authorid <>", value, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridGreaterThan(Integer value) {
            addCriterion("video__authorid >", value, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridGreaterThanOrEqualTo(Integer value) {
            addCriterion("video__authorid >=", value, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridLessThan(Integer value) {
            addCriterion("video__authorid <", value, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridLessThanOrEqualTo(Integer value) {
            addCriterion("video__authorid <=", value, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridIn(List<Integer> values) {
            addCriterion("video__authorid in", values, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridNotIn(List<Integer> values) {
            addCriterion("video__authorid not in", values, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridBetween(Integer value1, Integer value2) {
            addCriterion("video__authorid between", value1, value2, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoAuthoridNotBetween(Integer value1, Integer value2) {
            addCriterion("video__authorid not between", value1, value2, "videoAuthorid");
            return (Criteria) this;
        }

        public Criteria andVideoInfoIsNull() {
            addCriterion("video_info is null");
            return (Criteria) this;
        }

        public Criteria andVideoInfoIsNotNull() {
            addCriterion("video_info is not null");
            return (Criteria) this;
        }

        public Criteria andVideoInfoEqualTo(String value) {
            addCriterion("video_info =", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoNotEqualTo(String value) {
            addCriterion("video_info <>", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoGreaterThan(String value) {
            addCriterion("video_info >", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoGreaterThanOrEqualTo(String value) {
            addCriterion("video_info >=", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoLessThan(String value) {
            addCriterion("video_info <", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoLessThanOrEqualTo(String value) {
            addCriterion("video_info <=", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoLike(String value) {
            addCriterion("video_info like", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoNotLike(String value) {
            addCriterion("video_info not like", value, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoIn(List<String> values) {
            addCriterion("video_info in", values, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoNotIn(List<String> values) {
            addCriterion("video_info not in", values, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoBetween(String value1, String value2) {
            addCriterion("video_info between", value1, value2, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoInfoNotBetween(String value1, String value2) {
            addCriterion("video_info not between", value1, value2, "videoInfo");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNull() {
            addCriterion("video_time is null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIsNotNull() {
            addCriterion("video_time is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTimeEqualTo(Date value) {
            addCriterion("video_time =", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotEqualTo(Date value) {
            addCriterion("video_time <>", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThan(Date value) {
            addCriterion("video_time >", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("video_time >=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThan(Date value) {
            addCriterion("video_time <", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeLessThanOrEqualTo(Date value) {
            addCriterion("video_time <=", value, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeIn(List<Date> values) {
            addCriterion("video_time in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotIn(List<Date> values) {
            addCriterion("video_time not in", values, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeBetween(Date value1, Date value2) {
            addCriterion("video_time between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTimeNotBetween(Date value1, Date value2) {
            addCriterion("video_time not between", value1, value2, "videoTime");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNull() {
            addCriterion("video_type is null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIsNotNull() {
            addCriterion("video_type is not null");
            return (Criteria) this;
        }

        public Criteria andVideoTypeEqualTo(Integer value) {
            addCriterion("video_type =", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotEqualTo(Integer value) {
            addCriterion("video_type <>", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThan(Integer value) {
            addCriterion("video_type >", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_type >=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThan(Integer value) {
            addCriterion("video_type <", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeLessThanOrEqualTo(Integer value) {
            addCriterion("video_type <=", value, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeIn(List<Integer> values) {
            addCriterion("video_type in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotIn(List<Integer> values) {
            addCriterion("video_type not in", values, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeBetween(Integer value1, Integer value2) {
            addCriterion("video_type between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("video_type not between", value1, value2, "videoType");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountIsNull() {
            addCriterion("video_playcount is null");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountIsNotNull() {
            addCriterion("video_playcount is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountEqualTo(Integer value) {
            addCriterion("video_playcount =", value, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountNotEqualTo(Integer value) {
            addCriterion("video_playcount <>", value, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountGreaterThan(Integer value) {
            addCriterion("video_playcount >", value, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_playcount >=", value, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountLessThan(Integer value) {
            addCriterion("video_playcount <", value, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountLessThanOrEqualTo(Integer value) {
            addCriterion("video_playcount <=", value, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountIn(List<Integer> values) {
            addCriterion("video_playcount in", values, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountNotIn(List<Integer> values) {
            addCriterion("video_playcount not in", values, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountBetween(Integer value1, Integer value2) {
            addCriterion("video_playcount between", value1, value2, "videoPlaycount");
            return (Criteria) this;
        }

        public Criteria andVideoPlaycountNotBetween(Integer value1, Integer value2) {
            addCriterion("video_playcount not between", value1, value2, "videoPlaycount");
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
