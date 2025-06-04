package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},{"JPA","30000"}};

        Map<String, Integer> map = new HashMap<>();
        for (String[] productMap : productArr) {
            map.put(productMap[0], Integer.valueOf(productMap[1]));
        }
//        map.put("Java", 10000);
//        map.put("Spring", 20000);
//        map.put("JPA", 30000);

        for (Map.Entry<String, Integer> product : map.entrySet()) {
            System.out.println("제품: " + product.getKey() + ", 가격: " + product.getValue());

        }
    }
}
