class QueueX {

    private int maxSize; //size of queue array
    private int[] queueArray;
    private int front; //frist element index of queue
    private int rear; //last element index of queue
    private int numItem; //total num of item in the queue

    public QueueX(int maxSize){
        this.maxSize = maxSize;
        queueArray = new int[this.maxSize];
        front = 0;
        rear = -1;
        numItem = 0;
    }

    public int[] getQueueArray(){
        return queueArray;
    }

    public int getFront() {
        return front;
    }

    public int getRear() {
        return rear;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void insert(int j){
        if(isFull()){
            System.out.println("Queue is full");
        }else{
            rear++;
            queueArray[rear] = j;
            numItem++;
            System.out.print("\ninserting " + j + "     ");
            for (int i = 0; i < 7 ; i++){
                System.out.print(queueArray[i] + " ");
            }
            System.out.print("    front: " + front);
            System.out.print("    rear: " + rear );


        }
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -99;
        }else{
            numItem--;
            return queueArray[front++];
        }
    }

    public int peekFront(){
        if(isEmpty()){
            System.out.print("      Queue is empty");
            return -99;
        }else{
            return queueArray[front];
        }
    }

    public boolean isEmpty(){
        return numItem == 0;
    }

    public boolean isFull(){
        return numItem == maxSize;
    }


}
