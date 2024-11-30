package com.shweta.composite;

import java.util.List;

public class Equity implements Index{
    private int ID;
    private String name;

    public Equity(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public int getID() {
        return this.ID; // define in constant
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
