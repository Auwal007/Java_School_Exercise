public class Animal {
    public void move() {
        System.out.println("Animal is running");
    }
}

class Dog extends Animal {

    public void move() {
        System.out.println("The dog is running");
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("The cat is running");
    }
}

class Snake extends Animal {
    public void move() {
        System.out.println("The snake is crawling");
    }
}

