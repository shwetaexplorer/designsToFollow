package com.shweta.builder;

public class BuilderPatternMain {
    public static void main(String[] args) {
              CDBuilder cdBuilder = new CDBuilder();
      CDType sonyType =  cdBuilder.buildSonyCD();
      sonyType.showItems();
      CDType samsungType =  cdBuilder.buildSamsungCD();
      samsungType.showItems();
      sonyType.addPacking(new Sony());
    }
}
