package day11.multilevel;

public class Child extends Father {
    private int no_of_wheels = 1;
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.no_of_wheels);
    }
}
