package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {

    public int getDamage() { return 30; }
    public String getWeaponType() { return "Bow"; }
    public String getWeaponInfo() { return "Longbow (Ranger)"; }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Damage: " + getDamage());
    }
}
