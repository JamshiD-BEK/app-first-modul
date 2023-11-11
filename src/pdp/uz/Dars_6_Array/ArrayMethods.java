package pdp.uz.Dars_6_Array;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

//        arraysToString();

        arraysFill();

    }

    private static void arraysFill() {

        Object[] objects = new Object[10];

        objects[0] = 12;
        objects[1] = "String";

        int[] array = new int[10];

        Arrays.fill(array,13);

        System.out.println(Arrays.toString(array));

    }

    private static void arraysToString() {



    }

}
