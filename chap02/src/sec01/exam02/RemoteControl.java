package sec01.exam02;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 10;

    public void turn0n();
    public void turnOff();
    public void setVolume(int volume);
}
