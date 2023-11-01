
public class CircularLinkedList<E>
{
    private Box<E> head = null;
    private Box<E> tail = null;
    private int size;
    
    public void addBox(int value) {
        Box newBox = new Box(value);

        if (head == null) {
            head = newBox;
        } else {
            tail.setNext(newBox);
            size++;
        }

        tail = newBox;
        tail.setNext(head);
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
    
    private Box<E> getBox(int index) {
        Box<E> box = head;
        for (int i = 0; i < index && box != null; i++) {
            box = box.getNext();
        }
        return box;
    }
    public E printIndex(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        }
        Box<E> box = getBox(index);
        return box.getData();
    }
    
    public int size() {
        return size;
    }
    
    public void clear() {
        head = null;
    }
}
