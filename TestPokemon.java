
public class TestPokemon
{
    public static void main(String [] args) {
        Battlefield bf = new Battlefield();
        Keldeo keldeo = new Keldeo();
        Victini victini = new Victini();
        
        bf.battle(keldeo, victini);
    }
}
