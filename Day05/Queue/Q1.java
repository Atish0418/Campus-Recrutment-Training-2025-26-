import java.util.Scanner;

public class Q1 {
    static class BinarySeries {
        int front, rear, size;
        int capacity;
        String queue[];

        public BinarySeries(int capacity){
            front = 0;
            rear = -1;
            size = 0;
            this.capacity = capacity;  // ❗ Yeh line bhi add karni zaroori hai
            queue = new String[capacity];
        }

        void enqueue(String data){
            if(size == capacity){
                System.out.println("Queue is full");
                return;
            }

            rear = (rear + 1) % capacity;
            queue[rear] = data;
            size++;
            System.out.println("Enqueued : " + data);
        }

        String dequeue(){
            if(size == 0){
                System.out.println("Queue is empty");
                return null;
            }

            String removed = queue[front];
            front = (front + 1) % capacity;
            size--;  // ❗ isko bhi reduce karna hoga
            return removed;
        }

        public static void a(int n){
            BinarySeries q = new BinarySeries(2 * n);
            q.enqueue("1");

            for(int i = 0; i < n; i++){
                String current = q.dequeue();
                System.out.println("Current : " + current);
                q.enqueue(current + "0");
                q.enqueue(current + "1");
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        BinarySeries.a(n); // ✅ fix here
    }
}
