package Queue;
// Implementing queue using Array

import java.util.*;

public class Q1{
    static class ArrayQueue{
        int front, rear, size;
        int capacity;
        int queue[];

        public ArrayQueue(int capacity){
            this.capacity = capacity;
            front = 0;
            rear = -1;
            size = 0;
            queue = new int[capacity];
        }

        // enqueue (insert)
        void enqueue(int data){
            if(size == capacity){
                System.out.print("Queue is Full");
                return;
            }
            rear = (rear+1)%capacity;
            queue[rear] = data;
            size++;
            System.out.println("Enqueued : "+data);
        }

        // dequeue (Remove)
        int dequeue(){
            if(size == 0){
                System.out.print("Queue is empty");
                return -1;
            }
            int removed = queue[front];
            front = (front+1)%capacity;
            return removed;
        }

        // peek (front element)
        int peek(){
            if(size == 0){
                System.out.print("Queue is empty");
                return -1;
            }

            return queue[front];
        }

        // Display(queue)
        void display(){
             if(size == 0){
                System.out.print("Queue is empty");
                return;
            }
            System.out.print("Queue");
            for(int i=0; i<size; i++){
                System.out.print(queue[(front+i)%capacity]+" ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
    ArrayQueue q = new ArrayQueue(5);

    q.enqueue(1);
    q.enqueue(2); 
    q.enqueue(3);
    q.enqueue(4);

    System.out.println("Dequeued : " +q.dequeue());
    q.display();

    System.out.println("Front element: "+q.peek());

   } 
}
