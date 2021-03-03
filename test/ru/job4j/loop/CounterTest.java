package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CounterTest {

    @Test
    public void whenSumFromOneToThreeIs6() {
        int expected = 6;
        assertThat((Counter.sum(1, 3)), is(expected));
    }

    @Test
    public void whenSumEvenFromOneToTenIs30() {
        int expected = 30;
        assertThat((Counter.sumByEven(1, 10)), is(expected));
    }

        @Test
        public void whenSumEvenFromFiveToTenIs24() {
            int expected = 24;
            assertThat((Counter.sumByEven(5, 10)), is(expected));
    }
}