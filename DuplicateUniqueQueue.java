import java.util.Scanner;

public class DuplicateUniqueQueue {

    private int maxsize;
    private int rear;
    private int front;
    private int numItems;

    private int[] queueArray;

    public DuplicateUniqueQueue(int s) {
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

        DuplicateUniqueQueue duplicateUniqueQueue1 = new DuplicateUniqueQueue(size);

        for(int i = 0; i < size; i++){
            System.out.print("Enter element to insert: ");
            int x = sc.nextInt();
            duplicateUniqueQueue1.insert(x);
        }

        System.out.print("\nQueue 1 elements: ");
        for (int i = 0; i < duplicateUniqueQueue1.numItems; i++){
            System.out.print(duplicateUniqueQueue1.queueArray[i] + " ");
        }

        DuplicateUniqueQueue duplicateUniqueQueue2 = new DuplicateUniqueQueue(size);

        for(int i = 0; i < size; i++){
            int temp = duplicateUniqueQueue1.queueArray[i];

            for(int j = i +1; j < size; j++){
                int temp2 = duplicateUniqueQueue1.queueArray[j];
                if(temp == temp2){
                    duplicateUniqueQueue2.insert(temp);
                    break;
                }
            }
        }

        System.out.print("\nQueue 2 elements: ");
        for (int i = 0; i < duplicateUniqueQueue2.numItems; i++){
            System.out.print(duplicateUniqueQueue2.queueArray[i] + " ");
        }

        DuplicateUniqueQueue duplicateUniqueQueue3 = new DuplicateUniqueQueue(size);

        for(int i = 0; i < size; i++) {
            int temp = duplicateUniqueQueue2.queueArray[i];

            for (int j = 0; j < size; j++) {
                int temp2 = duplicateUniqueQueue1.queueArray[j];
                if (temp == temp2) {
                    duplicateUniqueQueue3.insert(temp);
                }
            }
        }


       sc.close();
    }

}