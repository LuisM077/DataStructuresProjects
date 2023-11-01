import java.util.Random;
public class Victini extends Pokemon
{
    String name = "Victini";
    String move;
    int power;

    public Victini() {
        super(100,100,100,100);
        setLevel(100);
        levelUp(getLevel());
    }
    
    public String chooseMove() {
        Random generator = new Random();
        
        int randomNumber = 1 + generator.nextInt(3);
        
        if(randomNumber == 1) {
            return move = "V-create";
        }
        else if(randomNumber == 2){
            return move = "Flame Charge";
        }
        else {
            return move = "Tackle";
        }
        
    }
    
    public int getPower() {
        if(move == "V-create") {
            return power = 180;
        }
        else if(move == "Flame Charge"){
            return power = 50;
        }
        else {
            return power = 50;
        }
    }
    public String getName() {
        return name;
    }
}
