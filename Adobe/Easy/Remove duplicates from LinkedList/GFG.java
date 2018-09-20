/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of Linked List
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
class GfG
{
    Node removeDuplicates(Node head){
        Node prev = head;
        Node current = head.next;
        while(current!=null){
            if(prev.data!=current.data){
                prev = prev.next;
            }
            else{
                prev.next = current.next;
            }
            current = current.next;
        }
        return head;
	}
}