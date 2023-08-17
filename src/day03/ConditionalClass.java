package day03;

public class ConditionalClass {

    public static void main(String[] args) {

        int rupees = 100;
        int chocolate = 10;

        System.out.println(rupees-chocolate);

        // conditional loops

        int age = 10;


        //// arithmetic operators +, -, * (multiplication), / (division)

        //// relational operators (comparison)
        // == - equal
        // >= -
        // <=
        // !=


        // = assignment operator

        // increment ++, decrement --

        // || - either or


        /// loops: initialization, termination, increment/decrement

        // 1 if
        if(age>=18) { // if (condition)
            System.out.println("You are eligible to vote...");
        }



        int number = 10;
        // 2 if-else odd or even
       if((number%2)==0){
           System.out.println(number + " is even!!!");
       } else {
           System.out.println(number + " is odd!!!");
       }

       // 3. grade system
        float percentage = 50.20F;
       // 80 -a, 60 -b, c

        if(percentage>80) {
            System.out.println("Your grade is A!!!");
        } else if (percentage>60) {
            System.out.println("Your grade is B!!!");
        } else {
            System.out.println("Your grade is C!!!");
        }

        // 4. switch


        String switch_case = "fan";
        switch (switch_case) {
            case "fan":
                System.out.println("FAN!!!");
                break;
            case "light":
                System.out.println("LIGHT!!!");
                break;
            case "ac":
                System.out.println("AC!!!");
                break;
            default:
                System.out.println("We dont have " + switch_case);
                break;
        }

        // 5. while loop

        int day = 1;
        int no_of_classes = 10;
        while(day<=no_of_classes) {
            System.out.println("I am attedning class day " + day);
            day ++;
        }

        // 6. do while - executed atleast once even if condition false

        int attempt = 1;
        int max_attempt = 0;
        do {
            System.out.println("This is attempt no " + attempt);
            attempt ++;
        } while (attempt<=max_attempt);


        /// count control
        int java_class = 10;
        for(int today = 1; today<=java_class; today++) {
            System.out.println("Java class day " + today);
        }

        int m_lb = 25;
        int m_ub = 30;
        for(int i= m_lb; i<=m_ub; i++) {
            System.out.println("Looking for a girl marriage at age " + i);
        }

        int no_of_postman = 7;

        for(int j = no_of_postman; j>0; j--) {
            System.out.println("Classes remaining " + j);

        }

    }
}
