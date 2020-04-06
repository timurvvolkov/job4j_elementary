package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax132Then3() {
        int result = Max.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3214Then4() {
        int result = Max.max(3, 2, 1, 4);
        assertThat(result, is(4));
    }
}
