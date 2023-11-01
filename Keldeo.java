import java.util.Random;
public class Keldeo extends Pokemon
{
    String name = "Keldeo";
    String move;
    int power;

    
    public Keldeo() {
        super(91,72,90,108);
        setLevel(100);
        levelUp(getLevel());
    }
    
    public String chooseMove() {
        Random generator = new Random();
        
        int randomNumber = 1 + generator.nextInt(3);
        
        if(randomNumber == 1) {
            return move = "Secret Sword";
        }
        else if(randomNumber == 2) {
            return move = "HyperBeam";
        }
        else {
            return move = "Tackle";
        }
        
    }
    
    public int getPower() {
        if(move == "Secret Sword") {
            return power = 85;
        }
        else if (move == "HyperBeam"){
            return power = 150;
        }
        else {
            return power = 50;
        }
    }
    
    public String getName() {
        return name;
    }
}
