package sec01.exam05;

public class ThreadB extends Thread{

    public void changeName() {
        setName("쓰레두 삐");
    }
    public void run(){
        for(int i=0; i<2; i++){
            System.out.println(getName() + "가 출력한 내용");
        }
    }
}
