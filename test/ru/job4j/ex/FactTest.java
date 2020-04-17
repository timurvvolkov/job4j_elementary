package ru.job4j.ex;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArgumentLessThanZeroThenFinish() {
        new Fact().calc(-1);
    }

    @Test
    public void when4then24() {
        int rsl = new Fact().calc(4);
        assertThat(rsl, is(24));
    }
}
