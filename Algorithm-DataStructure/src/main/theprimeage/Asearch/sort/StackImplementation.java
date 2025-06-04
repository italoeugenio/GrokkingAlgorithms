package main.theprimeage.Asearch.sort;

class StackNode {
    int data;
    StackNode next;

    public StackNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StackImplementation {
    private StackNode head;
    private int length = 0;

    public void push(int data) {
        StackNode newStack = new StackNode(data);
        if (head == null) {
            head = newStack;
            length++;
        } else {
            newStack.next = head;
            head = newStack;
            length++;
        }
    }

    public void pop() {
        if (isEmpty()) return;
        head = head.next;
        length--;
    }

    public int peek() {
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        if (isEmpty()) return;
        StackNode current = head;
        while (current != null) {
            System.out.println(current.data);
            System.out.println("----");
            current = current.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        
        stack.display();

    }
}
