/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


//function Template for Java
/* Return reference of new head of the reverse linked list 
 class Node {
     int value;
    Node next;
    Node(int value) {
        this.value = value;
    }
} */
class gfg
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverse(Node head){
       if(head == null){
           return head;
       }
       if(head.next==null){
           return head;
       }
       
       Node current = head;
       Node prev = null;
       
       while(current!=null){
           Node next = current.next;
           current.next = prev;
           prev = current;
           current = next;
       }
       head = prev;
       return head;
   }
}