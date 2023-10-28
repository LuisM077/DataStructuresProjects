
public class Battlefield
{
    public void battle(Pokemon userPokemon, Pokemon otherPokemon) {
        userPokemon.getStats();
        System.out.println();
        otherPokemon.getStats();
        System.out.println();
        while(userPokemon.getHp() > 0 && otherPokemon.getHp() > 0) {
            if(userPokemon.getSpeed() > otherPokemon.getSpeed()) {
                userPokemon.attack(userPokemon, otherPokemon);
                if(otherPokemon.getHp() > 0) {
                    System.out.println(otherPokemon.getName() + " has " + otherPokemon.getHp() + " hp left.");
                    otherPokemon.attack(otherPokemon, userPokemon);
                    if(userPokemon.getHp() >0) {
                        System.out.println(userPokemon.getName() + " has " + userPokemon.getHp() + " hp left.");
                    }
                    else {
                        userPokemon.setHp(0);
                        System.out.println(userPokemon.getName() + " has " + userPokemon.getHp() + " hp left.");
                        System.out.println(userPokemon.getName() + " has fainted.");
                    }
                }
                else {
                    otherPokemon.setHp(0);
                    System.out.println(otherPokemon.getName() + " has " + otherPokemon.getHp() + " hp left.");
                    System.out.println(otherPokemon.getName() + " has fainted.");
                }
            }
            else {
                otherPokemon.attack(otherPokemon, userPokemon);
                if(userPokemon.getHp() > 0) {
                    System.out.println(userPokemon.getName() + " has " + userPokemon.getHp() + " hp left."); 
                    userPokemon.attack(userPokemon, otherPokemon);
                    if(otherPokemon.getHp() > 0) {
                        System.out.println(otherPokemon.getName() + " has " + otherPokemon.getHp() + " hp left.");
                    }
                    else {
                        otherPokemon.setHp(0);
                        System.out.println(otherPokemon.getName() + " has " + otherPokemon.getHp() + " hp left.");
                        System.out.println(otherPokemon.getName() + " has fainted.");
                    }
                }
                else {
                    userPokemon.setHp(0);
                    System.out.println(userPokemon.getName() + " has " + userPokemon.getHp() + " hp left."); 
                    System.out.println(otherPokemon.getName() + " has fainted.");
                }
            }
        }
    }
}
