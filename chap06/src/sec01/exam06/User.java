package sec01.exam06;

class User implements Runnable {
    private Calculator calculator;
    private int memoryValue;

    public User(Calculator calculator, int memoryValue) {
        this.calculator = calculator;
        this.memoryValue = memoryValue;
    }

    @Override
    public void run() {
        calculator.setMemory(memoryValue);
    }
}
