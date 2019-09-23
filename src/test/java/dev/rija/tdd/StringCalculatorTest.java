package dev.rija.tdd;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void empty_string_should_return_0 () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("");

        // then
        assertThat(result, is(0));
    }

    @Test
    public void single_number_should_return_its_value () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("15");

        // then
        assertThat(result, is(15));
    }

    @Test
    public void two_coma_delimited_numbers_should_return_the_sum () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("1,5");

        // then
        assertThat(result, is(6));
    }

    @Test
    public void two_new_line_delimited_numbers_should_return_the_sum () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("2\n5");

        // then
        assertThat(result, is(7));
    }

    @Test
    public void three_numbers_delimited_either_way_should_return_the_sum () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("1\n2,3");

        // then
        assertThat(result, is(6));
    }

    @Test
    public void negative_number_should_throw_exception () {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage(containsString("negatives not allowed"));

        StringCalculator stringCalculator = new StringCalculator();

        stringCalculator.add("1\n2,-3,4,-6");
    }

    @Test
    public void numbers_greater_than_1000_should_be_ignored () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("1\n2000,3,1500\n4,6000");

        // then
        assertThat(result, is(8));
    }
    /**
     * to change a delimiter, the beginning of the string will contain a separate line that looks like this:
     * “//[delimiter]\n[numbers…]”
     * for example “//;\n1;2” should return three where the default delimiter is ‘;’
     */
    @Test
    public void numbers_delimited_by_custom_delimiter_should_return_the_sum () {
        // given
        StringCalculator stringCalculator = new StringCalculator();

        // when
        int result = stringCalculator.add("//;\n1;2");

        // then
        assertThat(result, is(3));
    }

}
