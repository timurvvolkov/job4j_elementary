package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = Diapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D, 17D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = Diapason.diapason(1, 4, x -> Math.pow(x, 2) + 2 * x - 1);
        List<Double> expected = Arrays.asList(2D, 7D, 14D, 23D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = Diapason.diapason(3, 6, x -> Math.pow(3, x));
        List<Double> expected = Arrays.asList(27D, 81D, 243D, 729D);
        assertThat(result, is(expected));
    }
}
