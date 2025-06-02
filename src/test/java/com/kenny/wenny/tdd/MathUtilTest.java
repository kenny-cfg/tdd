package com.kenny.wenny.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    @Test
    void when_providedTwoPositiveNumbers_then_returnsSum() {
        var expectedSum = 42;

        var actual = MathUtil.add(22, 20);

        assertThat(actual).isEqualTo(expectedSum);
//        assertEquals(expectedSum, actual);
    }

    @Test
    void when_providedNegativeAndZeroNumbers_then_returnsSum() {
        var expectedSum = -42;

        var actual = MathUtil.add(-42, 0);

        assertThat(actual).isEqualTo(expectedSum);
//        assertEquals(expectedSum, actual);
    }
}