package day12;

public class Child2 implements Father, Mother {

    public static void main(String[] args) {

        Child2 child = new Child2();
        System.out.println(child.graduate());
    }

    @Override // annotation
    public String graduate() {
        return "IPS";
    }

    @Override
    public void eatWell() {

    }

    @Override
    public void buyProperty() {

    }
}
