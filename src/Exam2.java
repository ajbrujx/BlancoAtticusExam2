import java.util.Scanner;

public class Exam2 {
    private String name;
    private int age;
    private Scanner input = new Scanner(System.in);
    private static String[] formatOption = {"long", "short"};


    public Exam2(String name, int age) {
        this.name = name;
        this.age = age;
        outputToTerminal("Initial " + age);
    }


    /*
    // prints the parameter value on one line.
    //Calls the chooseFormat method and "handles" the returned value.
    Calls the prepOutput method, using the return value from the chooseFormat method call above as its argument, and "handles the returned value.
    The returned value from the call to prepOutput will be used in a print command and displayed on its own line.
    Calls the canVote method and "handles" the returned value.
    If the canVote return value is true, print "Eligible to vote" to the terminal window.
    Otherwise, print "Not eligible to vote" to the terminal window.*/
    public void outputToTerminal(String initialAge) {
        System.out.println(initialAge);
        boolean truefalse = chooseFormat();
        prepOutput(truefalse);
    }

    public static boolean chooseFormat() {
        boolean formatSelection = false;
        Scanner s = new Scanner(System.in);
        int userSelection = 0;

        for (int i = 0; i < formatOption.length; i++) {
            System.out.printf("\"%d\": %s%n", i + 1, formatOption[i]);
        }

        do {
            System.out.println("--Select a format--");
            userSelection = Integer.parseInt(s.nextLine());

            switch (userSelection) {
                case 1 -> formatSelection = true;
                case 2 -> formatSelection = false;
                default -> System.out.println("Invalid choice.");
            }
        } while (!(userSelection == 1) && !(userSelection == 2));

        return formatSelection;
    }

    public String prepOutput(boolean tf) {
        if (tf) {
            return String.format("%s (%d)", name, age);
        } else {
            return name;
        }
    }



    public boolean canVote(){
        return (age >= 18);
    }


    /*A void method named, incAge with no parameters that does the following:
    Increments age instance variable by 1.
    Calls the outputToTerminal method using the literal string “age change results” as the argument.
    Zip and attach your project file to this exam question.*/
    public static void incAge(){
        return;
    }
}
