package pdp.uz.Dars_5_String_1;

public class StringExample {


    public static void main(String[] args) {

        //primitive
        //int, byte, short, char, long, boolean, double, float

        //     stack = > heap
        //            012345678

//        int length = str.length();
//        System.out.println(length);

//        System.out.println(System.identityHashCode(str));
//        str = "Yangi str";
//        System.out.println(System.identityHashCode(str));
//        String strSecond = "Hello pdp";
//        System.out.println(System.identityHashCode(strSecond));
//        String newStr = str.substring(6);
//        System.out.println(newStr);

//        String str = "Hello pdp";
//        //            012345678
//
//        // [2:4)
//        String substring = str.substring(2, 5);
//        System.out.println(substring);
//        System.out.println(str);

        String name = "Akmal";
//        String hello = "Akmal";
        String hello = new String("Akmal");
        System.out.println(System.identityHashCode(name));
        System.out.println(System.identityHashCode(hello));

        if (name.equals(hello)) {
            System.out.println("Teng");
        } else {
            System.out.println("Teng emas");
        }

//        String result = hello + name;

//        String concat = name.concat(hello);
//        System.out.println(concat);


//        System.out.println(result);


    }

}
