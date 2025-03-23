class QueueApp {
    public static void main(String[] args) {
        QueueX theQueue = new QueueX(7);

        int[] queueArray = theQueue.getQueueArray();
        int maxSize = theQueue.getMaxSize();

        System.out.println();
        for (int i = 0; i < maxSize ; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();

        theQueue.insert(67);
        theQueue.insert(12);
        theQueue.insert(22);
        theQueue.insert(55);
        theQueue.insert(34);
        theQueue.insert(70);
        theQueue.insert(60);


        System.out.println("\n");
        for (int i = 0; i < maxSize ; i++){
            System.out.print(queueArray[i] + " ");
        }

        System.out.print("    front " + theQueue.getFront());
        System.out.print("    rear " + theQueue.getRear());
        System.out.print("    peekFront " + theQueue.peekFront());
        System.out.println("\n");


       for(int i = 0; i < (maxSize / 2); i++){
           System.out.println("removing " + theQueue.remove());
       }

        System.out.println();
        for (int i = 0; i < maxSize ; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("    front " + theQueue.getFront());
        System.out.print("    rear " + theQueue.getRear());
        System.out.print("    peekFront " + theQueue.peekFront());
        System.out.println("\n");

        while(!theQueue.isEmpty()){
            System.out.println("removing " + theQueue.remove());
        }

        System.out.println();
        for (int i = 0; i < maxSize ; i++){
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("    front " + theQueue.getFront());
        System.out.print("    rear " + theQueue.getRear());
        System.out.print("    peekFront " + theQueue.peekFront());
        System.out.println("\n");



    }
}
