package com.example.movieproject;

import java.io.Serializable;

public class Movies implements Serializable {
    public Movies(int id,String title, String summary, String rating, String date, String time, String actor, int posterNormalImage, int posterBigImage) {
        this.title = title;
        this.summary = summary;
        this.rating = rating;
        this.date = date;
        this.time = time;
        this.actor = actor;
        this.posterNormalImage = posterNormalImage;
        this.posterBigImage = posterBigImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getPosterNormalImage() {
        return posterNormalImage;
    }

    public void setPosterNormalImage(int posterNormalImage) {
        this.posterNormalImage = posterNormalImage;
    }

    public int getPosterBigImage() {
        return posterBigImage;
    }

    public void setPosterBigImage(int posterBigImage) {
        this.posterBigImage = posterBigImage;
    }

    private String title,summary,rating,date,time,actor;
    private int posterNormalImage,posterBigImage,id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
