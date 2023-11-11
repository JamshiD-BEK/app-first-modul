package pdp.uz.Dars_10_Bitwise_etc;

import java.util.Random;
public class DRYTest {

    public static void main(String[] args) {


        System.out.println(getSmsCode("Verification code", 4));

//        int a =9;
//        int b =7;
//        int max;
//
//        max = getMax(a, b);
//
//        System.out.println(max);

//        int max = Math.max(9, 7);
//
//        int min = Math.min(7, 8);

    }

    public static String getSmsCode(String prefix, int digit) {
        Random random = new Random();
        int code = random.nextInt((int) Math.pow(10, digit - 1), (int) Math.pow(10, digit) - 1);
        return String.format("%s %d", prefix, code);
    }

    private static int getMax(int a, int b) {
        int max;
        if (a > b)
            max = a;
        else
            max = b;
        return max;
    }

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int average(int a, int b) {
        int sum = sum(a, b);
        int average = sum / 2;
        return average;
    }

}
