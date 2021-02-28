package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void testSquare() {
        int p = 50;
        int k = 4;
        double expected = 100;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}