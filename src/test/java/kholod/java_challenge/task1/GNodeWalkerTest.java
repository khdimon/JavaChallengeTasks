package kholod.java_challenge.task1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GNodeWalkerTest {

    @Test
    public void walkGraphTest() {

        GNode E = new MyGNode("E", new GNode[0]);
        GNode F = new MyGNode("F", new GNode[0]);
        GNode G = new MyGNode("G", new GNode[0]);
        GNode H = new MyGNode("H", new GNode[0]);
        GNode I = new MyGNode("I", new GNode[0]);
        GNode J = new MyGNode("J", new GNode[0]);
        GNode B = new MyGNode("B", new GNode[]{E, F});
        GNode C = new MyGNode("C", new GNode[]{G, H, I});
        GNode D = new MyGNode("D", new GNode[]{J});
        GNode A = new MyGNode("A", new GNode[]{B, C, D});

        ArrayList<GNode> expectedNodes = new ArrayList<>(Arrays.asList(A, B, E, F, C, G, H, I, D, J));

        GNodeWalker walker = new GNodeWalker();

        ArrayList<GNode> actualNodes = walker.walkGraph(A);

        assertEquals(expectedNodes, actualNodes);
    }
}
