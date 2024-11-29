public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog, Cat, and Snake
        Dog dog = new Dog();
        Cat cat = new Cat();
        Snake snake = new Snake();

        // Printing individual move method of each object
        dog.move();
        cat.move();
        snake.move();

        // Adding the created objects to an array to print them all at once
        Animal[] race = {dog, cat, snake};

        for (Animal a : race) {
            a.move();
        }
    }

}


/*
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Snake()};

        for (Animal animal : animals) {
            animal.move();
        }
    }
}
 */