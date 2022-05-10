import java.util.Scanner;
public class Fibonacci{      

    public static void main(String[] args){
        System.out.println("Enter the first number");
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        System.out.println("Enter the limit ");
        int n = sc.nextInt();
         int s = f + 1;
         System.out.println("your fibonacci series as below");
         System.out.println(f);
         System.out.println(s);
          for(int i=0; i<=n; i++){
                int t = f + s;
                if(t>=n){
                    break;}
                 System.out.println(t);
            f = s;
            s = t;
         }
    }
}
