package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class SqrtOperation extends Operation {
    @Override
    public double apply(double number) {
        if (Double.isNaN(number)){
            throw new ArithmeticException("Can't take square root of the value: it's NaN.");
        }
        if (number < 0) {
            throw new ArithmeticException("Only positive value is acceptable!");
        }
        return Math.sqrt(number);
    }

    @Override
    public double applyTriple(double number) {
        if (Double.isNaN(number)){
            throw new ArithmeticException("Can't take square root of the value: it's NaN.");
        }
        if (number < 0) {
            throw new ArithmeticException("Only positive value is acceptable!");
        }
        for (int i = 0; i != 3; i++) {
            number = apply(number);
        }
        return number;
    }
}
