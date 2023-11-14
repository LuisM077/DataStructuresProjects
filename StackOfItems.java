
public class StackOfItems
{
    double[] stack = new double[10];
    //int top;
    int size;
    
    public StackOfItems() {
        size = 0;
        //top = 0;
    }
    
    public void push(double element) {
        stack[size] = element;
        size++;
    }
    
    public double pop() {
        double element  = stack[size-1];
        stack[size-1] = 0;
        size--;
        return element;
    }
    
    public double peek() {
        double element  = stack[size - 1];
        return element;
    }
    
    public void empty() {
        size = 0;
        double[] newArray = new double[10];
        stack = newArray;
    }
    
    public boolean isEmpty() {
        if(size <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public int size() {
        return size;
    }
    
    public int search(double element) {
        int index = -1;
        for(int i = 0; i < size; i++) {
            if(stack[i] == element) {
                index = 1;
            }
            else {
                return index;
            }
        }
        return index;
    }
    public void print() {
        for(int i = 0; i < stack.length; i++) {
            System.out.println(i + ": " + stack[i]);
        }
    }
}
