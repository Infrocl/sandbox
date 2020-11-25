package ru.ssau.tk.sandman.sandbox.simpleclasses;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringsTest {
    @Test
    public void testPrintStringAsChars() {
        Strings.printStringAsChars("AbCD12K3");
    }

    @Test
    public void testGetBytesFromString() {
        Strings.getBytesFromString("Печатаем на русском");
        System.out.println("next string:");
        Strings.getBytesFromString("Type in english");
    }

    @Test
    public void testCompareStrings() {
        Strings.compareStrings();
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(Strings.isPalindrome("abcba"));
        assertTrue(Strings.isPalindrome("abba"));
        assertFalse(Strings.isPalindrome("abc"));
    }
}