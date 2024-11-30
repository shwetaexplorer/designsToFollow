package com.shweta.decorator;

public class ShivaWarrior implements XenGameWarrior{
    @Override
    public String printWeapon() {
        return "Trishul";
    }

    @Override
    public String getDescription() {
        return "Shiva Warrior";
    }
}
