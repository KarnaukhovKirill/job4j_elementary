package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void maxOfTwo() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void maxOfThree() {
        int result = Max.max(3, 1, 10);
        assertThat(result, is(10));
    }

    @Test
    public void maxOfFour() {
        int result = Max.max(2, 2, 10, 2);
        assertThat(result, is(10));
    }
}