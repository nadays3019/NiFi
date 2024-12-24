package com.example.demo.dto;

public class Header {
    private String rqstTime;
    private Boolean result;
    private String errorMsg;

    public String getRqstTime() {
        return rqstTime;
    }

    public void setRqstTime(String rqstTime) {
        this.rqstTime = rqstTime;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}