/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as
  class Node {
     int data;
     Node next;
  }
*/


Node InsertNth(Node head, int data, int position) {
    //Will Need to Return Head Node
    Node nodeToInsert = new Node();
    nodeToInsert.data = data;

    //Empty List - Returned newly created node or null
    if (head == null) {
        nodeToInsert.next = null;
        head = nodeToInsert;
        return head;
    }

    //Inserting a Node ahead of the List
    if (position == 0) {
        nodeToInsert.next = head;
        head = nodeToInsert;
        return head;
    }

    //Traverse the Singly Linked List to 1 Position Prior
    //Stop traversing if you reached the end of the List

    Node curr = head;
    for (int i = 0; i < position - 1 && curr.next != null; ++i){
        curr = curr.next;
    }

    //Inserting a Node in-between a List or at the end of of a List
    Node nodeAtPosition = curr.next;
    curr.next = nodeToInsert;
    curr = curr.next;
    curr.next = nodeAtPosition;

    return head;
}
