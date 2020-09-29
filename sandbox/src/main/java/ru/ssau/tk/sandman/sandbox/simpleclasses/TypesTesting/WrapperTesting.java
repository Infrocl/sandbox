package ru.ssau.tk.sandman.sandbox.simpleclasses.TypesTesting;

public class WrapperTesting {

    public static Integer CONSTANT = 128;

    public static void main(String[] args) {
        //автоупаковка:
        //-передать примитив в метод, ожидающий обёртку
        //-присвоить обёртке примитив

        //автораспаковка
        //-если распаковываем null -> exception
        //-передать обёртку, когда ждали примитив
        //-присвоить примитиву обёртку
        // сравнение обёрток (кроме == и !=, там сравниваются ссылки)
        Character character = 'a'; //автоупаковка
        Character anotherCharacter = Character.valueOf('a'); //упаковка
        Character sameCharacter = new Character('a'); //новый объект
        Integer integer = Integer.valueOf(200);
        Integer sameInteger = Integer.valueOf(200);
        int number = integer; //автораспаковка
        int stillNumber = sameInteger.intValue(); //распаковка
        WrapperTesting.compareWithConstant(number); //автоупаковка
        WrapperTesting.compareWithWrapper(integer, sameInteger); //автораспаковка и сравнение примитивов
        WrapperTesting.compareWithZero(integer); //автораспаковка
        WrapperTesting.compareWithWrapper(character, anotherCharacter); //ссылки на один и тот же объект
        WrapperTesting.compareWithWrapper(sameCharacter, anotherCharacter); //сравнение уже разных объектов
        try {
            Integer nullInteger = null;
            int nullNumber = nullInteger.intValue();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void compareWithConstant(Integer wrapper) {
        if (CONSTANT <= wrapper) {
            System.out.println("<= " + wrapper);
        }
    }

    public static void compareWithZero(int number) {
        if (number > 0) {
            System.out.println("Be positive!");
        }
    }

    public static void compareWithWrapper(Character firstCharWrapper, Character secondCharWrapper) {
        if (firstCharWrapper == secondCharWrapper) {
            System.out.println(firstCharWrapper instanceof Character);
            System.out.println(secondCharWrapper instanceof Character);
        } else {
            System.out.println(firstCharWrapper + " != " + secondCharWrapper);
        }
    }

    public static void compareWithWrapper(Integer firstCharWrapper, Integer secondCharWrapper) {
        if (firstCharWrapper <= secondCharWrapper) {
            System.out.println(firstCharWrapper + " <= " + secondCharWrapper);
        } else {
            System.out.println(firstCharWrapper + " > " + secondCharWrapper);
        }
    }
}

