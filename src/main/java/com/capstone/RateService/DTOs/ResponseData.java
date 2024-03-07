package com.capstone.RateService.DTOs;

import java.util.List;

public class ResponseData {
    private Integer code;
    private List<RateListDTOs> data;
    private String message;

    public ResponseData(Integer code, List<RateListDTOs> data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<RateListDTOs> getData() {
        return data;
    }

    public void setData(List<RateListDTOs> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseData{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }
}
