package com.shweta.decorator;

public class FlyingDecorator extends WarriorDecorator{
    public FlyingDecorator(XenGameWarrior warrior) {
        super(warrior);
    }

    @Override
    public String printWeapon() {
        return super.printWeapon() + " : I can fly.";
    }

    @Override
    public String getDescription() {
        return super.getDescription() ;
    }
}
