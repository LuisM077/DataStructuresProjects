import java.util.Random;
public class Traps
{
    private int arrowTrap;
    private int pitfall;

    public Traps() {
        arrowTrap = 4;
        pitfall = 2;
    }
    public int getArrowTrap() {
        return arrowTrap;
    }
    public int getPitfall() {
        return pitfall;
    }
    
    public void setArrowTrap(int userArrowTrap) {
        arrowTrap = userArrowTrap;    
    }
    public void setPitfall(int userPitfall) {
        pitfall = userPitfall;
    }
    
    public void activateTrap(Character character) {
        Random generator = new Random();
        
        int randomTrap = generator.nextInt(2);
        
        if(randomTrap == 0) {
            if(character.getCurrentLife() >= 5) {
                System.out.println("You got hit by arrows and lost 4 hp.");
                int newHp = character.getCurrentLife() - arrowTrap;
                character.setCurrentLife(newHp);
            }
            else {
                System.out.println("You died to arrows.");
                character.setCurrentLife(0);
            }
        }
        else {
            if(character.getCurrentLife() >= 3) {
                System.out.println("You fell into a pitfall and lost 2 hp.");
                int newHp = character.getCurrentLife() - pitfall;
                character.setCurrentLife(newHp);
            }
            else{
                System.out.println("You died to the fall");
                character.setCurrentLife(0);
            }
        }
    }
    
}
