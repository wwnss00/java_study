package test.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        GenericMethod.objMethod(i);

        //타입 인자(Type Arument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
    }
}
