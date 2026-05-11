public class Vehicle {
    protected String color;
    protected int numberOfPassengers, cargoCapacity,fuelCapacity;

    public Vehicle(int fuelCapacity, int cargoCapacity, String color, int numberOfPassengers) {
        this.fuelCapacity = fuelCapacity;
        this.cargoCapacity = cargoCapacity;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
    }

    public void work() {

        System.out.println("This vehicle is " + this.color + " with " + this.numberOfPassengers + " Passenger/s");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
