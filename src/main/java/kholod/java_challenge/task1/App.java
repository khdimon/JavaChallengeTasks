package kholod.java_challenge.task1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

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

        GNodeWalker walker = new GNodeWalker();
        ArrayList<GNode> nodes = walker.walkGraph(A);

        Helper helper = new Helper();
        helper.printGraph(nodes);
    }
}
