package pdp.uz.Dars_10_Bitwise_etc;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a = 10, b = 7;
//        System.out.println(Integer.toBinaryString(10));  // 2likka otkazadi
//        System.out.println(Integer.toBinaryString(7));
//        System.out.println(Integer.parseInt("1101", 2));
//        System.out.println(Integer.parseInt("1111", 2));  // 2likdan 10likka otkazadi
//
//        System.out.println(a ^ b);
//        System.out.println(0 ^ 0);
//        System.out.println(a | b);  // 15
//        System.out.println(a & b);  // 2

//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.toBinaryString(4));
//        System.out.println(Integer.toBinaryString(8));
//        System.out.println(Integer.toBinaryString(16));
//        System.out.println(Integer.toBinaryString(32));
//        System.out.println(Integer.toBinaryString(64));

        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        if ((number & (number - 1)) == 0){
//            System.out.println("Ha 2 ning darajasi");
//        }else{
//            System.out.println("Yo'q, 2ning darajasi emas");
//        }

//        int n = scanner.nextInt();
//        int [] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextInt();
//        }
//        int summa = 0;
//        for (int i = 0; i < n; i++) {
//            summa = summa ^ array[i];
//        }
//
//        System.out.println(summa);


//        int a = 5;
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.parseInt("101000", 2));
//        System.out.println(a << 3);  // left shift - 2 ga kopaytirish

        //System.out.println(changeToReverse("xyCBA12CBAyz", "CBA"));
        //                                      xyCBA12CBAyz

//        System.out.println(changeLast2Bit(7));
//        System.out.println(Integer.toBinaryString(7));
//        System.out.println(Integer.toBinaryString(9));
//        System.out.println(Integer.toBinaryString(11));
//        System.out.println(Integer.toBinaryString(13));
//        System.out.println(Integer.toBinaryString(15));
//        System.out.println();
//        System.out.println(Integer.toBinaryString(16));
//        System.out.println(Integer.toBinaryString(18));
//        System.out.println(Integer.toBinaryString(20));
//        System.out.println(isOdd(178));

        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }

    private static int factorial(int number) {
        if (number == 1){
            return 1;
        }

        return factorial(number - 1) * number;
    }

    private static int recursion(int number) {
        if (number == 0){
            return 0;
        }

        return recursion(number - 1) + 2;
    }


    public static boolean isOdd(int number){
        if ((number & 1) == 1){
            return true;
        }else{
            return false;
        }
    }
    private static int changeLast2Bit(int number) {
        int erased = number >> 2;
        int newNumber = erased << 2;
        return number - newNumber;
    }


    private static String changeToReverse(String str, String part) {
        StringBuilder sb = new StringBuilder();
        for (int i = part.length() - 1; i >= 0; i--) {
            sb.append(part.charAt(i));
        }
        String reverse = sb.toString();
        return str.replace(part, reverse);
    }
}