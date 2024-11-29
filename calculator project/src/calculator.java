import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int num1, num2, prod, sum, diff, quot;
        int choice;
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Choose the mode of operation");
            System.out.println("==============================");
            System.out.println("1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division(/)");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("ADDITION");
                    System.out.println("=====================");
                    System.out.println("Enter First Number: ");
                    num1 = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    num2 = scan.nextInt();
                    sum = num1 + num2;

                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                    break;

                case 2:
                    System.out.println("SUBTRACTION");
                    System.out.println("=====================");
                    System.out.println("Enter First Number: ");
                    num1 = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    num2 = scan.nextInt();
                    diff = num1 - num2;

                    System.out.println("The product of " + num1 + " and " + num2 + " is " + diff);
                    break;
                case 3:
                    System.out.println("MULTIPLICATION");
                    System.out.println("=====================");
                    System.out.println("Enter First Number: ");
                    num1 = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    num2 = scan.nextInt();
                    prod = num1 * num2;

                    System.out.println("The sum of " + num1 + " and " + num2 + " is " + prod);
                    break;
                case 4:
                    System.out.println("DIVISION");
                    System.out.println("=====================");
                    System.out.println("Enter First Number: ");
                    num1 = scan.nextInt();
                    System.out.println("Enter Second Number: ");
                    num2 = scan.nextInt();
                    quot = num1 / num2;

                    System.out.println("The Quotient of " + num1 + " and " + num2 + " is " + quot);
                    break;

            }
        }
    }
}