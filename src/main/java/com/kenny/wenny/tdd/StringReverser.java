package com.kenny.wenny.tdd;

public class StringReverser {
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        var result = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }
}
