package kholod.java_challenge.task2;

import java.util.ArrayList;
import java.util.StringJoiner;

public class GNodeHelper {

    public ArrayList<ArrayList<GNode>> paths(GNode node) {
        ArrayList<GNode> onePath = new ArrayList<>();
        ArrayList<ArrayList<GNode>> allPaths = new ArrayList<>();
        paths(node, onePath, allPaths);
        return allPaths;
    }

    private void paths(GNode node, ArrayList<GNode> onePath, ArrayList<ArrayList<GNode>> allPaths) {
        onePath.add(node);
        if (node.getChildren().length != 0) {
            for (GNode n : node.getChildren()) {
                paths(n, onePath, allPaths);
            }
        } else {
            allPaths.add(new ArrayList<>(onePath));
        }
        onePath.remove(onePath.size() - 1);
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
        GNode C = new MyGNode("C", new GNode[]{F, G});
        GNode D = new MyGNode("D", new GNode[]{H, I, J});
        GNode A = new MyGNode("A", new GNode[]{B, C, D});

        return A;
    }

    public void printPaths(ArrayList<ArrayList<GNode>> paths) {
        StringJoiner joinerExternal = new StringJoiner(" ", "(", ")");
        for (ArrayList<GNode> path : paths) {
            StringJoiner joinerInternal = new StringJoiner(" ", "(", ")");
            path.forEach(n -> joinerInternal.add(n.getName()));
            joinerExternal.add(joinerInternal.toString());
        }
        System.out.println(joinerExternal.toString());
    }
}
