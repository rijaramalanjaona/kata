package dev.rija.tdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeapYearTest {
    @Test
    public void should_return_false_when_year_not_divisible_by_4 () {
        // given
        LeapYear year = new LeapYear();

        // when
        boolean result = year.isLeap(2017);

        // then
        assertFalse(result);
    }

    @Test
    public void should_return_true_when_year_divisible_by_400 () {
        // given
        LeapYear year = new LeapYear();

        // when
        boolean result = year.isLeap(2000);

        // then
        assertTrue(result);
    }

    @Test
    public void should_return_false_when_year_divisible_by_100_but_not_by_400 () {
        // given
        LeapYear year = new LeapYear();

        // when
        boolean result = year.isLeap(1700);

        // then
        assertFalse(result);
    }

    @Test
    public void should_return_true_when_year_divisible_by_4_but_not_by_100 () {
        // given
        LeapYear year = new LeapYear();

        // when
        boolean result = year.isLeap(2008);

        // then
        assertTrue(result);
    }
}
