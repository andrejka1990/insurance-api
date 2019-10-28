package ru.krilovs.andrejs.insuranceapi.entity;

public class Policy {
    private String id;
    private Status status;
    private Double premium;

    public Policy(String id, Status status, Double premium) {
        this.id = id;
        this.status = status;
        this.premium = premium;
    }

    public Policy() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getPremium() {
        return premium;
    }

    public void setPremium(Double premium) {
        this.premium = premium;
    }
}
