package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class Point {
    public final double x;
    public final double y;
    public final double z;

    public Point(double x, double y, double z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static void main(String[] args) {
        Point firstPoint = new Point(2.5, 5, 3.77);
        Point secondPoint = new Point(0.538, 1.284, 6.225);
        System.out.print( "Координаты первой точки: (" + firstPoint.x + ", "+ firstPoint.y + ", " + firstPoint.z + ")");
    }
}

