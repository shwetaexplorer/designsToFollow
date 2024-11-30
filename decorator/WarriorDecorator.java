package com.shweta.decorator;

public abstract class WarriorDecorator implements XenGameWarrior{
    private XenGameWarrior warrior;
    public WarriorDecorator(XenGameWarrior warrior) {
        this.warrior = warrior;
    }

    @Override
    public String printWeapon() {
       return  warrior.printWeapon();
    }

    @Override
    public String getDescription() {
        return warrior.getDescription();
    }
}
