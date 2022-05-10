import java.util.Scanner;
public class ArrayString {
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("ENter the size if the array");
        int n = SC.nextInt();
        String[] SC_sc = new String[n];
        for(int i=0; i<n; i++){
            System.out.println("enetr the string");
            SC_sc[i] = SC.nextLine();
        } 
                System.out.println("your array of string is ");
                for(int i=0; i<n; i++){
                System.out.println(SC_sc[i]);}


    }
}   

