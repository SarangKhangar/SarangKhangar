import java.util.Scanner;
public class NameAge {
    public static void main(String[] args){
        System.out.println("Enter Name of The Person");
        Scanner MyObj = new Scanner(System.in);
        String Name = MyObj.nextLine();
        System.out.println("Enter Age of The Person");
        int Age = MyObj.nextInt();
        if(Age >= 18){
            System.out.println(Name + " is an adult");}
            else{
                System.out.println(Name + " is not adult");
            }
        }




    
    }
    

