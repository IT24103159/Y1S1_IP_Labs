import java.util.Scanner;

public class DeleteDuplicate {

    private int maxsize;
    private int rear;
    private int front;
    private int numItems;

    private int[] queueArray;

    public DeleteDuplicate(int s) {
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

        DeleteDuplicate deleteDuplicate1 = new DeleteDuplicate(size);

        for(int i = 0; i < size; i++){
            System.out.print("Enter element to insert: ");
            int x = sc.nextInt();
            deleteDuplicate1.insert(x);
        }

        System.out.print("\nQueue 1 elements: ");
        for (int i = 0; i < deleteDuplicate1.numItems; i++){
            System.out.print(deleteDuplicate1.queueArray[i] + " ");
        }

        DeleteDuplicate deleteDuplicate2 = new DeleteDuplicate(size);
        DeleteDuplicate deleteDuplicate3 = new DeleteDuplicate(size);

        int[] temp = new int[size];
        for (int i = 0; i < size; i++){
            temp[i] = deleteDuplicate1.remove();
        }

        for(int i = 0; i < size; i++){
            int x = temp[i];
            boolean isDuplicate = false;

            for(int j = i +1; j < size; j++){
                int y = temp[j];
                if(x == y){
                    deleteDuplicate2.insert(x);
                    isDuplicate = true;
                    break;
                }

                }

            if (!isDuplicate) {
                deleteDuplicate3.insert(x);
            }


        }

        System.out.print("\nQueue 2 elements: ");
        for (int i = 0; i < deleteDuplicate2.numItems; i++){
            System.out.print(deleteDuplicate2.queueArray[i] + " ");
        }

        System.out.print("\nQueue 3 elements: ");
        for (int i = 0; i < deleteDuplicate3.numItems; i++){
            System.out.print(deleteDuplicate3.queueArray[i] + " ");
        }








        sc.close();
    }

}
