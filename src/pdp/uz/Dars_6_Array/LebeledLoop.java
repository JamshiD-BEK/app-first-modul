package pdp.uz.Dars_6_Array;

public class LebeledLoop {

    public static void main(String[] args) {

        myIf:if (true){
            System.out.println("test");
        }

        //1-for
        myFirstFor:for (int i = 0; i < 20; i++) {

            //2-for
            mySecondFor:for (int j = 0; j < 10; j++) {

                if (j == 6)
                    break myFirstFor;

            }

        }

        System.out.println("Text");

    }

}
