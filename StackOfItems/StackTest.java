
public class StackTest
{
    public static void main(String[] args) {
        
       StackOfItems test = new StackOfItems();
       
       System.out.println("Push");
       test.push(3.0);
       test.push(5.0);
       test.push(7.0);
       test.push(10.0);
       test.print();
       System.out.println("Size is: " + test.size());
       System.out.println();
       
       System.out.println("Peek");
       System.out.println(test.peek());
       System.out.println();
       
       System.out.println("Pop");
       System.out.println(test.pop());
       System.out.println();
       test.print();
       System.out.println("Size is: " + test.size());
       System.out.println("is 3.0 in the stack and if so, which index? " + test.search(3.0));
       System.out.println("is 10.0 in the stack and if so, which index? " + test.search(10.0));
       System.out.println();
       
       System.out.println("Empty array");
       test.empty();
       System.out.println("Size is: " + test.size());
       System.out.println();
    }
}
