package pdp.uz.Dars_4_Method;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {


        Math.pow(2,3);

//        print(15);

//        String largeStr = "Hello world";
//        String smallStr = "illo";
//
//        boolean existStr = existStr(largeStr, smallStr);
//        System.out.println(existStr);

//        double average = average(4, 5);
//        System.out.println(average);

//        int max = max(8, 5);
//
//        System.out.println(max);

//        System.out.println("Limitni kiriting");
//        int limit = getNumberFromUser();
//
//        int number = (int) (Math.random() * limit);
//
//        System.out.println("Tahminingizni kiritin");
//        int userOpinion = getNumberFromUser();
//
//        if (number == userOpinion) {
//            System.out.println("You win 🛍️");
//        } else {
//            System.out.println("You loose ❌");
//        }

    }

    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static int max(int a, int b) {
//        return a > b ? a : b;
        if (a > b)
            return a;
        else
            return b;
    }

    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    //large -> katta so'z userInout -> qidirilayotgan so'z
    public static boolean existStr(String large, String small) {
        return large.contains(small);
    }

    public static void print(int limit) {

        for (int i = 1; i < limit; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " -> just son");
            } else {
                System.out.println(i + " -> toq son");
            }

        }

    }
}
