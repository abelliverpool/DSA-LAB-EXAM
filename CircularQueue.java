// question 3 
class CircularQueue {
    private final int maxSize;
    private final int[] queueArray;
    private int front;
    private int rear;

public CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

 public void enqueue(int item) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queueArray[rear] = item;
        } else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. Cannot enqueue.");
                rear = (rear - 1 + maxSize) % maxSize;
            } else {
                queueArray[rear] = item;
            }
        }
    }

public int dequeue() {
        int item = -1;
        if (!isEmpty()) {
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        return item;
    }

public int front() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. No front value.");
            return -1;
        }
    }

public int rear() {
        if (!isEmpty()) {
            return queueArray[rear];
        } else {
            System.out.println("Queue is empty. No rear value.");
            return -1;
        }
    }

public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println("Dequeue: " + q.dequeue()); // returns 1

        q.enqueue(4);
        System.out.println("Front: " + q.front()); // returns 2
        System.out.println("Rear: " + q.rear()); // returns 4
    }
}

