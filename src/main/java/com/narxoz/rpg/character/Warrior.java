package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Warrior implements Character {

    private String name;
    private int health = 150;
    private int mana = 30;
    private int strength = 80;
    private int intelligence = 20;

    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }

    public void useSpecialAbility() {
        System.out.println(name + " uses BERSERKER RAGE!");
    }

    public void displayStats() {
        System.out.println("=== Warrior: " + name + " ===");
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
