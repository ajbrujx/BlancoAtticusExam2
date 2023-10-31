import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static String userName;
    private static int userAge;


    public static void getNameAge() {
        System.out.println("What is your name?");
        userName = input.nextLine();
        System.out.println("What is your age?");
        userAge = Integer.parseInt(input.nextLine());
    }

    public static void main(String[] args) {
        getNameAge();
        Exam2 exam2 = new Exam2(userName, userAge);

    }
}