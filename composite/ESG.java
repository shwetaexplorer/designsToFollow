package com.shweta.composite;

import java.util.List;

public class ESG implements Index{
    private int ID;
    private String name;

    public ESG(int ID, String name) {
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
