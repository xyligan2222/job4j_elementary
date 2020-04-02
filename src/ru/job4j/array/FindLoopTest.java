package ru.job4j.array;

import org.junit.Test;
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
}