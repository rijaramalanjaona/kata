package dev.rija.tdd;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
    public List<String> of(String s) {
        List<String> result = new ArrayList<>();
        int len = s.length();
        if (len <= 1) {
            result.add(s);
        } else {
            for (int i = 0; i < len; i++) {
                List<String> anagramsOfRest = of(deleteCharAt(s, i));
                String firstChar = s.substring(i, i + 1);
                for (String anagramOfRest : anagramsOfRest) {
                    result.add(firstChar + anagramOfRest);
                }
            }
        }
        return result;
    }

    private String deleteCharAt(String s, int index) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(index);
        return sb.toString();
    }
}
