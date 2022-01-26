package com.company.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

    Calculator calculator = new Calculator();
    int[] sequence = new int[] {6, 9, 15, -2, 92, 11};

    @Test
    void determineMinimumValue() throws Exception {

        assertEquals(-2,  calculator.minimumValue(sequence));
    }

    @Test
    void throwsNullPointerExceptionWhenSequenceIsNull() {
       IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->  {
            calculator.minimumValue(null);
        });
        Assertions.assertEquals("Sequence must not be null", thrown.getMessage());
    }

    @Test
    void throwsIndexOfBoundsExceptionWhenSequenceIsEmpty() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->  {
            calculator.minimumValue( new int[]{ });
        });
        Assertions.assertEquals("Sequence must not be empty", thrown.getMessage());
    }
}

//    @Test
//    void determineMaximumValue() {
//        assertEquals(92, calculator.maxValue);
//    }
//
//    @Test
//    void determineSumOfValue() {
//        assertEquals(131, calculator.sumValues);
//    }
//
//    @Test
//    void determineNumberOfValue() {
//        assertEquals(6, calculator.numberElements);
//    }
//}