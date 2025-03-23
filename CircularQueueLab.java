import java.util.Scanner;

public class CircularQueueLab {

    private int maxsize;
    private int rear;
    private int front;
    private int numItems;

    private int[] queueArray;

    public CircularQueueLab(int s) {
        maxsize = s;
        rear = -1;
        front = 0;
        numItems = 0;
        queueArray = new int[maxsize];
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public boolean isFull() {
        return numItems == maxsize;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (rear == maxsize - 1) {
                rear = -1;
            }
            rear++;
            numItems++;
            queueArray[rear] = item;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            int temp = queueArray[front++];

            if (front == maxsize) {
                front = 0;
            }
            numItems--;
            return temp;
        }
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            return queueArray[front];
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the circular queue: ");
        int size = sc.nextInt();

        CircularQueueLab circularQueueLab1 = new CircularQueueLab(size);

        for (int i = 0; i < size; i++){
            System.out.print("Enter element to insert: ");
            int x = sc.nextInt();
            circularQueueLab1.insert(x);
        }


        System.out.print("Enter new element to insert: ");
        int newElement = sc.nextInt();
        circularQueueLab1.insert(newElement);

        int remove = circularQueueLab1.remove();
        System.out.println("Removing: " + remove);

        System.out.print("Enter new element to insert: ");
        newElement = sc.nextInt();
        circularQueueLab1.insert(newElement);

        System.out.print("Enter another element to insert: ");
        newElement = sc.nextInt();
        circularQueueLab1.insert(newElement);

        System.out.print("Queue elements: ");
        for (int i = 0; i < circularQueueLab1.numItems; i++){
            System.out.print(circularQueueLab1.queueArray[i] + " ");
        }

        sc.close();
    }
}