package kholod.java_challenge.task2;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Helper {

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
