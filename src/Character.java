
public class Character
{
    private int maxLife;
    private int attack;
    private int defense;
    private int speed;
    private int money;
    private int currentLife;
    int damage;
    String name;
    
    public Character() {
        
    }
    public Character(int userMaxLife, int userCurrentLife, int userAttack, int userDefense, int userSpeed, int userMoney) {
        maxLife = userMaxLife;
        currentLife = userCurrentLife;
        attack = userAttack;
        defense = userDefense;
        speed = userSpeed;
        money = userMoney;
    }
    
    public int getMaxLife(){
        return maxLife;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefense(){
        return defense;
    }
    public int getSpeed(){
        return speed;
    }
    public int getMoney(){
        return money;
    }
    
    public void setMaxLife(int userMaxLife) {
        maxLife = userMaxLife;
    }
    public void setAttack(int userAttack) {
        attack = userAttack;
    }
    public void setDefense(int userDefense) {
        defense = userDefense;
    }
    public void setSpeed(int userSpeed) {
        speed = userSpeed;
    }
    public void setMoney(int userMoney) {
        money = userMoney;
    }
    
    public int getCurrentLife() {
        return currentLife;
    }
    public void setCurrentLife(int userCurrentLife) {
        currentLife = userCurrentLife;
    }
    
    public void characterDamageTaken(Character character, Monster monster) {
        damage = character.getDefense() - monster.getAttack();
    }
    public int currentLife(Character character) {
        if(damage < 0) {
            currentLife = currentLife + damage;
        }
        else {
            currentLife = currentLife;
        }
        return currentLife;
    }
    
    public String getName(){
        return name;
    }
    
    public void getStats() {
        System.out.println("Name: " + getName());
        System.out.println("Max hp: " + getMaxLife());
        System.out.println("Current hp: " + getCurrentLife());
        System.out.println("Attack: " + getAttack());
        System.out.println("Defense: " + getDefense());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Money: " + getMoney());
    }
}
