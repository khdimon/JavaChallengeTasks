package kholod.java_challenge.task3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WordsCounter {
    private static String WORD_SYMBOLS_PATTERN = "[a-zA-Z]";
    private static String DEFAULT_FILE_ENCODING = "UTF-8";

    public Map<String, Integer> countWords(String filePath, String fileEncoding) throws IOException {
        if (fileEncoding == null) {
            fileEncoding = DEFAULT_FILE_ENCODING;
        }
        Map<String, Integer> words = new LinkedHashMap<>();
        try (InputStream is = Files.newInputStream(Paths.get(filePath));
             InputStreamReader reader = new InputStreamReader(is, fileEncoding)) {
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
        }

        return words;
    }
}
