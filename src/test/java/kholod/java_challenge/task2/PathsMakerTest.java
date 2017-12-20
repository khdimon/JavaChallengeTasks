package kholod.java_challenge.task2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class PathsMakerTest {

    @Test
    public void pathsTest() {

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

        ArrayList<ArrayList<GNode>> expectedPaths = new ArrayList<>();
        expectedPaths.add(new ArrayList<>(Arrays.asList(A, B, E)));
        expectedPaths.add(new ArrayList<>(Arrays.asList(A, B, F)));
        expectedPaths.add(new ArrayList<>(Arrays.asList(A, C, G)));
        expectedPaths.add(new ArrayList<>(Arrays.asList(A, C, H)));
        expectedPaths.add(new ArrayList<>(Arrays.asList(A, C, I)));
        expectedPaths.add(new ArrayList<>(Arrays.asList(A, D, J)));

        PathsMaker pathsMaker = new PathsMaker();

        ArrayList<ArrayList<GNode>> actualPaths = pathsMaker.paths(A);

        assertEquals(expectedPaths, actualPaths);
    }
}
