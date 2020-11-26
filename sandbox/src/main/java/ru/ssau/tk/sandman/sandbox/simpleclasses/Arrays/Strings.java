package ru.ssau.tk.sandman.sandbox.simpleclasses.Arrays;

public class Strings {
    private Strings() {
    }

    public static void printStringAsChars(String string) {
        for (int i = 0; i != string.length(); i++) {
            System.out.println(string.charAt(i));
        }
    }

    public static void getBytesFromString(String string) {
        byte[] bytes = string.getBytes();
        for (byte oneByte : bytes) {
            System.out.println(oneByte);
        }
    }

    public static void compareStrings() {
        String string = "abc";
        String secondString = new String(string);
        System.out.println(string == secondString);
        System.out.println(string.equals(secondString));
    }

    public static boolean isPalindrome(String string) {
        for (int i = 0; i != string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean notEqualInCase(String firstString, String secondString) {
        if (secondString == null || firstString == null || secondString.equals(firstString)) {
            return false;
        } else {
            return secondString.equalsIgnoreCase(firstString);
        }
    }

    public static void studyCharacterEscaping() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public static int indexOfSubstring(String string, String substring) {
        return string.indexOf(substring);
    }

    public static int indexOfSubstringInSecondHalf(String string, String substring) {
        return string.indexOf(substring, string.length() / 2);
    }
}
