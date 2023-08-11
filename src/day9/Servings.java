package day9;

public class Servings {

    public int no_of_cups = 10;
    private int no_of_cone = 20;
    protected int no_of_stick = 30;

    public void cup() {
        System.out.println("Cup!");
    }

    private void cone() {
        System.out.println("Cone!");
    }

    protected void stick() {
        System.out.println("Stick!");
    }
}
