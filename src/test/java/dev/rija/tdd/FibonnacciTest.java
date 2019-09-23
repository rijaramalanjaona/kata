package dev.rija.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class FibonnacciTest {
    private int position;
    private int expected;

    public FibonnacciTest(int position, int expected) {
        this.position = position;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {0, 0},
                {1, 1},
                {2, 1},
                {8, 21},
                {15, 610}
        });
    }

    @Test
    public void test_display () {
        // given
        Fibonnacci fibonnacci = new Fibonnacci();

        // when
        int result = fibonnacci.display(position);

        // then
        assertThat(result, is(expected));
    }

}
