package Basics;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayMulti {

    public static void main(String[] args){
    System.out.println("Enter the number of students");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];
    int sum=0;
    System.out.println("entr marks of studnts");
    for(int i=0; i<n; i++){
        array[i] = sc.nextInt();
    }
    int Low=array[0];
    for(int i=0; i<n; i++){
        if(array[i]<Low){
           Low = array[i];
        }
    }
           int High = array[1];
            for(int i=0; i<n; i++){
            if(array[i]>High){
               High = array[i];
            }
        }
         // Arrays.sort(array);
         // int lowest = array[0];
         // int highest = array[array.length-1];

      for(int i=0; i<n; i++){
        sum=sum+array[i];
    }
         int avg = sum/n;
        System.out.println("lowest marks obtain: " + Low);
        System.out.println("highest marks obtain: " + High);
        System.out.println("average of marks obtain :" + avg);
    }
}
