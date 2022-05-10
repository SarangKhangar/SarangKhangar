package Basics.Core_Java;

import java.util.ArrayList;
import java.util.*;
import java.util.function.*;
public class ListString {
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("Sarang");
        str.add("Shubham");
        str.add("Tejas");
        str.add("Kaustubh");
        str.add("Beldar");

        Collections.sort(str);
        System.out.println(str);
        System.out.println(str.get(3));
        System.out.println(str.set(2, "Abhi"));
        System.out.println(str.get(3));
        System.out.println(str);
        System.out.println((str.indexOf("Tejas")));
        

    }
    
}
