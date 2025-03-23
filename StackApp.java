class StackApp {
    public static void main(String[] args) {
        StackX theStack = new StackX(6);

        theStack.push(30);
        theStack.push(80);
        theStack.push(100);
        theStack.push(25);
        theStack.push(389);
        theStack.push(8069);
        theStack.push(45);
        theStack.push(95);


        System.out.println();
        double[] stackArray = theStack.getStackArray();
        for (int i = 5; i >= 0 ; i--){
            System.out.println(stackArray[i] + " ");
        }

        System.out.println();
        System.out.println(theStack.getTop());
        System.out.println(theStack.peek());
        System.out.println();

        while(!theStack.isEmpty()){

            double val = theStack.pop();
            System.out.println(val);
        }

        System.out.println();
        System.out.println(theStack.getTop());
        System.out.println(theStack.peek());
        System.out.println();


    }
}
