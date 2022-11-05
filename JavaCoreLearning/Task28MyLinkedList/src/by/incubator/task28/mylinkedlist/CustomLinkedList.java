package by.incubator.task28.mylinkedlist;

public class CustomLinkedList<T> implements MyLinkedList<T> {
    Node head;

    public void insert(T data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        }else {
            Node n = head;
            while(n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }
    }

    //function to add an element at the start of the list
    public void insertAtStart(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //function to add an element at a given index
    public void insertAt(int index, T data) {
        if(index == 0){
            insertAtStart(data); //We already have a function to do this.
        }else{
            Node newNode = new Node(data);
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    //function to delete an element at the given index
    public void deleteAt(int index) {
        if(index == 0) {
            head = head.next;
        }else{
            Node currentNode = head;
            for(int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
    }

    //function to show the list
    public void show() {
        Node currentNode = head;
        if(currentNode == null){
            System.out.println("Linked list is empty");
        }
        else {
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }
        }
    }
}

