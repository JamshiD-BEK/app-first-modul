package pdp.uz.Dars_7_String_2;

public class Example {

    public static void main(String[] args) {

        String s1 = new String("Scientech");//constant pool da bor
        String s2 = new String("Scientech");//
        String s3 = "Scientech";
        String s4 = "Scientech";

        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

    }
}
