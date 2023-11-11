package pdp.uz.Dars_6_Array;

public class ForByElement {

    public static void main(String[] args) {

        int[] array = {1,2,3,45,67};

//        for (int i = 0; i < array.length; i++) {
//
//            int element = array[i];
//
//        }

        for(int element : array){

            System.out.print(element);

        }

    }

}
