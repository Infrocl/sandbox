package ru.ssau.tk.sandman.sandbox.simpleclasses;

public class Points { //класс для работы с объектами класса Point
    private Points() {} //приватный конструктор, чтобы никто не создал экземпляр этого класса

    public static Point sum(Point firstPoint, Point secondPoint) {
        Point point = new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
        return point;
    }

    public static Point substruct(Point firstPoint, Point secondPoint) {
        Point point = new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
        return point;
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        if (secondPoint.x == 0 || secondPoint.y == 0 || secondPoint.z == 0) {
            throw new ArithmeticException("Dividing by zero");
        }
        Point point = new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
        return point;
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        Point point = new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
        return point;
    }

    public static Point enlarge(Point point, double number){
        return point = new Point(point.x * number, point.y * number, point.z * number );
    }

    public static double lenght(Point point){
        return point.length();
    }

    public static Point opposite(Point point){
        return point = new Point(-point.x, -point.y, -point.z); //получается -0.0, убрать "-", если придётся выводить
    }                                                        // значения полей с помощью java.text.DecimalFormat

    public static Point inverse(Point firstPoint){
        Point secondPoint = new Point(1, 1, 1);
        return firstPoint = Points.divide(secondPoint, firstPoint);
    }

    public static double scalarProduct(Point firstVector, Point secondVector){
        return firstVector.x * secondVector.x + firstVector.y * secondVector.y + firstVector.z * secondVector.z;
    }

    public static Point vectorProduct(Point firstVector, Point secondVector){
        double newX = firstVector.y * secondVector.z - firstVector.z * secondVector.y;
        double newY = firstVector.z * secondVector.x - firstVector.x * secondVector.z;
        double newZ = firstVector.x * secondVector.y - firstVector.y + secondVector.x;
        Point point = new Point(newX, newY, newZ);
        return point;
    }
}
