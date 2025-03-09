package sec02.verify.exam04;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread = new MovieThread();
        thread.setDaemon(true);
    }
}
