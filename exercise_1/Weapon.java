public class Weapon {

        // Exercise 1
        // 1. Create a "Weapon" class.
        
        // The Weapon class will have the following attributes.

        // Name
        // Damage
        // Weight
        // Rarity
        // Description

        // 2. Create a method named "weaponDescription" that will display the weapon
        // description.

        // 3. Create three (3) objects from the "Weapon" class and give them attributes

        // Examples

        // Object - Hammer
        // Object Name - "Mjollnir"
        // Weight - 4.5
        // Rarity - "Legendary"
        // Description - "A might hammer owned by the god of lightning thor!"

        // Object - Short Sword
        // Object Name - "Common Sword"
        // Weight - 2
        // Rarity - "Common"
        // Description - "A cheap sword used mostly by common enemies"

        // Weapon Attributes
        String name;
        int damage;
        double weight;
        String rarity;
        String description;

        public void weaponDescription()
        {
            System.out.println(name + ": " + description);
        }
    
}
