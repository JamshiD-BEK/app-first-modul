package pdp.uz.Dars_4_Method;

public class Recursion {
    public static void main(String[] args) {

//        f(0) = 0
//        f(1) = 1

        //f(2) = f(1) + f(0) = 1
        //f(3) = f(2) + f(1) = 2
        //f(4) = f(3) + f(2) = 2 + 1 = 3
        //f(5) = f(4) + f(3) = 3 + 2 = 5
        //f(6) = f(5) + f(4) = 5 + 3 = 8
        //f(7) = f(6) + f(5) = 8 + 5 = 13

//        int number = fibonacciCalculator(40);
//
//        System.out.println(number);


    }

    public static int factorial(int n){

        //5
        if (n == 0)
            return 1;

        //5 -> method(4) 120
        //4 -> method(3) 24
        //3 -> method(2) 6
        //2 -> method(1) 2
        //1 -> method(0) 1
        int number = n * factorial(n - 1);
        return number;
    }

    public static int fibonacciCalculator(int n){

        if (n < 0)
            throw new RuntimeException("Xato raqam berding");

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        //f(n) =        f(n-1)                     +       f(n-2);
        int number = fibonacciCalculator(n - 1) + fibonacciCalculator(n - 2);
        return number;
    }


    public static void head(int counter){

        if (counter < 2)
            return;

        counter--;
        head(counter);

        System.out.println("son -> " + counter);
    }
    public static void tail(int counter) {

        //2 - base condition(rekursiyani to'xtatuvchi shart)
        if (counter < 0)
            return;

        //TASK(ISH)
        System.out.println("Hello world");

        //3 - change state
        counter--;

        //1-itselft call (o'z-o'ziga murojaat)
        tail(counter);
    }

}
