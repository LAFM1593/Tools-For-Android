package com.lafm.restclient;

import com.google.gson.Gson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogGSON {

    private int number;

    private int code;

    private String description;

    private Object request;

    private Object response;

    private String elapsed_time;

    private String date;

    public LogGSON(){

        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
        date = DATE_FORMAT.format(new Date());
    }

    public LogGSON(int number, int code, String description, Object request, Object response, String elapsed_time) {
        this.code = code;
        this.description = description;
        this.request = request;
        this.response = response;
        this.elapsed_time = elapsed_time;
        this.number = number;

        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:SS");
        date = DATE_FORMAT.format(new Date());
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getRequest() {
        return request;
    }

    public void setRequest(Object request) {
        this.request = request;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public String getElapsed_time() {
        return elapsed_time;
    }

    public void setElapsed_time(String elapsed_time) {
        this.elapsed_time = elapsed_time;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
