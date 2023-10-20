
public class DungeonBattle
{
    public void battleEncounter(Character character, Monster monster) {   
        character.getStats();
        monster.getStats();
        System.out.println();
        while(character.getCurrentLife() > 0 && monster.getLife() > 0) {
            if(character.getSpeed() > monster.getSpeed()) {
                
                monster.monsterDamageTaken(monster, character);
                monster.currentLife(monster);
                System.out.println(character.getName() + " attacked " + monster.getName());
                System.out.println(character.getName() + " hp: " + character.getCurrentLife() + " --- " + monster.getName() + " hp: " + monster.getLife());
                if(monster.getLife() > 0) {
                    
                    character.characterDamageTaken(character, monster);
                    character.currentLife(character);
                    System.out.println(monster.getName() + " attacked " + character.getName());
                    System.out.println(character.getName() + " hp: " + character.getCurrentLife() + " --- " + monster.getName() + " hp: " + monster.getLife());
                }
                else {
                    System.out.println(monster.getName() + " died.");
                    
                }
            }
            else {
                
                character.characterDamageTaken(character, monster);
                character.currentLife(character);
                System.out.println(monster.getName() + " attacked " + character.getName());
                System.out.println(character.getName() + " hp: " + character.getCurrentLife() + " --- " + monster.getName() + " hp: " + monster.getLife());
                if(character.getCurrentLife() > 0) {
                    
                    monster.monsterDamageTaken(monster, character);
                    monster.currentLife(monster);
                    System.out.println(character.getName() + " attacked " + monster.getName());
                    System.out.println(character.getName() + " hp: " + character.getCurrentLife() + " --- " + monster.getName() + " hp: " + monster.getLife());
                }
                else {
                    System.out.println("You died.");
                }
            }
        }
    }
}
