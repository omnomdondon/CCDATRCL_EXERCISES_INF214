public class App {
    public static void main(String[] args) {

        // Character Class
        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Chen";
        knight.sayMyName();

        Character mage = new Character();
        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Akasha";
        mage.sayMyName();

        Character thief = new Character();

        thief.strength = 5;
        thief.agility = 10;
        thief.intelligence = 0;
        thief.name = "Gondar";
        thief.sayMyName();

        System.out.println();

        // Enemy Class 
        Enemy boss = new Enemy();

        boss.damage = 60;
        boss.health = 500;
        boss.armor = 100;
        boss.hasMagicImmunity = true;
        boss.name = "Roshan";
        boss.enemyDialogue();

        Enemy skeleton = new Enemy();

        skeleton.damage = 5;
        skeleton.health = 10;
        skeleton.armor = 5;
        skeleton.hasMagicImmunity = false;
        skeleton.name = "Common Skeleton Warrior";
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy();

        dragon.damage = 40;
        dragon.health = 400;
        dragon.armor = 75;
        dragon.hasMagicImmunity = false;
        dragon.name = "Ancient Wyvern";
        dragon.enemyDialogue();

        System.out.println();

        // Weapon Class

        Weapon wand = new Weapon();
        wand.name = "Potter's Wand";
        wand.weight = 1;
        wand.damage = 75;
        wand.rarity = "Legendary";
        wand.description = "Made of holly, and possessed a phoenix feather core.";
        wand.weaponDescription();

        Weapon watch= new Weapon();
        watch.name = "Omnitrix";
        watch.weight = 2.5;
        watch.damage = 75;
        watch.rarity = "Epic";
        watch.description = "A watch-like device owned by Ben Tennyson.";
        watch.weaponDescription();

        Weapon dagger = new Weapon();
        dagger.name = "Yngling Seax";
        dagger.weight = 7;
        dagger.damage = 45;
        dagger.rarity = "Standard";
        dagger.description = "Halfdan the Black once wileded this seax, and he wielded it well."; 
        dagger.weaponDescription();
    }
}