package pdp.uz.Dars_5_String_1;

public class HomeWorkReview {

    public static void main(String[] args) {

        //f(0) = 0
        //f(1) = 1
        //f(2) = f(1) + f(0) = 1
        //f(3) = f(2) + f(2) = 2
        //...
        //f(n) = f(n-1) + f(n-2)
//        long result = firstTask(100);
//
//        System.out.println(result);

//        int secondTask = secondTask(11);
//
//        System.out.println(secondTask);

        thirdTask(312);

    }

//    public static int secondTask(int n){
//
//        if (n < 0) {
//            return 0;
//        }
//
//        return n + secondTask( n - 1);
//    }

    public static void thirdTask(int n){

        if (n == 0) {
            return;
        }

        //1- > 5 ; 2 -> 4; 3 - > 7
        int a = n % 10;

        // 745 / 10 = 74; 2- > 7; 3 -> 0;
//        thirdTask(n / 10);

        switch (a){
            case 0:
                System.out.print("nol ");
                break;
            case 1:
                System.out.print("bir ");
                break;
            case 2:
                System.out.print("ikki ");
                break;
            case 3:
                System.out.print("uch ");
                break;
        }

        // 745 / 10 = 74; 2- > 7; 3 -> 0;
        thirdTask(n / 10);

    }


    public static long firstTask(int n) {

        if (n == 0)
            return 0;

        if (n == 1 || n == 2)
            return 1;

        //n-1 - > f(n)
        long nMinusOne = 1;

        //n-2 -> f(n-1)
        long nMinusTwo = 1;

        //fibonacci
        long fibonacci = 0;

        for (int i = 3; i <= n; i++) {

            //fibonacci
            fibonacci = nMinusOne + nMinusTwo;

            //
            nMinusTwo = nMinusOne;

            //
            nMinusOne = fibonacci;
        }

        return fibonacci;
    }

}
