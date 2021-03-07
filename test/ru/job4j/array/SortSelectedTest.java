package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOfSix() {
        int[] input = new int[] {55, 4, 6, 2, 9, 11};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 6, 9, 11, 55};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortOfThree() {
        int[] input = new int[] {5, 4, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {4, 5, 6};
        assertThat(result, is(expect));
    }
}