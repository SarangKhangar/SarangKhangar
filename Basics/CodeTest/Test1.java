package Basics.CodeTest;
import java.util.*;
public class Test1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of string");
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        Scanner sc1 = new Scanner(System.in);
        String[] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i]=sc1.nextLine();
        }
        int len=0;
        for(int i=0;i<n;i++){
            len=arr[i].length();
            if(len%2==1)
            list.add(arr[i]);
        }
         if(list.size()==0)
         {
             System.out.println("better luck next time");
         }
          else{
              Iterator<String> itr=list.iterator();
              int max=-1;
              String res="";
              while(itr.hasNext()){
                  String temp=(String)itr.next();
                  if (temp.length()>max)
                  {
                      res=temp;
                      max=temp.length();
                  }
              }        System.out.println(res);

          } 

}
    
}
