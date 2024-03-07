package com.capstone.RateService.DTOs;

public class RequestRating {
    private Integer userId;
    private String content;
    private Integer hotelId;
    private Float starRate;

    public RequestRating(Integer userId, String content, Integer hotelId, Float starRate) {
        this.userId = userId;
        this.content = content;
        this.hotelId = hotelId;
        this.starRate = starRate;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Float getStarRate() {
        return starRate;
    }

    public void setStarRate(Float starRate) {
        this.starRate = starRate;
    }
}
