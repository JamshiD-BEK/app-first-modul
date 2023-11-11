package pdp.uz.Dars_7_String_2;

public class ImmutableString {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        String replace = str1.replace("l", "9");

        System.out.println(str1);
        System.out.println(replace);

        String password = "Root_123$";//"oot_123"

        String substring = password.substring(2, 5);




    }
}
