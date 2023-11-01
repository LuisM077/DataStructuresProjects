
public class LuisDataHolder
{
    int size;
    double[] data = new double[10];
    
    public LuisDataHolder() {
        size = 0;
    }
    /*
     * Adds the element in the parameter to the first empty cell and increase the size.
     * if array is full, it creates a new array and copies elements from previous array.
     * 
     */
    public void add(double element) {
        data[size] = element;
        size++;
        if(size == data.length) {
            double[] newData = new double[data.length * 2];
            for(int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
        }
    }
    /*
     * Adds an element at given index. Moves all the elements after the index
     */
    public void add(int index, double element) {
        size++;
        for(int i = size; i > index; i--) {
            data[i] = data[i-1];
        }
        data[index] = element;
    }
    /*
     * Removes element at given position. Shifts all element after to the current position.
     */
    public void remove(int position) {
        for(int i = position; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
    }
    /*
     * removes the element if found by using above remove method.
     */
    public void remove(double element) {
        for(int i = 0; i< size; i++) {
            if(element == data[i]) {
                int index = i;
                remove(i);
            }
        }
    }
    
    /*
     * removes last element in the array
     */
    public void removeLast() {
        remove(size + 1);
        size--;
    }
    /*
     * Removes all the elements from the array.
     */
    public void clear() {
        size = 0;
        double[] newArray = new double[10];
        
        data = newArray;
    }
    
    /*
     * Creates a copy of the array.
     */
    public void deepClone() {
        double[] tempArray = new double[data.length];
        for(int i = 0; i < data.length; i++) {
            tempArray[i] = data[i];
        }
    }
    /*
     * Searchers for the element in the parameter and returns true if found.
     */
    public boolean contains(double element) {
        boolean found = false;
        for(int i = 0; i< size; i++) {
            while(found == false) {
                if(data[i] == element) {
                    found = true;
                }
                else {
                    found = false;
                }
            }
        }
        return found;
    }
    /*
     * Checks if the array is empty.
     */
    public boolean isEmpty() {
        if(size <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    /*
     * Returns size of the arrays
     */
    public int getSize() {
        return size;
    }
    
    // Used to print values in array. Gets the value at certain index.
    public double getIndex(int index) {
        return data[index];
    }
}
