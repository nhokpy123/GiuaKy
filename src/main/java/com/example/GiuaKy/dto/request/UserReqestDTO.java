package com.example.GiuaKy.dto.request;

import java.io.Serializable;

public class UserReqestDTO implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public UserReqestDTO(String firstName, String lastName, String email, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }
}
