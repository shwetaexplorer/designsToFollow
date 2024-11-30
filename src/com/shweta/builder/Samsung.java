package com.shweta.builder;

public class Samsung extends Company {
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Samsung";
    }
}
