package com.capstone.RateService.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class Rate {
    @Id
    private Integer rateId;
    @Column(name = "hotel_id")
    private Integer hotelId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "content")
    private String content;
    @Column(name = "star_rating")
    private Float starRating;;
    @Column(name = "rate_date")
    private LocalDate rateDate;

    public Rate(Integer hotelId, Integer userId, String content, Float starRating, LocalDate rateDate) {
        this.hotelId = hotelId;
        this.userId = userId;
        this.content = content;
        this.starRating = starRating;
        this.rateDate = rateDate;
    }

    public Rate(Integer rateId, Integer hotelId, Integer userId, String content, Float starRating, LocalDate rateDate) {
        this.rateId = rateId;
        this.hotelId = hotelId;
        this.userId = userId;
        this.content = content;
        this.starRating = starRating;
        this.rateDate = rateDate;
    }

    public Integer getRateId() {
        return rateId;
    }

    public void setRateId(Integer rateId) {
        this.rateId = rateId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
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

    public Float getStarRating() {
        return starRating;
    }

    public void setStarRating(Float starRating) {
        this.starRating = starRating;
    }

    public LocalDate getrateDate() {
        return rateDate;
    }

    public void setrateDate(LocalDate rateDate) {
        this.rateDate = rateDate;
    }

    @Override
    public String toString() {
        return "RateEntity{" +
                "rateId=" + rateId +
                ", hotelId=" + hotelId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", starRating=" + starRating +
                ", rateDate=" + rateDate +
                '}';
    }
}
