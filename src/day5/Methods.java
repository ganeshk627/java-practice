package day5;

public class Methods {

    // no of parameters accepted is 255
    public void hello(){ // non return , wo param
        System.out.println("Hello");
    }
    public String hi() { // return, wo param
        return "Hi";
//        return "guys";
    }

    public void sayurname(String name) { //non-return, with param
        System.out.println("Your name is :" + name);
    }

    public int add(int a, int b) { // return, with param
        return a+b;
    }

    public static void ganesh() {
        System.out.println("Ganesh");
    }



    public static void main(String[] args) {

        Methods m = new Methods();
        m.hello();
        String message = m.hi();
        System.out.println(message);
        System.out.println(message.length());
//        System.out.println(m.hi());


        m.sayurname("10");
        m.sayurname("Myname123");


        //
        m.add(4, 6);

        System.out.println(m.add(6, 4));
        int added = m.add(11, 22);
        System.out.println(added);

        Methods.ganesh();  //ClassName.attibute/method()

    }
}
