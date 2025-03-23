import java.util.Scanner;

public class CheckingParentheses {

    private int maxSize;
    private int top;
    private char[] reversing;

    public CheckingParentheses(int size){
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

    public boolean isBalanced(String str){

        CheckingParentheses checkingParentheses1 = new CheckingParentheses(str.length());

        for (int i = 0; i < str.length(); i++){

            char x = str.charAt(i);

            if (x == '{' || x == '[' || x == '('){
                checkingParentheses1.push(str.charAt(i));
            } else if (x == '}' || x == ']' || x == ')') {
                if(checkingParentheses1.isEmpty()){
                    return false;
                }

                char charTop = checkingParentheses1.pop();
                if((x == '}' && charTop != '{' ) || (x == ']' && charTop != '[' ) || (x == ')' && charTop != '(' )){
                    return false;
                }
            }
        }

        return checkingParentheses1.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an expression with parentheses: ");
        String expression = sc.nextLine();
        sc.close();

        CheckingParentheses checkingParentheses2 = new CheckingParentheses(expression.length());
        boolean balanced = checkingParentheses2.isBalanced(expression);


        if (balanced) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has imbalanced parentheses.");
        }

    }
}
