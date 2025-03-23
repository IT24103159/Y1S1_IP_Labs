public class QueueArray {

    private int maxsize;
    private int rear;
    private int front;
    private int numItems;

    private int[] queueArray;

    public QueueArray(int s){
        maxsize = s;
        rear = -1;
        front = 0;
        numItems = 0;
        queueArray = new int[maxsize];
    }

    public boolean isEmpty(){
        return numItems == 0;
    }

    public boolean isFull(){
        return numItems == maxsize;
    }

    public void insert(int item){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            rear++;
            queueArray[rear] = item;
            numItems++;
        }
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -99;
        }else{
            numItems--;
            return queueArray[front++];
        }
    }

    public int peekFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -99;
        }else{
            return queueArray[front];
        }
    }

    public int getCount(){
        return numItems;
    }


    public static void main(String[] args) {

        QueueArray queueArray1 = new QueueArray(3);

        queueArray1.insert(10);
        queueArray1.insert(20);
        queueArray1.insert(30);

        System.out.println();

        System.out.print("Queue elements: ");
        for (int i = 0; i < queueArray1.numItems; i++){
            System.out.print(queueArray1.queueArray[i] + " ");
        }

        int remove = queueArray1.remove();
        System.out.println("\nRemoved: " + remove);

        System.out.print("Queue elements: ");
        for (int i = 0; i < queueArray1.numItems; i++){
            System.out.print(queueArray1.queueArray[i] + " ");
        }

        int frontElement = queueArray1.peekFront();
        System.out.println("\nFront Element: " + frontElement);

        System.out.println("Queue Count: " + queueArray1.getCount());



    }
}
