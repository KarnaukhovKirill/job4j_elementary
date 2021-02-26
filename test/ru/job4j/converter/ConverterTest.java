package ru.job4j.converter;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ConverterTest extends TestCase {

    @Test
    public void testRubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void testRubleToDollar() {
        int inDollar = 180;
        int expectedDollar = 3;
        int outDollar = Converter.rubleToDollar(inDollar);
        Assert.assertEquals(expectedDollar, outDollar);
    }
}