package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {

    private String name;
    private int health = 100;
    private int mana = 60;
    private int strength = 60;
    private int intelligence = 50;

    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void useSpecialAbility() {
        System.out.println(name + " uses MULTI-SHOT!");
    }

    public void displayStats() {
        System.out.println("=== Archer: " + name + " ===");
        System.out.println("HP: " + health + " | Mana: " + mana);
        System.out.println("STR: " + strength + " | INT: " + intelligence);
    }

    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    public void equipArmor(Armor armor) { this.armor = armor; }

    public void displayEquipment() {
        if (weapon != null) weapon.displayInfo();
        if (armor != null) armor.displayInfo();
    }
}
