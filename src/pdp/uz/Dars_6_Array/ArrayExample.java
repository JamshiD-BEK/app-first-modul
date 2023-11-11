package pdp.uz.Dars_6_Array;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample {

    public static void main(String[] args) {

//        double pi = Math.PI;

        //default values of primitive types
        //int -> 0, short,double,float,long,byte -> 0
        //boolean = false

//        int[] array = new int[6];

//        int number = array[1];
//
//        System.out.println(number);

//        for (int i = 0; i < 6; i++) {
//            array[i] = i+1;
//        }

//        array[5] = 890;
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//        System.out.println(array);

//        for (int i = 0; i < array.length; i++) {
//            int number = array[i];
//            System.out.println(number);
//        }

        //1-USUL
        //int[] array = new int[6];

        //2-USUL
//       int[] array = new int[]{1,2,76,90,78,31,97,45,12};

        //3-USUL
//        int[] array = {62,234,123,45,67,2378,346778};


       /* Scanner scanner = new Scanner(System.in);

        System.out.print("Size ni kiriting: ");
        int size = scanner.nextInt();

        long[] myArray = new long[size];

        for (int i = 0; i < myArray.length; i++) {

            System.out.print("Index ni kiriting :");
            int index = scanner.nextInt();

            System.out.print(index+" - > " + "element : ");
            int number = scanner.nextInt();

            myArray[index] = number;

        }

        String toString = Arrays.toString(myArray);

        System.out.println(toString);*/

//        fillRandom();

        sortArray();
    }

    private static void sortArray() {

        int[] newArray = new int[]{90,54,67,9,12,45,21,76};

        System.out.println(Arrays.toString(newArray));

        Arrays.sort(newArray);

        System.out.println(Arrays.toString(newArray));

        int index = Arrays.binarySearch(newArray, 67);
        System.out.println(index);

    }

    public static void fillRandom(){

        double[] array = new double[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.random() * 100);//34.78 -> 34
        }

        String toString = Arrays.toString(array);
        System.out.println(toString);

    }
}
