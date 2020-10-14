package com.thoughtworks.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class ReduceTest {

    @Test
    public void should_get_average_of_list() {
        //get the average value
        //double numberA = 1.00000001;
        //double numberB = 0.00000001;
        Integer[] array = new Integer[]{12, 34, 56, 78, 90, 21};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);

        assertThat(reduce.getAverage()).isEqualTo(48.5);
    }

    @Test
    public void should_return_biggest_element() {
        //get the biggest value
        Integer[] array = new Integer[]{1, 11, 27, 20, 4, 9, 15, 4, 1, 11};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getMaxValue()).isEqualTo(27);
    }

    @Test
    public void should_return_last_odd_element() {
        //get the last odd number from the list
        Integer[] array = new Integer[]{1, 11, 27, 20, 4, 9, 15};
        List<Integer> arrayList = Arrays.asList(array);

        Reduce reduce = new Reduce(arrayList);
        assertThat(reduce.getLastOdd()).isEqualTo(15);
    }
}
