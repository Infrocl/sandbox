package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class IntGeneratorImpl implements IntGenerator {
    public int counter = 0;

    @Override
    public int nextInt() {
        counter += 1;
        return counter - 1;
    }
}