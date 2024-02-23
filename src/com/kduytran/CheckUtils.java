package com.kduytran;

public class CheckUtils {
    public static boolean checkAgrument(boolean expression) {
        if (!expression) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
