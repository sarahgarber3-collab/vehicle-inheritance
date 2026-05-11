public class App {
    public static void main(String[] args) {
        Moped m1 = new Moped(2,1,"Green",1 );
        m1.setColor("Green");
        m1.work();

        Car c1 = new Car(21,850,"Purple",4);
        c1.work();

        SemiTruck s1 = new SemiTruck(300,48000,"Yellow",2);
        s1.work();

        Hovercraft h1 = new Hovercraft(45,500,"Pink",78);
        h1.work();




    }
}
