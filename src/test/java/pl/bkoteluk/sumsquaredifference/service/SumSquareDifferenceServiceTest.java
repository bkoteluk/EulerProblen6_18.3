package pl.bkoteluk.sumsquaredifference.service;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;

class SumSquareDifferenceServiceTest {
    SumSquareDifferenceService euler;
    int maxNumber;

    @BeforeEach
    void setUp() {
        maxNumber = 10;
        euler = new SumSquareDifferenceService(maxNumber);
    }

    @Test
    void whenMaxNumberIsTen_shouldSumOfTheSquaresNumbersReturn385() {
        int expectedResult = 385;
        int result = euler.sumOfTheSquaresNumbers();
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void whenMaxNumberIsTen_shouldSquareOfTheSumNumbersReturn3025() {
        int expectedResult = 3025;
        int result = euler.squareOfTheSumNumbers();
        assertThat(expectedResult).isEqualTo(result);
    }

    @Test
    void whenFirstSumIs3025AndSecondSumIs385_shouldDifferenceBetweenSumsReturn2640() {
        int expectedResult = 2640;
        int result = euler.differenceBetweenSums();

        assertThat(expectedResult, CoreMatchers.is(result));

    }
}