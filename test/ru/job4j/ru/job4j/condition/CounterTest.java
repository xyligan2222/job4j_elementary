package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.loop.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }

    @Test
    public void sumNumber() {
        int rsl = Counter.sum(2, 8);
        int expected = 35;
        assertThat(rsl, is(expected));
    }
}