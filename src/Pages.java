import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        System.out.println("Wanna know how many pages you should read before giving up on a book?" + "\n" + "If so, you are in the right place!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age (an integer please): ");
        int age = scanner.nextInt();
        int pages = 100 - age;
        System.out.println("Since you are " + age + " years old, " + "\n" + "You should read a minimum of " + pages + " pages before giving up on a book!" );
    }
}
