package Queue;
import java.util.Scanner;

public class Q2 {

    static class Passanger {
        String name, destination;
        int numTickets;

        public Passanger(String name, String destination, int numTickets) {
            this.name = name;
            this.destination = destination;
            this.numTickets = numTickets;
        }
    }

    static class TicketsBooking {
        static class PassangerQueue {
            int front, rear, size;
            int capacity;
            Passanger queue[];

            public PassangerQueue(int capacity) {
                this.capacity = capacity;
                front = 0;
                rear = -1;
                size = 0;
                queue = new Passanger[capacity];
            }

            //Adding Passanger
            void enqueue(Passanger p) {
                if (size == capacity) {
                    System.out.println("Queue is Full. Cannot add more Passangers");
                    return;
                }
                rear = (rear + 1) % capacity;
                queue[rear] = p;
                size++;
                System.out.println("New passanger added: " + p.name + " to " + p.destination + " (" + p.numTickets + " tickets)");
            }

            //Removing Passanger
            Passanger dequeue() {
                if (size == 0) {
                    System.out.println("Queue is empty");
                    return null;
                }
                Passanger removed = queue[front];
                front = (front + 1) % capacity;
                size--;
                return removed;
            }

            // peek (for first passanger in queue)
            Passanger peek() {
                if (size == 0) {
                    System.out.println("Queue is empty");
                    return null;
                }
                return queue[front];
            }

            void display() {
                if (size == 0) {
                    System.out.println("Queue is empty");
                    return;
                }

                System.out.println("Passengers in queue:");
                for (int i = 0; i < size; i++) {
                    Passanger p = queue[(front + i) % capacity];
                    System.out.println((i + 1) + ". " + p.name + " to " + p.destination + " (" + p.numTickets + " tickets)");
                }
                System.out.println("Total passengers waiting : " + size);
            }

            boolean isEmpty() {
                return size == 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketsBooking.PassangerQueue q = new TicketsBooking.PassangerQueue(20);
        int choice;

        do {
            System.out.println("\n-----Railway Ticket Booking System-----");
            System.out.println("1. New passenger arrival");
            System.out.println("2. Serve next passenger");
            System.out.println("3. View current passenger");
            System.out.println("4. View all passengers in queue");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter passenger name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter destination: ");
                    String dest = sc.nextLine();
                    System.out.print("Enter number of tickets: ");
                    int tickets = sc.nextInt();
                    sc.nextLine();
                    q.enqueue(new Passanger(name, dest, tickets));
                    break;

                case 2:
                    Passanger served = q.dequeue();
                    if (served != null) {
                        System.out.println("Serving: " + served.name + " (" + served.numTickets + " tickets to " + served.destination + ")");
                    }
                    break;

                case 3:
                    Passanger current = q.peek();
                    if (current != null) {
                        System.out.println("Next in line: " + current.name + " to " + current.destination + " (" + current.numTickets + " tickets)");
                    }
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
