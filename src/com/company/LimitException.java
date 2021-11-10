package com.company;

public class LimitException extends Exception{
    double remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message) {
        super(message);
        this.remainingAmount = remainingAmount;
    }
}
