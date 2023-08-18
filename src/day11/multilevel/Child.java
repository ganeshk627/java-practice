package day11.multilevel;

public class Child extends Father {
    private int no_of_wheels = 1;
    public void buyProp() { // override
        System.out.println("child");
    }

    public void buyProp(String str) {// overloading

    }

    public void buyProp(String str, int num) { //overloading

    }
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.no_of_wheels);
    }
}
