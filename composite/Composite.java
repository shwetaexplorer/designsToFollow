package com.shweta.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Index{
    private List<Index> children = new ArrayList<>();
    @Override
    public int getID() {
        return 400;
    }

    @Override
    public String getName() {
        return "Composite";
    }

    @Override
    public List<Index> getIndexes() {
        return children;
    }


    @Override
    public void printIndexes() {
        for (Index child : children) {
            System.out.println(child.getID() + "::" + child.getName());
        }

    }

    @Override
    public void addIndex(Index index) {
        children.add(index);
    }
}
