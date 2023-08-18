package day13.constructor;

public class Bus {

    public Bus() { // automatically called when object created
        System.out.println("starting...");
    }

    public void left() {
        System.out.println("left");
    }

    public void right() {
        System.out.println("right");
    }

    public void horn() {
        System.out.println("horn");
    }


    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.left();
        bus.right();

        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

    }
}
