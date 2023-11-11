package pdp.uz.Dars_6_Array;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Exercise {

    public static int[] makeLast(int[] nums) {

        //3,4,6
        //int lastElement = 6;
        int lastElement = nums[nums.length - 1];

        int[] newArray = new int[nums.length * 2];

        newArray[newArray.length - 1] = lastElement;

        return newArray;
    }

    public static int[] biggerTwo(int[] a, int[] b) {



        int sumA = 0;
        int sumB = 0;
        for (int number : a) {
            sumA += number;
        }

        for (int number : b) {
            sumB += number;
        }

        return sumA >= sumB ? a : b;

//        if (sumA > sumB)
//            return a;
//        else
//            return b;
    }


}
