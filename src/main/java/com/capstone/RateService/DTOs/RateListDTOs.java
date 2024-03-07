package com.capstone.RateService.DTOs;

import java.time.LocalDate;

public class RateListDTOs {
    private String fullName;
    private LocalDate dateReview;
    private String content;
    private Float starRating;
    private String imageUser;

    public RateListDTOs(String fullName, LocalDate dateReview, String content, Float starRating, String imageUser) {
        this.fullName = fullName;
        this.dateReview = dateReview;
        this.content = content;
        this.starRating = starRating;
        this.imageUser = imageUser;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDateReview() {
        return dateReview;
    }

    public void setDateReview(LocalDate dateReview) {
        this.dateReview = dateReview;
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

    public String getImageUser() {
        return imageUser;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }
}
