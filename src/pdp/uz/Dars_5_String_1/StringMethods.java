package pdp.uz.Dars_5_String_1;

import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {

        //indexi
//        indexOf();

        //bormi
//        contain();

        //bo'shliqmi
//        isBlank();

//        join();

//        replace();

//        repeat();

//        split();

//        startsWith();

//        charAt();

//        lowerCase();

//        trim();

//        String string = 12 + 48 + "str" + 71 + 90;
        //10648str71
        //60str7190
        //60str161
        //
//        System.out.println(string);


        //     "745"
        //yetti to'rt besh
//        int number = 123;
//
//        String valueOf = String.valueOf(number);
//
//        System.out.println(valueOf);



    }

    private static void trim() {

        String fullname = "   Akmal Akmalov   ";
        System.out.println(fullname);

        String trim = fullname.trim();
        System.out.println(trim);
//        String replace = fullname.replace(" ", "");
//        System.out.println(replace);

    }

    private static void lowerCase() {

        String str = "HeLLO WoRld";

        String toLowerCase = str.toLowerCase();

        System.out.println(toLowerCase);

    }

    private static void charAt() {

        String str = "Hello";

        char charAt = str.charAt(0);
        System.out.println(charAt);

    }

    private static void startsWith() {

        String str = "Hello pdp";

        boolean startsWith = str.startsWith("Hello");
//        boolean startsWith = str.endsWith("pdp");

        System.out.println(startsWith);

    }

    private static void split() {

        String str = "Hello pdp lorem ipsum var char mar";

        String[] split = str.split(" ");

        System.out.println(Arrays.toString(split));

    }

    private static void repeat() {
        String str = "Hello world";
        String repeat = str.repeat(12);
        System.out.println(repeat);
    }

    private static void replace() {
        String str = "Hello worldooooooo";
        String replace = str.replace("o", " yangi str ");
        System.out.println(replace);
    }

    private static void join() {

        String join = String.join(" ", "1", "2", "3", "4", "5");
        System.out.println(join);

    }

    private static void isBlank() {
        String str = "        9";

        System.out.println(str.isBlank());
    }

    private static void contain() {
        String str = "Hello world";

        boolean contains = str.contains("ullo");

        System.out.println(contains);
    }

    public static void indexOf() {


        String str = "Hello world";
        //            0123456789

        int indexOf = str.indexOf("o",5);
//        int indexOf = str.lastIndexOf("o");

        System.out.println(indexOf);

    }
}
