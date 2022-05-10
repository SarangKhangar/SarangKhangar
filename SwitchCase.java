import java.util.Scanner;
public class SwitchCase{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from below list 1.India 2.Maharashtra 3.Jalgaon");
        int n = sc.nextInt();
        switch(n){
            case 1:
            System.out.println("India");
            break;
            case 2:
            System.out.println("Maharashtra");
            break;
            case 3:
            System.out.println("Jalgaon");
            break;
        }
    }
    
}
