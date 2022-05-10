package Basics;

public class personOFhuman implements human {

    @Override
    public void walking() {
        // TODO Auto-generated method stub
        System.out.println("he is walking");
    }

    @Override
    public void eating() {
        // TODO Auto-generated method stub
        System.out.println("he is eating");
    }

    @Override
    public void brushing() {
        // TODO Auto-generated method stub
        System.out.println("he is brushing");
    }

    @Override
    public void sleeping() {
        System.out.println("he is sleeping");
    }
  public static void main(String[] args){
     new personOFhuman().sleeping();
     new personOFhuman().brushing();
     new personOFhuman().eating();
     new personOFhuman().walking();
  }    
}
