package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class NamedPoint implements Resettable {
    public String name;

    @Override
    public void reset() {
        name = "Absent";
    }
}
