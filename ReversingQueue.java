import java.util.Scanner;

public class ReversingQueue {

    private int maxsize;
    private int rear;
    private int front;
    private int numItems;

    private int[] queueArray;

    public ReversingQueue(int s) {
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
            rear++;
            queueArray[rear] = item;
            numItems++;
        }
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -99;
        } else {
            numItems--;
            return queueArray[front++];
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
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();

        ReversingQueue reversingQueue1 = new ReversingQueue(size);

        for(int i = 0; i < size; i++){
            System.out.print("Enter element to insert: ");
            int x = sc.nextInt();
            reversingQueue1.insert(x);
        }

        System.out.print("\nQueue 1 elements: ");
        for (int i = 0; i < reversingQueue1.numItems; i++){
            System.out.print(reversingQueue1.queueArray[i] + " ");
        }
        System.out.println();

        int[] temp = new int[size];

        for (int i = 0; i < size; i++){
            temp[i] = reversingQueue1.remove();
        }

        System.out.print("\ntemp elements: ");
        for (int i = 0; i < size; i++){
            System.out.print(temp[i] + " ");
        }
        System.out.println();

       ReversingQueue reversingQueue2 = new ReversingQueue(size);
        for (int i = (size-1); i >= 0; i--){
            reversingQueue2.insert(temp[i]);
        }
        System.out.println();

        System.out.print("\nReversing Queue : ");
        while (!reversingQueue2.isEmpty()){
            System.out.print(reversingQueue2.remove() + " ");
        }
        System.out.println();
    }
}