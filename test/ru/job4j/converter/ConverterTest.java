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
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
}