/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
class GfG
{
    boolean isPalindrome(Node head) 
    {
        Node temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(temp!=null){
            stack.push(temp.data);
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            int num = stack.pop();
            if(num!=temp.data){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }    
}