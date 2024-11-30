package com.shweta.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecoratorAppMain {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello - Welcome to Warrior game");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("Choose your warrior");
        System.out.println("1. RAM with fly option-------------------------");
        System.out.println("2. SHIVA with fly option------------------------");
        System.out.println("3. RAM with walk in water option-------------------------");
        System.out.println("4. SHIVA with walk in water option------------------------");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int warriorOption = Integer.parseInt(bufferedReader.readLine());

        switch (warriorOption){
            case 1:
            {
                XenGameWarrior ramWarrior = new RamWarrior();
                XenGameWarrior flyingBehavior = new FlyingDecorator(ramWarrior);
                System.out.println(flyingBehavior.getDescription());
                System.out.println(flyingBehavior.printWeapon());
            }break;
            case 2: {
                XenGameWarrior shivaWarrior = new ShivaWarrior();
                XenGameWarrior flyingBehavior = new FlyingDecorator(shivaWarrior);
                System.out.println(flyingBehavior.getDescription());
                System.out.println(flyingBehavior.printWeapon());
            }break;
            case 3:
            {
                XenGameWarrior ramWarrior = new RamWarrior();
                XenGameWarrior walkInWaterBehavior = new WalkInWater(ramWarrior);
                System.out.println(walkInWaterBehavior.getDescription());
                System.out.println(walkInWaterBehavior.printWeapon());
            }break;
            case 4: {
                XenGameWarrior shivaWarrior = new ShivaWarrior();
                XenGameWarrior walkInWaterBehavior = new WalkInWater(shivaWarrior);
                System.out.println(walkInWaterBehavior.getDescription());
                System.out.println(walkInWaterBehavior.printWeapon());
            }break;
            default: {
                System.out.println("Invalid option");
            }
        }


    }
}
