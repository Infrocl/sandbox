package ru.ssau.tk.sandman.sandbox.simpleclasses;


public class TangentOperation extends Operation {
    @Override
    public double apply(double number) { //радианы
        if (Double.isNaN(number)) {
            throw new ArithmeticException("Can't calculate the tangent of the value: it's NaN.");
        }
        if (Double.isInfinite(number)) {
            throw new ArithmeticException("Can't calculate the tangent of the value: it's infinite.");
        }
        /*
        if ((number!=0) && (Math.abs(number)!=Math.PI) && (Math.abs(number % (Math.PI/2)) ) <= 0.000005) {
            throw new ArithmeticException("Tangent of the " + number + " doesn't exist. It's limit becomes infinite.");
            //TODO: переделать условие; не работает для чисел, близких к нулю
        }
         */
        return Math.tan(number);
    }
}
