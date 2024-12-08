package com.shweta.visitor;

public class EUStatusAttribute implements Attribute{
    private int charges;

    public EUStatusAttribute(int charges) {
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
