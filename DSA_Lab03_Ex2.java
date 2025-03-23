import java.util.Scanner;

public class DSA_Lab03_Ex2 {

    private int maxSize;
    private int top;
    private char[] reversing;

    public DSA_Lab03_Ex2(int size){
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

        DSA_Lab03_Ex2 dsaLab03Ex2 = new DSA_Lab03_Ex2(enterString.length());

        for(int i = 0; i < enterString.length(); i++){
            dsaLab03Ex2.push(enterString.charAt(i));
        }

        System.out.print("Reversed string: ");
        while(!dsaLab03Ex2.isEmpty()){
            char remove = dsaLab03Ex2.pop();
            System.out.print(remove);
        }
    }
}
