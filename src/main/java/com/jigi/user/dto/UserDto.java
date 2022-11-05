package com.jigi.user.dto;

import java.time.LocalDate;

public class UserDto {
    private String user_email;
    private String user_password;
    private String user_name;
    private LocalDate sign_up_date;
    private String authority;
    private int enabled;

    public UserDto() {
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public LocalDate getSign_up_date() {
        return sign_up_date;
    }

    public void setSign_up_date(LocalDate sign_up_date) {
        this.sign_up_date = sign_up_date;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
}
