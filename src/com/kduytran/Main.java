package com.kduytran;

public class Main {

    public static void main(String[] args) {
        PhoneNumber common = PhoneNumber.of(123, 1234);
        PhoneNumber common2 = PhoneNumber.of(123, 1234);
        System.out.println(common == common2);
    }

}