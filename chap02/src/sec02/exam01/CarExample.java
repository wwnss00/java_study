package sec02.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();

        mycar.run();

        mycar.frontLeftTire = new KumhoTire();
        mycar.backLeftTire = new KumhoTire();

        mycar.run();
    }
}
