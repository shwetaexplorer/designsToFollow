package com.shweta.visitor;

public class AttributeCostCalculator implements  AttributeVisitor{
    private long totalCost;

    public long getTotalCost() {
        return totalCost;
    }

    @Override
    public void visit(EUStatusAttribute euStatusAttribute) {
        totalCost += RateConstants.EU_STATUS_CONST +euStatusAttribute.getCharges();
    }

    @Override
    public void visit(IndirectTaxAttribute indirectTaxAttribute) {
        totalCost += RateConstants.INDIRECT_TAX_CONST +indirectTaxAttribute.getCharges();
    }

    @Override
    public void visit(CustomClearanceAttribute quantityAttribute) {
        totalCost += RateConstants.CUSTOM_CLEARANCE_CONST +quantityAttribute.getCharges();
    }
}
