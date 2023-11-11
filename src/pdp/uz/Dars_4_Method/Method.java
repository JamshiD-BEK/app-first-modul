package pdp.uz.Dars_4_Method;

import java.util.Scanner;
public class Method {
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        String name = scanner.nextLine();
//
//        hello(name);



//        System.out.print("Min: ");
//        int min = scanner.nextInt();
//        System.out.print("Max: ");
//        int max = scanner.nextInt();
//
//        int generateRandomRange = generateRandomRange(min, max);
//
//        System.out.println(generateRandomRange);
//

//
//        int limit = scanner.nextInt();
//
//        for (int i = 3; i < limit; i++) {
//            boolean isPrime = isPrime(i);
//
//            if (isPrime)
//                System.out.println("tub son -> " + i);
//        }

//        int limitTwo = scanner.nextInt();
//
//        for (int i = 3; i < limitTwo; i++) {
//            boolean prime = isPrime(i);
//            if (prime)
//                System.out.println(i);
//        }
    }


    public static void hello(String name){
        System.out.println("Hello " + name);
    }


    public static int generateRandomRange(int min, int max){
        if (min > max) {
            System.out.println("Sonlar xato");
            return -1;
        }

        int result = (int) (Math.random() * (max - min)) + min;
        return result;
    }



}
