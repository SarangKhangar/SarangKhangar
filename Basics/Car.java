package Basics;
import java.util.Scanner;
public class Car {
    public Car(String carType, String colour, int power, String driveType, int launchYear) {
        CarType = carType;
        Colour = colour;
        Power = power;
        DriveType = driveType;
        LaunchYear = launchYear;
    }
    String CarType;
    String Colour;
    int Power;
    String DriveType;
    int LaunchYear;
    public String getCarType() {
        return CarType;
    }
    @Override
    public String toString() {
        return "Car [CarType=" + CarType + ", Colour=" + Colour + ", DriveType=" + DriveType + ", LaunchYear="
                + LaunchYear + ", Power=" + Power + "]";
    }
    public void setCarType(String carType) {
        CarType = carType;
    }
    public String getColour() {
        return Colour;
    }
    public void setColour(String colour) {
        Colour = colour;
    }
    public int getPower() {
        return Power;
    }
    public void setPower(int power) {
        Power = power;
    }
    public String getDriveType() {
        return DriveType;
    }
    public void setDriveType(String driveType) {
        DriveType = driveType;
    }
    public int getLaunchYear() {
        return LaunchYear;
    }
    public void setLaunchYear(int launchYear) {
        LaunchYear = launchYear;
    }
}
class CarSystem{
    static Scanner sc = new Scanner(System.in);
     public static Car AddCar(){
     System.out.println("entr car type");
     Scanner sc5 = new Scanner(System.in);
     String CarType = sc5.nextLine();
     System.out.println("entr car colour");
     Scanner sc1 = new Scanner(System.in);
     String colour = sc1.nextLine();
     System.out.println("entr car power");
     Scanner sc2 = new Scanner(System.in);
     int Power = sc2.nextInt();
     System.out.println("entr car drive type FWD FRWD RWD");
     Scanner sc3 = new Scanner(System.in);
     String DriveType = sc3.nextLine();
     System.out.println("entr car launch year");
     Scanner sc4 = new Scanner(System.in);
     int LaunchYear = sc4.nextInt();
     Car C = new Car(CarType, colour, Power, DriveType, LaunchYear);
     System.out.println("Car created succesfully");
     System.out.println(C);
     return C;
     }
     public static void main(String[] args){
         System.out.println("1.to create Car");
         System.out.println("2.Exit System");
         int n = sc.nextInt();
         switch(n){
             case 1:
             AddCar();
             break;
             case 2:
             System.out.println("System exited");
             break;
            }
        }
    }









