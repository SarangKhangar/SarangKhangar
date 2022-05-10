package Basics.Core_Java;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class medical {
    String petientName;
    int patientAge;
    int PIN;
    int contact;
    int wardNo;
    public medical(String petientName, int patientAge, int pIN, int contact, int wardNo) {
        this.petientName = petientName;
        this.patientAge = patientAge;
        PIN = pIN;
        this.contact = contact;
        this.wardNo = wardNo;
    }
    public String getPetientName() {
        return petientName;
    }
    public void setPetientName(String petientName) {
        this.petientName = petientName;
    }
    public int getPatientAge() {
        return patientAge;
    }
    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }
    public int getPIN() {
        return PIN;
    }
    public void setPIN(int pIN) {
        PIN = pIN;
    }
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public int getWardNo() {
        return wardNo;
    }
    public void setWardNo(int wardNo) {
        this.wardNo = wardNo;
    }
    @Override
    public String toString() {
        return "medical [PIN=" + PIN + ", contact=" + contact + ", patientAge=" + patientAge + ", petientName="
                + petientName + ", wardNo=" + wardNo + "]";
    }
}
class system{

    public static medical addpetientMedical(){
       // Queue<medical> q = new ArrayDeque<>();
       Stack<medical> q = new Stack<>();

    System.out.println("enter name");
    Scanner sc1 = new Scanner(System.in);
    String name = sc1.nextLine();
    System.out.println("entr age");
    Scanner sc2 = new Scanner(System.in);
    int n = sc2.nextInt();
    System.out.println("entr pin");
    Scanner sc3 = new Scanner(System.in);
    int nn = sc3.nextInt();
    System.out.println("entr contact");
    Scanner sc4 = new Scanner(System.in);
    int nnn = sc4.nextInt();
    System.out.println("entr ward no.");
    Scanner sc5 = new Scanner(System.in);
    int nnnn = sc5.nextInt();
    medical p = new medical(name, n, nn, nnn, nnnn);
    q.push(p);
    System.out.println(p);
    return p;


}
public static void main(String[] args){
     // Queue<medical> q = new ArrayDeque<>();
     Stack<medical> q = new Stack<>();

     medical p = addpetientMedical();
      q.push(p);
    q.forEach(e -> {
        System.out.println("name :" + e.getPetientName());
        System.out.println("age :" + e.getPatientAge());
        System.out.println("pin :" + e.getPIN());
        System.out.println("contact :" + e.getContact());
        System.out.println("ward :" + e.getWardNo());
    });
}
}
