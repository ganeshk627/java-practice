package day09;

import day03.ConditionalClass;
import day09.toppings.Chocolated;
import day09.toppings.NutsFilled;

public class IceCream {

    private String companyName = "Arun Ice Cream";

    public static void main(String[] args) {

        IceCream iceCream = new IceCream();
        System.out.println(iceCream.companyName);
        Servings servings = new Servings(); // same package
        servings.cup();
        servings.stick();
        int no_of_cups = servings.no_of_cups;
        int no_of_stick = servings.no_of_stick;


        NutsFilled nutsFilled = new NutsFilled();
        nutsFilled.almonds();
        int amount_of_almonds = nutsFilled.amount_of_almonds;

        Chocolated chocolated = new Chocolated();
//        chocolated.

        Chocolated.chocochips();
        int amount_of_chocochips = Chocolated.amount_of_chocochips;

        System.out.println(Chocolated.name);
        Chocolated.name = "Kritik Roshan"; // changing static attributes
        System.out.println(Chocolated.name);

        System.out.println(chocolated.dob);
//        chocolated.dob = "2000"; // trying to change final attributes
        System.out.println(chocolated.dob);

        ConditionalClass conditionalClass = new ConditionalClass();
    }
}
