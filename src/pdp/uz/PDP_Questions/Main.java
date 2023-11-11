package pdp.uz.PDP_Questions;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {


    public static void main(String[] args) {

        int[] arr = {5, 8, 2, 10, 3}; // Arrayni aniqlab olamiz
        int maxIndex = -1; // Local maksimum indeksini saqlash uchun o'zgaruvchi
        for (int i = 1; i < arr.length - 1; i++) { // Array boshidan va oxiridan birinchi elementlarni tekshirishga kerak emas
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) { // Agar element local maksimum bo'lsa
                maxIndex = i; // Indeksni saqlash uchun o'zgaruvchiga tayinlaymiz
            }
        }
        if (maxIndex == -1) { // Agar local maksimum topilmagan bo'lsa
            System.out.println("Local maksimum topilmadi");
        } else { // Aks holda
            System.out.println("Local maksimum indeksi: " + maxIndex);
        }




//        Random random = new Random();
//        int n = 5;
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = random.nextInt(10);
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        int[] arr2 = new int[n/2];
//        int j=arr[1];
//        for (int i = 0; i < n/2 ; i++) {
//            arr2[i] = arr[i+1];
//
//        }
//            System.out.print(Arrays.toString(arr2));

    }
}