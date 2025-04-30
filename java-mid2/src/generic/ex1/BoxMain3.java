package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T의 타입 결정
        integerBox.setValue(10);
//        integerBox.setValue("문자100"); // Integer 타입만 허용, 컴파일 오류
        Integer integer = integerBox.getValue(); // Integer 타입 반환(캐스팅x)
        System.out.println("Integer value is " + integer);

        GenericBox<String> StringBox = new GenericBox<>();
        StringBox.setValue("Hello");
        String string = StringBox.getValue();
        System.out.println("String value is " + string);

        //원하는 모든 타입 사용 가능

        //타입 추론: 생성하는 제네릭 타입 생략 가능



    }
}
