package com.shweta.visitor;

public interface AttributeVisitor {

   void visit(EUStatusAttribute  euStatusAttribute);
   void visit(IndirectTaxAttribute indirectTaxAttribute);
   void visit(CustomClearanceAttribute quantityAttribute);
}
