package kholod.java_challenge.task1;

import java.util.Objects;

public class MyGNode implements GNode {

    private String name;
    private GNode[] children;

    public MyGNode(String name, GNode[] children) {
        this.children = children;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public GNode[] getChildren() {
        return children;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyGNode myGNode = (MyGNode) o;
        return Objects.equals(name, myGNode.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
