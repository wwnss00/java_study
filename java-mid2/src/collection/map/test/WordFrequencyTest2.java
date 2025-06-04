package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest2 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> textMap = new HashMap<>();
        String[] word = text.split(" ");
        for (String key : word) {
            textMap.put(key, textMap.getOrDefault(key, 0) + 1);
        }

        System.out.println(textMap);
    }
}
