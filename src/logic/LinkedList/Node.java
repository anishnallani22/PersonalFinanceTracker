package logic.LinkedList;

import logic.TransactionDetails;

//Helper class for LinkedList operations
public class Node {
    public TransactionDetails data;
    public Node prev;
    public Node next;

    public Node(TransactionDetails transactionData){
        data = transactionData;
        this.prev = null;
        this.next = null;
    }
}
