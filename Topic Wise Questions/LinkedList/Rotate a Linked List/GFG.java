/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

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
	public void rotate(Node head,int k){
	    if(head==null || head.next==null){
	        System.out.println(head.data);
	    }
        Node temp = head;
        int i = 0;
        while(i<k-1){
        
            temp = temp.next;
            i++;
        }
        
        Node next = temp.next;
        temp.next = null;
        
        
        if(next!=null){
            Node prev = head;
            head = next;
        
            while(next.next!=null){
                next = next.next;
            }
            next.next = prev;
        }
        
        temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp =temp.next;
        }
    }
}