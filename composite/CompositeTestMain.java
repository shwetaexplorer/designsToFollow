package com.shweta.composite;

public class CompositeTestMain {

    public static void main(String[] args) {

        Index equityIndiaIndex = new Equity(101, "Equity India");
        Index equityUSIndex = new Equity(102,"Equity US");
        Index  esgIndiaIndex =  new ESG(201, "Esg India");
        Index esgUSIndex =  new ESG(202, "Esg US");
        Index reitIndiaIndex = new RealEstate(301,"Reit India");
        Index reitUSIndex =  new RealEstate(302,"Reit US");
        Index composite = new Composite();
        composite.addIndex(equityIndiaIndex);
        composite.addIndex(equityUSIndex);

        composite.addIndex(esgIndiaIndex);
        composite.addIndex(esgUSIndex);
        composite.addIndex(reitIndiaIndex);
        composite.addIndex(reitUSIndex);
        composite.printIndexes();


    }
}
