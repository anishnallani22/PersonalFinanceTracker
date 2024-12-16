package logic.LinkedList;
import logic.TransactionDetails;

public class LinkedList {
    private Node head; //Reference to the first node in the list
    private Node tail; //Reference to the last node in the list

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    //Add a new transaction to the end of the list
    public void addTransactions(TransactionDetails transaction){
        Node newNode = new Node(transaction);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //Display all transactions through iteration
    public void displayTransactions(){
        if(head==null){
            System.out.println("No transaction history!");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }


}
