package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> textMap = new HashMap<>();
        String[] word = text.split(" ");
        for (String key : word) {
            Integer count = textMap.get(key);
            if (count == null) {
                count = 0;
            }
            count++;
            textMap.put(key, count);
        }

        System.out.println(textMap);
    }
}
