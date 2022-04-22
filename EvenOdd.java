import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
    System.out.println("enter the number");
    Scanner Obj = new Scanner(System.in);
    int a = Obj.nextInt();
    if (a % 2 == 0){
        System.out.println(a + " is even");
    }
    else{
        System.out.println(a + " is odd");
    }
}

}