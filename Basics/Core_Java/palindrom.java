package Basics.Core_Java;
import java.util.Scanner;
public class palindrom {
 public static void main(String [] args){
     System.out.println("entr ur no");
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int rev=0;
     int cnt = n;
     while(n>0){
     int rem = n%10;
      n = n/10;
      rev = rev*10+rem;}
      System.out.println(rev);
      if(cnt==rev){
          System.out.println("no. is palindrom");
      }
      else{
          System.out.println("no. is not palindrom");
      }
     

 }
}
