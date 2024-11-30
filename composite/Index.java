package com.shweta.composite;

import java.util.List;
// This will be component that will be exposed to client, with this clint won't distinguish between single or hierarchy
public interface Index {
    int getID();
    String getName();
    List<Index> getIndexes();
    void printIndexes();
    void addIndex(Index index);
}
