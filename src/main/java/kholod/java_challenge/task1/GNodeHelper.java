package kholod.java_challenge.task1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class GNodeHelper {

    public ArrayList<GNode> walkGraph(GNode node) {
        ArrayList<GNode> nodes = new ArrayList<>();
        walkGraph(node, nodes);
        return nodes;
    }

    private void walkGraph(GNode node, ArrayList<GNode> nodes) {
        if (!nodes.contains(node)) {
            nodes.add(node);
        }
        if (node.getChildren().length != 0) {
            for (GNode n : node.getChildren()) {
                walkGraph(n, nodes);
            }
        }
    }

    public GNode generateGraph() {

        GNode K = new MyGNode("K", new GNode[0]);
        GNode L = new MyGNode("L", new GNode[0]);
        GNode F = new MyGNode("F", new GNode[0]);
        GNode G = new MyGNode("G", new GNode[0]);
        GNode H = new MyGNode("H", new GNode[0]);
        GNode I = new MyGNode("I", new GNode[0]);
        GNode J = new MyGNode("J", new GNode[0]);
        GNode E = new MyGNode("E", new GNode[]{K, L});
        GNode B = new MyGNode("B", new GNode[]{E, F});
        GNode C = new MyGNode("C", new GNode[]{G, F});
        GNode D = new MyGNode("D", new GNode[]{H, I, J});
        GNode A = new MyGNode("A", new GNode[]{B, C, D});

        return A;
    }

    public void printGraph(ArrayList<GNode> nodes) {
        StringJoiner joiner = new StringJoiner(", ");
        nodes.forEach(n -> joiner.add(n.getName()));
        System.out.println(joiner.toString());
    }
}
