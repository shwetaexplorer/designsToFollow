package com.shweta.visitor;

public class CustomClearanceAttribute implements Attribute{
    private int charges;
    public CustomClearanceAttribute(int charges) {
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
