package com.refresh.refresh18.data.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
@Document
public class Churches implements Serializable {

    private static final long serialVersionUID = -8353648095026268920L;

    @Id
    private String churchID;
    private String name;
    private String pocName;
    private String pocMobile;
    private String noOfParticipants;

    public String getChurchID() {
        return churchID;
    }

    public void setChurchID(String churchID) {
        this.churchID = churchID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPocName() {
        return pocName;
    }

    public void setPocName(String pocName) {
        this.pocName = pocName;
    }

    public String getPocMobile() {
        return pocMobile;
    }

    public void setPocMobile(String pocMobile) {
        this.pocMobile = pocMobile;
    }

    public String getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(String noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }
}
