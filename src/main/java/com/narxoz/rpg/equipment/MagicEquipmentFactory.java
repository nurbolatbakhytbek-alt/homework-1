package com.narxoz.rpg.equipment;

public class MagicEquipmentFactory implements EquipmentFactory {

    public Weapon createWeapon() { return new WizardStaff(); }
    public Armor createArmor() { return new EnchantedRobes(); }
}
