package dev.rija.tdd;

/**
 * You get first two starting numbers, 0 and 1,
 * and the next number in the sequence is always the sum of the previous two numbers.
 * 0, 1, 1, 2, 3, 5, 8, 11,...
 */
public class Fibonnacci {

    public int display(int position) {
        if (position <= 1) {
            return position;
        } else {
            return display(position - 1) + display(position - 2);
        }
    }
}
