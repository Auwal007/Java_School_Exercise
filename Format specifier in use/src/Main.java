import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("What is Your full name? ");
        String name = m.nextLine();
        System.out.println("What is your age? ");
        int age = m.nextInt();
        System.out.println("Which school did you attend?");
        String schoolName = m.next();
        System.out.printf("Hello, your full name is %s and you are %d years old and you attended %s.", name, age,schoolName );
    }
}