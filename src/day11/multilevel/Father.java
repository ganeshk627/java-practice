package day11.multilevel;

public class Father extends GrandParent {
    protected int no_of_wheels = 4;
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.no_of_wheels);
    }

}
