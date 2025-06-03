package main.theprimeage.Asearch.sort;

class Qnode {
    int data;
    Qnode next;

    public Qnode(int data) {
        this.data = data;
        this.next = null;
    }
}


public class QueueImplementation {
    public int length = 0;
    private Qnode head;
    private Qnode tail;

    public void enqueue(int data) {
        Qnode newQnode = new Qnode(data);
        if (head == null) {
            head = newQnode;
        } else {
            tail.next = newQnode;
        }
        tail = newQnode;
        length++;
    }

    public void dequeue() {
        if (head == null) {
            return;
        }
        head = head.next;
        length--;
        if (head == null) {
            tail = null;
        }
    }

    public void peek() {
        if(isEmpty()){
            System.out.println("Is empty");
        } else {
            System.out.println(head.data);
        }
    }


    public boolean isEmpty() {
        return head == null;
    }

    public int queueSize() {
        return length;
    }

    public void display() {
        Qnode current = head;
        System.out.print("<- ");
        while (current != null) {
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("Begin");
    }

    public static void main(String[] args) {
        QueueImplementation queueImplementation = new QueueImplementation();
        System.out.println(queueImplementation.isEmpty());
        queueImplementation.enqueue(2);
        queueImplementation.enqueue(3);
        queueImplementation.enqueue(4);
        queueImplementation.enqueue(5);
        queueImplementation.display();
        queueImplementation.dequeue();
        queueImplementation.display();
        queueImplementation.queueSize();
        queueImplementation.peek();
        queueImplementation.dequeue();
        queueImplementation.display();
        queueImplementation.peek();

    }
}


