package day12;

public class Child implements Father, Mother {

    public static void main(String[] args) {
        System.out.println(Father.name);
        System.out.println(Mother.name);
        Child child = new Child();
        System.out.println(child.graduate());

    }

    @Override // annotation
    public String graduate() {
        return "IAS";
    }

    @Override
    public void eatWell() {

    }

    @Override
    public void buyProperty() {

    }
}
