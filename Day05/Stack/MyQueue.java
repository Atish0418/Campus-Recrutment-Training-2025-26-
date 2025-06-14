import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    // Constructor
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Push element to the end of queue
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from the front of the queue
    public int pop() {
        if (empty()) {
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    // Get the front element
    public int peek() {
        if (empty()) {
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    // Check if queue is empty
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println(q.pop());  // Output: 10
        System.out.println(q.peek()); // Output: 20
        System.out.println(q.empty()); // Output: false
    }
}
