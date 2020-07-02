package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DepDescCompTest {
    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void fullTest() {
        List<String> input = Arrays.asList("k1", "k1/sk1", "k1/sk1/ssk1", "k1/sk1/ssk2", "k1/sk2",
                                           "k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk2");
        List<String> expect = List.of("k2", "k2/sk1", "k2/sk1/ssk1", "k2/sk1/ssk2",
                                      "k1", "k1/sk1", "k1/sk1/ssk1", "k1/sk1/ssk2", "k1/sk2");
        Collections.sort(input, new DepDescComp());
        assertThat(input, is(expect));
    }
}