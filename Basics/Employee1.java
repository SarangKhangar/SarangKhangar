package Basics;
import java.time.LocalDate;
import java.util.Scanner;
 class Employee1 {
    
    String Ename;
    String Erole;
    double Esalary;
    double Eexp;
    String Edob;
    
    public Employee1(String ename, String erole, double esalary, double eexp, String edob) {
        Ename = ename;
        Erole = erole;
        Esalary = esalary;
        Eexp = eexp;
        Edob = edob;
    }
    public String getEname() {
        return Ename;
    }
    public void setEname(String ename) {
        Ename = ename;
    }
    public String getErole() {
        return Erole;
    }
    public void setErole(String erole) {
        Erole = erole;
    }
    public double getEsalary() {
        return Esalary;
    }
    public void setEsalary(double esalary) {
        Esalary = esalary;
    }
    public double getEexp() {
        return Eexp;
    }
    public void setEexp(double eexp) {
        Eexp = eexp;
    }
    public String getEdob() {
        return Edob;
    }
    public void setEdob(String edob) {
        Edob = edob;
    }
    @Override
    public String toString() {
        return "Employee1 [Edob=" + Edob + ", Eexp=" + Eexp + ", Ename=" + Ename + ", Erole=" + Erole + ", Esalary="
                + Esalary + "]";
        }  }    
                 class EmployeeSystem{
               static Scanner sc = new Scanner(System.in);
                public static Employee1 addemployee(){
                System.out.println("Entr the employee Name");
                String Ename = sc.nextLine();
                System.out.println("Entr the employee Role");
                String Erole = sc.nextLine();
                System.out.println("Entr the employee salary");
                double Esalary = sc.nextDouble();
                System.out.println("Entr the employee experiance");         
                double Eexp = sc.nextDouble();
                System.out.println("Entr the employee DOB dd/mm/yyyy");
                Scanner ss = new Scanner(System.in);
                String Edob = ss.nextLine();
                String d = Edob.split("/")[0];
                String m = Edob.split("/")[1];
                String y = Edob.split("/")[2];
               System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d)));
                Employee1 E = new Employee1(Ename, Erole, Esalary, Eexp, Edob);
                System.out.println("employee created succesfully");
                            System.out.println(E);
                      return E;
            
         }

                 public static void main(String[] args){
                 System.out.println("1.To add emplyee");
                 System.out.println("2.TO exit system ");
                 int n = sc.nextInt();
                     switch(n){
                 case 1:
                 System.out.println("how many employee do u want to add");
                 Scanner t = new Scanner (System.in);
                 int y = t.nextInt();
                 for(int i=0; i<y; i++){          
                 addemployee();}
                 break;
                 case 2:
                 System.exit(0);
                 case 3:
                 default:
                 break;
                }
            }
        }
    
    
    
