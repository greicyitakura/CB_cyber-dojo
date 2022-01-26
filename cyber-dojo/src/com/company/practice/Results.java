package com.company.practice;

import org.junit.platform.commons.util.StringUtils;

import java.util.Arrays;

public class Results{

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        int[] seq = {6, 9, 15, -2, 92, 11};

        int minValue = calculator.minimumValue(seq);
        int maxValue = Integer.parseInt(calculator.maximumValue(seq));
        int sumValues = Arrays.stream(seq).sum();
        int numberOfElements = seq.length;

        System.out.println("Minimum value = " + minValue);
        System.out.println("Maximum value = " + maxValue);
        System.out.println("Number of elements = " + numberOfElements);
        System.out.println("Sum of value = " + sumValues);
    }
}

