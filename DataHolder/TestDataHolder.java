import java.util.ArrayList;

public class TestDataHolder
{
    public static void main(String[] args) {
        LuisDataHolder ldh = new LuisDataHolder();
        
        System.out.println("add");
        ldh.add(1.0);
        ldh.add(2.0);
        ldh.add(3.0);
        ldh.add(4.0);
        for(int i = 0; i < ldh.getSize(); i++) {
            System.out.println(ldh.getIndex(i));
        }
        System.out.println("Size is: " + ldh.getSize());
        
        System.out.println("Add at index");
        ldh.add(1,7.0);
        for(int i = 0; i < ldh.getSize(); i++) {
            System.out.println(ldh.getIndex(i));
        }
        System.out.println("Size is: " + ldh.getSize());
        
        System.out.println("remove at index");
        ldh.remove(1);
        for(int i = 0; i < ldh.getSize(); i++) {
            System.out.println(ldh.getIndex(i));
        }
        System.out.println("Size is: " + ldh.getSize());
        
        System.out.println("remove element");
        ldh.remove(3.0);
        for(int i = 0; i < ldh.getSize(); i++) {
            System.out.println(ldh.getIndex(i));
        }
        System.out.println("Size is: " + ldh.getSize());
        

        System.out.println("remove last element");
        ldh.removeLast();
        for(int i = 0; i < ldh.getSize(); i++) {
            System.out.println(ldh.getIndex(i));
        }
        System.out.println("Size is: " + ldh.getSize());
        
        //System.out.println("2 is "+ ldh.contains(2) + " 7 is " + ldh.contains(7));
        
        System.out.println("clear array.");
        ldh.clear();
        System.out.println("Size is: " + ldh.getSize());
        
        
        
        
        
    }
}
