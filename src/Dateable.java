import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
        System.out.println("Welcome to dating age calculator!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age (please enter an integer): ");
        int Age = scanner.nextInt();
        int Date = 7 + Age/2;
        System.out.println("Your date should be at least " + Date + " years old!");

        
    }
}
