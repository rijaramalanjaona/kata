package dev.rija.tdd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class PrimeNumberTest {
    private int number;
    private boolean expected;

    public PrimeNumberTest(int number, boolean expected) {
        this.number = number;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1, false},
                {2, true},
                {3, true},
                {4, false},
                {11, true},
                {1217, true}
        });
    }

    @Test
    public void test_is_prime () {
        // given
        PrimeNumber primeNumber = new PrimeNumber();

        // when
        boolean result = primeNumber.isPrime(number);

        // then
        assertThat(result, is(expected));
    }
}
