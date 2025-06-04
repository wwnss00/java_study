package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> dict = new HashMap<>();



        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 ( 종료는 'q' ) :");
            String eng = sc.nextLine();
            if (eng.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String kor = sc.nextLine();
            dict.put(eng,kor);
        }
        System.out.println("==단어 검색 단계");
        while (true) {
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchWord = sc.nextLine();

            if (searchWord.equals("q")) {
                break;
            }

            if (dict.containsKey(searchWord)) {
                String kor = dict.get(searchWord);
                System.out.println(searchWord + "의 뜻: " + kor);
            }else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }

        }


    }
}
