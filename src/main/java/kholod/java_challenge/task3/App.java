package kholod.java_challenge.task3;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        WordsCounter counter = new WordsCounter();
        counter.countWords();
        counter.printWords();
    }
}
