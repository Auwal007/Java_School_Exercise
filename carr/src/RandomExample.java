import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1; // 0 to 9 + 1 to get 1 to 10
        System.out.println("Random number between 1 and 10: " + randomNumber);
    }
}
