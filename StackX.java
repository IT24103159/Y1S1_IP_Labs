class StackX {
    private int maxSize; //size of stack array
    private double[] stackArray;
    private int top; //top of the stack

    public StackX(int maxSize){
        this.maxSize = maxSize; // set array size
        stackArray = new double[this.maxSize];
        top = -1;
    }

    public double[] getStackArray() {
        return stackArray;
    }


    public int getTop() {
        return top;
    }

    public void push(double j){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top = top + 1;
            stackArray[top] = j;
        }
    }

    public double pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -99;
        }else{
           return stackArray[top--];
        }
    }

    public double peek(){
        if(isEmpty()) {
            System.out.print("Stack is empty");
            return -99;
        }else{
            return stackArray[top];
        }
    }

    public boolean isEmpty(){
       return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

}
