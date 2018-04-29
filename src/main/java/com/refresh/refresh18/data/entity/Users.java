package com.refresh.refresh18.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Document
public class Users {

    @Id
    private String mobileNumber;
    private String userName;
    private String password;
    private String churchID;

    public Users(){}

    public Users(String mobileNumber, String userName, String password, String churchID) {
        this.mobileNumber = mobileNumber;
        this.userName = userName;
        this.password = password;
        this.churchID = churchID;
    }

    public String getUserId() {
        return userName;
    }

    public void setUserId(String userId) {
        this.userName = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getChurchID() {
        return churchID;
    }

    public void setChurchID(String churchID) {
        this.churchID = churchID;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
