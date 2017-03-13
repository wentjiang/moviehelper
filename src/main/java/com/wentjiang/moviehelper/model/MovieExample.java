package com.wentjiang.moviehelper.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andScenaristIsNull() {
            addCriterion("scenarist is null");
            return (Criteria) this;
        }

        public Criteria andScenaristIsNotNull() {
            addCriterion("scenarist is not null");
            return (Criteria) this;
        }

        public Criteria andScenaristEqualTo(String value) {
            addCriterion("scenarist =", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristNotEqualTo(String value) {
            addCriterion("scenarist <>", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristGreaterThan(String value) {
            addCriterion("scenarist >", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristGreaterThanOrEqualTo(String value) {
            addCriterion("scenarist >=", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristLessThan(String value) {
            addCriterion("scenarist <", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristLessThanOrEqualTo(String value) {
            addCriterion("scenarist <=", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristLike(String value) {
            addCriterion("scenarist like", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristNotLike(String value) {
            addCriterion("scenarist not like", value, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristIn(List<String> values) {
            addCriterion("scenarist in", values, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristNotIn(List<String> values) {
            addCriterion("scenarist not in", values, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristBetween(String value1, String value2) {
            addCriterion("scenarist between", value1, value2, "scenarist");
            return (Criteria) this;
        }

        public Criteria andScenaristNotBetween(String value1, String value2) {
            addCriterion("scenarist not between", value1, value2, "scenarist");
            return (Criteria) this;
        }

        public Criteria andRelaseDataIsNull() {
            addCriterion("relase_data is null");
            return (Criteria) this;
        }

        public Criteria andRelaseDataIsNotNull() {
            addCriterion("relase_data is not null");
            return (Criteria) this;
        }

        public Criteria andRelaseDataEqualTo(Date value) {
            addCriterionForJDBCDate("relase_data =", value, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataNotEqualTo(Date value) {
            addCriterionForJDBCDate("relase_data <>", value, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataGreaterThan(Date value) {
            addCriterionForJDBCDate("relase_data >", value, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("relase_data >=", value, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataLessThan(Date value) {
            addCriterionForJDBCDate("relase_data <", value, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("relase_data <=", value, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataIn(List<Date> values) {
            addCriterionForJDBCDate("relase_data in", values, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataNotIn(List<Date> values) {
            addCriterionForJDBCDate("relase_data not in", values, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("relase_data between", value1, value2, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRelaseDataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("relase_data not between", value1, value2, "relaseData");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNull() {
            addCriterion("run_time is null");
            return (Criteria) this;
        }

        public Criteria andRunTimeIsNotNull() {
            addCriterion("run_time is not null");
            return (Criteria) this;
        }

        public Criteria andRunTimeEqualTo(String value) {
            addCriterion("run_time =", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotEqualTo(String value) {
            addCriterion("run_time <>", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThan(String value) {
            addCriterion("run_time >", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeGreaterThanOrEqualTo(String value) {
            addCriterion("run_time >=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThan(String value) {
            addCriterion("run_time <", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLessThanOrEqualTo(String value) {
            addCriterion("run_time <=", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeLike(String value) {
            addCriterion("run_time like", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotLike(String value) {
            addCriterion("run_time not like", value, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeIn(List<String> values) {
            addCriterion("run_time in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotIn(List<String> values) {
            addCriterion("run_time not in", values, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeBetween(String value1, String value2) {
            addCriterion("run_time between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRunTimeNotBetween(String value1, String value2) {
            addCriterion("run_time not between", value1, value2, "runTime");
            return (Criteria) this;
        }

        public Criteria andRateNumIsNull() {
            addCriterion("rate_num is null");
            return (Criteria) this;
        }

        public Criteria andRateNumIsNotNull() {
            addCriterion("rate_num is not null");
            return (Criteria) this;
        }

        public Criteria andRateNumEqualTo(Float value) {
            addCriterion("rate_num =", value, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumNotEqualTo(Float value) {
            addCriterion("rate_num <>", value, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumGreaterThan(Float value) {
            addCriterion("rate_num >", value, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumGreaterThanOrEqualTo(Float value) {
            addCriterion("rate_num >=", value, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumLessThan(Float value) {
            addCriterion("rate_num <", value, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumLessThanOrEqualTo(Float value) {
            addCriterion("rate_num <=", value, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumIn(List<Float> values) {
            addCriterion("rate_num in", values, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumNotIn(List<Float> values) {
            addCriterion("rate_num not in", values, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumBetween(Float value1, Float value2) {
            addCriterion("rate_num between", value1, value2, "rateNum");
            return (Criteria) this;
        }

        public Criteria andRateNumNotBetween(Float value1, Float value2) {
            addCriterion("rate_num not between", value1, value2, "rateNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNull() {
            addCriterion("comment_num is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumIsNotNull() {
            addCriterion("comment_num is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumEqualTo(Integer value) {
            addCriterion("comment_num =", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotEqualTo(Integer value) {
            addCriterion("comment_num <>", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThan(Integer value) {
            addCriterion("comment_num >", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_num >=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThan(Integer value) {
            addCriterion("comment_num <", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumLessThanOrEqualTo(Integer value) {
            addCriterion("comment_num <=", value, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumIn(List<Integer> values) {
            addCriterion("comment_num in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotIn(List<Integer> values) {
            addCriterion("comment_num not in", values, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumBetween(Integer value1, Integer value2) {
            addCriterion("comment_num between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andCommentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_num not between", value1, value2, "commentNum");
            return (Criteria) this;
        }

        public Criteria andStart5IsNull() {
            addCriterion("start5 is null");
            return (Criteria) this;
        }

        public Criteria andStart5IsNotNull() {
            addCriterion("start5 is not null");
            return (Criteria) this;
        }

        public Criteria andStart5EqualTo(Float value) {
            addCriterion("start5 =", value, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5NotEqualTo(Float value) {
            addCriterion("start5 <>", value, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5GreaterThan(Float value) {
            addCriterion("start5 >", value, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5GreaterThanOrEqualTo(Float value) {
            addCriterion("start5 >=", value, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5LessThan(Float value) {
            addCriterion("start5 <", value, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5LessThanOrEqualTo(Float value) {
            addCriterion("start5 <=", value, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5In(List<Float> values) {
            addCriterion("start5 in", values, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5NotIn(List<Float> values) {
            addCriterion("start5 not in", values, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5Between(Float value1, Float value2) {
            addCriterion("start5 between", value1, value2, "start5");
            return (Criteria) this;
        }

        public Criteria andStart5NotBetween(Float value1, Float value2) {
            addCriterion("start5 not between", value1, value2, "start5");
            return (Criteria) this;
        }

        public Criteria andStart4IsNull() {
            addCriterion("start4 is null");
            return (Criteria) this;
        }

        public Criteria andStart4IsNotNull() {
            addCriterion("start4 is not null");
            return (Criteria) this;
        }

        public Criteria andStart4EqualTo(Float value) {
            addCriterion("start4 =", value, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4NotEqualTo(Float value) {
            addCriterion("start4 <>", value, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4GreaterThan(Float value) {
            addCriterion("start4 >", value, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4GreaterThanOrEqualTo(Float value) {
            addCriterion("start4 >=", value, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4LessThan(Float value) {
            addCriterion("start4 <", value, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4LessThanOrEqualTo(Float value) {
            addCriterion("start4 <=", value, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4In(List<Float> values) {
            addCriterion("start4 in", values, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4NotIn(List<Float> values) {
            addCriterion("start4 not in", values, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4Between(Float value1, Float value2) {
            addCriterion("start4 between", value1, value2, "start4");
            return (Criteria) this;
        }

        public Criteria andStart4NotBetween(Float value1, Float value2) {
            addCriterion("start4 not between", value1, value2, "start4");
            return (Criteria) this;
        }

        public Criteria andStart3IsNull() {
            addCriterion("start3 is null");
            return (Criteria) this;
        }

        public Criteria andStart3IsNotNull() {
            addCriterion("start3 is not null");
            return (Criteria) this;
        }

        public Criteria andStart3EqualTo(Float value) {
            addCriterion("start3 =", value, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3NotEqualTo(Float value) {
            addCriterion("start3 <>", value, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3GreaterThan(Float value) {
            addCriterion("start3 >", value, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3GreaterThanOrEqualTo(Float value) {
            addCriterion("start3 >=", value, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3LessThan(Float value) {
            addCriterion("start3 <", value, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3LessThanOrEqualTo(Float value) {
            addCriterion("start3 <=", value, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3In(List<Float> values) {
            addCriterion("start3 in", values, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3NotIn(List<Float> values) {
            addCriterion("start3 not in", values, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3Between(Float value1, Float value2) {
            addCriterion("start3 between", value1, value2, "start3");
            return (Criteria) this;
        }

        public Criteria andStart3NotBetween(Float value1, Float value2) {
            addCriterion("start3 not between", value1, value2, "start3");
            return (Criteria) this;
        }

        public Criteria andStart2IsNull() {
            addCriterion("start2 is null");
            return (Criteria) this;
        }

        public Criteria andStart2IsNotNull() {
            addCriterion("start2 is not null");
            return (Criteria) this;
        }

        public Criteria andStart2EqualTo(Float value) {
            addCriterion("start2 =", value, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2NotEqualTo(Float value) {
            addCriterion("start2 <>", value, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2GreaterThan(Float value) {
            addCriterion("start2 >", value, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2GreaterThanOrEqualTo(Float value) {
            addCriterion("start2 >=", value, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2LessThan(Float value) {
            addCriterion("start2 <", value, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2LessThanOrEqualTo(Float value) {
            addCriterion("start2 <=", value, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2In(List<Float> values) {
            addCriterion("start2 in", values, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2NotIn(List<Float> values) {
            addCriterion("start2 not in", values, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2Between(Float value1, Float value2) {
            addCriterion("start2 between", value1, value2, "start2");
            return (Criteria) this;
        }

        public Criteria andStart2NotBetween(Float value1, Float value2) {
            addCriterion("start2 not between", value1, value2, "start2");
            return (Criteria) this;
        }

        public Criteria andStart1IsNull() {
            addCriterion("start1 is null");
            return (Criteria) this;
        }

        public Criteria andStart1IsNotNull() {
            addCriterion("start1 is not null");
            return (Criteria) this;
        }

        public Criteria andStart1EqualTo(Float value) {
            addCriterion("start1 =", value, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1NotEqualTo(Float value) {
            addCriterion("start1 <>", value, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1GreaterThan(Float value) {
            addCriterion("start1 >", value, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1GreaterThanOrEqualTo(Float value) {
            addCriterion("start1 >=", value, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1LessThan(Float value) {
            addCriterion("start1 <", value, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1LessThanOrEqualTo(Float value) {
            addCriterion("start1 <=", value, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1In(List<Float> values) {
            addCriterion("start1 in", values, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1NotIn(List<Float> values) {
            addCriterion("start1 not in", values, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1Between(Float value1, Float value2) {
            addCriterion("start1 between", value1, value2, "start1");
            return (Criteria) this;
        }

        public Criteria andStart1NotBetween(Float value1, Float value2) {
            addCriterion("start1 not between", value1, value2, "start1");
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