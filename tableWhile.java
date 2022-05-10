import java.util.Scanner;
public class tableWhile {
    public static void main(String[] args){
        int i=1;
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while( i<=10){
            System.out.println(i*n);
            i++;
        }
    }
}
