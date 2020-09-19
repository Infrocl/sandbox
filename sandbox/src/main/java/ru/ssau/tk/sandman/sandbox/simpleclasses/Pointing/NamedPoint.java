package ru.ssau.tk.sandman.sandbox.simpleclasses.Pointing;

import ru.ssau.tk.sandman.sandbox.simpleclasses.NumberGenerators.Resettable;

public class NamedPoint extends Point implements Resettable {
    private String name;

    public NamedPoint(double x, double y, double z) {
        super(x, y, z);
    }

    public NamedPoint(double x, double y, double z, String name) {
        super(x, y, z);
        this.name = name;
    }

    public NamedPoint() {
        this(0, 0, 0, "Origin");
    }

    @Override
    public void reset() {
        name = "Absent";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
