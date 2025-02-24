package com.designPatterns.Composite;

import com.designPatterns.Root.TestCases;
import com.designPatterns.Leaf.StringGenerator;

import java.util.ArrayList;
import java.util.List;

public class ArrayOfTC implements TestCases {
    private final List<TestCases> testCasesList = new ArrayList<>();
    private final int numTestCases, minSize, maxSize;

    public ArrayOfTC(int numTestCases, int minSize, int maxSize) {
        this.numTestCases = numTestCases;
        this.minSize = minSize;
        this.maxSize = maxSize;
    }

    @Override
    public void generate() {
        for (int i = 0; i < numTestCases; i++) {
            int size = minSize + (int) (Math.random() * (maxSize - minSize + 1)); // Random size
            StringGenerator generator = new StringGenerator(size);
            generator.generate();
            testCasesList.add(generator);
        }
    }

    public List<String> getGeneratedTestCases() {
        List<String> testCases = new ArrayList<>();
        for (TestCases tc : testCasesList) {
            if (tc instanceof StringGenerator) {
                testCases.add(((StringGenerator) tc).getGeneratedString());
            }
        }
        return testCases;
    }
}
