package ru.ssau.tk.sandman.sandbox.simpleclasses.Arrays;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

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

    @Test
    public void testIsNotEqual() {
        assertTrue(Strings.notEqualInCase("ABC", "abc"));
        assertTrue(Strings.notEqualInCase("abc", "ABC"));
        assertFalse(Strings.notEqualInCase(null, null));
        assertFalse(Strings.notEqualInCase(null, ""));
        assertFalse(Strings.notEqualInCase("ыв", null));
        assertFalse(Strings.notEqualInCase("", ""));
    }

    @Test
    public void testStudyCharacterEscaping() {
        Strings.studyCharacterEscaping();
    }

    @Test
    public void testIndexOfSubstring() {
        assertEquals(Strings.indexOfSubstring("abcbcac", "ca"), 4);
        assertEquals(Strings.indexOfSubstring("Only losers pass null to this method", "null"), 17);
        assertEquals(Strings.indexOfSubstring("Only losers pass null and null, and null, and..", "null"), 17);
    }

    @Test
    public void testIndexOfSubstringInSecondHalf() {
        assertEquals(Strings.indexOfSubstringInSecondHalf("abcabcac", "ca"), 5);
        assertEquals(Strings.indexOfSubstringInSecondHalf("Only losers pass null to this method", "null"), -1);
        assertEquals(Strings.indexOfSubstringInSecondHalf("Only losers pass null and null, and null, and..", "null"), 26);
    }
}