package com.designPatterns.concreteHandlers;

import com.designPatterns.handler.PasswordVerifier;

public class MaxLengthVerify implements PasswordVerifier {
    private PasswordVerifier nextVerifier = null;
    private int maxLength;

    public MaxLengthVerify(int maxLength){
        this.maxLength = maxLength;
    }
    public void setNextVerifier(PasswordVerifier pv){
        this.nextVerifier = pv;
    }

    public boolean verify(String query){
        if (query.length() <= maxLength) {
            if (nextVerifier != null) {
                return nextVerifier.verify(query);
            }
            return true;
        }
        return false;
    }
}
