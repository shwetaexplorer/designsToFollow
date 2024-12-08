package com.shweta.visitor;

public interface Attribute {
  void accept(AttributeVisitor visitor);
}
