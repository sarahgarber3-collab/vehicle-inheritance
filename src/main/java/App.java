public class App {
    public static void main(String[] args) {
        Moped m1 = new Moped();
        m1.setColor("Green");
        m1.setNumberOfPassengers(1);
        m1.setCargoCapacity(0); //ibs
        m1.setFuelCapacity(2);//Gallons
        m1.work();

        Car c1 = new Car();
        c1.setColor("Purple");
        c1.setNumberOfPassengers(4);
        c1.setCargoCapacity(850); //ibs
        m1.setFuelCapacity(21); //Gallons
        c1.work();

        SemiTruck s1 = new SemiTruck();
        s1.setColor("Yellow");
        s1.setNumberOfPassengers(2);
        s1.setCargoCapacity(48000); //ibs
        s1.setFuelCapacity(300); //gallons
        s1.work();

        Hovercraft h1 = new Hovercraft();
        h1.setColor("Pink");
        h1.setNumberOfPassengers(78);
        h1.setCargoCapacity(500); //ibs
        h1.setFuelCapacity(45); //gallons
        h1.work();




    }
}
