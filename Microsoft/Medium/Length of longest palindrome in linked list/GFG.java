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
}*/
class GfG
{
    private static int getPalindrome(Node prev, Node next){
        if(prev==null || next==null){
            return 0;
        }
        int count = 0;
        while(prev!=null && next!=null && prev.data==next.data){
            count+=2;
            prev = prev.next;
            next = next.next;
        }
        return count;
    }
    
    public static int maxPalindrome(Node head){
        Node prev = null;
        Node curr = head;
        
        int max = 0;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            
            
            int odd = getPalindrome(prev,next) + 1;
            int even = getPalindrome(curr,next);
            
            max = Math.max(Math.max(even,odd),max);
            prev = curr;
            curr = next;
        }
        return max;
    }
}