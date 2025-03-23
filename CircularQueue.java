class CircularQueue {

    private int maxSize;
    private int front;
    private int rear;
    private int numItem;

    private int[] cirularQueue;

    public CircularQueue(int size){
        maxSize = size;
        front = 0;
        rear = -1;
        numItem = 0;
        cirularQueue = new int[maxSize];
    }

    public boolean isEmpty(){
        return numItem == 0;
    }

    public boolean isFull(){
        return numItem == maxSize;
    }

    public void insert(int j){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            if(rear == maxSize -1)
                rear = -1;

            rear++;
            cirularQueue[rear] = j;
            numItem++;
        }
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -99;
        }else{
            int temp = cirularQueue[front++];

            if(front == maxSize)
                front =0;

            numItem--;

            return temp;
        }
    }

    public int peekFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -99;
        }else{
           return cirularQueue[front];
        }
    }


}
