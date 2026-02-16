package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    public int getDefense() { return 40; }
    public String getArmorType() { return "Plate"; }
    public String getArmorInfo() { return "Plate Armor (Medieval)"; }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo() + " | Defense: " + getDefense());
    }
}
