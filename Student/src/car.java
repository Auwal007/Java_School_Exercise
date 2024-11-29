class Car {
    // Private data members
    private String model;
    private int speed;

    // Public getter for model
    public String getModel() {
        return model;
    }

    // Public setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Public getter for speed
    public int getSpeed() {
        return speed;
    }

    // Public setter for speed with validation
    public void setSpeed(int speed) {
        if (speed >= 0) { // Speed should not be negative
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Toyota");
        car.setSpeed(120);

        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Speed: " + car.getSpeed());

        car.setSpeed(-50); // Attempt to set invalid speed

    }
}
