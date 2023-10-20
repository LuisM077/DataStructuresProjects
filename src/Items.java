import java.util.Random;

public class Items
{
    private int potion;
    private int weapon;
    private int treasureChest;
    private int emptyChest;
    
    /*
     * potions heals 10 hp
     * weapons increase attack by 5
     * treasureChest increases money by 1000
     * emptyChest does nothing
     */
    public Items() {
        potion = 10;
        weapon = 5;
        treasureChest = 1000;
        emptyChest = 0;
    }
    public int getPotion() {
        return potion;
    }
    public int getWeapon() {
        return weapon;
    }
    public int getTreasureChest() {
        return treasureChest;
    }
    public int getEmptyChest() {
        return emptyChest;
    }
    
    public void setPotion(int userPotion) {
        potion = userPotion;
    }
    public void setWeapon(int userWeapon) {
        weapon = userWeapon;
    }
    public void setTreasureTesting(int userTreasureChest) {
        treasureChest = userTreasureChest;
    }
    public void setEmptyChest(int userEmptyChest) {
        emptyChest = userEmptyChest;
    }
    
    public void obtainItem(Character character) {
        int randomItem;
        Random generator = new Random();
        
        randomItem = generator.nextInt(4);
        
        if(randomItem == 0) {
            if(character.getCurrentLife() < character.getMaxLife() - 10) {
                System.out.println("You found a potion! You used it and gained +10 hp.");
                int newHp = character.getCurrentLife() + potion;
                character.setCurrentLife(newHp);
            }
            else {
                System.out.println("You found a potion! You used it and healed to max hp.");
                int newHp = character.getMaxLife();
                character.setCurrentLife(newHp);
            }
        }
        else if (randomItem == 1) {
            System.out.println("You found a sword! You equipped it and gained +5 attack.");
            int newAttack = character.getAttack() + weapon;
            character.setAttack(newAttack);
        }
        else if(randomItem == 2) {
            System.out.println("You found a treasure chest! You gained 1000 gold.");
            int newMoney = character.getMoney() + treasureChest;
            character.setMoney(newMoney);
        }
        else {
            System.out.println("You found a treasure chest! It is empty...");
            int newMoney = character.getMoney() + emptyChest;
            character.setMoney(newMoney);
        }
    }
    
}
