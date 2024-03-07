package com.capstone.RateService.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name ="Users")
@Entity
public class Users {

    @Id
    private Integer userId;
    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phone;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "password")
    private String password;

    @Column(name = "dob")
    private LocalDate birthday;

    @Column(name = "avatar")
    private String avatar;

    @Column(name = "role_userId")
    private int role;

    public Users(Integer userId, String email, String phone, String fullName, boolean gender, String password, LocalDate birthday, String avatar, int role) {
        this.userId = userId;
        this.email = email;
        this.phone = phone;
        this.fullName = fullName;
        this.gender = gender;
        this.password = password;
        this.birthday = birthday;
        this.avatar = avatar;
        this.role = role;
    }

    public Integer getuserId() {
        return userId;
    }

    public void setuserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gender=" + gender +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", avatar='" + avatar + '\'' +
                ", role=" + role +
                '}';
    }
}

