package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.array.FindLoop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas10Then1() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3};
        int e1 = 10;
        int result = find.indexOf(data, e1);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas11Then() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3};
        int e1 = 11;
        int result = find.indexOf(data, e1);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHasLength5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind2() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 3;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}