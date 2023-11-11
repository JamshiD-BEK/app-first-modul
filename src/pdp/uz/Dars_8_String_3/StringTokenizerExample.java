package pdp.uz.Dars_8_String_3;

import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import java.util.StringTokenizer;

public class StringTokenizerExample {

    public static void main(String[] args) {

        exampleSplit();

//        StringTokenizer stringTokenizer = new StringTokenizer("Hello world"," ");

        //["Hello","world"]
        //[0,1,2,3,4]
        //         🔺
        //hasMoreTokens() -> ()

//        while (stringTokenizer.hasMoreTokens()){
//            System.out.println(stringTokenizer.nextToken());
//        }

//        String str = "Tepst 123";
//
//        String[] split = str.split("e");
//
//        System.out.println(split[1].length());
//
//        System.out.println(Arrays.toString(split));

    }

    public static void exampleSplit(){

        String str ="dXp1bVNlcnZpY2U6cm9vdDEyMw==";

        //select * from users where user_name ='akmal' or 1=1' and password = '2$shbcashbchachb';
        //jdbc connection ->

        String token = new String(Base64.getDecoder().decode(str));

        String[] split = token.split(":");

        String username = split[0];
        String password = split[1];

        System.out.println(username);
        System.out.println(password);

        //auth
        //

//        System.out.println(token);

    }

}
