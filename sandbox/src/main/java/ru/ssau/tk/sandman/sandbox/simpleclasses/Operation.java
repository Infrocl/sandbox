package ru.ssau.tk.sandman.sandbox.simpleclasses;

public abstract class Operation {
    public abstract double apply(double number);

    public double applyTriple(double number) {
        for (int i = 0; i != 3; i++) {
            number = apply(number);
        }
        return number;
    }
}
