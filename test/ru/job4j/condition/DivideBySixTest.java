package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        String expected = "Исходное число делиться на 6.";
        assertThat(DivideBySix.checkNumber(24), is(expected));
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        String expected = "Исходное число делиться на 3, но не является чётным.";
        assertThat(DivideBySix.checkNumber(69), is(expected));
    }

    @Test
    public void whenNumberNotDivideBy3AndEven() {
        String expected = "Исходное число не делиться на 3, но является чётным.";
        assertThat(DivideBySix.checkNumber(74), is(expected));
    }

    @Test
    public void whenNumberNotDivideBy3AndNotEven() {
        String expected = "Исходное число не делиться на 3 и не является чётным.";
        assertThat(DivideBySix.checkNumber(77), is(expected));
    }
}