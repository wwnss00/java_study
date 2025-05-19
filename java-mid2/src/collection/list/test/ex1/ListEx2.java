package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            list.add(sc.nextInt());
            if (sc.nextInt() == 0) {
                break;
            }
        }
        System.out.println(list);
    }
}
