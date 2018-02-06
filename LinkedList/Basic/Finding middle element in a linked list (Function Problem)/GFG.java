/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}
This is method only submission.  You only need to complete the method. */
class GFG
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
         if(head==null){
             return -1;
         }
         int len = 0;
         Node temp = head;
         while(temp!=null){
             temp = temp.next;
             len++;
         }
         
         int mid = len/2;
         
         int count = 0;
         temp = head;
         while(count!=mid){
             temp = temp.next;
             count++;
         }
         return temp.data;
   }
}