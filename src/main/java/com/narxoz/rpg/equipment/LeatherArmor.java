package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    public int getDefense() { return 25; }
    public String getArmorType() { return "Leather"; }
    public String getArmorInfo() { return "Leather Armor (Ranger)"; }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + getDefense());
    }
}
