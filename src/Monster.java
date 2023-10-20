import java.util.Random;

public class Monster
{
    private int life;
    private int attack;
    private int defense;
    private int speed;
    private int money;
    private int level;
    int damage;
    String name;
    public Monster() {
        
    }
    public Monster(int userLife, int userAttack, int userDefense, int userSpeed, int userMoney, int userLevel) {
        life = userLife;
        attack = userAttack;
        defense = userDefense;
        speed = userSpeed;
        money = userMoney;
        level = userLevel;
    }
    
    public int getLife(){
        return life;
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
    public int getLevel() {
        return level;
    }
    
    public void setLife(int userlife) {
        life = userlife;
    }
    public void setAttacl(int userAttack) {
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
    public void setLevel(int userLevel) {
        level = userLevel;
    }
    
    public Monster selectMonster() {
        Random generator = new Random();
        int rand;
        Monster monster;
        Slime slime = new Slime();
        Goblin goblin = new Goblin();
        Ogre ogre = new Ogre();
        
        rand = generator.nextInt(7);
        if(rand == 0 || rand == 2 || rand == 4) {
            monster = slime;
        }
        else if(rand == 1 || rand == 3 || rand ==5) {
            monster = goblin;
        }
        else {
            monster = ogre;
        }
        return monster;
    }
    public void monsterDamageTaken(Monster monster, Character character) {
        damage = monster.getDefense() - character.getAttack();
    }
    public int currentLife(Monster monster) { 
        if(damage < 0) {
            life = life + damage;            
        }
        else {
            life = life;
        }
        return life;
    }
    
    public String getName() {
        return name;
    }
    
    public void getStats() {
        System.out.println("Name: " + getName());
        System.out.println("Hp: " + getLife());
        System.out.println("Attack: " + getAttack());
        System.out.println("Defense: " + getDefense());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Money: " + getMoney());
        System.out.println("Level: " + getLevel());
    }
}
