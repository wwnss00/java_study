package sec01.exam06;

public class MainThreadExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Thread user1 = new Thread(new User(calculator, 100), "User1");
        Thread user2 = new Thread(new User(calculator, 50), "User2");

        user1.start();
        user2.start();
    }
}
