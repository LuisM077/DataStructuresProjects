/*
 * Luis Morales
 * The linked list containes the 5 most common names in the world according to Forebears
 * The main methods tests the methods in the LinkedContainer class.
 */
public class LinkedListTest
{
    public static void main(String[] args) {
        
        LinkedContainer lc = new LinkedContainer();
        
        lc.add("Maria");
        lc.add("Nushi");
        lc.add("Mohammed");
        lc.add("Jose");
        lc.add("Muhammad");

        lc.printAll();
        System.out.println("Size of list is: " + lc.size());
        
        lc.clear();
        lc.printAll();
        
        
        CircularLinkedList cll = new CircularLinkedList();
        
        cll.addBox(13);
        cll.addBox(7);
        cll.addBox(24);
        cll.addBox(1);
        cll.addBox(8);
        cll.addBox(37);
        cll.addBox(46);

        int index = 4;
        System.out.println("Index " + index + ": " + cll.printIndex(index));
        //cll.printAll();
        cll.size();
        System.out.println();
        
        
    }
}
