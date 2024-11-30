package com.shweta.composite;

import java.awt.*;
import java.util.List;

public class RealEstate implements Index {
    private int ID;
    private String name;

    public RealEstate(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Index> getIndexes() {
        return List.of();
    }

    @Override
    public void printIndexes() {

    }

    @Override
    public void addIndex(Index index) {

    }
}
