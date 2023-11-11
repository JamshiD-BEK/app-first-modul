package pdp.uz.Dars_11_Test;

import java.util.Random;

public class ExerciseFour {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        exercise4();

        int[][] matrix = new int[9][9];

        fillMatrixWithRandom(matrix, 0, 9);

//        printMatrix(matrix);

//        exercise5(matrix);

        exercise6(matrix);
    }

    private static void exercise6(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j || (matrix.length - 1) == i + j){
                    System.out.print(" " +(i+1) + " ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }

    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void fillMatrixWithRandom(int[][] matrix, int minValue, int maxValue) {
        Random rand = new Random();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextInt(maxValue - minValue + 1) + minValue;
            }
        }
    }


    private static void exercise5(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (i == (matrix.length - 1) / 2 || j == (matrix.length - 1) / 2) {
                    System.out.print(" " + matrix[i][j] + " ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();

        }

    }

    private static void exercise4() {
        int n = 8;

        int counter = 1;
        for (int i = n; i >= 1; i--) {

            String str = "  ".repeat(counter);
            System.out.print(str + i + "\n");
            counter++;
        }

        counter = n - 1;
        for (int i = 2; i <= n; i++) {

            String str = "  ".repeat(counter);
            System.out.print(str + i + "\n");
            counter--;

        }
    }

}

