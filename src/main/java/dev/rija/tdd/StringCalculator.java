package dev.rija.tdd;

public class StringCalculator {

    private static final String DEFAULT_SEPARATOR = ",";
    private static final String NEW_LINE = "\n";
    private static final String  DELIMITER_STARTER = "//";
    private static final int MAX_VALUE = 1000;

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        } else if (numbers.startsWith(DELIMITER_STARTER)) {
            String delimiter = numbers.substring(DELIMITER_STARTER.length(), DELIMITER_STARTER.length() + 1);
            String numbersToTreat = numbers.substring(DELIMITER_STARTER.length() + 1);
            return getSumNumbersSeparatedBy(numbersToTreat, delimiter);
        } else {
            return getSumNumbersSeparatedBy(numbers, DEFAULT_SEPARATOR);
        }
    }

    private int getSumNumbersSeparatedBy(String numbers, String separator) {
        numbers = convertNewLineToSeparator(numbers, separator);
        String[] arrayString = numbers.split(separator);
        int somme = 0;
        for (String s : arrayString) {
            int number = Integer.parseInt(s);
            if (number < 0) {
                throw new IllegalArgumentException("negatives not allowed");
            } else if (number > MAX_VALUE) {
                continue;
            } else {
                somme += number;
            }
        }
        return somme;
    }

    private String convertNewLineToSeparator(String numbers, String separator) {
        return numbers.trim().replaceAll(NEW_LINE, separator);
    }

}
