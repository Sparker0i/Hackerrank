/*
  Print elements of a linked list in reverse order as standard output
  head pointer could be NULL as well for empty list
  Node is defined as
  class Node
  {
     int data;
     Node next;
  }
*/
void ReversePrint(Node head)
{
  // This is a "method-only" submission.
  // You only need to complete this method.
    if(head != null)
    {
        ReversePrint(head.next);
        System.out.println(head.data);
    }
}
