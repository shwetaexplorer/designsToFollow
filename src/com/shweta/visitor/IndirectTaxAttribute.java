package com.shweta.visitor;

public class IndirectTaxAttribute implements  Attribute{
    private int charges;

    public IndirectTaxAttribute(int charges) {
        this.charges = charges;
    }

    public int getCharges() {
        return charges;
    }

    @Override
    public void accept(AttributeVisitor visitor) {
        visitor.visit(this);
    }
}
