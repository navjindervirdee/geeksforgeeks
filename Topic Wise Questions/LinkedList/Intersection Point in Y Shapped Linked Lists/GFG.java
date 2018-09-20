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
	int intersectPoint(Node headA, Node headB){
        int lenA = 0;
        int lenB = 0;
        
        Node tempA = headA;
        Set<Node> set = new HashSet<Node>();
        while(headA!=null){
            set.add(headA);
            headA = headA.next;
            
        }
        
        Node tempB = headB;
        while(tempB!=null){
            if(set.contains(tempB)){
                return tempB.data;
            }
            tempB = tempB.next;
        }
        return -1;
 	}
}