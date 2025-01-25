package sec02.exam05;

public class ImplementationC implements InterfaceC{
    @Override
    public void methodC() {
        System.out.println("ImplementationC-methodC() 실행");
    }

    @Override
    public void methodA() {
        System.out.println("ImplementationC-methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("ImplementataionC-methodB() 실행");
    }
}
