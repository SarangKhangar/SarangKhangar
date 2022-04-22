import java.util.Scanner;
public class PrimeNo{
    public static void main(String[] args){
        System.out.println("Enter Number");
        Scanner scaa = new Scanner(System.in);
        int n = scaa.nextInt();
        for(int i = 2; i<n; i++){
            if(n % i == 0){
                System.out.println(n +" is not prime");
            }
                else if(i == n){
                    System.out.println(n +" is prime");
                }
         }
     }
    
}
