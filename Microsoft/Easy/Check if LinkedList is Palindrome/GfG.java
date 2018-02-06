/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


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
        String str = "";
        while(head!=null){
            str = str + Integer.toString(head.data);
            head = head.next;
        }
        
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse.equals(str);
        //Your code here
    }    
}