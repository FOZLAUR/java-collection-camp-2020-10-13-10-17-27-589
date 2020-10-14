package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class MyMapTest {
    @Test
    public void should_map_to_triple() {
        //triple times ever element in the list

        Integer[] array = new Integer[]{1, 3, 5, 4, 9};
        List<Integer> list = Arrays.asList(array);

        MyMap myMap = new MyMap(list);

        Integer[] result = new Integer[]{3, 9, 15, 12, 27};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(myMap.getTriple()).isEqualTo(resultList);
    }

    @Test
    public void should_map_to_letter() {
        //mapping number to the letter
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);

        MyMap myMap = new MyMap(list);

        String[] result = new String[]{"a", "b", "c", "d", "e"};
        List<String> resultList = Arrays.asList(result);

        assertThat(myMap.mapLetter()).isEqualTo(resultList);
    }

    @Test
    public void should_sort_from_big_to_small() {
        //order from big to small
        Integer[] array = new Integer[]{2, 1, 3, 4, 5};
        List<Integer> list = Arrays.asList(array);

        MyMap myMap = new MyMap(list);

        Integer[] result = new Integer[]{5, 4, 3, 2, 1};
        List<Integer> resultList = Arrays.asList(result);

        assertThat(myMap.sortFromBig()).isEqualTo(resultList);
    }
}
