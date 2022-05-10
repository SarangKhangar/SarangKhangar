package Basics;
import java.util.Scanner;
public class Array1{
    public static void main(String[] args){
        int[] arr = new int[5];
      /*  Object[] obj = new Object[3];
        obj[0] = 23;
        obj[1] = "sarang";
        obj[2] = 1.1;
        for(Object ob : obj){
        System.out.println(obj.toString());}*/

        Scanner sc = new Scanner(System.in);
        System.out.println("enter values");
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        int sum=0;
        for(int i : arr){
            sum=sum+i;
        }System.out.println(sum);
    }}
        
    

