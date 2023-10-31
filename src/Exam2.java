import java.util.Scanner;

public class Exam2 {
    private final String name;
    private int age;
    private final Scanner input = new Scanner(System.in);
    private static final String[] formatOption = {"long", "short"};


    public Exam2(String name, int age) {
        this.name = name;
        this.age = age;
        outputToTerminal("Initial " + age);
    }

    public void outputToTerminal(String initialAge) {
        System.out.println(initialAge);
        System.out.println(prepOutput(chooseFormat()));
        if (canVote()) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public boolean chooseFormat() {
        boolean formatSelection = Boolean.parseBoolean(null);
        int userSelection;

        for (int i = 0; i < formatOption.length; i++) {
            System.out.printf("\"%d\": %s%n", i + 1, formatOption[i]);
        }

        do {
            System.out.println("--Select a format--");
            userSelection = Integer.parseInt(input.nextLine());

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

    public void incAge(){
        age++;
        outputToTerminal("age change results");

    }
}
