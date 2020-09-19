package ru.ssau.tk.sandman.sandbox.simpleclasses.TypesTesting;

import ru.ssau.tk.sandman.sandbox.simpleclasses.Pointing.NamedPoint;

public class TestingStuff {
    public static void main(String[] args) {
        byte someValue = -125;
        Types.printType(someValue);
        char someCharValue = (char) someValue; //byte -> char; теперь это обозначение символа "\uFF83"
        Types.printType(someCharValue);
        int someIntValue = someCharValue; // char -> int;  полученное значение 65 411 - UTF-16 представление этого символа
        short someShortValue = (short) someCharValue; //char -> short; someShortValue = -125
        Types.printType(someShortValue);
        someIntValue = someShortValue; //short -> int
        Types.printType(someIntValue);
        long someLongValue = someIntValue; //int -> long
        Types.printType(someLongValue);
        double someDoubleValue = someLongValue; //long -> double
        Types.printType(someDoubleValue);
        float someFloatValue = (float) someDoubleValue; //double -> float
        Types.printType(someFloatValue);
        boolean someBooleanValue = false;
        Types.printType(someBooleanValue);
        NamedPoint point = new NamedPoint();
        Types.printType(point);
        String s = "22";
        Types.printType(s);
        Types.printType(null);
    }
}
