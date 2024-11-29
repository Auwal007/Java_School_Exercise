
public class Main {
    public static void main(String[] args) {
        car tesla = new car();
        car toyota = new car();

        tesla.type = "cyber truck";
        tesla.model = "model x";
        tesla.year = 2023;

        tesla.start();
        System.out.print(tesla.type);

    }
}