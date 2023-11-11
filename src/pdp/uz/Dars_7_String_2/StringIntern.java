package pdp.uz.Dars_7_String_2;

public class StringIntern {

    public static void main(String[] args) {

        String str2 = new String("Hello");

        String str1 = "Hello";

        String str3 = str2.intern();

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));


    }

}
