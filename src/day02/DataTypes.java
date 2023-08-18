package day02;

public class DataTypes {

    public static void main(String[] args) {

        //// numbers
        int number1 = 123434; // int 32 bit
        int number2 = 0;
        int number3 = -5756;
        // - 2147483648,0,2147483647

        float pi = 3.14F;

        long phone_number = 8768876880999L;
        double reg_number = 8768876880999D;

        //// boolean
        boolean isIndian = true; // either true or false


        //// text
        char grade = 'A';
        String mobile = "9834234234"; // collections of characters, it should be enclosed with "" double quotes
        System.out.println(number1);
        System.out.println(mobile);
        System.out.println(mobile.length());

        String quote = "Good morning fellows!";
        System.out.println(quote.split(" ").length); // split() will return an array


        String[] splitted_quote = quote.split(" ");
        String[] splitted_byo_quote = quote.split("o");
        System.out.println(splitted_quote[2]);

        System.out.println(splitted_byo_quote.length);
        System.out.println(splitted_byo_quote[0]);
        System.out.println(splitted_byo_quote[1]);
        System.out.println(splitted_byo_quote[2]);
        System.out.println(splitted_byo_quote[3]);
        System.out.println(splitted_byo_quote[4]);
        System.out.println(splitted_byo_quote[5]);
        System.out.println(splitted_byo_quote[6]);



        // arrays - collection of similar data type

        int marks [] = {80, 20, 50, 40, 89};
        String subjects[] = {"tamil", "english", "maths"}; // index starts with 0



        System.out.println(marks.length);
        System.out.println(subjects.length);

        System.out.println(subjects[0]); // [index]
        System.out.println(subjects[1]); // [index]
        System.out.println(subjects[2]); // [index]
//        System.out.println(subjects[3]);




    }
}
