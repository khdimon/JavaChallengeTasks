package kholod.java_challenge.task1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        GNodeHelper helper = new GNodeHelper();
        GNode node = helper.generateGraph();
        ArrayList<GNode> nodes = helper.walkGraph(node);
        helper.printGraph(nodes);
    }
}
