package dev.rija.tdd;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void should_return_list_of_empty_character_when_given_string_is_empty () {
        // given
        Anagram anagram = new Anagram();
        List<String> expected = Collections.singletonList("");

        // when
        List<String> result = anagram.of("");

        // then
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_list_of_character_when_given_string_contains_one_character () {
        // given
        Anagram anagram = new Anagram();
        List<String> expected = Collections.singletonList("A");

        // when
        List<String> result = anagram.of("A");

        // then
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_list_of_swapped_two_characters_when_given_string_contains_two_characters () {
        // given
        Anagram anagram = new Anagram();
        List<String> expected = Arrays.asList("AB", "BA");

        // when
        List<String> result = anagram.of("AB");

        // then
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_list_of_swapped_three_characters_when_given_string_contains_three_characters () {
        // given
        Anagram anagram = new Anagram();
        List<String> expected = Arrays.asList("ABC", "ACB", "BAC", "BCA", "CAB", "CBA");

        // when
        List<String> result = anagram.of("ABC");

        // then
        assertThat(result, is(expected));
    }

    @Test
    public void should_return_list_of_swapped_n_characters_when_given_string_contains_n_characters () {
        // given
        Anagram anagram = new Anagram();
        List<String> expected = Arrays.asList(  "biro", "bior", "brio", "broi", "boir", "bori",
                "ibro", "ibor", "irbo", "irob", "iobr", "iorb",
                "rbio", "rboi", "ribo", "riob", "robi", "roib",
                "obir", "obri", "oibr", "oirb", "orbi", "orib");

        // when
        List<String> result = anagram.of("biro");

        // then
        assertThat(result, is(expected));
    }

}
