package ru.job4j.ru.job4j.condition;

import org.junit.Test;
import ru.job4j.array.ArrayChar;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ru.job4j.array.ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'p'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}