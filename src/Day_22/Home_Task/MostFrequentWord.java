package Day_22.Home_Task;

import java.util.*;
import java.util.stream.*;

public class MostFrequentWord {
    public static void main(String[] args) {

        String text = "java python java spring java python";

        Map<String, Long> map = Arrays.stream(text.toLowerCase().split(" "))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        Map.Entry<String, Long> max = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        System.out.println(max.getKey() + " -> " + max.getValue());
    }
}