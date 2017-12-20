package kholod.java_challenge.task1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Helper {

    public void printGraph(ArrayList<GNode> nodes) {
        StringJoiner joiner = new StringJoiner(", ");
        nodes.forEach(n -> joiner.add(n.getName()));
        System.out.println(joiner.toString());
    }
}
