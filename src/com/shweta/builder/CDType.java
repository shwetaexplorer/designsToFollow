package com.shweta.builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {

    private List<Packing> cdTypes = new ArrayList<Packing>();

    public void addPacking(Packing packing) {
        cdTypes.add(packing);
    }
    public int getCost(){
        int cost = 0;
        for(Packing packing : cdTypes){
            cost += packing.getPrice();
        }
        return cost;
    }
    public void showItems(){
        for(Packing packing : cdTypes){
            System.out.println(packing.getDescription());
        }
    }

    public List<Packing> getCdTypes() {
        return cdTypes;
    }

    public void setCdTypes(List<Packing> cdTypes) {
        this.cdTypes = cdTypes;
    }
}
