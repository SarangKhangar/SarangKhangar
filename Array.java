import java.util.*;
public class Array {
    public static void main(String[] args){
        System.out.println("enter the size of array");
        Scanner Myobj = new Scanner(System.in);
        int n = Myobj.nextInt();
        int[] array = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter");
            array[i] = Myobj.nextInt();
         }              System.out.println("your array is");

         for(int i=0; i<n; i++){
         System.out.println(array[i]);}
    }
}
