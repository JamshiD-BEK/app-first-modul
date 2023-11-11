package pdp.uz.Dars_7_String_2;

public class CreatingTypeOfString {

    public static void main(String[] args) {

        String str1 = "Hello1";
        String str2 = new String("Hello1");

        char[] chars = new char[]{'H','e','l','l','o','1'};

        String str3 = new String(chars);

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }

}
