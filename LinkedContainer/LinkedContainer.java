
public class LinkedContainer<E>
{
    private Box<E> head = null;
    private Box<E> tail = null;
    private int size;
    
    public void add(String data){ 
        Box box = new Box(data);
        
        if(head == null) {
            head = box;
            size++;
        }
        else {
            Box current = head;
            while(current.getNext() != null) {
                current = current.getNext();
            }
            size++;
            current.setNext(box);
        }
    }
    
    public void printAll() {
        Box current = head;

        if(head == null) {
            System.out.println("There is nothing in the list");
        }
        else {
            while(current.getNext() != null) {
                System.out.println(current.getData());
                current = current.getNext();
            }
            System.out.println(current.getData());;
        }
        
    }
    
    public int size() {
        return size;
    }
    
    public void clear() {
        head = null;
    }
}
