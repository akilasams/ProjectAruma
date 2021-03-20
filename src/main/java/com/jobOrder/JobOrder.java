package com.jobOrder;

public class JobOrder {
    private int joId;
    private int fromId;
    private int toId;
    private int accepted; //from Designer
    private int confirmed; //from Customer
    private String date;
    private String orderDesc;
    private String duration;
    private int quantity;

    public JobOrder(int joId, int fromId, int toId, int accepted, int confirmed, String date, String orderDesc, String duration, int quantity) {
        this.joId = joId;
        this.fromId = fromId;
        this.toId = toId;
        this.accepted = accepted;
        this.confirmed = confirmed;
        this.date = date;
        this.orderDesc = orderDesc;
        this.duration = duration;
        this.quantity = quantity;
    }

    public JobOrder(int fromId, int toId, int accepted, int confirmed, String date, String orderDesc, String duration, int quantity) {
        this.fromId = fromId;
        this.toId = toId;
        this.accepted = accepted;
        this.confirmed = confirmed;
        this.date = date;
        this.orderDesc = orderDesc;
        this.duration = duration;
        this.quantity = quantity;
    }

    public JobOrder(int fromId, int toId, String orderDesc, String duration, int quantity) {
        this.fromId = fromId;
        this.toId = toId;
        this.orderDesc = orderDesc;
        this.duration = duration;
        this.quantity = quantity;
    }

    public int getJoId() {
        return joId;
    }

    public void setJoId(int joId) {
        this.joId = joId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getToId() {
        return toId;
    }

    public void setToId(int toId) {
        this.toId = toId;
    }

    public int isAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public int isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
