package com.systechafrica.part1.util;

public class ValidateInput {
    public static final boolean validate(String input) {
        if (input != null && input.length() > 0) {
            return true;
        }
        return false;
    }
}
