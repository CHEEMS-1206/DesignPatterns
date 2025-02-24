package com.designPatterns.Leaf;

import com.designPatterns.Root.TestCases;
import java.security.SecureRandom;

public class StringGenerator implements TestCases {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final SecureRandom RANDOM = new SecureRandom();

    private final int size;
    private String generatedString;

    public StringGenerator(int size) {
        this.size = size;
    }

    @Override
    public void generate() {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            int index = RANDOM.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }
        generatedString = sb.toString();
    }

    public String getGeneratedString() {
        return generatedString;
    }
}
