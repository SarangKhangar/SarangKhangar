package Basics;
import java.util.Scanner;
public class ArrayEachMulti {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int multi=1;
        int[] array = new int[n];
        System.out.println("entr the array");
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
         }

           for(int i=0; i<n; i++){
               multi=multi*array[i];
           }
           System.out.println("multiplication of array : " + multi);
        }
}
