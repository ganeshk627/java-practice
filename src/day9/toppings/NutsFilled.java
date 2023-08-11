package day9.toppings;

public class NutsFilled {

    public int amount_of_almonds = 10;
    private int amount_of_cashews = 20;
    protected int amount_of_currants = 30;

    public void almonds(){
        System.out.println("Almonds!");
    }

    private void cashews() {
        System.out.println("Cashews!");
    }

    protected void currants() {
        System.out.println("Currants!");
    }
}
