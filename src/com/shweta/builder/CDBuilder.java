package com.shweta.builder;

public class CDBuilder {

    public CDType buildSonyCD(){
        CDType cd = new CDType();
        cd.addPacking(new Sony());
        return cd;

    }

    public CDType buildSamsungCD(){
        CDType cd = new CDType();
        cd.addPacking(new Samsung());
        return cd;

    }
}
