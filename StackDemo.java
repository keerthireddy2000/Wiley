import java.util.*;
class Stack {
    static final int MAX = 1000;
    int top;
    int s[] = new int[MAX]; 
    boolean isEmpty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    void push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack is full!!!");
            return;
        }
        else {
            s[++top] = x;
            System.out.println(x + " pushed into stack");
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("Stack is empty!!!");
            return 0;
        }
        else {
            int x = s[top--];
            return x;
        }
    }
 
    int peek()
    {
        if (top < 0) {
            System.out.println("Stack is empty!!!");
            return 0;
        }
        else {
            int x = s[top];
            return x;
        }
    }
    void display() {
    	if(top < 1) {
    		System.out.println("Stack is empty");
    	}
    	else {
    		System.out.println("The elements in the stack are:");
    	for(int i = top; i >= 0; i--) {
    		System.out.print(s[i]+" ");
    	}
    }
    }
}
 

public class StackDemo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
    	Stack s = new Stack();
        int n;
        do {
        	System.out.println("1.Push\n2.Pop\n3.Peek\n4.Display\n5.Exit\nEnter your choice:");
        	n = sc.nextInt();
        	sc.nextLine();
        	if (n == 1) {
        		System.out.println("Enter element to push into stack");
        		int x = sc.nextInt();
        		sc.nextLine();
        		s.push(x);

        	}
        	else if (n == 2) {
        		System.out.println(s.pop() + " Popped from stack");
        	}
        	else if (n == 3) {
        		System.out.println(s.peek() + " Peek element");
        	}
        	else if(n == 4) {
        		s.display();
        	}
        	else if (n == 5) {
        		System.out.println("Thankyou!!");
        		break;
        	}
        } while (n >= 0 && n <= 4);
        
        
    }
}