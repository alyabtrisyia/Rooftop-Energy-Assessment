import java.util.Arrays;

public class simple_stack {

    private int[] data;
    private int top;
    
    public static void main(String[] args) {
        simple_stack stack = new simple_stack();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek top element 
        System.out.println("Peek: " + stack.peek());

        // Pop elements 
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }

    public simple_stack() {
        data = new int[4];
        top = 0;
    }

    // Function to push an element onto the stack
    public void push(int value) {
        // If array is full, resize (double the capacity)
        if (top == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[top] = value; // place value at the top position
        top++;             // move top forward
    }

    // Function to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        top--;                
        int value = data[top];  // read the element
        return value;
    }

    // Function to peek at the top element of the stack
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek.");
        }
        return data[top - 1]; 
    }

    // Function to check if the stack has no elements
    public boolean isEmpty() {
        return top == 0;
    }

    // Return number of elements in the stack
    public int size() {
        return top;
    }
}
