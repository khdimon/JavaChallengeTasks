package kholod.java_challenge.task2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GNodeHelper helper = new GNodeHelper();
        GNode node = helper.generateGraph();
        ArrayList<ArrayList<GNode>> paths = helper.paths(node);
        helper.printPaths(paths);
    }
}
