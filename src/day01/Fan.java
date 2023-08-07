package day01;

// Class name should be same as Class File name
public class Fan {
    // should start with uppercase
    // should not start with number
    // should contain upper, lower or number
    // only "_" underscore is allowed

    public static void main(String[] args) {
        System.out.println("Hello world!");

        Fan fan = new Fan();
        fan.swtichon();
        fan.switchoff();
        // System.out.println("Summa");
        int rpm1 = fan.rpm;
        System.out.println(rpm1);
    }

    // 1. attributes or variables
    String color = "Brown"; // collection of characters
    int rpm = 150;
    int no_of_wings = 3;
    String [] components = new String[]{"Capacitor", "Coil"};

    // 2. behaviours or methods
    public void swtichon(){
        System.out.println("Spinning.....");
    }

    public void switchoff(){
        System.out.println("Switched off....");
    }


}