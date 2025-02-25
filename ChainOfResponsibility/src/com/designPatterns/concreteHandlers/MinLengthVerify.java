package com.designPatterns.concreteHandlers;

import com.designPatterns.handler.PasswordVerifier;

public class MinLengthVerify implements PasswordVerifier {
    private PasswordVerifier nextVerifier = null;
    private int minLength;

    public MinLengthVerify(int minLength){
        this.minLength = minLength;
    }
    public void setNextVerifier(PasswordVerifier pv){
        this.nextVerifier = pv;
    }

    public boolean verify(String query){
        if (query.length() >= minLength) {
            if (nextVerifier != null) {
                return nextVerifier.verify(query);
            }
            return true;
        }
        return false;
    }
}
