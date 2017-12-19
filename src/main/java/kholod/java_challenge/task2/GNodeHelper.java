package kholod.java_challenge.task2;

import java.util.ArrayList;
import java.util.StringJoiner;

public class GNodeHelper {

    public ArrayList<ArrayList<GNode>> paths(GNode node) {
        ArrayList<GNode> path = new ArrayList<>();
        ArrayList<ArrayList<GNode>> paths = new ArrayList<>();
        paths(node, path, paths);
        return paths;
    }

    private void paths(GNode node, ArrayList<GNode> path, ArrayList<ArrayList<GNode>> paths) {
        path.add(node);
        if (node.getChildren().length != 0) {
            for (GNode n : node.getChildren()) {
                paths(n, path, paths);
            }
        } else {
            paths.add(path);
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

    public void printPaths(ArrayList<ArrayList<GNode>> paths) {
        StringJoiner joinerExternal = new StringJoiner(" ", "(", ")");
        StringJoiner joinerInternal = new StringJoiner(" ", "(", ")");
        for (ArrayList<GNode> path : paths) {
            path.forEach(n -> joinerInternal.add(n.getName()));
            joinerExternal.add(joinerInternal.toString());
        }
        System.out.println(joinerExternal.toString());
    }
}
