public class Car {
    // the attributes/characteristics
    String model = "F690";
    int year = 2015;

    // the methods/behaviour
    public void start() {
        System.out.println("The car is staring");
    }

    public void drive() {
        System.out.println("The car is driving");
    }

    public static void main(String[] args) {
                // Create a Car object
                Car myCar = new Car();

                // print the car's attributes
                 System.out.println("The car model is " + myCar.model);
                 System.out.println("The car year of production is " + myCar.year);


                // Call the object's methods
                myCar.start();
                myCar.drive();
    }
}