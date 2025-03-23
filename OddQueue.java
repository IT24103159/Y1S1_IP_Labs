import java.util.Scanner;

public class OddQueue {

    private int maxsize;
    private int rear;
    private int front;
    private int numItems;

    private int[] queueArray;

    public OddQueue(int s) {
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

        OddQueue oddQueue1 = new OddQueue(size);

        for(int i = 0; i < size; i++){
            System.out.print("Enter element to insert: ");
            int x = sc.nextInt();
            oddQueue1.insert(x);
        }

        System.out.print("\nQueue 1 elements: ");
        for (int i = 0; i < oddQueue1.numItems; i++){
            System.out.print(oddQueue1.queueArray[i] + " ");
        }
        System.out.println();

        OddQueue oddQueue2 = new OddQueue(size);

        while(!oddQueue1.isEmpty()){
            int remove = oddQueue1.remove();
            System.out.println("Removing: " + remove);
            if((remove % 2) == 1){
                oddQueue2.insert(remove);
            }
        }

        System.out.print("\nQueue 2 elements: ");
        for (int i = 0; i < oddQueue2.numItems; i++){
            System.out.print(oddQueue2.queueArray[i] + " ");
        }

    }

}