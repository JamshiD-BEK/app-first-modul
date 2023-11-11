package pdp.uz.Modul_1_Exam;

public class Exam {

    //Question-1 Bitwise
    public static int next(byte n){
        int num = (n >> 2);
        int num1 = (num << 2);
        return n - num1;
    }

    public static int recursion(int n, int m){
        if(m == 0) return 1;
        return recursion(n,m-1) * n;
    }

    public static void main(String[] args) {

        System.out.println( "2-savol javobi => " + recursion(2,4));

        System.out.println( "1-savol javobi => " + next((byte) 7));

        System.out.println( "3-savol javobi => " + reverce("pdp123 it maktab pdp123","pdp123"));

        four(3);

    }

    public static void massiv(int n){

    }

    public static void four(int n){

        String result = "";
        for (int i = n; i >= 1; i--) {
            result += " ".repeat((n-i)*2) + i + "\n";
        }
        for (int i = 2; i <= n; i++) {
            result += " ".repeat((n-i)*2) + i + "\n";
        }
        System.out.println("4-savol javobi => "+ "\n" + result);

    }


    public static String reverce(String s, String d){

        StringBuilder text = new StringBuilder();
        for (int i = d.length()-1; i >= 0; i--) {
            text.append(d.charAt(i));
        }
        String dd = text.toString();
        String res = s.replace(d,dd);
        return res;
    }
}
