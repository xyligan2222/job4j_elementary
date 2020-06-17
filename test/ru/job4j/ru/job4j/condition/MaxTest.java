package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax4() {
        int result = Max.max(7, 3, 3, 5);
        assertThat(result, is(7));
    }
    @Test
    public void whenMax3() {
        int result = Max.max(10, 3, 3);
        assertThat(result, is(10));
    }
    @Test
    public void whenMax2() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }
}