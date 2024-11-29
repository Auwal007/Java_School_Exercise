import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("This Program Displays The Day number You Choose From 1-7");
        System.out.println("Enter day number between 1-7: ");
        int day = scan.nextInt();
        //day =2;
        switch (day) {
            case 1:
                System.out.println("Day " + day + " is " + "Monday");
                break;
            case 2:
                System.out.println("Day " + day + " is " + "Tuesday");
                break;
            case 3:
                System.out.println("Day " + day + " is " + "Wednesday");
                break;
            case 4:
                System.out.println("Day " + day + " is " + "Thursday");
                break;
            case 5:
                System.out.println("Day " + day + " is " + "Friday");
                break;
            case 6:
                System.out.println("Day " + day + " is " + "Saturday");
                break;
            case 7:
                System.out.println("Day " + day + " is " + "Sunday");
                break;
            default:
                System.out.println("out of range");
        }
    }
}