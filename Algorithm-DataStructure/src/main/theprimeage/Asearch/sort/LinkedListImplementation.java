package main.theprimeage.Asearch.sort;

class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class LinkedListImplementation{
    private Node head;

    public void addToEnd(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void addToStart(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void remove(int data){
        if(head == null) return;

        if(head.data == data){
            head = head.next;
            return;
        }

        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public void display(){
        Node current  = head;
        while (current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int size(){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListImplementation list = new LinkedListImplementation();

        list.addToEnd(10);
        list.addToEnd(20);
        list.addToEnd(5);
        list.display();

        list.remove(20);
        list.display();

        System.out.println(list.size());
    }
}

