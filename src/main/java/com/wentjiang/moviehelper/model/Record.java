package com.wentjiang.moviehelper.model;

import java.io.Serializable;

public class Record implements Serializable {
    private Integer id;

    private String movieUrl;

    private Byte readed;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl == null ? null : movieUrl.trim();
    }

    public Byte getReaded() {
        return readed;
    }

    public void setReaded(Byte readed) {
        this.readed = readed;
    }
}