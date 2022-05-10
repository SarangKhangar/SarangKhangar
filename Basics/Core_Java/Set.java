package Basics.Core_Java;

import java.util.HashSet;

public class Set {
    public static void main(String[] args){
        HashSet<Integer> s = new HashSet<>();
        s.add(11);
        s.add(22);
        s.add(33);
        s.add(44);

        s.forEach(System.out::println);
    }
    
}
