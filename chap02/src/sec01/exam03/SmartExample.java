package sec01.exam03;

import sec01.exam02.RemoteControl;

public class SmartExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        Searchable searchable = tv;
    }
}
