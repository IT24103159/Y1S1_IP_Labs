public class StackArray {

    private int maxSize;
    private int top;

    private int[] stackArray;

    public StackArray(int size){
        maxSize = size;
        top = -1;
        stackArray = new int[maxSize];
    }

    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == maxSize - 1;
    }

    public void push(int item){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top++;
            stackArray[top] = item;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -99;
        }else{
            return stackArray[top--];
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -99;
        }else{
            return stackArray[top];
        }
    }

    public void display(){
        System.out.print("Stack elements: ");
        for(int i = 0; i < maxSize; i++){
            System.out.print(stackArray[i] + " ");
        }

    }

    public static void main(String[] args) {

        StackArray stackArray1 = new StackArray(3);

        stackArray1.push(10);
        stackArray1.push(20);
        stackArray1.push(30);

        System.out.println();
        stackArray1.display();
        System.out.println();

        int peek = stackArray1.peek();
        System.out.println("Peek: " + peek);

        int pop = stackArray1.pop();
        System.out.println("Popped: " + pop);

        stackArray1.display();
        System.out.println();

        System.out.println("Is stack empty? " + stackArray1.isEmpty());
        System.out.println("Is stack full? " + stackArray1.isFull());

    }
}


