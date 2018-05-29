package kholod.java_challenge.task3;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        WordsCounter counter = new WordsCounter();
        String filePath = "/Users/dkhol/IdeaProjects/JavaChallengeTasks/example.txt";
        Helper helper = new Helper();
        helper.printWords(counter.countWords(filePath, null));
    }
}
