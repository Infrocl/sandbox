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
}
