package ru.ssau.tk.sandman.sandbox.simpleclasses;

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
}
