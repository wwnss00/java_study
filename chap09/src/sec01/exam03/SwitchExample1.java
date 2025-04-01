package sec01.exam03;

public class SwitchExample1 {
    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
                System.out.println("감사합니다.");
            }
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
