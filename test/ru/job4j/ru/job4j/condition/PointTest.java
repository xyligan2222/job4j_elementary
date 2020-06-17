package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Point;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void whenZeroAndZeroAnd10Then10() {
        Point first = new Point(0, 0, 0);
        Point second = new Point(0, 0, 9);
        double result = first.distance3d(second);
        first.info3d();
        second.info3d();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(9D));
        System.out.println(" ");
    }
    @Test
    public void whenCheckItself() {
        Point point = new Point(0, 0);
        double result = point.distance(point);
        point.info();
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(0D));
        System.out.println(" ");
    }

}
