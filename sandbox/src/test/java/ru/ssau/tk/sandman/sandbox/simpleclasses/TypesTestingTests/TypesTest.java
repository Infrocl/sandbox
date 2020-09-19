package ru.ssau.tk.sandman.sandbox.simpleclasses.TypesTestingTests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static ru.ssau.tk.sandman.sandbox.simpleclasses.TypesTesting.Types.printType;

public class TypesTest {
    private ByteArrayOutputStream output = new ByteArrayOutputStream(); //именно этот поток, потому что его легко преобразовать в строку

    @BeforeTest
    public void setUpStreams() {
        System.setOut(new PrintStream(output)); //теперь то, что должно было выводиться в консоль, будет сохранено в потоке output
    }

    @Test
    public void testByte() {
        byte oneByte = 127;
        printType(oneByte);
        int returnInt = 1275;
        oneByte = (byte) returnInt;
        printType(oneByte);
        Assert.assertEquals(output.toString(), "byte\r\nbyte\r\n"); // \r - carriage return CR, \n - linefeed LF
    }

    @Test
    public void testShort() {
        short returnShort = -1100;
        printType(returnShort);
        Assert.assertEquals(output.toString(), "short\r\n");
    }

    @Test
    public void testChar() {
        char returnChar = 'Ф';
        printType(returnChar);
        Assert.assertEquals(output.toString(), "char\r\n");
    }

    @Test
    public void testInt() {
        int returnInt = 550;
        printType(returnInt);
        Assert.assertEquals(output.toString(), "int\r\n");
    }

    @Test
    public void testLong() {
        long returnLong = 300L;
        printType(returnLong);
        Assert.assertEquals(output.toString(), "long\r\n");
    }

    @Test
    public void testFloat() {
        float returnFloat = .0f;
        printType(returnFloat);
        Assert.assertEquals(output.toString(), "float\r\n");
    }

    @Test
    public void testDouble() {
        double returnDouble = 0.001;
        printType(returnDouble);
        Assert.assertEquals(output.toString(), "double\r\n");
    }

    @Test
    public void testBoolean() {
        boolean returnBoolean = false;
        printType(returnBoolean);
        Assert.assertEquals(output.toString(), "boolean\r\n");
    }

    @Test
    public void testObject() {
        printType(null);
        Assert.assertEquals(output.toString(), "null\r\n");
        output.reset();
        Integer returnInteger = 20;
        printType(returnInteger);
        Assert.assertEquals(output.toString(), "class java.lang.Integer\r\n");
    }

    @AfterMethod
    public void cleanOutPut() {
        output.reset();
    }

    @AfterTest
    public void cleanUpStreams() {
        System.setOut(System.out);
    }
}
