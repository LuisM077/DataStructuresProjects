
public class Dungeon<E>
{
    private E room;
    private Dungeon<E> next;
    
    public Dungeon(E userRoom) {
        room = userRoom;
        next = null;
    }
    public Dungeon getNext() {
        return next;
    }
    
    public void setNext(Dungeon userInputNext) {
        next = userInputNext;
    }
    
    public E getRoom() {
        return room;
    }
}
