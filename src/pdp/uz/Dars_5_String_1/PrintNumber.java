package pdp.uz.Dars_5_String_1;

public class PrintNumber {

    public static void main(String[] args) {

        printNumber(134);

    }

    public static void printNumber(int number){

        String text = String.valueOf(number);

        //0,1,2,3

        String replace = text
                .replace("0", " nol ")
                .replace("1"," bir ")
                .replace("2"," ikki ")
                .replace("3"," uch ")
                .replace("4"," to'rt ");

        System.out.println(replace);
    }

}
