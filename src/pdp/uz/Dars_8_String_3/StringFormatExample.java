package pdp.uz.Dars_8_String_3;

import javax.swing.text.DateFormatter;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class StringFormatExample {

    public static void main(String[] args) {


        String str = "Hello var qalaysan var nima gaplar var";

        String s = "Hello " + "45" + " qalaysan " + "var" + "nima gaplar " + "var";

        String.format("Hello %s bdhsbch %s svdcghvdscg %s","bhdbc",80);


//        numberFormatExample();
//        dateExample();
//        numberExample();

//        System.out.println("Assalomu alaykum");

//        Scanner scanner = new Scanner(System.in);
//
//        String name = scanner.nextLine();
//        int age = scanner.nextInt();

        //32 -> "32"
//        String format = String.format("Hello %s Yoshing %s dami",name, age);
//        String format = String.format("Hello %2$s yoshin %1$S dami %s", name,age);
//        String format = String.format("Hello %s yoshin %S dami %s", name,age);
//        System.out.println();

//        System.out.print(format);

    }

    public static void numberExample(){

//        double d = 1/3.0;
//
//        String format = String.format("%.2f", d);
//
//        System.out.println(format);

        //LONG, INTEGER, SHORT, -> ...
//        String str = String.format("Sizning balingiz %d", 889889L);


        //8.899000e+02 -> + 8 * 10^2
//        String str = String.format("Sizning balingiz %.1e", 889.90);
//        String str = String.format("Sizning balingiz %.1f", 889.90);
        String str = String.format("Sizning balingiz %.1f", 889.90);
        System.out.println(str);
    }



    public static void dateExample(){

        //KUN:OY:YIL SOAT:MINUT
        Date myDate = new Date();

        //year
//        System.out.printf("bugun %tY",myDate);

        //YEAR MONTH DAY
//        System.out.printf("bugun %tY %<tm %<td",myDate);

//        System.out.printf("hafta kuni %tA",myDate);
//        System.out.printf("hafta kuni %ta",myDate);
//        System.out.printf("Oy %tB",myDate);
//        System.out.printf("Oy %tB",myDate);

//        String format = String.format("sana : %td/%<tm/%<tY %<tH:%<tM", myDate);
//        System.out.println(format);

//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
//
//        String format1 = dateFormat.format(myDate);
//
//        System.out.println(format1);

//        System.out.println(myDate);

        moneyFormatExample();

    }

    private static void moneyFormatExample() {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

        double money = 14.98;

        String format = currencyInstance.format(money);
        System.out.println(format);
    }

    public static void numberFormatExample(){



    }


}
