package Test;
class Node {
    int data;
    Node next;

  
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class Stack1 {
    private Node top;


    public Stack1() {
        this.top = null;
    }

    
    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);  
        newNode.next = top;  
        top = newNode;  
        System.out.println(data + " pushed to stack");
    }

   
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int poppedData = top.data; 
        top = top.next;  
        return poppedData;
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.println("Stack elements are:");
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}


public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack1 stack = new Stack1();

      
        stack.push(10);
        stack.push(20);
        stack.push(30);

        
        System.out.println("Top element is: " + stack.peek());

       
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Popped element is: " + stack.pop());

        
        stack.display();
    }
}