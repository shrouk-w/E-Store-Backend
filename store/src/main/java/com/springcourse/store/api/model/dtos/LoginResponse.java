package com.springcourse.store.api.model.dtos;

public class LoginResponse {
    private String jwt;

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
