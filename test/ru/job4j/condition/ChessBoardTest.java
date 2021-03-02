package ru.job4j.condition;

import static org.junit.Assert.assertThat;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        assertThat(ChessBoard.way(6, 7, 1, 2), is(5));
    }

    @Test
    public void wayIs7() {
        assertThat(ChessBoard.way(8, 1, 1, 8), is(7));
    }

    @Test
    public void wayIs0() {
        assertThat(ChessBoard.way(4, 3, 5, 1), is(0));
    }
}