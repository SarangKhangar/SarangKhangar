package Basics.Core_Java;
import java.util.*;

public class ListOne {
    public static void main(String [] args){
        ArrayList<Integer> List  = new ArrayList<>();
        List.add(40);
        List.add(30);
        List.add(20);
        List.add(10);
        Collections.sort(List);

        System.out.println(List.size());
        System.out.println(List.get(3));
        System.out.println(List.contains(30));
        System.out.println(List.contains(60));
        System.out.println(List.indexOf(30));
        System.out.println(List.set(1, 90));

       /* System.out.println("for loop :--");
        for(int i=0; i<List.size(); i++){
            System.out.println(List.get(i));
        }
        Collections.sort(List);
        System.out.println("sorting by using for loop :--");
        for(int i=0; i<List.size(); i++){
            System.out.println(List.get(i));
        }*/
        
}
}