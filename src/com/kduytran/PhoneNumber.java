package com.kduytran;

public class PhoneNumber {
    private static final PhoneNumber COMMON_PHONE_NUMBER = of(123, 1234);
    private final int areaCode;
    private final int number;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }

    public static PhoneNumber of(int areaCode, int number) {
        CheckUtils.checkAgrument(areaCode > 100);
        CheckUtils.checkAgrument(number > 1000);

        // Check if it is the common phone number
        if (areaCode == 123 && number == 1234) {
            return COMMON_PHONE_NUMBER;
        }

        return new PhoneNumber(areaCode, number);
    }

}
