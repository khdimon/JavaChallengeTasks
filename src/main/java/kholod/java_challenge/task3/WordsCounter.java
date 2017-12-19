package kholod.java_challenge.task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class WordsCounter {
    public static String WORD_SYMBOLS_PATTERN = "[a-zA-Z]";
    public static String FILE_ENCODING = "UTF-8";
    public static String FILE_PATH = "/Users/dkhol/IdeaProjects/JavaChallengeTasks/example.txt";

    private Map<String, Integer> words = new LinkedHashMap<>();

    public void countWords() throws IOException {
        words.clear();
        InputStream is = Files.newInputStream(Paths.get(FILE_PATH));
        InputStreamReader reader = new InputStreamReader(is, FILE_ENCODING);
        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            char symbol = (char) reader.read();
            if (String.valueOf(symbol).matches(WORD_SYMBOLS_PATTERN)) {
                sb.append(symbol);
            } else if (sb.length() > 0) {
                String word = sb.toString().toLowerCase();
                words.put(word, Optional.ofNullable(words.get(word)).orElse(0) + 1);
                sb.setLength(0);
            }
        }
        words = words.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }

    public void printWords() {
        words.keySet()
                .forEach(key -> System.out.println(words.get(key) + " " + key));
    }
}
