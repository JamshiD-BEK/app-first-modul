package pdp.uz.Dars_4_Method;

import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Max ");
        int max = scanner.nextInt();
        System.out.print("Min ");
        int min = scanner.nextInt();

        double random = Math.random();

        int number = (int)(random * (max-min)) + min;
        System.out.println(number);



//        Scanner scanner = new Scanner(System.in);
//
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        double result = Math.pow(x, 5) + Math.pow(y, 1 / 7D) - Math.pow(x, 3 / 2.0) + Math.abs(Math.pow(x, 3));
//        System.out.println(result);
    }

}
