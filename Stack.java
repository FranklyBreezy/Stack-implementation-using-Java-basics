import java.util.Scanner;
class stackFunction{
    int top = -1;
    int max = 3;
    int [] Stack = new int[max];

    public void isEmpty(){
        if (top == -1){
            System.out.println("Stack is empty.");
        }
        else {
            System.out.println("Stack is not empty");
        }
    }
    public void isFull(){
        if (top == max - 1){
            System.out.println("Stack is full.");
        }
        else {
            System.out.println("Stack is not full");
        }
    }

    public void push(Scanner sc){
        if ( top > max - 1){
            System.out.println("Stack overflow");
        }
        else {
            top++;
            System.out.println("Enter a number to push : ");
            int a = sc.nextInt();
            Stack[top] = a;
        }
            
    }
    public void pop(){
        if (top <0){
            System.out.println("Stack Underflow.");
        }
        else {
            System.out.println("Popped element: " + Stack[top]);
            top--;
        }
    }
    public void peek(){
        for (int i = 0; i < max ; i++){
            System.out.println(Stack[i]);
        }
    }
}
public class Stack
{  public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        stackFunction Stack = new stackFunction();
        boolean running = true;
        while (running)
        {
            System.out.println("Select an operation to execute :\n1. Push.\n2. Pop.\n3. Peek.\n4. Check Empty.\n5. Check Full.\n6. Exit");
            int b = sc.nextInt();
            switch (b)
            {
                case 1:
                    Stack.push(sc);
                    break;

                case 2:
                    Stack.pop();
                    break;
                case 3:
                    Stack.peek();
                    break;
                case 4:
                    Stack.isEmpty();
                    break;
                case 5:
                    Stack.isFull();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid input...");
            }
        }
        sc.close();
    }
}
