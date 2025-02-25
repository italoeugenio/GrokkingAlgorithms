package main.DataStructure.LinkedLists;

public class LinkedLists {
    //Implement
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    class LinkedList{
        private Node head;

        public void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
            } else {
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next= newNode;
            }
        }

        public void remove(int data){

        }
    }

    //Using class
    public static void main(String[] args) {

    }
}
