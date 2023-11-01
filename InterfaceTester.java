/*
 * Luis Morales     10/06/23

 */
public class InterfaceTester
{
    public static void main(String[] args) {
        
        SlotMachine game = new SlotMachine(5);
        
        System.out.println("Starting slot machine game...");
        System.out.println("Number of coins left: " + game.getCoins());
        
        game.slotMachine();
        System.out.println();
    }
}
