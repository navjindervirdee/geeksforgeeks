/*
Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
*/
class GfG
{
    private static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
	public void rotate(Node head,int k){
        if(head==null || k<=0){
            printList(head);
            return;
        }
        Node temp = head;
        Node prev = null;
        while(k>0){
            prev = temp;
            temp = temp.next;
            k--;
        }
        if(temp==null){
            printList(head);
            return;
        }
        prev.next = null;
        
        Node prevHead = head;
        head = temp;
        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next = prevHead;
        printList(head);
    }
}