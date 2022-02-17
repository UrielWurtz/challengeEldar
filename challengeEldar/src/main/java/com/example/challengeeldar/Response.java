package com.example.challengeeldar;

import java.time.LocalDate;

public class Response {

    private boolean success;
    private Object response;
    private int cardNumber;
    private Object brand;
    private Object cardHolderFirstName;
    private Object cardHolderLastName;
    private Object expirationDate;
    private double operationAmount;
    private double totalAmount;

    public Response() {
        this.success = true;
    }
    public Object getResponse() {
        return response;
    }
    public boolean isSuccess() {
        return success;
    }
    public int getCardNumber() {
        return cardNumber;
    }
    public Object getCardHolderFirstName() {
        return cardHolderFirstName;
    }
    public Object getCardHolderLastName() {
        return cardHolderLastName;
    }
    public Object getBrand() {
        return brand;
    }
    public Object getExpirationDate() {
        return expirationDate;
    }
    public double getOperationAmount() {
        return operationAmount;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public  void setCardNumber(int cardNumber) {this.cardNumber = cardNumber;}

    public  void setBrand(Object brand) {this.brand = brand;}

    public  void setCardHolderFirstName(Object cardHolderFirstName) {this.cardHolderFirstName = cardHolderFirstName;}

    public  void setCardHolderLastName(Object cardHolderLastName) {this.cardHolderLastName = cardHolderLastName;}

    public  void setExpirationDate(Object expirationDate) {this.expirationDate = expirationDate;}

    public  void setOperationAmount(double operationAmount) {this.operationAmount = operationAmount;}

    public  void setTotalAmount(double totalAmount) {this.totalAmount = totalAmount;}

    @Override
    public String toString() {
        return "{\"Response\":{"
                + "\"valid\":\"" + success + "\""
                + ", \"response\":" + response + "\""
                + ", \"cardNumber\":\"" + cardNumber + "\""
                + ", \"brand\":\"" + brand + "\""
                + ", \"cardHolderFirstName\":\"" + cardHolderFirstName + "\""
                + ", \"cardHolderLastName\":\"" + cardHolderLastName + "\""
                + ", \"expirationDate\":\"" + expirationDate + "\""
                + ", \"operationAmount\":\"" + operationAmount + "\""
                + ", \"totalAmount\":\"" + totalAmount + "\""
                + "}}";
    }
}