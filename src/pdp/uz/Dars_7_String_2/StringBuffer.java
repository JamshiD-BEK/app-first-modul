package pdp.uz.Dars_7_String_2;

public class StringBuffer {

    public static Integer countOfViews = 1000;//blocklayman
    //1-user nechchi 1000
    //2-user nechchi 1000

    public static void main(String[] args) {

        countOfViews++;// read, increment, write
        //1000 -> 1001
        //1-user 1000 -> 1001 write
        //2-user 1000 -> 1001 write

//        String str = "Hello";
//        for (int i = 0; i < 100; i++) {
//            str = str + i; //1,12,123,1234
//        }
//
//        System.out.println(str);

        //Thread safety ya'ni bir nechta thread bir vaqtda murojaat qilsa har
        // biri navbatma navbat amaliyot bajaradi.(1-thread bajarilguncha 2-si kutadi)
//        StringBuffer stringBuffer = new StringBuffer();

        //Thread safety emas ya'ni 2-ta thread bir vaqtda kelsa ikkala amal ham
        //bir vaqtda bajariladi
//        StringBuilder stringBuilder = new StringBuilder();
//
//        for (int i = 0; i < 1000; i++) {
//            stringBuffer.append(i);
//        }
//
//        System.out.println(stringBuffer.toString());

//        StringBuffer stringBuffer = new StringBuffer()
//                .append("Hello world");

        //16 -> 16*2 + 2 = 34

//        System.out.println(System.identityHashCode(stringBuffer));

//        stringBuffer.append("123");
//        System.out.println(System.identityHashCode(stringBuffer));
//        System.out.println(stringBuffer.capacity());

//        stringBuffer.append("123456789090909090");
//        System.out.println(stringBuffer.capacity());
//        stringBuffer.append("123456789090909090sdghdsgchdsgchgdsvgc");
//        System.out.println(stringBuffer.capacity());
//        System.out.println(stringBuffer.length());


//        System.out.println(System.identityHashCode(stringBuffer));



//        StringBuffer stringBuffer = new StringBuffer("Hello world");
//       // stringBuffer.reverse();
//
//        System.out.println(stringBuffer);



    }

}
