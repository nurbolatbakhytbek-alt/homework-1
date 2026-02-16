package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    public int getDamage() { return 25; }
    public String getWeaponType() { return "Sword"; }
    public String getWeaponInfo() { return "Iron Sword (Medieval)"; }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Damage: " + getDamage());
    }
}
