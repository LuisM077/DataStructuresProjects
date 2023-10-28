
public class Box<E>
{
    private E data;
    
    private Box<E> next;
    
    private Box<E> prev = null;
    
    public Box(E userInputData) {
        data = userInputData;
        next = null;
    }
    
    public Box(E userInputData, Box<E> nextBox) {
        data = userInputData;
        next = nextBox;
    }
    
    public Box getNext(){
        return next;
    }
    
    public void setNext(Box userInputNext){
        next = userInputNext;
    }
    
    public E getData(){
        return data;
    }
    /*
    public void setData(E userInputData) {
        data = userInputData;
    }*/
}
