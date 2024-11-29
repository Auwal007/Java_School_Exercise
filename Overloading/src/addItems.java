import java.util.Scanner;
public class addItems {
    static int add(int z, int b){
        return z+b+b;
    }
    static int add(int a, int b, int c ){
        return a+b+c;
    }
    static String add(String a, String b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
    static boolean add(boolean a, boolean b){
        return a=b;
    }
    static String add(int a, String b){
        return a+b;
    }

    public static void main(String[] args) {

        System.out.println(add(5, 6));
        System.out.println(add(5, 6, 7));
        System.out.println(add("Hello ", "World!!!"));
        System.out.println(add(5.5, 6.6));
        System.out.println(add(true, true));
        System.out.println("Its " + add( 5, " O'Clock") + " in the morning");
    }
}
