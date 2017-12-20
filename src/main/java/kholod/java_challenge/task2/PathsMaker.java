package kholod.java_challenge.task2;

import java.util.ArrayList;

public class PathsMaker {
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
}
