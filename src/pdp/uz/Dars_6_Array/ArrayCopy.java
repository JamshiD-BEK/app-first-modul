package pdp.uz.Dars_6_Array;

import java.util.Arrays;
public class ArrayCopy {

    public static void main(String[] args) {

        int[] array = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString(array));

        int[] array2 = new int[10];

        System.out.println(Arrays.toString(array2));

        System.arraycopy(array,2,array2,2,array.length-2);

        System.out.println(Arrays.toString(array2));
    }

}
