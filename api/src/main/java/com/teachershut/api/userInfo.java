package com.teachershut.api;

import org.springframework.stereotype.Component;

@Component
public class userInfo {
    String name;
    String email;
    String phone;

    public userInfo(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public userInfo() {
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
