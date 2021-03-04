package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenN5ThenFactorialIs120() {
        int expected = 120;
        assertThat(Factorial.calc(5), is(expected));
    }

    @Test
    public void whenN0ThenFactorialIs1() {
        int expected = 1;
        assertThat(Factorial.calc(0), is(expected));
    }
}