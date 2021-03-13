package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class SqAreaTest {

    @Test
    public void testSquare() {
        int p = 50;
        int k = 4;
        double expected = 100;
        double out = SqArea.square(p, k);
        assertThat(out, is(expected));
    }

    @Test
    public void whenp6k2s2() {
        int k = 2;
        int p = 6;
        double expected = 2;
        double s = SqArea.square(p, k);
        assertThat(s, is(expected));
    }
}