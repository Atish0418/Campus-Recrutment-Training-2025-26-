import java.util.Scanner;
import java.util.Stack;

public class StackUsingQ{
    static class ArrayQueue{
        int arr[];
        int rear, front, size, capacity;

        public ArrayQueue(int capacity){
            this.capacity = capacity;
            size = 0;
            front = 0;
            rear = -1;
            arr = new int[capacity];
        }

        // enequeue
        void enequeue(int data){
            if(size == capacity) return;

            rear = (rear + 1) % capacity;
            arr[rear] = data;
            size++;
        }

        //dequeue
        int dequeue(){
            if(isEmpty()) return -1;

            int removed = arr[front];
            front = (front + 1) % capacity;
            size--;
            return removed;
        }

        public boolean isEmpty(){
            return size == 0;
        }

        public int getSize(){
            return size;
        }

        static class Stack{
            ArrayQueue q1, q2;

            public Stack(int capacity){
                q1 = new ArrayQueue(capacity);
                q2 = new ArrayQueue(capacity);
            }

            // push
            public void push(int x){
                if(!q1.isEmpty()){
                    q1.enequeue(x);
                }
                else{
                    q2.enequeue(x);
                }
            }

            // pop
            public int pop(){
                if(q1.isEmpty() && q2.isEmpty()) return -1;

                ArrayQueue full = !q1.isEmpty() ? q1 : q2;
                ArrayQueue empty = full == q1 ? q2 : q1;

                while (full.getSize()>1) {
                    empty.enequeue(full.dequeue());
                }

                return full.dequeue();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack s = new Stack(100);

        while (q-- >1) {
            int type = sc.nextInt();
            if(type == 1){
                int x = sc.nextInt();
                s.push(x);
            }
            else{
                System.out.println(s.pop());
            }
        }
    }
}