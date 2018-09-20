/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* Linked List
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
// This function should delete node from linked list. The function
// may assume that node exists in linked list and is not last node
class GfG
{
    void deleteNode(Node del)
    {
        Node next = del.next;
        del.data = next.data;
        del.next = next.next;
        
    }
}