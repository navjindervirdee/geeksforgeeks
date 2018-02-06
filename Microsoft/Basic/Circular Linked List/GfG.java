/*
Please note that it's Function problem i.e.
you need to write your solution in the form Function(s) only.
Driver Code to call/invoke your function would be added by GfG's Online Judge.*/


/* Structure of LinkedList
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/
class GfG
{
    boolean isCircular(Node head)
    {
        Node temp = head;
        Node first = head;
        Set<Node> set = new HashSet<Node>();
        while(temp!=null){
            if(set.contains(temp)){
                if(temp==first){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                set.add(temp);
                temp = temp.next;
            }
        }
        return false;
	// Your code here	
    }
}