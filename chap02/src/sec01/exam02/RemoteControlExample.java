package sec01.exam02;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turn0n();
        rc = new Audio();
        rc.turn0n();
    }
}
