package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    public int getDamage() { return 35; }
    public String getWeaponType() { return "Staff"; }
    public String getWeaponInfo() { return "Wizard Staff (Magic)"; }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo() + " | Damage: " + getDamage());
    }
}
