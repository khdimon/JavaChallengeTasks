package kholod.java_challenge.task1;

import java.util.ArrayList;

public class GNodeWalker {

    public ArrayList<GNode> walkGraph(GNode node) {
        ArrayList<GNode> nodes = new ArrayList<>();
        walkGraph(node, nodes);
        return nodes;
    }

    private void walkGraph(GNode node, ArrayList<GNode> nodes) {
        if (!nodes.contains(node)) {
            nodes.add(node);
        }
        for (GNode n : node.getChildren()) {
            walkGraph(n, nodes);
        }
    }
}
