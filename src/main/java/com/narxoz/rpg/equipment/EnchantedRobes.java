package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    public int getDefense() { return 20; }
    public String getArmorType() { return "Robes"; }
    public String getArmorInfo() { return "Enchanted Robes (Magic)"; }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + getDefense());
    }
}
