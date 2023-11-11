package pdp.uz.Dars_2_DataTypes;


import java.util.Scanner;

/**
 * Bu class sjcjhbsdhjhjsdbch
 */
public class DataTypes {

    final float VALUE_OF_PI = 3.14F;

    /**
     * sdbchbshdcbhjsd
     * dcjhsdhjcbhjsdc
     * sdcbhsjdbchjbsd
     * sdjcbhsdbch
     *
     */
    public static void main(String[] args) {

        //BUTUN SONLAR byte(-128; 127), short(-32768 ;32767), int(-2 mlrd...; 2 mlrd...), long(-19 xonali; 19xonali)

        //byte myByteVariable = -128;
        byte myByteVariable = 127;
        System.out.println(myByteVariable);

        //short myShortVariable = -32768;
        short myShortVariable = -32768;
        System.out.println(myShortVariable);

//        int myIntVar = Integer.MIN_VALUE;
        int myIntVar = Integer.MAX_VALUE;

        long myLongVar = 30000000000000000L;


        float myFloatVar = 5676767676F;

        double myDouble = 87621761726371620.0;

        char myCharVar = '✅';

        boolean myBoolean = false;

        String myStr = "Hello world";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Int qiymat kiriting...");
        int intVar = scanner.nextInt();
        System.out.println("Int qiymat -> " + intVar);

        String str = scanner.next();


    }

}