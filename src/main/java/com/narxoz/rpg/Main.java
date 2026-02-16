package com.narxoz.rpg;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.equipment.*;

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("Thorin");
        Mage mage = new Mage("Gandalf");
        Archer archer = new Archer("Legolas");

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        EquipmentFactory magicFactory = new MagicEquipmentFactory();
        EquipmentFactory rangerFactory = new RangerEquipmentFactory();

        warrior.equipWeapon(medievalFactory.createWeapon());
        warrior.equipArmor(medievalFactory.createArmor());

        mage.equipWeapon(magicFactory.createWeapon());
        mage.equipArmor(magicFactory.createArmor());

        archer.equipWeapon(rangerFactory.createWeapon());
        archer.equipArmor(rangerFactory.createArmor());

        warrior.displayStats();
        warrior.displayEquipment();
        warrior.useSpecialAbility();

        System.out.println();

        mage.displayStats();
        mage.displayEquipment();
        mage.useSpecialAbility();

        System.out.println();

        archer.displayStats();
        archer.displayEquipment();
        archer.useSpecialAbility();
    }
}
