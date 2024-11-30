package com.shweta.decorator;

public class WalkInWater extends WarriorDecorator{
    public WalkInWater(XenGameWarrior warrior) {
        super(warrior);
    }

    @Override
    public String printWeapon() {
        return super.printWeapon() + " I can walk in water" ;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
