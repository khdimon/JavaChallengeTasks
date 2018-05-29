package kholod.java_challenge.task3;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Helper {
    public void printWords(Map<String, Integer> words) {
        Map<String, Integer> sortedWords = words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        sortedWords.keySet()
                .forEach(key -> System.out.println(sortedWords.get(key) + " " + key));
    }
}
