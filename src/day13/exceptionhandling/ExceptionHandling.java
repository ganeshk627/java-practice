package day13.exceptionhandling;

public class ExceptionHandling {


/*
    try {
        // code block that produce Error or exception
    } catch(Exception e) {
        // catch block activated only if Exception occured in try block (atleast 1)
    } finally {
     // atleast 0, max 1
    }
*/


    public static void main(String[] args) {





        String quote = "Good morning fellows!";
        System.out.println(quote.split(" ").length); // split() will return an array


        String[] splitted_quote = quote.split(" ");
        String[] splitted_byo_quote = quote.split("o");
        System.out.println(splitted_quote[2]);


        try {
            System.out.println(splitted_byo_quote.length);
            System.out.println(splitted_byo_quote[0]);
            System.out.println(splitted_byo_quote[1]);
            System.out.println(splitted_byo_quote[2]);
            System.out.println(splitted_byo_quote[3]);
            System.out.println(splitted_byo_quote[4]);
            System.out.println(splitted_byo_quote[5]);
            System.out.println(splitted_byo_quote[6]);

        }
        catch (NullPointerException e) {
            System.out.println("null exe");
        }
        catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println(e);
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e) {
            System.out.println("exception");
        }
        finally {
            System.out.println("Finally!!!");
        }


        int marks[] = {80, 20, 50, 40, 89};
        String subjects[] = {"tamil", "english", "maths"}; // index starts with 0


        System.out.println(marks.length);
        System.out.println(subjects.length);

        System.out.println(subjects[0]); // [index]
        System.out.println(subjects[1]); // [index]
        System.out.println(subjects[2]); // [index]
//        System.out.println(subjects[3]);


    }

}
