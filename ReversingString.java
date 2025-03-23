import java.util.Scanner;

public class ReversingString {

    private int maxSize;
    private int top;
    private char[] reversing;

    public ReversingString(int size){
        maxSize = size;
        top = -1;
        reversing = new char[maxSize];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public void push(char j){
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            top++;
            reversing[top] = j;
        }
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
                return 'o';
        }else{
            return reversing[top--];
        }
    }

    public char peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 'o';
        }else{
            return reversing[top];
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String enterString = sc.nextLine();
        sc.close();

        int stringLen = enterString.length();
        ReversingString reversingString1 = new ReversingString(stringLen);

        for(int i = 0; i < enterString.length(); i++){
            reversingString1.push(enterString.charAt(i));
        }

        System.out.print("Reversed string: ");

        while (!reversingString1.isEmpty()){
            System.out.print(reversingString1.pop());
        }

    }
}
