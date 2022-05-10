import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        System.out.println("Enter weight range 1.greater than 90 2.less than 30 3.between 45-60");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 1:
            System.out.println("your fat");
            break;
            case 2:
            System.out.println("your thin");
            break;
            case 3:
            System.out.println("your healthy");
            break;
        }
    }
}
