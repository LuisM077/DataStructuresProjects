
public class Hero extends Character
{
    private int currentLife;
    String name = "Hero";
    public Hero(){
        super(15,15,8,5,5,100);
    }
    
    public String getName() {
        return name;
    }
}
