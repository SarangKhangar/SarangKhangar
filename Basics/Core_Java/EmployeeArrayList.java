package Basics.Core_Java;
import java.util.*;


public class EmployeeArrayList {
     int EmpID;
     String EmpName;
     int EmpExp;
     int EmpSalary;
     String EmpDesi;
    public EmployeeArrayList(int empID, String empName, int empExp, int empSalary, String empDesi) {
        EmpID = empID;
        EmpName = empName;
        EmpExp = empExp;
        EmpSalary = empSalary;
        EmpDesi = empDesi;
    }
    @Override
            public String toString() {
                return "EmployeeArrayList [EmpDesi=" + EmpDesi + ", EmpExp=" + EmpExp + ", EmpID=" + EmpID
                        + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
            }}
            class emplo{
        public static void main(String[] args){
            ArrayList<EmployeeArrayList> list = new ArrayList<EmployeeArrayList>(); 
            EmployeeArrayList E1 = new EmployeeArrayList(1111, "Sarang", 1, 6, "Sr.SD");
            EmployeeArrayList E2 = new EmployeeArrayList(2222, "Khangar", 1, 6, "Sr.SD");
            list.add(E1);
            list.add(E2);
            list.forEach(a-> System.out.println(a));
           /* for( EmployeeArrayList i : list){
                System.out.println(EmpDesi+" "+EmpExp+" " +EmpID+" "+EmpName+" " +EmpSalary);
                
            }*/
       
                
             }
       
       
        }
        
        


                        
                        
                    
                
            
