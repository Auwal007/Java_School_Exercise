import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(7,10)+3;
        System.out.println("Random number between 7 and 10 + 3: " + randomNumber);
    }
}

