import java.util.Scanner;
public class TestQuestion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time in 24 hours format: ");
        int time = input.nextInt();
        //int time = 24;
        if (time >= 6 && time <=12) {
            System.out.println("Good Morning!");
        }
        else if (time >= 12 && time < 18) {
            System.out.println("Good Afternoon!");
        }
        else {
            System.out.println("Time out of range! The time has to be only between morning and afternoon ( i.e between 6-18 ).");
        }
        }
    }