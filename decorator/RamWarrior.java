package com.shweta.decorator;

public class RamWarrior implements XenGameWarrior{
    @Override
    public String printWeapon() {
        return "Bow+ Arrow";
    }

    @Override
    public String getDescription() {
        return "Ram Warrior";
    }
}
