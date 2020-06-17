package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.array.Check;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] input = new boolean[]{true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] input = new boolean[]{true, false, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataEvenTrueByFalse() {
        boolean[] input = new boolean[] {true, false, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataEvenTrueByTrue() {
        boolean[] input = new boolean[] {true, true, true, true};
        boolean result = Check.mono(input);
        assertThat(result, is(true));
    }

}