package com.company.practice;


import java.util.Arrays;

public class Calculator {

    public int minimumValue(int[] seq) throws Exception {

        if (seq == null) {
            throw new IllegalArgumentException("Sequence must not be null");
        }
        if (Arrays.equals(seq, new int[]{ })) {
            throw new IllegalArgumentException("Sequence must not be empty");
        }

        int minValue = seq[0];
        for (int i = 1; i < seq.length; i++) {
            if (seq[i] < minValue) {
                minValue = seq[i];
            }
        }
        return minValue;
    }

    public String maximumValue(int[] seq) {
        int maxValue = seq[0];
        for (int i = 1; i < seq.length; i++)
            if (seq[i] > maxValue) {
                maxValue = seq[i];
            }
        return String.valueOf(maxValue);
    }

    public String sumOfValues(int[] seq) {
        float sumValues = seq[0];
        for (int i = 1; i < seq.length; i++)
            sumValues += seq[i];
        return String.valueOf(sumValues);
    }
}