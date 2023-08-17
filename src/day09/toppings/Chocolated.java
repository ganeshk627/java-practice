package day09.toppings;

public class Chocolated {


    public static int amount_of_chocochips = 10;
    public static String name = "Ganesh";
    public final String dob = "1999";
    private static int amount_of_cashews = 20;
    protected static int amount_of_currants = 30;

    public static void chocochips() {
        System.out.println("Choco-chips!");
    }

    private static void chococream() {
        System.out.println("Choco-creams!");
    }

    protected static void chocorolls() {
        System.out.println("Choco-rolls!");
    }
}
