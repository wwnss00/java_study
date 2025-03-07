package sec01.exam06;

public class User1 implements Runnable{
    private Calculator calculator;



//    public void setCalculator(Calculator calculator) {
//        this.setName("User1");
//        this.calculator = calculator;
//    }

    public void run() {

        calculator.setMemory(100);
    }
}
