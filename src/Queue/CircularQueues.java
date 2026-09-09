//Circular Queue in Java

package Queue;

public class CircularQueues {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    CircularQueues(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int value) {

        if (size == queue.length) {
            System.out.println("Queue Full");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
    }

    int dequeue() {

        if (size == 0) {
            System.out.println("Queue Empty");
            return -1;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;

        return value;
    }

    public static void main(String[] args) {

        CircularQueues queue = new CircularQueues(3);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue());

        queue.enqueue(40);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}

//o/p:-
//10
//20
//30
//40
