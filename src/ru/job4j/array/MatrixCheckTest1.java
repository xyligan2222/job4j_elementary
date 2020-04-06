package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest1 {

    @Test
    public void whenHasMonoHorizontal() {
        char[][] input = {
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
                {' ', ' ', ' '},

        };
        boolean result = MatrixCheck1.monoHorizontal(input, 0);
        assertThat(result, is(true));
    }
}