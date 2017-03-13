package com.wentjiang.moviehelper.model;

import java.io.Serializable;
import java.util.Date;

public class Movie implements Serializable {
    private Integer id;

    private String name;

    private String director;

    private String scenarist;

    private Date relaseData;

    private String runTime;

    private Float rateNum;

    private Integer commentNum;

    private Float start5;

    private Float start4;

    private Float start3;

    private Float start2;

    private Float start1;

    private String actors;

    private String type;

    private String country;

    private String language;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director == null ? null : director.trim();
    }

    public String getScenarist() {
        return scenarist;
    }

    public void setScenarist(String scenarist) {
        this.scenarist = scenarist == null ? null : scenarist.trim();
    }

    public Date getRelaseData() {
        return relaseData;
    }

    public void setRelaseData(Date relaseData) {
        this.relaseData = relaseData;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime == null ? null : runTime.trim();
    }

    public Float getRateNum() {
        return rateNum;
    }

    public void setRateNum(Float rateNum) {
        this.rateNum = rateNum;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }

    public Float getStart5() {
        return start5;
    }

    public void setStart5(Float start5) {
        this.start5 = start5;
    }

    public Float getStart4() {
        return start4;
    }

    public void setStart4(Float start4) {
        this.start4 = start4;
    }

    public Float getStart3() {
        return start3;
    }

    public void setStart3(Float start3) {
        this.start3 = start3;
    }

    public Float getStart2() {
        return start2;
    }

    public void setStart2(Float start2) {
        this.start2 = start2;
    }

    public Float getStart1() {
        return start1;
    }

    public void setStart1(Float start1) {
        this.start1 = start1;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors == null ? null : actors.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }
}