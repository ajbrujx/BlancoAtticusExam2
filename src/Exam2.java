import java.util.Scanner;

public class Exam2 {
    private String name;
    private int age;
    private Scanner input = new Scanner(System.in);



    /*
     * A constructor with a String parameter and an int parameter that does the following:
     * Initializes the name instance variable with the value of the String parameter.
     * Initializes the age instance variable with the value of the int parameter.
     * Calls the outputToTerminal method and passes the literal string “Initial age “ as the argument.*/
    public Exam2(String name, int age){
        this.name = name;
        this.age = age;
        outputToTerminal("Initial age");
        return;
    }

    /*A void method named, outputToTerminal with one String parameter that does the following:
    prints the parameter value on one line.
    Calls the chooseFormat method and "handles" the returned value.
    Calls the prepOutput method, using the return value from the chooseFormat method call above as its argument, and "handles the returned value.
    The returned value from the call to prepOutput will be used in a print command and displayed on its own line.
    Calls the canVote method and "handles" the returned value.
    If the canVote return value is true, print "Eligible to vote" to the terminal window.
    Otherwise, print "Not eligible to vote" to the terminal window.*/
    public static void outputToTerminal(String initialAge){
        return;
    }


    /*
    * A method named, chooseFormat with a return type of boolean and no parameters that does the following:
    * Prompts the user to input the integer 1 for long format and 2 for short format.
    * Returns true if the input from the user is a 1 otherwise returns false.*/
    public static void chooseFormat(){
        return;
    }

    /*A method named, prepOutput with a return type of String and one parameter of type boolean that does the following:
    If the argument passed to the method is false, returns ONLY the name instance variable.
    If the argument passed to the method is true, returns the instance variable, name, and the instance variable, age,
    with parenthesis around the age value (e.g. Jane (25) ) as a single string.*/
    public static void prepOutput(){
        return;
    }

    /*
    * A method named, canVote with a return type of boolean and no parameters that returns true if age is 18 or greater
    * and false otherwise.*/
    public static void canVote(){
        return;
    }

    /*A void method named, incAge with no parameters that does the following:
    Increments age instance variable by 1.
    Calls the outputToTerminal method using the literal string “age change results” as the argument.
    Zip and attach your project file to this exam question.*/
    public static void incAge(){
        return;
    }



}
