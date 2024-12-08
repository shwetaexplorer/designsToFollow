package com.shweta.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorAppMain {
    public static void main(String[] args) {
        EUStatusAttribute euStatusAttribute = new EUStatusAttribute(2);
        CustomClearanceAttribute customClearanceAttribute = new CustomClearanceAttribute(3);
        IndirectTaxAttribute indirectTaxAttribute = new IndirectTaxAttribute(4);

        List<Attribute> attributes = new ArrayList<Attribute>();
        attributes.add(euStatusAttribute);
        attributes.add(customClearanceAttribute);
        attributes.add(indirectTaxAttribute);

        AttributeCostCalculator attributeCostCalculator = new AttributeCostCalculator();
        for(Attribute attribute : attributes) {
            attribute.accept(attributeCostCalculator);
        }

        System.out.println("Total Cost is :" +attributeCostCalculator.getTotalCost());
    }
}
