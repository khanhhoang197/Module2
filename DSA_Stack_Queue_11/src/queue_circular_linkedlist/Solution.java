package queue_circular_linkedlist;

public class Solution {
    static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null)
            q.front = temp;
        else
            q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }

    static int deQueue(Queue q) {
        if (q.front == null) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return value;
    }

    static void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.println("Elements in Circular Queue are:");

        while (temp.link != q.front) {
            System.out.printf("%d \n", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d  \n", temp.data);
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.front = q.rear = null;

        enQueue(q, 13);
        enQueue(q, 12);
        enQueue(q, 11);
        displayQueue(q);


        System.out.printf("Deleted value = %d  \n", deQueue(q));
        System.out.printf("Deleted value = %d  \n", deQueue(q));

        displayQueue(q);

        enQueue(q, 7);
        enQueue(q, 6);
        displayQueue(q);

    }
}
