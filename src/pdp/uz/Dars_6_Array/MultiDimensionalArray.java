package pdp.uz.Dars_6_Array;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] matrix1 = {
                {45,12,31,0,90,65,41},//1
                {20,17},//2
                {89,6,2,7},//3
                {4},
                {}
        };


        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {

            int[] elements = matrix[i];

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = (int) (Math.random() * 40);

            }

        }


        for (int[] elements : matrix) {

            for (int element : elements) {

                System.out.print(element + "\t");

            }
            System.out.println();

        }

        //Matritsani toString methodi
//        System.out.println(Arrays.deepToString(matrix));



//        for (int i = 0; i < matrix.length; i++) {
//
//            int[] innerArray = matrix[i];
//
//            for (int j = 0; j < innerArray.length; j++) {
//
//                int element = matrix[i][j];
//
//                System.out.print(element + "\t");
//
//            }
//
//            System.out.println();
//
//        }


    }

}
