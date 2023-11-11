package pdp.uz.Any_Questions;

import java.util.Scanner;
public class Savollar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scan.nextInt();
        System.out.println(number(n));
    }

    public static void massive(int n){

    }
    static public float number(int n){
        float sum=0;
        for(int i=1; i<=n; i++){
            sum += 1f/i;
        }
        return sum;
    }
}
