
public class Pokemon implements LevelUp
{
    private int hp;
    private int attack;
    private int defense;
    private int speed;
    private int power;
    private String name;
    private String move;
    private int level;
    public Pokemon(int userInputHp, int userInputAttack, int userInputDefense,
                     int userInputSpeed){
        hp = userInputHp;
        attack = userInputAttack;
        defense = userInputDefense;
        speed = userInputSpeed;
    }
    
    public int getHp(){
        return hp;
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
    
    public void setHp(int userInputHp){
        hp = userInputHp;
    }
    public void setAttack(int userInputAttack){
        attack = userInputAttack;
    }
    public void setDefense(int userInputDefense){
        defense = userInputDefense;
    }
    public void setSpeed(int userInputSpeed){
        speed = userInputSpeed;
    }

    public String getName() {
        return name;
    }
    public String chooseMove() {
        return move;
    }
    public int getPower() {
        return power;
    }
    
    public int getLevel() {
        return level;
    }
    public void setLevel(int userLevel) {
        level = userLevel;
    }
    
    public void getStats() {
        System.out.println("Name: " + getName());
        System.out.println("Hp: " + getHp());
        System.out.println("Attack: " + getAttack());
        System.out.println("Defense: " + getDefense());
        System.out.println("Speed: " + getSpeed());
        System.out.println("Level: " + getLevel());
    }
    public int attack(Pokemon userPokemon, Pokemon otherPokemon) {
        int hp;
        System.out.println(userPokemon.getName() + " uses " + userPokemon.chooseMove() + " and attacks " + otherPokemon.getName());
        
        hp = otherPokemon.getHp() - ((userPokemon.getPower() * userPokemon.getAttack()) / otherPokemon.getDefense());
        otherPokemon.setHp(hp);

        return hp;
    }
    
    public void levelUp(int level) {
        hp = hp + (3 * level);
        attack = attack + (2 * level);
        defense = defense + (2 * level);
        speed = speed + (1 * level);
    }
    
}
