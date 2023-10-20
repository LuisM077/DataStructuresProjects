import java.util.Scanner;
import java.util.Random;

public class LinkedDungeon<E>
{
    private Dungeon<E> head = null;
    private Dungeon<E> tail = null;
    private int size;
    
    public void addFirst() {
        Dungeon exit = new Dungeon("Exit") ;
        head = exit;
        size = 1;
    }

    
    public void printAll() {
        Dungeon current = head;

        if(head == null) {
            System.out.println("There is nothing in the list");
        }
        else {
            while(current.getNext() != null) {
                System.out.println(current.getRoom());
                current = current.getNext();
            }
            System.out.println(current.getRoom());;
        }
        
    }
    
    public int size() {
        return size;
    }
    
    private Dungeon<E> getDungeon(int index) {
        Dungeon<E> dungeon = head;
        for (int i = 0; i < index && dungeon != null; i++) {
            dungeon = dungeon.getNext();
        }
        return dungeon;
    }

    public E printIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Dungeon<E> dungeon = getDungeon(index);
        return dungeon.getRoom();
    }
    
    public void addRandom() {
        Random generator = new Random();
        
        Dungeon dungeon;
        while(size < 10) {
            int randNumber = 1 + generator.nextInt(3);
            if(randNumber == 1) {
                dungeon = new Dungeon("Monster");
                size++;
            }
            else if(randNumber == 2) {
                dungeon = new Dungeon("Item");
                size++;
            }
            else {
                dungeon = new Dungeon("Trap");
                size++;
            }
            
            Dungeon current = head;
            while(current.getNext() != null) {
            current = current.getNext();
            }
            current.setNext(dungeon);
        }
    }
    
    public void runGame() {
        int randomNumber;
        String choice;
        String characterChoice;
        Scanner scnr = new Scanner(System.in);
        
        Hero hero = new Hero();
        Mage mage = new Mage();
        Tanker tanker = new Tanker();
        
        Monster monster = new Monster();
        Slime slime = new Slime();
        
        Character character = null;
        System.out.println("Choose: Hero, Mage, Tanker");
        characterChoice = scnr.next();
        while(character == null) {
        if(characterChoice.equals("Hero")) {
            character = hero;
        }
        else if(characterChoice.equals("Mage")) {
            character = mage;
        }
        else if(characterChoice.equals("Tanker")) {
            character = tanker;
        }
        }
        

        DungeonBattle dg = new DungeonBattle();
        Items item = new Items();
        Traps trap = new Traps();
        
        while(character.getCurrentLife() > 0) {
            addFirst();
            addRandom();
            int llIndex = 0;
            
            while(llIndex < 10 && character.getCurrentLife() > 0) {
                System.out.println("|" + printIndex(llIndex) + "|" + "     " + "|" + printIndex(llIndex + 1) + "|");
                System.out.println("Choice: ");
                choice = scnr.next();
                if(choice.equals("Exit")) {
                    System.out.println("You left the dungeon.");
                    character.setCurrentLife(0);
                    llIndex = 11;
                }
                else if(choice.equals("Monster")) {
                    Monster newMonster = monster.selectMonster();
                    dg.battleEncounter(character, newMonster);
                    System.out.println("Your hp: " + character.getCurrentLife());
                }
                else if(choice.equals("Item")) {
                    item.obtainItem(character);
                    System.out.println("Your hp: " + character.getCurrentLife());
                }
                else if(choice.equals("Trap")) {
                    trap.activateTrap(character);
                    System.out.println("Your hp: " + character.getCurrentLife());
                }
                else {
                    System.out.println("That is not a choice. Try again");
                    choice = scnr.next();
                }
                llIndex = llIndex + 2;
            }
        }
    }
}
