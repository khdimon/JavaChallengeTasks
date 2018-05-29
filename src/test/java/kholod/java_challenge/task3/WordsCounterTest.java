package kholod.java_challenge.task3;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class WordsCounterTest {

    @Test
    public void countWordsTest() throws IOException {
        Path tempFile = Files.createTempFile("", "");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile.toFile()))) {
            bw.write("Write a quick and dirty program to produce a count\n" +
                    " of all the different words in a text file.");
        }
        Map<String, Integer> expextedWords = new LinkedHashMap<>();
        expextedWords.put("a", 3);
        expextedWords.put("all", 1);
        expextedWords.put("and", 1);
        expextedWords.put("count", 1);
        expextedWords.put("different", 1);
        expextedWords.put("dirty", 1);
        expextedWords.put("file", 1);
        expextedWords.put("in", 1);
        expextedWords.put("of", 1);
        expextedWords.put("produce", 1);
        expextedWords.put("program", 1);
        expextedWords.put("quick", 1);
        expextedWords.put("text", 1);
        expextedWords.put("the", 1);
        expextedWords.put("to", 1);
        expextedWords.put("write", 1);
        expextedWords.put("words", 1);

        WordsCounter counter = new WordsCounter();
        Map<String, Integer> actualWords = counter.countWords(tempFile.toString(), null);

        assertEquals(expextedWords, actualWords);
    }
}
