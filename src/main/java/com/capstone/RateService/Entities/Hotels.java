package com.capstone.RateService.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.BitSet;

@Entity
@Table
public class Hotels {
    @Id
    @SequenceGenerator(
            name = "hotels_hotel_id_seq",
            sequenceName = "hotels_hotel_id_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hotels_hotel_id_seq"
    )
    private Integer hotelId;
    private String hotelName;
    private String hotelAddress;
    private String hotelCity;
    private String hotelCountry;
    private String hotelContractNumber;
    private String hotelEmail;
    private String hotelDescription;
    private Double starRating;
    private LocalDate checkInTime;
    private LocalDate checkOutTime;

    public Hotels() {
    }

    public Hotels(Integer hotelId, String hotelName, String hotelAddress, String hotelCity, String hotelCountry, String hotelContractNumber, String hotelEmail, String hotelDescription, Double starRating, LocalDate checkInTime, LocalDate checkOutTime) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelCity = hotelCity;
        this.hotelCountry = hotelCountry;
        this.hotelContractNumber = hotelContractNumber;
        this.hotelEmail = hotelEmail;
        this.hotelDescription = hotelDescription;
        this.starRating = starRating;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public Hotels(String hotelName, String hotelAddress, String hotelCity, String hotelCountry, String hotelContractNumber, String hotelEmail, String hotelDescription, Double starRating, LocalDate checkInTime, LocalDate checkOutTime) {
        this.hotelName = hotelName;
        this.hotelAddress = hotelAddress;
        this.hotelCity = hotelCity;
        this.hotelCountry = hotelCountry;
        this.hotelContractNumber = hotelContractNumber;
        this.hotelEmail = hotelEmail;
        this.hotelDescription = hotelDescription;
        this.starRating = starRating;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelCountry() {
        return hotelCountry;
    }

    public void setHotelCountry(String hotelCountry) {
        this.hotelCountry = hotelCountry;
    }

    public String getHotelContractNumber() {
        return hotelContractNumber;
    }

    public void setHotelContractNumber(String hotelContractNumber) {
        this.hotelContractNumber = hotelContractNumber;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public Double getStarRating() {
        return starRating;
    }

    public void setStarRating(Double starRating) {
        this.starRating = starRating;
    }

    public LocalDate getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalDate checkInTime) {
        this.checkInTime = checkInTime;
    }

    public LocalDate getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(LocalDate checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    @Override
    public String toString() {
        return "Hotels{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", hotelAddress='" + hotelAddress + '\'' +
                ", hotelCity='" + hotelCity + '\'' +
                ", hotelCountry='" + hotelCountry + '\'' +
                ", hotelContractNumber='" + hotelContractNumber + '\'' +
                ", hotelEmail='" + hotelEmail + '\'' +
                ", hotelDescription='" + hotelDescription + '\'' +
                ", starRating=" + starRating +
                ", checkInTime=" + checkInTime +
                ", checkOutTime=" + checkOutTime +
                '}';
    }
}
