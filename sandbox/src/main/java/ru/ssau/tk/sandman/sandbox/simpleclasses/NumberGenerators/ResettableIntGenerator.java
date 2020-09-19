package ru.ssau.tk.sandman.sandbox.simpleclasses.NumberGenerators;

public class ResettableIntGenerator extends IntGeneratorImpl implements Resettable, IntGenerator {
    @Override
    public int nextInt() {
        return super.nextInt();
    }

    @Override
    public void reset() {
        super.counter = 0;
    }
}
