package com.dahrens.codesample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sample_UT {

    private static Stream<Arguments> sumLists_source() {
        return Stream.of(
                Arguments.of(18, Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5)),
                Arguments.of(9, Arrays.asList(6, 3), null),
                Arguments.of(0, null, null)
        );
    }

    @ParameterizedTest
    @MethodSource("sumLists_source")
    void sumLists(Integer expectedResult, List<Integer> list1, List<Integer> list2) {
        assertEquals(Sample.sumLists(list1, list2), expectedResult);
    }

    @Test
    void sumLists_null() {
        assertEquals(Sample.sumLists(null, null), 0);
    }

    @Test
    void sumLists_partialNull() {
        List<Integer> list1 = Arrays.asList(6, 3);
        assertEquals(Sample.sumLists(list1, null), 9);
    }

    private static Stream<Arguments> sharedIndices_source() {
        return Stream.of(
                Arguments.of(1, "Snake", "snowing"),
                Arguments.of(1, "LOREM", "IPSUM"),
                Arguments.of(0, "", "Example")
        );
    }

    @ParameterizedTest
    @MethodSource("sharedIndices_source")
    void sharedIndices(Integer expectedValue, String item1, String item2) {
        assertEquals(Sample.sharedIndices(item1, item2), expectedValue);
    }
}
