import java.util.ArrayList;
import java.util.Random;

public class SlotMachine implements Iterator
{
    private int coins;
    
    Random generator = new Random();
    /*
     * default constructor
     */
    public SlotMachine() {
        
    }
    /*
     * @param userCoins
     */
    public SlotMachine(int userCoins) {
        coins = userCoins;
    }
    
    /*
     * @return coins
     */
    public int getCoins() {
        return coins;
    }
    /*
     * @param userCoins - the amounr of coins to set.
     */
    public void setCoins(int userCoins) {
        coins = userCoins;
    }
    
    /*
     * boolean method called hasNext.
     * checks if there are still any left and returns true.
     * returns false if there aren't anymore coins left.
     */
    public boolean hasNext(){
        if(coins >= 1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /*
     * int method called next.
     * uses the method pull to check if it's a win or not.
     * if true, adds 1 to the coins variable.
     * if false, leaves coins as is.
     */
    public int next() {
        if(pull() == true) {
            System.out.println("You won 1 coin");
            coins++;
        }
        else {
            System.out.println("You did not win");
            coins = coins;
        }
        return coins;
    }
    
    /*
     * void method called remove.
     * if there is at least one coin, it subtracts 1 to the coins variable
     * everytime it is called.
     */
    public void remove() {
        if(coins >= 1) {
            coins--;
            System.out.println("Coins left: " + getCoins());
            System.out.println();
        }
    }
    
    /*
     * boolean method called pull.
     * checks if it's a win or not by randomly generation 1 or 0.
     * if 1, it returns true and if 0, it returns false.
     */
    public boolean pull() {
        int result;
        result = generator.nextInt(2);
        if(result == 1) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /*
     * void method called slotMachine.
     * next() and remove() will keep getting called until there are no more coins.
     */
    public void slotMachine() {
        while(hasNext() == true) {
            next();
            remove();
        }
        if(hasNext() == false) {
            System.out.println("You have ran out of coins...");
        }
    }
}
